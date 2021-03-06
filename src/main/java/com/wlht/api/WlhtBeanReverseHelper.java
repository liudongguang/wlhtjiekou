package com.wlht.api;

import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgStringUtil;
import com.wlht.api.po.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
public class WlhtBeanReverseHelper {
    /**
     * @param zrrList
     * @param baseid      主表id
     * @param baidentity  唯一标识码
     * @param zrrName     责任人姓名
     * @param bingrenName 病人姓名
     * @param banum       病案号
     * @param zzdm        机构代码
     * @param zzname      机构名称
     * @param zrrType     责任人类型
     */
    public static void handlerZrr(List<TBnzrr> zrrList, Long baseid, String baidentity, String banum, String zrrName, String bingrenName, String zzdm, String zzname, String zrrType) {
        if (StringUtils.isNotBlank(zrrName)) {
            TBnzrr newZrr = new TBnzrr();
            newZrr.setZblsh(baseid);
            newZrr.setBnh(banum);
            newZrr.setZrridentity(baidentity);
            newZrr.setZzjgdm(SysConstant.zzdm);
            newZrr.setZzjgname(SysConstant.zzdmName);
            newZrr.setName(bingrenName);
            newZrr.setJlh("");
            newZrr.setFzjgbsf("0");
            newZrr.setZzjgdm(zzdm);
            newZrr.setZzjgname(zzname);
            newZrr.setZrrname(zrrName);
            newZrr.setBazrrtype(zrrType);
            zrrList.add(newZrr);
        }
    }

    /**
     * @param id         base表的id
     * @param baIdentity 标识
     * @param jlh        记录号
     * @param zrrList    添加的责任人列表
     * @param ssczList   添加的手术列表
     * @param ssjczbm    手术编码
     * @param ssjczrq    手术操作时间
     * @param ssjb       手术级别
     * @param ssjczmc    手术操作名称
     * @param sz         术者
     * @param yz         一助
     * @param ez         二助
     * @param qkdj       切口等级
     * @param qkyhlb     切口愈合类别
     * @param mzfs       麻醉方式
     * @param mzys       麻醉医师
     * @throws ParseException
     *
     *
     *
     *
    切口:0，I ,II ,III,

    愈合:甲  乙  丙   其他
     */
    public static void handlerSSCZ(Long id, String baIdentity, String banum, String brname, String jlh, List<TBnzrr> zrrList, List<TBnsscz> ssczList, String ssjczbm, String ssjczrq, String ssjb, String ssjczmc, String sz, String yz, String ez, String qkdj, String qkyhlb, String mzfs, String mzys) throws ParseException {
        if (StringUtils.isNotBlank(ssjczbm)) {
            TBnsscz newsscz = new TBnsscz();
            if (StringUtils.isNotBlank(ssjb)) {
                if (ssjb.indexOf("一级") != -1) {
                    ssjb = "1";
                    newsscz.setSsczbs("11");
                } else if (ssjb.indexOf("二级") != -1) {
                    newsscz.setSsczbs("11");
                    ssjb = "2";
                } else if (ssjb.indexOf("三级") != -1) {
                    newsscz.setSsczbs("11");
                    ssjb = "3";
                } else if (ssjb.indexOf("四级") != -1) {
                    newsscz.setSsczbs("11");
                    ssjb = "4";
                } else {
                    newsscz.setSsczbs("22");
                }
            }
            if (StringUtils.isNotBlank(qkdj)) {
                    if (qkdj.indexOf("Ⅰ") != -1) {
                        qkdj = "2";
                    } else if (qkdj.indexOf("Ⅱ") != -1) {
                        qkdj = "3";
                    } else if (qkdj.indexOf("Ⅲ") != -1) {
                        qkdj = "4";
                    } else {
                        qkdj = "1";
                    }
                }
                if(StringUtils.isNotBlank(qkyhlb)){
                    if (qkyhlb.indexOf("甲") != -1) {
                        qkyhlb = "1";
                    } else if (qkyhlb.indexOf("乙") != -1) {
                        qkyhlb = "2";
                    } else if (qkyhlb.indexOf("丙") != -1) {
                        qkyhlb = "3";
                    } else {
                        qkyhlb = "9";
                    }
                }



            if (StringUtils.isNotBlank(mzfs)) {
                if (mzfs.indexOf("表面麻醉") != -1) {
                    mzfs = "36";
                } else if (mzfs.indexOf("复合麻醉") != -1) {
                    mzfs = "4";
                } else if (mzfs.indexOf("臂丛阻滞及上肢神经阻滞") != -1
                        || mzfs.indexOf("会阴神经阻滞") != -1) {
                    mzfs = "33";
                } else if (mzfs.indexOf("静脉麻醉") != -1) {
                    mzfs = "12";
                } else if (mzfs.indexOf("局部浸润麻醉") != -1) {
                    mzfs = "35";
                } else if (mzfs.indexOf("局部麻醉") != -1
                        || mzfs.indexOf("局麻") != -1) {
                    mzfs = "3";
                } else if (mzfs.indexOf("气管内全身麻醉") != -1
                        || mzfs.indexOf("吸入麻醉") != -1) {
                    mzfs = "11";
                } else if (mzfs.indexOf("全麻") != -1
                        || mzfs.indexOf("全麻醉") != -1
                        || mzfs.indexOf("全身麻醉") != -1) {
                    mzfs = "1";
                } else if (mzfs.indexOf("蛛网膜") != -1) {
                    mzfs = "21";
                } else if (mzfs.indexOf("椎管内") != -1) {
                    mzfs = "2";
                } else {
                    mzfs = "9";
                }
            }

            // 手术start

            newsscz.setZblsh(id);
            newsscz.setSsidentity(baIdentity);
            newsscz.setBah(banum);
            newsscz.setName(brname);
            newsscz.setZzjgdm(SysConstant.zzdm);
            newsscz.setJgmcname(SysConstant.zzdmName);
            newsscz.setJlh(jlh);
            newsscz.setSsczbm(ssjczbm);// 1
            newsscz.setSsbmname(LdgStringUtil.getStringByLength(ssjczmc,16));// 2
            if(StringUtils.isNotBlank(ssjczrq)&&ssjczrq.length()==10){
                try {
                    newsscz.setSstarttime(DateUtil.yyyy_MM_ddFormat.parse(ssjczrq));// 3
                }
                catch (Exception e){

                }
            }else{
                if(StringUtils.isNotBlank(ssjczrq)&&ssjczrq.length()==16){
                    try{
                        newsscz.setSstarttime(DateUtil.yyyy_MM_dd_HH_mmFormat.parse(ssjczrq));// 3
                    }catch (Exception e){

                    }
                }
            }

            if (StringUtils.isNotBlank(ssjb)) {
                newsscz.setSslevel(ssjb);// 4
            }
            if (LdgStringUtil.isNum(qkdj)) {
                newsscz.setQklevel(Integer.parseInt(qkdj));// 5
            }
//            if (LdgStringUtil.isNum(qkyhdj1)) {
//                newsscz.setYhlevel(Integer.parseInt(qkyhdj1));// 6
//            }
            newsscz.setFzjgbsf("0");
            newsscz.setMzfs(mzfs);
            ssczList.add(newsscz);//添加到手术列表集合
            ////手术end
            // 责任人
            // ////手术者
            WlhtBeanReverseHelper.handlerZrr(zrrList, id, baIdentity, banum, sz, brname, SysConstant.zzdm, SysConstant.zzdmName, "31");
            //助手1
            WlhtBeanReverseHelper.handlerZrr(zrrList, id, baIdentity, banum, yz, brname, SysConstant.zzdm, SysConstant.zzdmName, "32");
            //助手2
            WlhtBeanReverseHelper.handlerZrr(zrrList, id, baIdentity, banum, ez, brname, SysConstant.zzdm, SysConstant.zzdmName, "321");
            //麻醉
            WlhtBeanReverseHelper.handlerZrr(zrrList, id, baIdentity, banum, mzys, brname, SysConstant.zzdm, SysConstant.zzdmName, "33");

        }

    }

