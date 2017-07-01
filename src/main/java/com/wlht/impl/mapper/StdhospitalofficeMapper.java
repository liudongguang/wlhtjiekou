package com.wlht.impl.mapper;

import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.SearForKs;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StdhospitalofficeMapper extends Mapper<Stdhospitaloffice> {
    /**
     * 根据科室名称获取科室编码
     * @param rykb
     * @return
     */
    List<String> getKeshiCodeByName(String rykb);
    /**
     * 按照条件获取科室列表
     */
    List<HospitalOfficeVo> getAllHospitalOffice(SearForKs param);
}