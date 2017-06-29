package com.wlht.impl.mapper;

import com.wlht.api.po.Stddomesticrelation;
import tk.mybatis.mapper.common.Mapper;

public interface StddomesticrelationMapper extends Mapper<Stddomesticrelation> {
    String getLXRGXCodeByName(String gx);
}