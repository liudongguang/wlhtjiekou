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

    private final static Map<String, String> zdrybq = new HashMap<>();//诊断入院病情

    private final static Map<String, String> keshiType = new HashMap<>();//科室类型

    private final static Map<String, String> fuhestatus = new HashMap<>();//符合情况

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
        rh.put("阴", 1);
        rh.put("阳", 2);
        rh.put("不详", 3);
        rh.put("未查", 4);
        //
        lyfs.put("其他", "9");
        lyfs.put("非医嘱离院", "4");
        lyfs.put("医嘱离院", "1");
        lyfs.put("医嘱转院", "2");
        lyfs.put("医嘱转社区卫生服务机构/乡镇卫生院", "3");
        lyfs.put("死亡", "5");
        //
        zdrybq.put("有", "1");
        zdrybq.put("临床未确定", "2");
        zdrybq.put("情况不明", "3");
        zdrybq.put("无", "4");
        //
        keshiType.put("门诊科室", "1");
        keshiType.put("住院科室", "2");
        keshiType.put("医技科室", "3");
        keshiType.put("管理科室", "4");
        keshiType.put("后勤科室", "5");
        keshiType.put("其他科室", "6");
        //
        fuhestatus.put("符合", "1");
        fuhestatus.put("不符合", "2");
        fuhestatus.put("未做", "3");
    }

    public static String getYlfs(String source) {
        if (source == null) {
            return "90";
        }
        return ylfs.get(source) == null ? "90" : ylfs.get(source.trim());
    }

    public static Integer getXb(String source) {
        if (source == null) {
            return 9;
        }
        return xb.get(source) == null ? 9 : xb.get(source.trim());
    }

    public static void setMz(String key, String val) {
        mz.put(key, val);
    }

    public static String getMz(String key) {
        return mz.get(key);
    }

    public static String getzhiye(String source) {
        if (source == null) {
            return "90";
        }
        return zy.get(source) == null ? "90" : zy.get(source.trim());
    }

    public static String gethunyin(String source) {
        if (source == null) {
            return "90";
        }
        return hy.get(source) == null ? "90" : hy.get(source.trim());
    }

    public static void setlxrgx(String key, String val) {
        lxrgx.put(key, val);
    }

    public static String getlxrgx(String key) {
        return lxrgx.get(key);
    }

    public static String getrytj(String source) {
        if (source == null) {
            return "9";
        }
        return rytj.get(source) == null ? "9" : rytj.get(source.trim());
    }

    public static void setkeshi(String key, String val) {
        keshi.put(key, val);
    }

    public static String getkeshi(String key) {
        return keshi.get(key);
    }

    public static Integer getXx(String source) {
        if (source == null) {
            return 6;
        }
        return xx.get(source) == null ? 6 : xx.get(source.trim());
    }

    public static Integer getRh(String source) {
        if (source == null) {
            return 4;
        }
        return rh.get(source) == null ? 4 : rh.get(source.trim());
    }

    public static String getYLFS(String source) {
        if (source == null) {
            return "9";
        }
        return lyfs.get(source) == null ? "9" : lyfs.get(source.trim());
    }

    public static String getZdrybq(String source) {
        if (source == null) {
            return "4";
        }
        return zdrybq.get(source) == null ? "4" : zdrybq.get(source.trim());
    }

    public static String getKeShiType(String source) {
        if (source == null) {
            return "6";
        }
        return keshiType.get(source) == null ? "6" : keshiType.get(source.trim());
    }

    public static String getFuhestatus(String source) {
        if (source == null) {
            return "3";
        }
        return fuhestatus.get(source) == null ? "3" : keshiType.get(source.trim());
    }

}
