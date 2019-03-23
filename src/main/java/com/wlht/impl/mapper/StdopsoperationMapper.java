package com.wlht.impl.mapper;

import com.wlht.api.po.Stdopsoperation;
import com.wlht.api.vo.SearForKs;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StdopsoperationMapper extends Mapper<Stdopsoperation> {
    List<SimpleStdopsoperationVo> getAllHospitalShoushu(SearForShoushu param);
}