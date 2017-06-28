package com.remote.api.service;

import com.remote.api.po.Hisview;
import com.wlht.api.vo.ImportParam;

import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public interface RemoteHisService {
    List<Hisview> getHisDataByDate();

    List<Hisview> selectBADateFromHis(ImportParam param);

    int addRemotePatients(List<Hisview> rslist);
}
