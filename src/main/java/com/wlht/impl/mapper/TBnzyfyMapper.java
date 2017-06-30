package com.wlht.impl.mapper;

import com.wlht.api.po.TBnzyfy;

public interface TBnzyfyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnzyfy record);

    int insertSelective(TBnzyfy record);

    TBnzyfy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnzyfy record);

    int updateByPrimaryKey(TBnzyfy record);
}