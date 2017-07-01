package com.wlht.impl.mapper;

import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.TBnjbzd;

import java.util.List;

public interface TBnjbzdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBnjbzd record);

    int insertSelective(TBnjbzd record);

    TBnjbzd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBnjbzd record);

    int updateByPrimaryKey(TBnjbzd record);

    void batchInsert(List<TBnjbzd> jbzdList);

    void batchDelete(List<DelBaseInfo> delList);
}