package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_BNZRR")
public class TBnzrr {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZBLSH")
    private Long zblsh;

    @Column(name = "ZRRIDENTITY")
    private String zrridentity;

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

    @Column(name = "BAZRRTYPE")
    private String bazrrtype;

    @Column(name = "ZRRNAME")
    private String zrrname;

    @Column(name = "ZRRIDCARD")
    private String zrridcard;

    @Column(name = "JLH")
    private String jlh;

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
     * @return ZRRIDENTITY
     */
    public String getZrridentity() {
        return zrridentity;
    }

    /**
     * @param zrridentity
     */
    public void setZrridentity(String zrridentity) {
        this.zrridentity = zrridentity;
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
     * @return BAZRRTYPE
     */
    public String getBazrrtype() {
        return bazrrtype;
    }

    /**
     * @param bazrrtype
     */
    public void setBazrrtype(String bazrrtype) {
        this.bazrrtype = bazrrtype;
    }

    /**
     * @return ZRRNAME
     */
    public String getZrrname() {
        return zrrname;
    }

    /**
     * @param zrrname
     */
    public void setZrrname(String zrrname) {
        this.zrrname = zrrname;
    }

    /**
     * @return ZRRIDCARD
     */
    public String getZrridcard() {
        return zrridcard;
    }

    /**
     * @param zrridcard
     */
    public void setZrridcard(String zrridcard) {
        this.zrridcard = zrridcard;
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
}