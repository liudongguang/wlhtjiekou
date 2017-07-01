package com.wlht.impl.mapper;

import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.TBngmyw;

import java.util.List;

public interface TBngmywMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBngmyw record);

    int insertSelective(TBngmyw record);

    TBngmyw selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBngmyw record);

    int updateByPrimaryKey(TBngmyw record);

    void batchInsert(List<TBngmyw> gmywList);

    void batchDelete(List<DelBaseInfo> delList);
}