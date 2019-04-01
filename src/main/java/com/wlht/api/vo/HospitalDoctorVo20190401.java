package com.wlht.api.vo;

import java.util.Date;

public class HospitalDoctorVo20190401 {
    private String ysname;
    private String idcard;
    private String suozaiks;
    private String workday;
    private String yyidentity;
    private String pinyinIndex;
    private Date birthday;

    public String getPinyinIndex() {
        return pinyinIndex;
    }

    public void setPinyinIndex(String pinyinIndex) {
        this.pinyinIndex = pinyinIndex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getYyidentity() {
        return yyidentity;
    }

    public void setYyidentity(String yyidentity) {
        this.yyidentity = yyidentity;
    }

    public String getYsname() {
        return ysname;
    }

    public void setYsname(String ysname) {
        this.ysname = ysname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSuozaiks() {
        return suozaiks;
    }

    public void setSuozaiks(String suozaiks) {
        this.suozaiks = suozaiks;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    @Override
    public String toString() {
        return "HospitalDoctorVo20190401{" +
                "ysname='" + ysname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", suozaiks='" + suozaiks + '\'' +
                ", workday='" + workday + '\'' +
                '}';
    }
}