    public static void handlerJBZD(Long id, String baidentity, String banum, String name, List<TBnjbzd> jbzdList,String jbmc,String jbbm,String bq,String jbtype) {
        if (StringUtils.isNotBlank(jbbm)) {
            TBnjbzd newjbzd = new TBnjbzd();
            ///
            newjbzd.setZblsh(id);
            newjbzd.setJbidentity(baidentity);
            newjbzd.setBah(banum);
            newjbzd.setName(name);
            newjbzd.setZzjgdm(SysConstant.zzdm);
            newjbzd.setZzjgname(SysConstant.zzdmName);
            //
            newjbzd.setZdtype(jbtype);
            newjbzd.setJbzdbm(jbbm);
            newjbzd.setShouxiejibing(LdgStringUtil.getStringByLength(jbmc,20) );
            newjbzd.setZdrybq(WlhtDataReverseHelper.getZdrybq(bq));
            jbzdList.add(newjbzd);
        }
    }

    public static void handlerFY(Long id, String baidentity, String banum, String name,List<TBnzyfy> ylfsList, BigDecimal jine, String jinetype) {
        if(jine!=null) {
            TBnzyfy newfy = new TBnzyfy();
            //
            newfy.setZblsh(id);
            newfy.setBah(banum);
            newfy.setName(name);
            newfy.setZyidentity(baidentity);
            newfy.setFzjgbsf("0");
            newfy.setZzjgdm(SysConstant.zzdm);
            newfy.setZzjgname(SysConstant.zzdmName);
            //
            newfy.setFylb(jinetype);
            newfy.setJine(jine);
            ylfsList.add(newfy);
        }
    }

    public static void handGMYW(Long id, String baidentity, String banum, String name, List<TBngmyw> gmywList, String gmyw,String jlh) {
        if (StringUtils.isNotBlank(gmyw)) {
            TBngmyw tywgm = new TBngmyw();
            tywgm.setZblsh(id);
            tywgm.setGmidentity(baidentity);
            tywgm.setBnh(banum);
            tywgm.setName(name);
            tywgm.setFzjgbsf("0");
            tywgm.setZzjgdm(SysConstant.zzdm);
            tywgm.setZzjgname(SysConstant.zzdmName);
            tywgm.setJlh(jlh);
            tywgm.setBm("99");
            tywgm.setGmywname(gmyw);
            gmywList.add(tywgm);
        }
    }
}
