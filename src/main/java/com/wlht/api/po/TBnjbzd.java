package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_BNJBZD")
public class TBnjbzd {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZBLSH")
    private Long zblsh;

    @Column(name = "JBIDENTITY")
    private String jbidentity;

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

    @Column(name = "JLH")
    private String jlh;

    @Column(name = "ZDTYPE")
    private String zdtype;

    @Column(name = "JBZDBM")
    private String jbzdbm;

    @Column(name = "ZDRYBQ")
    private String zdrybq;

    @Column(name = "ZLJG")
    private String zljg;

    @Column(name = "SHOUXIEJIBING")
    private String shouxiejibing;

    @Column(name = "ZHENDUANSHUNXU")
    private Integer zhenduanshunxu;

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
     * @return JBIDENTITY
     */
    public String getJbidentity() {
        return jbidentity;
    }

    /**
     * @param jbidentity
     */
    public void setJbidentity(String jbidentity) {
        this.jbidentity = jbidentity;
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
     * @return ZDTYPE
     */
    public String getZdtype() {
        return zdtype;
    }

    /**
     * @param zdtype
     */
    public void setZdtype(String zdtype) {
        this.zdtype = zdtype;
    }

    /**
     * @return JBZDBM
     */
    public String getJbzdbm() {
        return jbzdbm;
    }

    /**
     * @param jbzdbm
     */
    public void setJbzdbm(String jbzdbm) {
        this.jbzdbm = jbzdbm;
    }

    /**
     * @return ZDRYBQ
     */
    public String getZdrybq() {
        return zdrybq;
    }

    /**
     * @param zdrybq
     */
    public void setZdrybq(String zdrybq) {
        this.zdrybq = zdrybq;
    }

    /**
     * @return ZLJG
     */
    public String getZljg() {
        return zljg;
    }

    /**
     * @param zljg
     */
    public void setZljg(String zljg) {
        this.zljg = zljg;
    }

    /**
     * @return SHOUXIEJIBING
     */
    public String getShouxiejibing() {
        return shouxiejibing;
    }

    /**
     * @param shouxiejibing
     */
    public void setShouxiejibing(String shouxiejibing) {
        this.shouxiejibing = shouxiejibing;
    }

    /**
     * @return ZHENDUANSHUNXU
     */
    public Integer getZhenduanshunxu() {
        return zhenduanshunxu;
    }

    /**
     * @param zhenduanshunxu
     */
    public void setZhenduanshunxu(Integer zhenduanshunxu) {
        this.zhenduanshunxu = zhenduanshunxu;
    }
}