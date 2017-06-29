package com.wlht.api;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
public class WlhtStringUtil {
    public static String getBaIdentity20170629(String source) {
        StringBuilder rtStr = new StringBuilder("1-");
        String qianStr=source.split("-")[0];
        rtStr.append(qianStr.substring(2));
        return rtStr.toString();
    }
    public static String getBaIdentity(String source) {
        StringBuilder rtStr = new StringBuilder("1-");
        int sourceLength = source.length();
        if (sourceLength < 8) {
            StringBuilder lingStr = new StringBuilder();
            int lingNum = 8 - sourceLength;
            for (int i = 0; i < lingNum; i++) {
                lingStr.append("0");
            }
            rtStr.append(lingStr).append(source);
        } else {
            return getBaIdentity20170629(source);
        }
        return rtStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(getBaIdentity20170629("0000057339-1"));
    }
}
