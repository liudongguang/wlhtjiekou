package com.wlht.impl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.SearForKs;
import com.wlht.impl.mapper.StddomesticrelationMapper;
import com.wlht.impl.mapper.StdhospitalofficeMapper;
import com.wlht.impl.mapper.StdnationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public String getMinZuCodeByName(String name) {
        String val="01";
        if(name!=null){
             val=WlhtDataReverseHelper.getMz(name);//先从缓存获取
            if(val!=null){
                return val;
            }else {
                List<String> dblist = stdnationMapper.getMinZuCodeByName(name);
                if (dblist != null && dblist.size() > 0) {
                    val = dblist.get(0);
                    WlhtDataReverseHelper.setMz(name, val);
                }else{
                    val = "01";
                    WlhtDataReverseHelper.setMz(name, val);
                }
            }
        }
        return val;
    }

    @Override
    public String getLXRGX(String gx) {
        String val="97";
        if(gx!=null){
            val=WlhtDataReverseHelper.getlxrgx(gx);
            if(val!=null){
                return val;
            }else{
                List<String> dblist=stddomesticrelationMapper.getLXRGXCodeByName(gx);
                if(dblist!=null&&dblist.size()>0){
                    val=dblist.get(0);
                    WlhtDataReverseHelper.setlxrgx(gx,val);
                }else{
                    val="97";
                    WlhtDataReverseHelper.setlxrgx(gx,val);
                }
            }
        }
        return val;
    }

    @Override
    public String getKeshiCodeByName(String rykb) {
        String val="";
        if(rykb!=null){
            val=WlhtDataReverseHelper.getkeshi(rykb);
            if(val!=null){
                return val;
            }else{
                List<String> dblist=stdhospitalofficeDao.getKeshiCodeByName(rykb);
                if(dblist!=null&&dblist.size()>0){
                    val=dblist.get(0);
                    WlhtDataReverseHelper.setkeshi(rykb,val);
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
}
