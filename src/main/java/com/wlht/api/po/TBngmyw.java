package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_BNGMYW")
public class TBngmyw {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 主表流水号
     */
    @Column(name = "ZBLSH")
    private Long zblsh;

    /**
     * 唯一标识
     */
    @Column(name = "GMIDENTITY")
    private String gmidentity;

    /**
     * 机构代码
     */
    @Column(name = "ZZJGDM")
    private String zzjgdm;

    /**
     * 机构名称
     */
    @Column(name = "ZZJGNAME")
    private String zzjgname;

    /**
     * 分支机构
     */
    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    /**
     * 病案号
     */
    @Column(name = "BNH")
    private String bnh;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 记录号
     */
    @Column(name = "JLH")
    private String jlh;

    /**
     * 编码
     */
    @Column(name = "BM")
    private String bm;

    /**
     * 过敏药物名称
     */
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
     * 获取主表流水号
     *
     * @return ZBLSH - 主表流水号
     */
    public Long getZblsh() {
        return zblsh;
    }

    /**
     * 设置主表流水号
     *
     * @param zblsh 主表流水号
     */
    public void setZblsh(Long zblsh) {
        this.zblsh = zblsh;
    }

    /**
     * 获取唯一标识
     *
     * @return GMIDENTITY - 唯一标识
     */
    public String getGmidentity() {
        return gmidentity;
    }

    /**
     * 设置唯一标识
     *
     * @param gmidentity 唯一标识
     */
    public void setGmidentity(String gmidentity) {
        this.gmidentity = gmidentity;
    }

    /**
     * 获取机构代码
     *
     * @return ZZJGDM - 机构代码
     */
    public String getZzjgdm() {
        return zzjgdm;
    }

    /**
     * 设置机构代码
     *
     * @param zzjgdm 机构代码
     */
    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    /**
     * 获取机构名称
     *
     * @return ZZJGNAME - 机构名称
     */
    public String getZzjgname() {
        return zzjgname;
    }

    /**
     * 设置机构名称
     *
     * @param zzjgname 机构名称
     */
    public void setZzjgname(String zzjgname) {
        this.zzjgname = zzjgname;
    }

    /**
     * 获取分支机构
     *
     * @return FZJGBSF - 分支机构
     */
    public String getFzjgbsf() {
        return fzjgbsf;
    }

    /**
     * 设置分支机构
     *
     * @param fzjgbsf 分支机构
     */
    public void setFzjgbsf(String fzjgbsf) {
        this.fzjgbsf = fzjgbsf;
    }

    /**
     * 获取病案号
     *
     * @return BNH - 病案号
     */
    public String getBnh() {
        return bnh;
    }

    /**
     * 设置病案号
     *
     * @param bnh 病案号
     */
    public void setBnh(String bnh) {
        this.bnh = bnh;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取记录号
     *
     * @return JLH - 记录号
     */
    public String getJlh() {
        return jlh;
    }

    /**
     * 设置记录号
     *
     * @param jlh 记录号
     */
    public void setJlh(String jlh) {
        this.jlh = jlh;
    }

    /**
     * 获取编码
     *
     * @return BM - 编码
     */
    public String getBm() {
        return bm;
    }

    /**
     * 设置编码
     *
     * @param bm 编码
     */
    public void setBm(String bm) {
        this.bm = bm;
    }

    /**
     * 获取过敏药物名称
     *
     * @return GMYWNAME - 过敏药物名称
     */
    public String getGmywname() {
        return gmywname;
    }

    /**
     * 设置过敏药物名称
     *
     * @param gmywname 过敏药物名称
     */
    public void setGmywname(String gmywname) {
        this.gmywname = gmywname;
    }
}