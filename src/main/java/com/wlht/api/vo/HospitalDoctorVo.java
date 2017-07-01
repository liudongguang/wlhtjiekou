package com.wlht.api.vo;

import java.util.Date;

/**
 * Created by liudo on 2017/7/1.
 */
public class HospitalDoctorVo {
    private Long id;
    private String ysname;
    private String suozaiks;
    private String idcard;
    private String ksType;
    private Date birthday;
    private Date workday;

    private String yyidentity;//医院标识
    private String pinyinIndex;//姓名拼音首字母

    public String getPinyinIndex() {
        return pinyinIndex;
    }

    public void setPinyinIndex(String pinyinIndex) {
        this.pinyinIndex = pinyinIndex;
    }

    public String getYyidentity() {
        return yyidentity;
    }

    public void setYyidentity(String yyidentity) {
        this.yyidentity = yyidentity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYsname() {
        return ysname;
    }

    public void setYsname(String ysname) {
        this.ysname = ysname;
    }

    public String getSuozaiks() {
        return suozaiks;
    }

    public void setSuozaiks(String suozaiks) {
        this.suozaiks = suozaiks;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getKsType() {
        return ksType;
    }

    public void setKsType(String ksType) {
        this.ksType = ksType;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getWorkday() {
        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }
}
