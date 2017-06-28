package com.remote.impl.mapper;

import com.remote.api.po.Hisview;
import com.wlht.api.vo.ImportParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HisviewMapper extends Mapper<Hisview> {
    List<Hisview> selectBADateFromHis(ImportParam param);
}