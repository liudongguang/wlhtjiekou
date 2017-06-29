package com.wlht.impl.service;

import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.service.ZiDianService;
import com.wlht.impl.mapper.StddomesticrelationMapper;
import com.wlht.impl.mapper.StdhospitalofficeMapper;
import com.wlht.impl.mapper.StdnationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if(name==null){
            name="";
        }
        String val=WlhtDataReverseHelper.getMz(name);
        if(val!=null){
            return val;
        }else{
            val=stdnationMapper.getMinZuCodeByName(name);
            if(val!=null){
                WlhtDataReverseHelper.setMz(name,val);
            }else {
               val="01";
                WlhtDataReverseHelper.setMz(name,val);
            }
        }
        return val;
    }

    @Override
    public String getLXRGX(String gx) {
        if(gx==null){
            gx="";
        }
        String val=WlhtDataReverseHelper.getlxrgx(gx);
        if(val!=null){
            return val;
        }else{
            val= stddomesticrelationMapper.getLXRGXCodeByName(gx);
            if(val!=null){
                WlhtDataReverseHelper.setlxrgx(gx,val);
            }else {
                val="97";
                WlhtDataReverseHelper.setlxrgx(gx,val);
            }
        }
        return val;
    }

    @Override
    public String getKeshiCodeByName(String rykb) {
        if(rykb==null){
            rykb="";
        }
        String val=WlhtDataReverseHelper.getkeshi(rykb);
        if(val!=null){
            return val;
        }else{
            val= stdhospitalofficeDao.getKeshiCodeByName(rykb);
            if(val!=null){
                WlhtDataReverseHelper.setkeshi(rykb,val);
            }else {
                val="97";
                WlhtDataReverseHelper.setkeshi(rykb,val);
            }
        }
        return val;
    }
}
