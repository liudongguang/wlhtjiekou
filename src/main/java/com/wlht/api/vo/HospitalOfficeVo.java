package com.wlht.api.vo;

/**
 * Created by liudo on 2017/7/1.
 */
public class HospitalOfficeVo {
    private String KeshiBM;
    private String mingcheng;
    private String biaozhunLiShu;
    private String biaozhunLiShuName;
    private String ksType;
    private String shouzimuIndex;
    private String yyidentity;//医院标识
    private String pinyin;//拼音首字母

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getYyidentity() {
        return yyidentity;
    }

    public void setYyidentity(String yyidentity) {
        this.yyidentity = yyidentity;
    }

    public String getKeshiBM() {
        return KeshiBM;
    }

    public void setKeshiBM(String keshiBM) {
        KeshiBM = keshiBM;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getBiaozhunLiShu() {
        return biaozhunLiShu;
    }

    public void setBiaozhunLiShu(String biaozhunLiShu) {
        this.biaozhunLiShu = biaozhunLiShu;
    }

    public String getBiaozhunLiShuName() {
        return biaozhunLiShuName;
    }

    public void setBiaozhunLiShuName(String biaozhunLiShuName) {
        this.biaozhunLiShuName = biaozhunLiShuName;
    }

    public String getKsType() {
        return ksType;
    }

    public void setKsType(String ksType) {
        this.ksType = ksType;
    }

    public String getShouzimuIndex() {
        return shouzimuIndex;
    }

    public void setShouzimuIndex(String shouzimuIndex) {
        this.shouzimuIndex = shouzimuIndex;
    }
}
