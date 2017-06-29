package com.wlht.impl.service;

import com.ldg.api.util.DateUtil;
import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.po.TBaBase;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.ImportParam;
import com.wlht.impl.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Service
public class WlhtDataServiceImpl implements WlhtDataService {
    @Autowired
    private RemoteHisService hisrmService;
    @Autowired
    private TBaBaseMapper baseMapper;
    @Autowired
    private TBnjbzdMapper jbzdDao;
    @Autowired
    private TBnssczMapper sszdDao;
    @Autowired
    private TBnzrrMapper zrrDao;
    @Autowired
    private TBngmywMapper gmywDao;
    @Autowired
    private TBnzyfyMapper zyfyDao;
    @Autowired
    private ZiDianService zidianservice;

    @Override
    public void test() {
        System.out.println("--------------------------");
        List<Hisview> hisDataByDate = hisrmService.getHisDataByDate();
        System.out.println(baseMapper.selectAll());
    }

    @Override
    public String importDataByDate(ImportParam param) {
        int days = DateUtil.getZYTSForInt(param.getEnd(), param.getStarte());
        if (days < 0) {
            return "结束日期不能在开始日期之前！";
        } else if (days / 30 >= 6) {
            return "日期区间不能大于6个月！";
        }
        //1.时间段查询
        List<Hisview> hisDataByDate = hisrmService.selectBADateFromHis(param);
        //2.根据数据的唯一表示查询是否本地系统存在数据
        if (hisDataByDate.size() > 0) {
            hisDataByDate = hisDataByDate.stream().filter(item -> {
                String weiyibiaoshi = item.getSku();
                Long uid = baseMapper.selectByWeiyiBiaoShi(weiyibiaoshi);
                if (uid != null) {
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            //3.没有存在与本地系统的插入本地库
//            hisDataByDate.forEach(item->{
//                TBaBase baBase = item.getBABase();
//                int i=baseMapper.insertSelective(baBase);
//
//            });
            List<TBaBase> baseList = hisDataByDate.stream().map(item -> item.getBABase(zidianservice)
            ).collect(Collectors.toList());
            System.out.println(baseList);
            //baseMapper.insertBatchData(baseList);
            System.out.println(baseList);
        } else {
            return "无可导入的数据！";
        }
        return null;
    }
}
