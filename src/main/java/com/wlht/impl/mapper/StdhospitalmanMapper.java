package com.wlht.impl.mapper;

import com.wlht.api.po.Stdhospitalman;
import com.wlht.api.vo.HospitalDoctorVo;
import com.wlht.api.vo.SearForKs;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
import java.util.List;

public interface StdhospitalmanMapper extends Mapper<Stdhospitalman> {

    List<HospitalDoctorVo> getAllHospitalMan(SearForKs param);

    List<BigDecimal> checkIDCardForHospitalMan(HospitalDoctorVo param);

    int saveYSXXInfo(HospitalDoctorVo param);

    HospitalDoctorVo getHoapitalManByIdForEdit(HospitalDoctorVo param);

    int updateByPrimaryKeySelectiveForSave(HospitalDoctorVo param);

    int updateYSXXInfo(HospitalDoctorVo item);
}