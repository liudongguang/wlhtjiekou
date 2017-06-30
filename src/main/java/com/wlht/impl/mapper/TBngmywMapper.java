package com.wlht.impl.mapper;

import com.wlht.api.po.TBngmyw;

public interface TBngmywMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBngmyw record);

    int insertSelective(TBngmyw record);

    TBngmyw selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBngmyw record);

    int updateByPrimaryKey(TBngmyw record);
}