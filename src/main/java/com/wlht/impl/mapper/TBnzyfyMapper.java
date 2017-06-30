package com.wlht.impl.mapper;

import com.wlht.api.po.TBnzyfy;

import java.util.List;

public interface TBnzyfyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnzyfy record);

    int insertSelective(TBnzyfy record);

    TBnzyfy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnzyfy record);

    int updateByPrimaryKey(TBnzyfy record);

    void batchInsert(List<TBnzyfy> zlfyList);
}