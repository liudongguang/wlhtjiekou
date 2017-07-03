package com.wlht.impl.service;

import com.ldg.api.excel.ExcelUtils;
import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgStringUtil;
import com.ldg.api.util.RequestFileUtil;
import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.PingyinHandler;
import com.wlht.api.SessionUtil;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.WlhtStringUtil;
import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.*;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.HospitalDoctorVo;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.ImportParam;
import com.wlht.api.vo.LoginParam;
import com.wlht.impl.mapper.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Service
public class WlhtDataServiceImpl implements WlhtDataService {
    @Autowired
    private RemoteHisService hisrmService;
    @Autowired
    private TBaBaseMapper baseMapper;
    @Autowired
    private TBnjbzdMapper jbzdDao;
    @Autowired
    private TBnssczMapper sszdDao;
    @Autowired
    private TBnzrrMapper zrrDao;
    @Autowired
    private TBngmywMapper gmywDao;
    @Autowired
    private TBnzyfyMapper zyfyDao;
    @Autowired
    private ZiDianService zidianservice;
    @Autowired
    private TCzyMapper tCzyMapper;


    @Override
    public void test() {
        System.out.println("--------------------------");
        List<Hisview> hisDataByDate = hisrmService.getHisDataByDate();
        System.out.println(baseMapper.selectAll());
    }

