package com.wlht.api.vo;

import java.util.Date;

/**
 * Created by liudo on 2017/7/1.
 */
public class HospitalDoctorVo {
    private Long id;
    private String ysname;
    private String suozaiksBm;//所在科室编码
    private String gonghao;//工号
    private String sex;
    private String minzu;
    private String idcard;
    private String suozaiks;
    private String xzgl;//行政管理
    private String zyzgmc;
    private Date birthday;
    private Date workday;
    private String sxzy;
    private String cszy;//从事专业
    private String xueli;//
    private String xuewei;//
    private String pinrenzy;//聘任专业技术职务
    private String yyidentity;//医院标识
    private String pinyinIndex;//姓名拼音首字母


    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getXzgl() {
        return xzgl;
    }

    public void setXzgl(String xzgl) {
        this.xzgl = xzgl;
    }

    public String getZyzgmc() {
        return zyzgmc;
    }

    public void setZyzgmc(String zyzgmc) {
        this.zyzgmc = zyzgmc;
    }

    public String getSxzy() {
        return sxzy;
    }

    public void setSxzy(String sxzy) {
        this.sxzy = sxzy;
    }

    public String getCszy() {
        return cszy;
    }

    public void setCszy(String cszy) {
        this.cszy = cszy;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getXuewei() {
        return xuewei;
    }

    public void setXuewei(String xuewei) {
        this.xuewei = xuewei;
    }

    public String getPinrenzy() {
        return pinrenzy;
    }

    public void setPinrenzy(String pinrenzy) {
        this.pinrenzy = pinrenzy;
    }

    public String getSuozaiksBm() {
        return suozaiksBm;
    }

    public void setSuozaiksBm(String suozaiksBm) {
        this.suozaiksBm = suozaiksBm;
    }

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

    @Override
    public String toString() {
        return "HospitalDoctorVo{" +
                "id=" + id +
                ", ysname='" + ysname + '\'' +
                ", suozaiksBm='" + suozaiksBm + '\'' +
                ", gonghao='" + gonghao + '\'' +
                ", sex='" + sex + '\'' +
                ", minzu='" + minzu + '\'' +
                ", idcard='" + idcard + '\'' +
                ", suozaiks='" + suozaiks + '\'' +
                ", xzgl='" + xzgl + '\'' +
                ", zyzgmc='" + zyzgmc + '\'' +
                ", birthday=" + birthday +
                ", workday=" + workday +
                ", sxzy='" + sxzy + '\'' +
                ", cszy='" + cszy + '\'' +
                ", xueli='" + xueli + '\'' +
                ", xuewei='" + xuewei + '\'' +
                ", pinrenzy='" + pinrenzy + '\'' +
                ", yyidentity='" + yyidentity + '\'' +
                ", pinyinIndex='" + pinyinIndex + '\'' +
                '}';
    }
}
