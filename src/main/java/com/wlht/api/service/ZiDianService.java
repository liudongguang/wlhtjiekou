package com.wlht.api.service;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.SearForKs;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
public interface ZiDianService {
    /**
     * 获取民族编码通过姓名
     * @param name
     * @return
     */
    public String getMinZuCodeByName(String name);

    /**
     * 联系人关系
     * @param gx
     * @return
     */
    String getLXRGX(String gx);

    /**
     * 获取科室编码通过科室名称
     * @param rykb
     * @return
     */
    String getKeshiCodeByName(String rykb);

    /**
     * 获取医院科室字典
     * @param pageParam
     * @param param
     * @return
     */
    PageInfo<HospitalOfficeVo> getAllHospitalOffice(PageParam pageParam, SearForKs param);
}
