package com.wlht.impl.mapper;

import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.vo.*;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
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

    /**
     * 按科室名与医院标识查找
     * @param param
     * @return
     */
    List<BigDecimal> checkKSName(HospitalOfficeVo param);
    /**
     * 按科编码与医院标识查找
     * @param param
     * @return
     */
    List<BigDecimal> checkKSCode(HospitalOfficeVo param);

    /**
     * 插入科室信息
     * @param param
     * @return
     */
    int saveKSXXInfo(HospitalOfficeVo param);

    List<ZiDianBaseVo> searchKSINFO(FbaiduParam param);
}