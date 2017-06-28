package com.remote.impl.service;

import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.remote.impl.mapper.HisviewMapper;
import com.wlht.api.vo.ImportParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Service
public class RemoteHisServiceImpl implements RemoteHisService {
    @Autowired
    private HisviewMapper hisviewMapper;
    @Override
    public List<Hisview> getHisDataByDate() {
        return hisviewMapper.selectAll();
    }

    @Override
    public List<Hisview> selectBADateFromHis(ImportParam param) {
        return hisviewMapper.selectBADateFromHis(param);
    }
}
