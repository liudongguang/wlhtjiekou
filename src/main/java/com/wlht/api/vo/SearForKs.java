package com.wlht.api.vo;

/**
 * Created by liudo on 2017/7/1.
 */
public class SearForKs {
    private String ksName;
    private String ksType;
    private String yyIdentity;
   //查询医生使用
    private String ysName;
    private String cardId;
    private String suozaiksbm;

    public String getYsName() {
        return ysName;
    }

    public void setYsName(String ysName) {
        this.ysName = ysName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getSuozaiksbm() {
        return suozaiksbm;
    }

    public void setSuozaiksbm(String suozaiksbm) {
        this.suozaiksbm = suozaiksbm;
    }

    public String getYyIdentity() {
        return yyIdentity;
    }

    public void setYyIdentity(String yyIdentity) {
        this.yyIdentity = yyIdentity;
    }

    public String getKsName() {
        return ksName;
    }

    public void setKsName(String ksName) {
        this.ksName = ksName;
    }

    public String getKsType() {
        return ksType;
    }

    public void setKsType(String ksType) {
        this.ksType = ksType;
    }

}
