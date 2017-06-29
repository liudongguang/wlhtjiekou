package com.wlht.impl.mapper;

import com.wlht.api.po.Stdhospitaloffice;
import tk.mybatis.mapper.common.Mapper;

public interface StdhospitalofficeMapper extends Mapper<Stdhospitaloffice> {
    /**
     * 根据科室名称获取科室编码
     * @param rykb
     * @return
     */
    String getKeshiCodeByName(String rykb);
}