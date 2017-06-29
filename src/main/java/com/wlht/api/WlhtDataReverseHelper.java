package com.wlht.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
public class WlhtDataReverseHelper {
    private final static Map<String, String> ylfs = new HashMap<>();//医疗付费方式
    private final static Map<String, Integer> xb = new HashMap<>();//性别
    private final static Map<String, String> mz = new ConcurrentHashMap<>();//民族
    private final static Map<String, String> zy = new HashMap<>();//职业
    private final static Map<String, String> hy = new HashMap<>();//婚姻
    private final static Map<String, String> lxrgx = new ConcurrentHashMap<>();//联系人关系
    private final static Map<String, String> rytj = new HashMap<>();//入院途径
    private final static Map<String, String> keshi = new ConcurrentHashMap<>();//科室
    private final static Map<String, Integer> xx = new HashMap<>();//血型
    private final static Map<String, Integer> rh = new HashMap<>();//RH血型
    private final static Map<String, String> lyfs = new ConcurrentHashMap<>();//离院方式
    static {
        ylfs.put("全自费", "70");
        ylfs.put("新型农村合作医疗", "30");
        ylfs.put("城镇居民基本医疗保险", "20");
        ylfs.put("城镇职工基本医疗保险", "10");
        //
        xb.put("男", 1);
        xb.put("女", 2);
        //
        zy.put("无业", "70");
        zy.put("农民", "27");
        zy.put("专业技术人员", "13");
        zy.put("其他", "90");
        //
        hy.put("已婚", "20");
        hy.put("未婚", "10");
        hy.put("初婚", "21");
        hy.put("再婚", "22");
        hy.put("复婚", "23");
        hy.put("丧偶", "30");
        hy.put("离婚", "40");
        //
        rytj.put("门诊", "40");
        rytj.put("急诊", "40");
        //
        xx.put("A", 1);
        xx.put("B", 2);
        xx.put("O", 3);
        xx.put("AB", 4);
        xx.put("不详", 5);
        xx.put("未查", 6);
        //
        rh.put("阴",1);
        rh.put("阳",2);
        rh.put("不详",3);
        rh.put("未查",4);
        //
        lyfs.put("其他","9");
        lyfs.put("非医嘱离院","4");
        lyfs.put("医嘱离院","1");
        lyfs.put("医嘱转院","2");
        lyfs.put("医嘱转社区卫生服务机构/乡镇卫生院","3");
        lyfs.put("死亡","5");
    }

    public static String getYlfs(String source) {
        return ylfs.get(source) == null ? "90" : ylfs.get(source);
    }

    public static Integer getXb(String source) {
        return xb.get(source) == null ? 9 : xb.get(source);
    }

    public static void setMz(String key, String val) {
        mz.put(key, val);
    }

    public static String getMz(String key) {
        return mz.get(key);
    }

    public static String getzhiye(String source) {
        return zy.get(source) == null ? "90" : zy.get(source);
    }

    public static String gethunyin(String source) {
        return hy.get(source) == null ? "90" : hy.get(source);
    }

    public static void setlxrgx(String key, String val) {
        lxrgx.put(key, val);
    }

    public static String getlxrgx(String key) {
        return lxrgx.get(key);
    }

    public static String getrytj(String source) {
        return rytj.get(source) == null ? "9" : rytj.get(source);
    }

    public static void setkeshi(String key, String val) {
        keshi.put(key, val);
    }

    public static String getkeshi(String key) {
        return keshi.get(key);
    }

    public static Integer getXx(String source) {
        return xx.get(source) == null ? 6 : xx.get(source);
    }

    public static Integer getRh(String source) {
        return rh.get(source) == null ? 4 : rh.get(source);
    }

    public static String getYLFS(String source) {
        return lyfs.get(source) == null ? "9" : lyfs.get(source);
    }
}
