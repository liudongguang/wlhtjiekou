package com.wlht.impl.service;

import com.ldg.api.excel.ExcelUtils;
import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgStringUtil;
import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.WlhtStringUtil;
import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.*;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.ImportParam;
import com.wlht.impl.mapper.*;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                String weiyibiaoshi = WlhtStringUtil.getBaIdentity(item.getSku());
                Long uid = baseMapper.selectByWeiyiBiaoShi(weiyibiaoshi);
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
                    // sszdDao.batchInsert(ssczList); //1.插入手术信息
                }
                if (zrrList.size() > 0) {
                    // zrrDao.batchInsert(zrrList);//2.插入责任人信息
                }
                //3.疾病
                List<TBnjbzd> jbzdList = item.getJBZD();//疾病列表
                System.out.println(jbzdList);
                if (jbzdList.size() > 0) {
                    // jbzdDao.batchInsert(jbzdList);
                }
                //4.费用
                List<TBnzyfy> zlfyList = item.getZLFY();//费用列表
                if (zlfyList.size() > 0) {
                    // zyfyDao.batchInsert(zlfyList);
                }
                //5.过敏药物
                List<TBngmyw> gmywList = item.getGMYW();//过敏药物
                if (gmywList.size() > 0) {
                    //  gmywDao.batchInsert(gmywList);
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
        Date startDate_fy= param.getStarte();
        Date endDate_fy=param.getEnd();
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
}
