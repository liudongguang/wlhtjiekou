package com.wlht.impl.mapper;

import com.wlht.api.po.Stdopslevel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StdopslevelMapper extends Mapper<Stdopslevel> {
    String selectNameByCode(String level);

    List<Stdopslevel> selectShoushuLeves();
}