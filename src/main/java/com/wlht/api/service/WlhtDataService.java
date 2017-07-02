package com.wlht.api.service;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.po.TCzy;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.ImportParam;
import com.wlht.api.vo.LoginParam;
import com.wlht.api.vo.SearForKs;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public interface WlhtDataService {
    void test();

    String importDataByDate(ImportParam param) throws Exception;

    void delChongfuInfo();

    String importFeiYongDataByDate(ImportParam param);

    TCzy selectCzy(LoginParam param);
}
