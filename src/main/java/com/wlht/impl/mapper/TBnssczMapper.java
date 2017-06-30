package com.wlht.impl.mapper;

import com.wlht.api.po.TBnsscz;

import java.util.List;

public interface TBnssczMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnsscz record);

    int insertSelective(TBnsscz record);

    TBnsscz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnsscz record);

    int updateByPrimaryKey(TBnsscz record);

    void batchInsert(List<TBnsscz> ssczList);
}