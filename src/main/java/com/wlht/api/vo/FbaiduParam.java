package com.wlht.api.vo;

import com.wlht.api.SysConstant;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by liudo on 2017/7/1.
 */
public class FbaiduParam {
    private String searVal;
    private int searchType;
    private String yybaidentity;

    public String getYybaidentity() {
        return yybaidentity;
    }

    public void setYybaidentity(String yybaidentity) {
        this.yybaidentity = yybaidentity;
    }

    public String getSearVal() {
        return searVal;
    }

    public void setSearVal(String searVal) {
        this.searVal = searVal;
        if(StringUtils.isNotBlank(searVal)){
            if(SysConstant.pattern_number.matcher(searVal).matches()){
                searchType=SysConstant.searchTYPE_NUM;
            }else if(SysConstant.getPattern_str.matcher(searVal).matches()){
                searchType=SysConstant.searchTYPE_Str;
            }else {
                searchType=SysConstant.searchTYPE_HanZi;
            }
        }
    }

    public int getSearchType() {
        return searchType;
    }

    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }

    public static void main(String[] args) {
        System.out.println(SysConstant.pattern_number.matcher("112.3").matches());
        System.out.println(SysConstant.getPattern_str.matcher("a1bS").matches());
    }
}
