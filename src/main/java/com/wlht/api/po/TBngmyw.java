package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_BNGMYW")
public class TBngmyw {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZBLSH")
    private Long zblsh;

    @Column(name = "GMIDENTITY")
    private String gmidentity;

    @Column(name = "ZZJGDM")
    private String zzjgdm;

    @Column(name = "ZZJGNAME")
    private String zzjgname;

    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    @Column(name = "BNH")
    private String bnh;

    @Column(name = "NAME")
    private String name;

    @Column(name = "JLH")
    private String jlh;

    @Column(name = "BM")
    private String bm;

    @Column(name = "GMYWNAME")
    private String gmywname;

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
     * @return GMIDENTITY
     */
    public String getGmidentity() {
        return gmidentity;
    }

    /**
     * @param gmidentity
     */
    public void setGmidentity(String gmidentity) {
        this.gmidentity = gmidentity;
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
     * @return BNH
     */
    public String getBnh() {
        return bnh;
    }

    /**
     * @param bnh
     */
    public void setBnh(String bnh) {
        this.bnh = bnh;
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
     * @return JLH
     */
    public String getJlh() {
        return jlh;
    }

    /**
     * @param jlh
     */
    public void setJlh(String jlh) {
        this.jlh = jlh;
    }

    /**
     * @return BM
     */
    public String getBm() {
        return bm;
    }

    /**
     * @param bm
     */
    public void setBm(String bm) {
        this.bm = bm;
    }

    /**
     * @return GMYWNAME
     */
    public String getGmywname() {
        return gmywname;
    }

    /**
     * @param gmywname
     */
    public void setGmywname(String gmywname) {
        this.gmywname = gmywname;
    }
}