package com.wlht.api.po;

import javax.persistence.*;

@Table(name = "T_BNJBZD")
public class TBnjbzd {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 疾病诊断主表流水号
     */
    @Column(name = "ZBLSH")
    private Long zblsh;

    /**
     * 疾病唯一标识
     */
    @Column(name = "JBIDENTITY")
    private String jbidentity;

    /**
     * 疾病机构代码
     */
    @Column(name = "ZZJGDM")
    private String zzjgdm;

    /**
     * 疾病机构名称
     */
    @Column(name = "ZZJGNAME")
    private String zzjgname;

    /**
     * 分支机构标识符
     */
    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    /**
     * 病案号
     */
    @Column(name = "BAH")
    private String bah;

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
     * 诊断类型
     */
    @Column(name = "ZDTYPE")
    private String zdtype;

    /**
     * 诊断编码
     */
    @Column(name = "JBZDBM")
    private String jbzdbm;

    /**
     * 诊断病情
     */
    @Column(name = "ZDRYBQ")
    private String zdrybq;

    /**
     * 治疗结果
     */
    @Column(name = "ZLJG")
    private String zljg;

    /**
     * 手写疾病名称
     */
    @Column(name = "SHOUXIEJIBING")
    private String shouxiejibing;

    /**
     * 顺位
     */
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
     * 获取疾病诊断主表流水号
     *
     * @return ZBLSH - 疾病诊断主表流水号
     */
    public Long getZblsh() {
        return zblsh;
    }

    /**
     * 设置疾病诊断主表流水号
     *
     * @param zblsh 疾病诊断主表流水号
     */
    public void setZblsh(Long zblsh) {
        this.zblsh = zblsh;
    }

    /**
     * 获取疾病唯一标识
     *
     * @return JBIDENTITY - 疾病唯一标识
     */
    public String getJbidentity() {
        return jbidentity;
    }

    /**
     * 设置疾病唯一标识
     *
     * @param jbidentity 疾病唯一标识
     */
    public void setJbidentity(String jbidentity) {
        this.jbidentity = jbidentity;
    }

    /**
     * 获取疾病机构代码
     *
     * @return ZZJGDM - 疾病机构代码
     */
    public String getZzjgdm() {
        return zzjgdm;
    }

    /**
     * 设置疾病机构代码
     *
     * @param zzjgdm 疾病机构代码
     */
    public void setZzjgdm(String zzjgdm) {
        this.zzjgdm = zzjgdm;
    }

    /**
     * 获取疾病机构名称
     *
     * @return ZZJGNAME - 疾病机构名称
     */
    public String getZzjgname() {
        return zzjgname;
    }

    /**
     * 设置疾病机构名称
     *
     * @param zzjgname 疾病机构名称
     */
    public void setZzjgname(String zzjgname) {
        this.zzjgname = zzjgname;
    }

    /**
     * 获取分支机构标识符
     *
     * @return FZJGBSF - 分支机构标识符
     */
    public String getFzjgbsf() {
        return fzjgbsf;
    }

    /**
     * 设置分支机构标识符
     *
     * @param fzjgbsf 分支机构标识符
     */
    public void setFzjgbsf(String fzjgbsf) {
        this.fzjgbsf = fzjgbsf;
    }

    /**
     * 获取病案号
     *
     * @return BAH - 病案号
     */
    public String getBah() {
        return bah;
    }

    /**
     * 设置病案号
     *
     * @param bah 病案号
     */
    public void setBah(String bah) {
        this.bah = bah;
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
     * 获取诊断类型
     *
     * @return ZDTYPE - 诊断类型
     */
    public String getZdtype() {
        return zdtype;
    }

    /**
     * 设置诊断类型
     *
     * @param zdtype 诊断类型
     */
    public void setZdtype(String zdtype) {
        this.zdtype = zdtype;
    }

    /**
     * 获取诊断编码
     *
     * @return JBZDBM - 诊断编码
     */
    public String getJbzdbm() {
        return jbzdbm;
    }

    /**
     * 设置诊断编码
     *
     * @param jbzdbm 诊断编码
     */
    public void setJbzdbm(String jbzdbm) {
        this.jbzdbm = jbzdbm;
    }

    /**
     * 获取诊断病情
     *
     * @return ZDRYBQ - 诊断病情
     */
    public String getZdrybq() {
        return zdrybq;
    }

    /**
     * 设置诊断病情
     *
     * @param zdrybq 诊断病情
     */
    public void setZdrybq(String zdrybq) {
        this.zdrybq = zdrybq;
    }

    /**
     * 获取治疗结果
     *
     * @return ZLJG - 治疗结果
     */
    public String getZljg() {
        return zljg;
    }

    /**
     * 设置治疗结果
     *
     * @param zljg 治疗结果
     */
    public void setZljg(String zljg) {
        this.zljg = zljg;
    }

    /**
     * 获取手写疾病名称
     *
     * @return SHOUXIEJIBING - 手写疾病名称
     */
    public String getShouxiejibing() {
        return shouxiejibing;
    }

    /**
     * 设置手写疾病名称
     *
     * @param shouxiejibing 手写疾病名称
     */
    public void setShouxiejibing(String shouxiejibing) {
        this.shouxiejibing = shouxiejibing;
    }

    /**
     * 获取顺位
     *
     * @return ZHENDUANSHUNXU - 顺位
     */
    public Integer getZhenduanshunxu() {
        return zhenduanshunxu;
    }

    /**
     * 设置顺位
     *
     * @param zhenduanshunxu 顺位
     */
    public void setZhenduanshunxu(Integer zhenduanshunxu) {
        this.zhenduanshunxu = zhenduanshunxu;
    }
}