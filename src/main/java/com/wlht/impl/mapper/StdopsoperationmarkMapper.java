package com.wlht.impl.mapper;

import com.wlht.api.po.Stdopsoperationmark;
import tk.mybatis.mapper.common.Mapper;

public interface StdopsoperationmarkMapper extends Mapper<Stdopsoperationmark> {
    String selectNameByCode(String stdopsoperationmark);
}