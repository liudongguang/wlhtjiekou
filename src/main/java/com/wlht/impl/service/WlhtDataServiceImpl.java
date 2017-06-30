package com.wlht.impl.service;

import com.ldg.api.excel.ExcelUtils;
import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgStringUtil;
import com.remote.api.po.Hisview;
import com.remote.api.service.RemoteHisService;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.WlhtStringUtil;
import com.wlht.api.po.TBaBase;
import com.wlht.api.po.TBnsscz;
import com.wlht.api.po.TBnzrr;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.ImportParam;
import com.wlht.impl.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
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
    public String importDataByDate(ImportParam param) throws Exception {
        int days = DateUtil.getZYTSForInt(param.getEnd(), param.getStarte());
        if (days < 0) {
            return "结束日期不能在开始日期之前！";
        } else if (days / 30 >= 6) {
            return "日期区间不能大于6个月！";
        }
        //1.时间段查询
        List<Hisview> hisDataByDate = hisrmService.selectBADateFromHis(param);
        StringBuilder datebetween = new StringBuilder(DateUtil.yyyy_MM_ddFormat.format(param.getStarte()));
        datebetween.append(" 至 ").append(DateUtil.yyyy_MM_ddFormat.format(param.getEnd())).append("--->");
        //2.根据数据的唯一表示查询是否本地系统存在数据
        if (hisDataByDate.size() > 0) {
            hisDataByDate = hisDataByDate.stream().filter(item -> {
                String weiyibiaoshi = WlhtStringUtil.getBaIdentity(item.getSku());
                Long uid = baseMapper.selectByWeiyiBiaoShi(weiyibiaoshi);
                if (uid != null) {
                    return false;
                }
                return true;
            }).collect(Collectors.toList());
            if (hisDataByDate.size() == 0) {
                datebetween.append("都以导入完成！");
                return datebetween.toString();
            }
            List<TBaBase> baseList = hisDataByDate.stream().map(item -> item.getBABase(zidianservice)
            ).collect(Collectors.toList());
            //3.没有存在与本地系统的插入本地库
            for (TBaBase item : baseList) {
                int i = baseMapper.insertSelective(item);
                ///导入到其他表中
                List<TBnzrr> zrrList = item.getBAZRR(zidianservice);//获取责任人列表
                List<TBnsscz> ssczList = item.getSSCZ(zidianservice, zrrList);//手术列表
                if(ssczList.size()>0){
                    sszdDao.batchInsert(ssczList); //1.插入手术信息
                }
                if(zrrList.size()>0) {
                    // zrrDao.batchInsert(zrrList);//2.插入责任人信息
                }
            }
            datebetween.append("成功导入").append(hisDataByDate.size()).append("条信息");
            return datebetween.toString();
        } else {
            datebetween.append("无可导入的数据！");
            return datebetween.toString();
        }

    }
}
