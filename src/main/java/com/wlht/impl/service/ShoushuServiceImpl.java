package com.wlht.impl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.po.Stdopslevel;
import com.wlht.api.po.Stdopsoperationmark;
import com.wlht.api.service.ShoushuService;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;
import com.wlht.impl.mapper.StdopslevelMapper;
import com.wlht.impl.mapper.StdopsoperationMapper;
import com.wlht.impl.mapper.StdopsoperationmarkMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ShoushuServiceImpl implements ShoushuService {
    @Autowired
    private StdopsoperationMapper stdopsoperationMapper;
    @Autowired
    private StdopslevelMapper stdopslevelMapper;
    @Autowired
    private StdopsoperationmarkMapper stdopsoperationmarkMapper;
    @Override
    public PageInfo<SimpleStdopsoperationVo> getAllHospitalShoushu(PageParam pageParam, SearForShoushu param) {
        PageInfo<SimpleStdopsoperationVo> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> stdopsoperationMapper.getAllHospitalShoushu(param));
        List<SimpleStdopsoperationVo> list = pageInfo.getList();
        for(SimpleStdopsoperationVo simpleStdopsoperationVo:list){
            String level = simpleStdopsoperationVo.getLevel();
            String stdopsoperationmark = simpleStdopsoperationVo.getStdopsoperationmark();
            if(StringUtils.isNotBlank(level)){
                String levelName=stdopslevelMapper.selectNameByCode(level);
                simpleStdopsoperationVo.setLevelName(levelName);
            }
            if(StringUtils.isNotBlank(stdopsoperationmark)){
                String stdopsoperationmarkName=stdopsoperationmarkMapper.selectNameByCode(stdopsoperationmark);
                simpleStdopsoperationVo.setStdopsoperationmarkName(stdopsoperationmarkName);
            }
        }
        return pageInfo;
    }

    @Override
    public SimpleStdopsoperationVo selectShoushuByID(Long id) {
        return stdopsoperationMapper.selectShoushuByID(id);
    }

    @Override
    public List<Stdopslevel> selectShoushuLeves() {
        return stdopslevelMapper.selectShoushuLeves();
    }

    @Override
    public List<Stdopsoperationmark> selectShoushuMarks() {
        List<Stdopsoperationmark> stdopsoperationmarks = stdopsoperationmarkMapper.selectShoushuMarks();
        Iterator<Stdopsoperationmark> iterator = stdopsoperationmarks.iterator();
        while (iterator.hasNext()){
            Stdopsoperationmark next = iterator.next();
            if(next.getCode().length()==1){
                iterator.remove();
            }
        }
        return stdopsoperationmarks;
    }

    @Override
    public int saveShoushu(SimpleStdopsoperationVo param) {
        if(param.getId()==null){
            return 0;
        }
        return stdopsoperationMapper.updateBySimpleStdopsoperationVo(param);
    }
}
