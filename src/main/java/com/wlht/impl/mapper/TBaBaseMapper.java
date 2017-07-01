package com.wlht.impl.mapper;

import com.wlht.api.bo.DelBaseInfo;
import com.wlht.api.po.TBaBase;

import java.util.List;

public interface TBaBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBaBase record);

    int insertSelective(TBaBase record);

    TBaBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBaBase record);

    int updateByPrimaryKey(TBaBase record);

    Long selectByWeiyiBiaoShi(String weiyibiaoshi);

    List<TBaBase> selectAll();

    List<DelBaseInfo> getDelBaseInfo();

    void batchDelete(List<DelBaseInfo> delList);
}