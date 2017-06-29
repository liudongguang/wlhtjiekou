package com.wlht.impl.mapper;

import com.wlht.api.po.Stdnation;
import tk.mybatis.mapper.common.Mapper;

public interface StdnationMapper extends Mapper<Stdnation> {
    String getMinZuCodeByName(String name);
}