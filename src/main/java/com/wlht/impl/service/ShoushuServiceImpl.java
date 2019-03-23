package com.wlht.impl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.service.ShoushuService;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;
import com.wlht.impl.mapper.StdopsoperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoushuServiceImpl implements ShoushuService {
    @Autowired
    private StdopsoperationMapper stdopsoperationMapper;
    @Override
    public PageInfo<SimpleStdopsoperationVo> getAllHospitalShoushu(PageParam pageParam, SearForShoushu param) {
        PageInfo<SimpleStdopsoperationVo> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> stdopsoperationMapper.getAllHospitalShoushu(param));

        return pageInfo;
    }
}
