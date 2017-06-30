package com.wlht.api.po;

public class TBngmyw {
    private Long id;

    private Long zblsh;

    private String gmidentity;

    private String zzjgdm;

    private String zzjgname;

    private String fzjgbsf;

    private String bnh;

    private String name;

    private String jlh;

    private String bm;

    private String gmywname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getZblsh() {
        return zblsh;
    }

    public void setZblsh(Long zblsh) {
        this.zblsh = zblsh;
    }

    public String getGmidentity() {
        return gmidentity;
    }

    public void setGmidentity(String gmidentity) {
        this.gmidentity = gmidentity;
    }

    public String getZzjgdm() {
        return zzjgdm;
    }

    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    public String getZzjgname() {
        return zzjgname;
    }

    public void setZzjgname(String zzjgname) {
        this.zzjgname = zzjgname;
    }

    public String getFzjgbsf() {
        return fzjgbsf;
    }

    public void setFzjgbsf(String fzjgbsf) {
        this.fzjgbsf = fzjgbsf;
    }

    public String getBnh() {
        return bnh;
    }

    public void setBnh(String bnh) {
        this.bnh = bnh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJlh() {
        return jlh;
    }

    public void setJlh(String jlh) {
        this.jlh = jlh;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getGmywname() {
        return gmywname;
    }

    public void setGmywname(String gmywname) {
        this.gmywname = gmywname;
    }

    @Override
    public String toString() {
        return "TBngmyw{" +
                "id=" + id +
                ", zblsh=" + zblsh +
                ", gmidentity='" + gmidentity + '\'' +
                ", zzjgdm='" + zzjgdm + '\'' +
                ", zzjgname='" + zzjgname + '\'' +
                ", fzjgbsf='" + fzjgbsf + '\'' +
                ", bnh='" + bnh + '\'' +
                ", name='" + name + '\'' +
                ", jlh='" + jlh + '\'' +
                ", bm='" + bm + '\'' +
                ", gmywname='" + gmywname + '\'' +
                '}';
    }
}