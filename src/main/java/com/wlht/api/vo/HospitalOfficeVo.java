package com.wlht.api.vo;

/**
 * Created by liudo on 2017/7/1.
 */
public class HospitalOfficeVo {
    private String keshiBM;
    private String mingcheng;
    private String biaozhunLiShu;
    private String biaozhunLiShuName;
    private Integer chuangweishu;
    private String shouzimuIndex;
    private String ksType;

    private String yyidentity;//医院标识
    private String pinyin;//拼音首字母

    public Integer getChuangweishu() {
        return chuangweishu;
    }

    public void setChuangweishu(Integer chuangweishu) {
        this.chuangweishu = chuangweishu;
    }

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
        return keshiBM;
    }

    public void setKeshiBM(String keshiBM) {
        this.keshiBM = keshiBM;
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

    @Override
    public String toString() {
        return "HospitalOfficeVo{" +
                "KeshiBM='" + keshiBM + '\'' +
                ", mingcheng='" + mingcheng + '\'' +
                ", biaozhunLiShu='" + biaozhunLiShu + '\'' +
                ", biaozhunLiShuName='" + biaozhunLiShuName + '\'' +
                ", chuangweishu=" + chuangweishu +
                ", shouzimuIndex='" + shouzimuIndex + '\'' +
                ", ksType='" + ksType + '\'' +
                ", yyidentity='" + yyidentity + '\'' +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }
}
