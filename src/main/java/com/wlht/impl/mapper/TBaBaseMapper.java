package com.wlht.impl.mapper;

import com.wlht.api.po.TBaBase;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TBaBaseMapper extends Mapper<TBaBase> {
    /**
     * 根据唯一表示查询id
     * @param weiyibiaoshi
     * @return
     */
    Long selectByWeiyiBiaoShi(String weiyibiaoshi);

    void insertBatchData(List<TBaBase> baseList);

    int addOne(TBaBase item);
}