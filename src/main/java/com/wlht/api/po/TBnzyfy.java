package com.wlht.api.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "T_BNZYFY")
public class TBnzyfy {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZBLSH")
    private Long zblsh;

    @Column(name = "ZYIDENTITY")
    private String zyidentity;

    @Column(name = "ZZJGDM")
    private String zzjgdm;

    @Column(name = "ZZJGNAME")
    private String zzjgname;

    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    @Column(name = "BAH")
    private String bah;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FYLB")
    private String fylb;

    @Column(name = "JINE")
    private BigDecimal jine;

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
     * @return ZBLSH
     */
    public Long getZblsh() {
        return zblsh;
    }

    /**
     * @param zblsh
     */
    public void setZblsh(Long zblsh) {
        this.zblsh = zblsh;
    }

    /**
     * @return ZYIDENTITY
     */
    public String getZyidentity() {
        return zyidentity;
    }

    /**
     * @param zyidentity
     */
    public void setZyidentity(String zyidentity) {
        this.zyidentity = zyidentity;
    }

    /**
     * @return ZZJGDM
     */
    public String getZzjgdm() {
        return zzjgdm;
    }

    /**
     * @param zzjgdm
     */
    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    /**
     * @return ZZJGNAME
     */
    public String getZzjgname() {
        return zzjgname;
    }

    /**
     * @param zzjgname
     */
    public void setZzjgname(String zzjgname) {
        this.zzjgname = zzjgname;
    }

    /**
     * @return FZJGBSF
     */
    public String getFzjgbsf() {
        return fzjgbsf;
    }

    /**
     * @param fzjgbsf
     */
    public void setFzjgbsf(String fzjgbsf) {
        this.fzjgbsf = fzjgbsf;
    }

    /**
     * @return BAH
     */
    public String getBah() {
        return bah;
    }

    /**
     * @param bah
     */
    public void setBah(String bah) {
        this.bah = bah;
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
     * @return FYLB
     */
    public String getFylb() {
        return fylb;
    }

    /**
     * @param fylb
     */
    public void setFylb(String fylb) {
        this.fylb = fylb;
    }

    /**
     * @return JINE
     */
    public BigDecimal getJine() {
        return jine;
    }

    /**
     * @param jine
     */
    public void setJine(BigDecimal jine) {
        this.jine = jine;
    }
}