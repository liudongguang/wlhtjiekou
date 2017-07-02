package com.wlht.impl.mapper;

import com.wlht.api.po.TCzy;
import com.wlht.api.vo.LoginParam;
import tk.mybatis.mapper.common.Mapper;

public interface TCzyMapper extends Mapper<TCzy> {
    TCzy selectCzy(LoginParam param);
}