package com.wlht.impl.mapper;

import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.TBnzrr;

import java.util.List;

public interface TBnzrrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnzrr record);

    int insertSelective(TBnzrr record);

    TBnzrr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnzrr record);

    int updateByPrimaryKey(TBnzrr record);

    void batchInsert(List<TBnzrr> zrrList);

    void batchDelete(List<DelBaseInfo> delList);
}