    @Override
    public String importDataByDate(ImportParam param) throws Exception {
        int days = DateUtil.getZYTSForInt(param.getEnd(), param.getStarte());
        if (days < 0) {
            return "结束日期不能在开始日期之前！";
        } else if (days / 30 >= 6) {
            return "日期区间不能大于6个月！";
        }
        //1.时间段查询
        List<Hisview> hisDataByDate = hisrmService.selectBADateFromHis(param);
        StringBuilder datebetween = new StringBuilder(DateUtil.yyyy_MM_ddFormat.format(param.getStarte()));
        datebetween.append(" 至 ").append(DateUtil.yyyy_MM_ddFormat.format(param.getEnd())).append("--->");
        //2.根据数据的唯一表示查询是否本地系统存在数据
        if (hisDataByDate.size() > 0) {
            hisDataByDate = hisDataByDate.stream().filter(item -> {
                //String weiyibiaoshi = WlhtStringUtil.getBaIdentity(item.getSku());
                Long uid = baseMapper.selectByWeiyiBiaoShi(item.getSku());
                if (uid != null) {
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            if (hisDataByDate.size() == 0) {
                datebetween.append("都以导入完成！");
                return datebetween.toString();
            }
            List<TBaBase> baseList = hisDataByDate.stream().map(item -> item.getBABase(zidianservice)
            ).collect(Collectors.toList());
            //3.没有存在与本地系统的插入本地库
            for (TBaBase item : baseList) {
                int i = baseMapper.insertSelective(item);
                ///导入到其他表中
                List<TBnzrr> zrrList = item.getBAZRR();//获取责任人列表
                List<TBnsscz> ssczList = item.getSSCZ(zrrList);//手术列表
                if (ssczList.size() > 0) {
                    sszdDao.batchInsert(ssczList); //1.插入手术信息
                }
                if (zrrList.size() > 0) {
                    zrrDao.batchInsert(zrrList);//2.插入责任人信息
                }
                //3.疾病
                List<TBnjbzd> jbzdList = item.getJBZD();//疾病列表
                if (jbzdList.size() > 0) {
                    jbzdDao.batchInsert(jbzdList);
                }
                //4.费用
                List<TBnzyfy> zlfyList = item.getZLFY();//费用列表
                if (zlfyList.size() > 0) {
                    zyfyDao.batchInsert(zlfyList);
                }
                //5.过敏药物
                List<TBngmyw> gmywList = item.getGMYW();//过敏药物
                if (gmywList.size() > 0) {
                    gmywDao.batchInsert(gmywList);
                }
            }
            datebetween.append("成功导入").append(hisDataByDate.size()).append("条信息");
            return datebetween.toString();
        } else {
            datebetween.append("无可导入的数据！");
            return datebetween.toString();
        }
    }

    @Override
    public void delChongfuInfo() {
        // 1.获取重复的记录中最早的那条，删除这条，保留最近日期的记录
        List<DelBaseInfo> delList = baseMapper.getDelBaseInfo();
        // 2.删除记录，费用，疾病，过敏药物，手术操作，责任人
        if (delList != null && delList.size() > 0) {
            delGuanlianBiao(delList);
        }
    }

    /**
     * 删除信息包括关联的
     *
     * @param delList
     */
    private void delGuanlianBiao(List<DelBaseInfo> delList) {
        // 1.删除基本信息
        baseMapper.batchDelete(delList);
        // 2.删除疾病信息
        jbzdDao.batchDelete(delList);
        // 3.删除手术操作信息
        sszdDao.batchDelete(delList);
        // 4.删除费用信息
        zyfyDao.batchDelete(delList);
        // 5.删除责任人信息
        zrrDao.batchDelete(delList);
        // 6.删除过敏药物
        gmywDao.batchDelete(delList);
    }

    @Override
    public String importFeiYongDataByDate(ImportParam param) {
        Date startDate_fy = param.getStarte();
        Date endDate_fy = param.getEnd();
        int days = DateUtil.getZYTSForInt(param.getEnd(), param.getStarte());
        if (days < 0) {
            return "结束日期不能在开始日期之前！";
        } else if (days / 30 >= 3) {
            return "日期区间不能大于3个月！";
        }
        Integer delFyState = param.getDelFyState();
        StringBuilder hdStr = new StringBuilder();
        if (delFyState != null && delFyState == 1) {
            int delFYNum = zyfyDao.delExsitFYXX(param);
            hdStr.append("费用删除数：").append(delFYNum);
        }
        // 1.抽取范围内的费用
//        List<TBnzyfy> fyList = zyfyDao.getFyYong(startDate_fy, endDate_fy);
//        hdStr.append("  范围内费用条数：").append(fyList.size());
//        // 2.获取时间范围内没有费用的基本信息，初始化费用信息与基本信息
//        List<TBaBase> exsistBaseInfo = wlthSV.getExsistBaseInfo(
//                startDate_fy, endDate_fy);
//        hdStr.append("  没有费用基本信息数：").append(exsistBaseInfo.size());
//        WlhtParsedFYModel fyParsed = new WlhtParsedFYModel();
//        fyParsed.setFyList(fyList);
//        fyParsed.initDate();
//        if (exsistBaseInfo != null && exsistBaseInfo.size() != 0) {
//            // 3.插入费用信息
//            int haveFYNum = 0;
//            for (TBaBase base : exsistBaseInfo) {
//                String baIdentity = base.getBaidentity();
//                List<TBnzyfy> addFYList = fyParsed
//                        .getFYByIdentity(baIdentity);
//                if (addFYList != null && addFYList.size() > 0) {
//                    wlthSV.addFYList(base, addFYList);
//                    haveFYNum++;
//                }
//            }
//            hdStr.append("  费用插入完成！补入费用条数：").append(haveFYNum);
//            HandlerStrFY = hdStr.toString();
//            System.out.println(HandlerStrFY);
//        }

        return null;
    }

    @Override
    public TCzy selectCzy(LoginParam param) {
        return tCzyMapper.selectCzy(param);
    }

    @Override
    public String ksExcelImport(HttpServletRequest request) throws Exception {
        List<MultipartFile> uploadFile = RequestFileUtil.getUploadFile(request);
        if (uploadFile != null && uploadFile.size() == 1) {
            MultipartFile file = uploadFile.get(0);
            if (file.getOriginalFilename().indexOf("keshi") == -1) {
                return "文件错误！";
            }
            String yyidneity = SessionUtil.getYyIdentityForCZY(request);
            InputStream excelIns = file.getInputStream();
            List<HospitalOfficeVo> rlist = ExcelUtils.readExcel(excelIns, HospitalOfficeVo.class, file.getOriginalFilename());
            final int[] saveNum = {0};
            final int[] updateNum = {0};
            StringBuilder sbd = new StringBuilder();
            rlist.stream().map(mitem -> {
                mitem.setYyidentity(yyidneity);
                String ksmc = mitem.getMingcheng();
                if (StringUtils.isNotBlank(ksmc)) {
                    mitem.setPinyin(PingyinHandler.converterToFirstSpell(ksmc));//设置拼音首字母
                }
                String kstype = mitem.getKsType();
                mitem.setKsType(WlhtDataReverseHelper.getKeShiType(kstype));
                return mitem;
            }).forEach(item -> {
                Long id = zidianservice.checkKSExistsByKSNameAndYYIdentity(item);
                if (id == null) {
                    Long ksbmid=zidianservice.checkKSExistsByKSCodeAndYYIdentity(item);
                    if(ksbmid!=null){
                        item.setKeshiBM(item.getKeshiBM()+"99");
                    }
                    zidianservice.saveKSXXInfo(item);
                    saveNum[0]++;
                } else {
                   // zidianservice.updateKSXXInfo(item);
                    //updateNum[0]++;
                }
            });
            sbd.append("新增：").append(saveNum[0]).append("条");
            return sbd.toString();
        }
        return null;
    }

    @Override
    public String yishiExcelImport(HttpServletRequest request) throws Exception {
        List<MultipartFile> uploadFile = RequestFileUtil.getUploadFile(request);
        if (uploadFile != null && uploadFile.size() == 1) {
            MultipartFile file = uploadFile.get(0);
            if (file.getOriginalFilename().indexOf("renyuan") == -1) {
                return "文件错误！";
            }
            String yyidneity = SessionUtil.getYyIdentityForCZY(request);
            InputStream excelIns = file.getInputStream();
            List<HospitalDoctorVo> rlist = ExcelUtils.readExcel(excelIns, HospitalDoctorVo.class, file.getOriginalFilename());
            final int[] saveNum = {0};
            final int[] updateNum = {0};
            final int[] noIDCARDNum = {0};
            StringBuilder sbd = new StringBuilder();
            rlist.stream().map(mitem -> {
                mitem.setYyidentity(yyidneity);
                String ksname = mitem.getSuozaiks();
                mitem.setSuozaiks(zidianservice.getKeshiCodeByName(ksname));
                return mitem;
            }).forEach(item -> {
                if (StringUtils.isNotBlank(item.getIdcard())) {
                    Long id = zidianservice.checkYiShiExistsByIDCardAndYYIdentity(item);//通过身份证号与医院标识查询
                    if (id == null) {
                        try {
                            item.setId(null);
                            zidianservice.saveYSXXInfo(item);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        saveNum[0]++;
                    } else {
                        try {
                            item.setId(id);
                            zidianservice.updateYSXXInfo(item);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        updateNum[0]++;
                    }
                } else {
                    noIDCARDNum[0]++;
                }
            });
            sbd.append("新增：").append(saveNum[0]).append("条，修改了：").append(updateNum[0]).append("条  无身份证号不插入：").append(noIDCARDNum[0]).append("条");
            return sbd.toString();
        }
        return null;
    }
}
