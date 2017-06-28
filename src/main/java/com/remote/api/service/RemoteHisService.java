package com.remote.api.service;

import com.remote.api.po.Hisview;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public interface RemoteHisService {
    List<Hisview> getHisDataByDate();
}
