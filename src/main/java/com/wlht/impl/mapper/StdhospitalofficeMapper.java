package com.wlht.impl.mapper;

import com.wlht.api.po.Stdhospitaloffice;
import com.wlht.api.vo.*;
import org.apache.ibatis.annotations.Param;
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

    /**
     * 修改科室信息，通过科室code与医院标识
     * @param item
     * @return
     */
    int updateKSXXInfo(HospitalOfficeVo item);

    /**
     * 获取科室编码通过科室名称
     * @param ksname
     * @return
     */
    List<String> selectKeshiCodeByName(@Param("ksname") String ksname);

    /**
     * 根据科室id获取单条信息
     * @param param
     * @return
     */
    HospitalOfficeVo getHoapitalOfficeByIdForEdit(HospitalOfficeVo param);

    /**
     * 通过ksid修改
     * @param param
     * @return
     */
    int updateKSXXInfoForEdit(HospitalOfficeVo param);
}