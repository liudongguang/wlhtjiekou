package com.wlht.impl.service;

import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.service.WlhtDataService;
import com.wlht.impl.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Service
public class WlhtDataServiceImpl  implements WlhtDataService{
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

    @Override
    public void test() {
        List<Hisview> hisDataByDate = hisrmService.getHisDataByDate();
        baseMapper.selectAll();
    }
}
