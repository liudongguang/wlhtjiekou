package com.wlht.api.service;

import com.wlht.api.vo.ImportParam;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public interface WlhtDataService {
    void test();

    String importDataByDate(ImportParam param) throws Exception;
}
