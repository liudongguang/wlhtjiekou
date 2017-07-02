package com.wlht.impl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldg.api.util.DateUtil;
import com.ldg.api.vo.PageParam;
import com.wlht.api.PingyinHandler;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.po.Stdhospitalman;
import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.*;
import com.wlht.impl.mapper.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
@Service
public class ZiDianServiceImpl implements ZiDianService {
    @Autowired
    private StdnationMapper stdnationMapper;
    @Autowired
    private StddomesticrelationMapper stddomesticrelationMapper;
    @Autowired
    private StdhospitalofficeMapper stdhospitalofficeDao;
    @Autowired
    private StdhospitalmanMapper stdhospitalmanDao;
    @Autowired
    private StdconsultationsubjectMapper stdconsultationsubjectMapper;
    @Override
    public String getMinZuCodeByName(String name) {
        String val = "01";
        if (name != null) {
            val = WlhtDataReverseHelper.getMz(name);//先从缓存获取
            if (val != null) {
                return val;
            } else {
                List<String> dblist = stdnationMapper.getMinZuCodeByName(name);
                if (dblist != null && dblist.size() > 0) {
                    val = dblist.get(0);
                    WlhtDataReverseHelper.setMz(name, val);
                } else {
                    val = "01";
                    WlhtDataReverseHelper.setMz(name, val);
                }
            }
        }
        return val;
    }

    @Override
    public String getLXRGX(String gx) {
        String val = "97";
        if (gx != null) {
            val = WlhtDataReverseHelper.getlxrgx(gx);
            if (val != null) {
                return val;
            } else {
                List<String> dblist = stddomesticrelationMapper.getLXRGXCodeByName(gx);
                if (dblist != null && dblist.size() > 0) {
                    val = dblist.get(0);
                    WlhtDataReverseHelper.setlxrgx(gx, val);
                } else {
                    val = "97";
                    WlhtDataReverseHelper.setlxrgx(gx, val);
                }
            }
        }
        return val;
    }

    @Override
    public String getKeshiCodeByName(String rykb) {
        String val = "";
        if (rykb != null) {
            val = WlhtDataReverseHelper.getkeshi(rykb);
            if (val != null) {
                return val;
            } else {
                List<String> dblist = stdhospitalofficeDao.getKeshiCodeByName(rykb);
                if (dblist != null && dblist.size() > 0) {
                    val = dblist.get(0);
                    WlhtDataReverseHelper.setkeshi(rykb, val);
                }
            }
        }
        return val;
    }

    @Override
    public PageInfo<HospitalOfficeVo> getAllHospitalOffice(PageParam pageParam, SearForKs param) {
        PageInfo<HospitalOfficeVo> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> stdhospitalofficeDao.getAllHospitalOffice(param));
        return pageInfo;
    }

    @Override
    public String checkOfficeNameAndCode(HospitalOfficeVo param) {
        List<BigDecimal> ksList = stdhospitalofficeDao.checkKSName(param);
        if (ksList != null && ksList.size() > 0) {
            return "科室名已存在";
        }
        ksList = stdhospitalofficeDao.checkKSCode(param);
        if (ksList != null && ksList.size() > 0) {
            return "科室编码已存在";
        }
        return null;
    }

    @Override
    public int saveKSXXInfo(HospitalOfficeVo param) {
        String ksmc=param.getMingcheng();
        if(StringUtils.isNotBlank(ksmc)){
            param.setPinyin(PingyinHandler.converterToFirstSpell(ksmc));//设置拼音首字母
        }
        return stdhospitalofficeDao.saveKSXXInfo(param);
    }

    @Override
    public PageInfo<HospitalDoctorVo> getAllHospitalMan(PageParam pageParam, SearForKs param) {
        PageInfo<HospitalDoctorVo> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> stdhospitalmanDao.getAllHospitalMan(param));
        return pageInfo;
    }

    @Override
    public String checkIDCardForHospitalMan(HospitalDoctorVo param) {
        List<BigDecimal> ksList = stdhospitalmanDao.checkIDCardForHospitalMan(param);
        if (ksList != null && ksList.size() > 0) {
            return "身份证号已存在";
        }
        return null;
    }

    @Override
    public int saveYSXXInfo(HospitalDoctorVo param) throws ParseException {
        String ysname=param.getYsname();
        if(StringUtils.isNotBlank(ysname)){
            param.setPinyinIndex(PingyinHandler.converterToFirstSpell(ysname));//设置拼音首字母
        }
        String sfz=param.getIdcard();
        if(StringUtils.isNotBlank(sfz)&&sfz.length()==18){
            Date date=DateUtil.getDateBySFZNUM(sfz);
            param.setBirthday(date);
        }
        if(param.getId()!=null){
            return stdhospitalmanDao.updateByPrimaryKeySelectiveForSave(param);
        }
        return stdhospitalmanDao.saveYSXXInfo(param);
    }
    @Override
    public int updateYSXXInfo(HospitalDoctorVo item) throws ParseException{
        String ysname=item.getYsname();
        if(StringUtils.isNotBlank(ysname)){
            item.setPinyinIndex(PingyinHandler.converterToFirstSpell(ysname));//设置拼音首字母
        }
        String sfz=item.getIdcard();
        if(StringUtils.isNotBlank(sfz)&&sfz.length()==18){
            Date date=DateUtil.getDateBySFZNUM(sfz);
            item.setBirthday(date);
        }
        return stdhospitalmanDao.updateYSXXInfo(item);
    }
    @Override
    public List<ZiDianBaseVo> searchKSINFO(FbaiduParam param) {
        return stdhospitalofficeDao.searchKSINFO(param);
    }

    @Override
    public List<ZiDianBaseVo> searchLSKSGJBZINFO(FbaiduParam param) {
        return stdconsultationsubjectMapper.searchLSKSGJBZINFO(param);
    }

    @Override
    public int delHoapitalMan(HospitalDoctorVo param) {
        return stdhospitalmanDao.deleteByPrimaryKey(param.getId());
    }

    @Override
    public HospitalDoctorVo getHoapitalManByIdForEdit(HospitalDoctorVo param) {
        return stdhospitalmanDao.getHoapitalManByIdForEdit(param);
    }

    @Override
    public Long checkKSExistsByKSCodeAndYYIdentity(HospitalOfficeVo item) {
        List<BigDecimal> ksList = stdhospitalofficeDao.checkKSName(item);
        if(ksList!=null&&ksList.size()>0){
            return ksList.get(0).longValue();
        }
        return null;
    }

    @Override
    public int updateKSXXInfo(HospitalOfficeVo item) {
        return stdhospitalofficeDao.updateKSXXInfo(item);
    }

    @Override
    public Long checkYiShiExistsByIDCardAndYYIdentity(HospitalDoctorVo item) {
        List<BigDecimal> ksList = stdhospitalmanDao.checkIDCardForHospitalMan(item);
        if (ksList != null && ksList.size() > 0) {
            return ksList.get(0).longValue();
        }
        return null;
    }

    @Override
    public List<String> selectKeshiCodeByName(String ksname) {
        return stdhospitalofficeDao.selectKeshiCodeByName(ksname);
    }
}
