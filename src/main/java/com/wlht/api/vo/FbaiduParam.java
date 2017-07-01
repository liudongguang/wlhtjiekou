package com.wlht.api.vo;

import com.wlht.api.SysConstant;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by liudo on 2017/7/1.
 */
public class FbaiduParam {
    private String searVal;
    private int searchType=1;
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
        if(StringUtils.isNotBlank(searVal)){
            if(SysConstant.pattern_code.matcher(searVal).matches()){
                searchType=SysConstant.searchTYPE_NUM;
            }else if(SysConstant.getPattern_str.matcher(searVal).matches()){
                searchType=SysConstant.searchTYPE_Str;
            }else {
                searchType=SysConstant.searchTYPE_HanZi;
            }
        }
        this.searVal = searVal;
    }

    public int getSearchType() {
        return searchType;
    }

    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }

    @Override
    public String toString() {
        return "FbaiduParam{" +
                "searVal='" + searVal + '\'' +
                ", searchType=" + searchType +
                ", yybaidentity='" + yybaidentity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(SysConstant.pattern_code.matcher("1a").matches());
        System.out.println(SysConstant.getPattern_str.matcher("abS").matches());
    }
}
