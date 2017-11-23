package com.wlht.impl.mapper;

import com.wlht.api.po.Stdconsultationsubject;
import com.wlht.api.vo.FbaiduParam;
import com.wlht.api.vo.ZiDianBaseVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StdconsultationsubjectMapper extends Mapper<Stdconsultationsubject> {
    List<ZiDianBaseVo> searchLSKSGJBZINFO(FbaiduParam param);

}