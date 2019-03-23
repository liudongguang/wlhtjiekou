package com.wlht.api.service;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;

public interface ShoushuService {
    /**
     * 获取所有手术
     * @param pageParam
     * @param param
     * @return
     */
    PageInfo<SimpleStdopsoperationVo> getAllHospitalShoushu(PageParam pageParam, SearForShoushu param);
}
