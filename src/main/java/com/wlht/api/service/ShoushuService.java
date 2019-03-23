package com.wlht.api.service;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.po.Stdopslevel;
import com.wlht.api.po.Stdopsoperationmark;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;

import java.util.List;

public interface ShoushuService {
    /**
     * 获取所有手术
     * @param pageParam
     * @param param
     * @return
     */
    PageInfo<SimpleStdopsoperationVo> getAllHospitalShoushu(PageParam pageParam, SearForShoushu param);

    /**
     * 通过手术id获取手术信息
     * @param id
     * @return
     */
    SimpleStdopsoperationVo selectShoushuByID(Long id);

    /**
     * 获取手术等级
     * @return
     */
    List<Stdopslevel> selectShoushuLeves();

    /**
     * 获取手术标识
     * @return
     */
    List<Stdopsoperationmark> selectShoushuMarks();

    /**
     * 修改手术
     * @param param
     * @return
     */
    int saveShoushu(SimpleStdopsoperationVo param);
}
