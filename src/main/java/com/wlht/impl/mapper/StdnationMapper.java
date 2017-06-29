package com.wlht.impl.mapper;

import com.wlht.api.po.Stdnation;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StdnationMapper extends Mapper<Stdnation> {
    List<String> getMinZuCodeByName(String name);
}