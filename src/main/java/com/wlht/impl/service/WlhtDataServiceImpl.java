package com.wlht.impl.service;

import com.ldg.api.util.DateUtil;
import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.service.WlhtDataService;
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
public class WlhtDataServiceImpl  implements WlhtDataService{
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

    @Override
    public void test() {
        List<Hisview> hisDataByDate = hisrmService.getHisDataByDate();
        baseMapper.selectAll();
    }

    @Override
    public String importDataByDate(ImportParam param) {
        int days = DateUtil.getZYTSForInt(param.getEnd(), param.getStarte());
        if (days < 0) {
            return"结束日期不能在开始日期之前！";
        } else if (days / 30 >= 6) {
            return  "日期区间不能大于6个月！";
        }
        //1.时间段查询
        List<Hisview> hisDataByDate = hisrmService.selectBADateFromHis(param);
        //2.根据数据的唯一表示查询是否本地系统存在数据
        if(hisDataByDate.size()>0){
            hisDataByDate=hisDataByDate.stream().filter(item->{
                String weiyibiaoshi=item.getSku();
                Long uid= baseMapper.selectByWeiyiBiaoShi(weiyibiaoshi);
                if(uid!=null){
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            //3.没有存在与本地系统的插入本地库
            hisDataByDate.forEach(item->{

            });
        }
        return null;
    }
}
