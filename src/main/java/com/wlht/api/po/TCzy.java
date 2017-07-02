package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_CZY")
public class TCzy {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "CARDID")
    private String cardid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "BHQX")
    private String bhqx;

    @Column(name = "YYIDENTIRY")
    private String yyidentiry;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELPHONE")
    private String telphone;

    @Column(name = "YYNAME")
    private String yyname;

    @Column(name = "JINRUQX")
    private String jinruqx;

    @Column(name = "GLKSBM")
    private String glksbm;

    @Column(name = "GLSHENHEKS")
    private String glshenheks;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return SEX
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return CARDID
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * @param cardid
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return BHQX
     */
    public String getBhqx() {
        return bhqx;
    }

    /**
     * @param bhqx
     */
    public void setBhqx(String bhqx) {
        this.bhqx = bhqx;
    }

    /**
     * @return YYIDENTIRY
     */
    public String getYyidentiry() {
        return yyidentiry;
    }

    /**
     * @param yyidentiry
     */
    public void setYyidentiry(String yyidentiry) {
        this.yyidentiry = yyidentiry;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return TELPHONE
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * @param telphone
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * @return YYNAME
     */
    public String getYyname() {
        return yyname;
    }

    /**
     * @param yyname
     */
    public void setYyname(String yyname) {
        this.yyname = yyname;
    }

    /**
     * @return JINRUQX
     */
    public String getJinruqx() {
        return jinruqx;
    }

    /**
     * @param jinruqx
     */
    public void setJinruqx(String jinruqx) {
        this.jinruqx = jinruqx;
    }

    /**
     * @return GLKSBM
     */
    public String getGlksbm() {
        return glksbm;
    }

    /**
     * @param glksbm
     */
    public void setGlksbm(String glksbm) {
        this.glksbm = glksbm;
    }

    /**
     * @return GLSHENHEKS
     */
    public String getGlshenheks() {
        return glshenheks;
    }

    /**
     * @param glshenheks
     */
    public void setGlshenheks(String glshenheks) {
        this.glshenheks = glshenheks;
    }
}