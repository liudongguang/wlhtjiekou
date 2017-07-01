package com.wlht.api.service;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.vo.*;

import java.text.ParseException;
import java.util.List;

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

    /**
     * 根据科室名称，科室编码判断是否存在
     * @param param
     * @return
     */
    String checkOfficeNameAndCode(HospitalOfficeVo param);

    /**
     * 添加科室数据
     * @param param
     * @return
     */
    int saveKSXXInfo(HospitalOfficeVo param);

    /**
     * 获取医生列表
     * @param pageParam
     * @param param
     * @return
     */
    PageInfo<HospitalDoctorVo> getAllHospitalMan(PageParam pageParam, SearForKs param);

    /**
     * 通过身份证好查询是否存在
     * @param param
     * @return
     */
    String checkIDCardForHospitalMan(HospitalDoctorVo param);

    /**
     * 保存医生信息
     * @param param
     * @return
     */
    int saveYSXXInfo(HospitalDoctorVo param) throws ParseException;
    /**
     *
     * 查找科室，通过代码，简拼，汉字
     */

    List<ZiDianBaseVo> searchKSINFO(FbaiduParam param);
}
