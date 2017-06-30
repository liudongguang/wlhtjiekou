package com.wlht.impl.mapper;

import com.wlht.api.po.TBnjbzd;

public interface TBnjbzdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnjbzd record);

    int insertSelective(TBnjbzd record);

    TBnjbzd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnjbzd record);

    int updateByPrimaryKey(TBnjbzd record);
}