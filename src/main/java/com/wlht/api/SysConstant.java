package com.wlht.api;

import java.util.regex.Pattern;

/**
 * Created by LiuDongguang on 2017/4/19.
 */
public interface SysConstant {
    String zzdm = "46064108-7";
    String zzdmName = "科右前旗人民医院";
    String type_BigDecimal = "java.math.BigDecimal";
    String type_Long = "java.lang.Long";
    String type_String = "java.lang.String";
    String type_Short = "java.lang.Short";
    String type_Date = "java.util.Date";
    Pattern pattern_code = Pattern.compile("^[A-Za-z]?[0-9]*\\.?[0-9]*$");
    Pattern getPattern_str=Pattern.compile("^[A-Za-z]+$");
    int searchTYPE_NUM=1;
    int searchTYPE_Str=2;
    int searchTYPE_HanZi=3;
    String sessionUSER="user";

}
