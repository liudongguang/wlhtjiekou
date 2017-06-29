package com.wlht.impl.mapper;

import com.wlht.api.po.Stddomesticrelation;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StddomesticrelationMapper extends Mapper<Stddomesticrelation> {
    List<String> getLXRGXCodeByName(String gx);
}