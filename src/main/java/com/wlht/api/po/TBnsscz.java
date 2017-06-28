package com.wlht.api.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_BNSSCZ")
public class TBnsscz {
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
    @Column(name = "SSIDENTITY")
    private String ssidentity;

    /**
     * 机构代码
     */
    @Column(name = "ZZJGDM")
    private String zzjgdm;

    /**
     * 机构名称
     */
    @Column(name = "JGMCNAME")
    private String jgmcname;

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
     * 操作标识 
     */
    @Column(name = "SSCZBS")
    private String ssczbs;

    /**
     * 手术开始时间
     */
    @Column(name = "SSTARTTIME")
    private Date sstarttime;

    /**
     * 手术结束时间
     */
    @Column(name = "SSENDTIME")
    private Date ssendtime;

    /**
     * 手术级别
     */
    @Column(name = "SSLEVEL")
    private String sslevel;

    /**
     * 手术操作编码
     */
    @Column(name = "SSCZBM")
    private String ssczbm;

    /**
     * 切口等级
     */
    @Column(name = "QKLEVEL")
    private Integer qklevel;

    /**
     * 愈合类别
     */
    @Column(name = "YHLEVEL")
    private Integer yhlevel;

    /**
     * 手术性质 
     */
    @Column(name = "SSXZ")
    private String ssxz;

    /**
     * 风险分级
     */
    @Column(name = "SSFXFJ")
    private Integer ssfxfj;

    /**
     * 野皮准备方法
     */
    @Column(name = "SSYPZB")
    private Integer ssypzb;

    /**
     * 手术部位
     */
    @Column(name = "SSBW")
    private String ssbw;

    /**
     * 感染部位
     */
    @Column(name = "SSGRBW")
    private String ssgrbw;

    /**
     * 新技术或项目
     */
    @Column(name = "SSISNEW")
    private Integer ssisnew;

    /**
     * 异物遗留
     */
    @Column(name = "SSYWYL")
    private Integer ssywyl;

    /**
     * 手术性质
     */
    @Column(name = "SSTIME")
    private String sstime;

    /**
     * 手术中出血量
     */
    @Column(name = "SSCXL")
    private BigDecimal sscxl;

    /**
     * 手术后并发症
     */
    @Column(name = "SSBFZ")
    private String ssbfz;

    /**
     * 重返手术室目的
     */
    @Column(name = "CFSSMD")
    private String cfssmd;

    /**
     * 麻醉方式
     */
    @Column(name = "MZFS")
    private String mzfs;

    /**
     * 体外循环
     */
    @Column(name = "TWXH")
    private String twxh;

    /**
     * 麻醉分级
     */
    @Column(name = "MZFJ")
    private String mzfj;

    /**
     * 麻醉非预期事件
     */
    @Column(name = "MZFYQ")
    private String mzfyq;

    /**
     * 患者术后去向
     */
    @Column(name = "HZSHQX")
    private String hzshqx;

    /**
     * 进入复苏室时间
     */
    @Column(name = "JRMZFSTIME")
    private Date jrmzfstime;

    /**
     * 离开复苏室时间
     */
    @Column(name = "LKMZFSTIME")
    private Date lkmzfstime;

    /**
     * Steward评分
     */
    @Column(name = "LIMZFSTIMEPF")
    private Integer limzfstimepf;

    /**
     * 重返手术室计划
     */
    @Column(name = "CFSSJH")
    private String cfssjh;

    /**
     * 手术名称
     */
    @Column(name = "SSBMNAME")
    private String ssbmname;

    /**
     * 合并手术编码1
     */
    @Column(name = "HEBING1SSBM")
    private String hebing1ssbm;

    /**
     * 合并手术名称1
     */
    @Column(name = "HEBING1SSBMNAME")
    private String hebing1ssbmname;

    /**
     * 合并手术编码2
     */
    @Column(name = "HEBING2SSBM")
    private String hebing2ssbm;

    /**
     * 合并手术名称2
     */
    @Column(name = "HEBING2SSBMNAME")
    private String hebing2ssbmname;

    /**
     * 合并手术编码3
     */
    @Column(name = "HEBING3SSBM")
    private String hebing3ssbm;

    /**
     * 合并手术名称3
     */
    @Column(name = "HEBING3SSBMNAME")
    private String hebing3ssbmname;

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
     * @return SSIDENTITY - 唯一标识
     */
    public String getSsidentity() {
        return ssidentity;
    }

    /**
     * 设置唯一标识
     *
     * @param ssidentity 唯一标识
     */
    public void setSsidentity(String ssidentity) {
        this.ssidentity = ssidentity;
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
     * @return JGMCNAME - 机构名称
     */
    public String getJgmcname() {
        return jgmcname;
    }

    /**
     * 设置机构名称
     *
     * @param jgmcname 机构名称
     */
    public void setJgmcname(String jgmcname) {
        this.jgmcname = jgmcname;
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
     * 获取操作标识 
     *
     * @return SSCZBS - 操作标识 
     */
    public String getSsczbs() {
        return ssczbs;
    }

    /**
     * 设置操作标识 
     *
     * @param ssczbs 操作标识 
     */
    public void setSsczbs(String ssczbs) {
        this.ssczbs = ssczbs;
    }

    /**
     * 获取手术开始时间
     *
     * @return SSTARTTIME - 手术开始时间
     */
    public Date getSstarttime() {
        return sstarttime;
    }

    /**
     * 设置手术开始时间
     *
     * @param sstarttime 手术开始时间
     */
    public void setSstarttime(Date sstarttime) {
        this.sstarttime = sstarttime;
    }

    /**
     * 获取手术结束时间
     *
     * @return SSENDTIME - 手术结束时间
     */
    public Date getSsendtime() {
        return ssendtime;
    }

    /**
     * 设置手术结束时间
     *
     * @param ssendtime 手术结束时间
     */
    public void setSsendtime(Date ssendtime) {
        this.ssendtime = ssendtime;
    }

    /**
     * 获取手术级别
     *
     * @return SSLEVEL - 手术级别
     */
    public String getSslevel() {
        return sslevel;
    }

    /**
     * 设置手术级别
     *
     * @param sslevel 手术级别
     */
    public void setSslevel(String sslevel) {
        this.sslevel = sslevel;
    }

    /**
     * 获取手术操作编码
     *
     * @return SSCZBM - 手术操作编码
     */
    public String getSsczbm() {
        return ssczbm;
    }

    /**
     * 设置手术操作编码
     *
     * @param ssczbm 手术操作编码
     */
    public void setSsczbm(String ssczbm) {
        this.ssczbm = ssczbm;
    }

    /**
     * 获取切口等级
     *
     * @return QKLEVEL - 切口等级
     */
    public Integer getQklevel() {
        return qklevel;
    }

    /**
     * 设置切口等级
     *
     * @param qklevel 切口等级
     */
    public void setQklevel(Integer qklevel) {
        this.qklevel = qklevel;
    }

    /**
     * 获取愈合类别
     *
     * @return YHLEVEL - 愈合类别
     */
    public Integer getYhlevel() {
        return yhlevel;
    }

    /**
     * 设置愈合类别
     *
     * @param yhlevel 愈合类别
     */
    public void setYhlevel(Integer yhlevel) {
        this.yhlevel = yhlevel;
    }

    /**
     * 获取手术性质 
     *
     * @return SSXZ - 手术性质 
     */
    public String getSsxz() {
        return ssxz;
    }

    /**
     * 设置手术性质 
     *
     * @param ssxz 手术性质 
     */
    public void setSsxz(String ssxz) {
        this.ssxz = ssxz;
    }

    /**
     * 获取风险分级
     *
     * @return SSFXFJ - 风险分级
     */
    public Integer getSsfxfj() {
        return ssfxfj;
    }

    /**
     * 设置风险分级
     *
     * @param ssfxfj 风险分级
     */
    public void setSsfxfj(Integer ssfxfj) {
        this.ssfxfj = ssfxfj;
    }

    /**
     * 获取野皮准备方法
     *
     * @return SSYPZB - 野皮准备方法
     */
    public Integer getSsypzb() {
        return ssypzb;
    }

    /**
     * 设置野皮准备方法
     *
     * @param ssypzb 野皮准备方法
     */
    public void setSsypzb(Integer ssypzb) {
        this.ssypzb = ssypzb;
    }

    /**
     * 获取手术部位
     *
     * @return SSBW - 手术部位
     */
    public String getSsbw() {
        return ssbw;
    }

    /**
     * 设置手术部位
     *
     * @param ssbw 手术部位
     */
    public void setSsbw(String ssbw) {
        this.ssbw = ssbw;
    }

    /**
     * 获取感染部位
     *
     * @return SSGRBW - 感染部位
     */
    public String getSsgrbw() {
        return ssgrbw;
    }

    /**
     * 设置感染部位
     *
     * @param ssgrbw 感染部位
     */
    public void setSsgrbw(String ssgrbw) {
        this.ssgrbw = ssgrbw;
    }

    /**
     * 获取新技术或项目
     *
     * @return SSISNEW - 新技术或项目
     */
    public Integer getSsisnew() {
        return ssisnew;
    }

    /**
     * 设置新技术或项目
     *
     * @param ssisnew 新技术或项目
     */
    public void setSsisnew(Integer ssisnew) {
        this.ssisnew = ssisnew;
    }

    /**
     * 获取异物遗留
     *
     * @return SSYWYL - 异物遗留
     */
    public Integer getSsywyl() {
        return ssywyl;
    }

    /**
     * 设置异物遗留
     *
     * @param ssywyl 异物遗留
     */
    public void setSsywyl(Integer ssywyl) {
        this.ssywyl = ssywyl;
    }

    /**
     * 获取手术性质
     *
     * @return SSTIME - 手术性质
     */
    public String getSstime() {
        return sstime;
    }

    /**
     * 设置手术性质
     *
     * @param sstime 手术性质
     */
    public void setSstime(String sstime) {
        this.sstime = sstime;
    }

    /**
     * 获取手术中出血量
     *
     * @return SSCXL - 手术中出血量
     */
    public BigDecimal getSscxl() {
        return sscxl;
    }

    /**
     * 设置手术中出血量
     *
     * @param sscxl 手术中出血量
     */
    public void setSscxl(BigDecimal sscxl) {
        this.sscxl = sscxl;
    }

    /**
     * 获取手术后并发症
     *
     * @return SSBFZ - 手术后并发症
     */
    public String getSsbfz() {
        return ssbfz;
    }

    /**
     * 设置手术后并发症
     *
     * @param ssbfz 手术后并发症
     */
    public void setSsbfz(String ssbfz) {
        this.ssbfz = ssbfz;
    }

    /**
     * 获取重返手术室目的
     *
     * @return CFSSMD - 重返手术室目的
     */
    public String getCfssmd() {
        return cfssmd;
    }

    /**
     * 设置重返手术室目的
     *
     * @param cfssmd 重返手术室目的
     */
    public void setCfssmd(String cfssmd) {
        this.cfssmd = cfssmd;
    }

    /**
     * 获取麻醉方式
     *
     * @return MZFS - 麻醉方式
     */
    public String getMzfs() {
        return mzfs;
    }

    /**
     * 设置麻醉方式
     *
     * @param mzfs 麻醉方式
     */
    public void setMzfs(String mzfs) {
        this.mzfs = mzfs;
    }

    /**
     * 获取体外循环
     *
     * @return TWXH - 体外循环
     */
    public String getTwxh() {
        return twxh;
    }

    /**
     * 设置体外循环
     *
     * @param twxh 体外循环
     */
    public void setTwxh(String twxh) {
        this.twxh = twxh;
    }

    /**
     * 获取麻醉分级
     *
     * @return MZFJ - 麻醉分级
     */
    public String getMzfj() {
        return mzfj;
    }

    /**
     * 设置麻醉分级
     *
     * @param mzfj 麻醉分级
     */
    public void setMzfj(String mzfj) {
        this.mzfj = mzfj;
    }

    /**
     * 获取麻醉非预期事件
     *
     * @return MZFYQ - 麻醉非预期事件
     */
    public String getMzfyq() {
        return mzfyq;
    }

    /**
     * 设置麻醉非预期事件
     *
     * @param mzfyq 麻醉非预期事件
     */
    public void setMzfyq(String mzfyq) {
        this.mzfyq = mzfyq;
    }

    /**
     * 获取患者术后去向
     *
     * @return HZSHQX - 患者术后去向
     */
    public String getHzshqx() {
        return hzshqx;
    }

    /**
     * 设置患者术后去向
     *
     * @param hzshqx 患者术后去向
     */
    public void setHzshqx(String hzshqx) {
        this.hzshqx = hzshqx;
    }

    /**
     * 获取进入复苏室时间
     *
     * @return JRMZFSTIME - 进入复苏室时间
     */
    public Date getJrmzfstime() {
        return jrmzfstime;
    }

    /**
     * 设置进入复苏室时间
     *
     * @param jrmzfstime 进入复苏室时间
     */
    public void setJrmzfstime(Date jrmzfstime) {
        this.jrmzfstime = jrmzfstime;
    }

    /**
     * 获取离开复苏室时间
     *
     * @return LKMZFSTIME - 离开复苏室时间
     */
    public Date getLkmzfstime() {
        return lkmzfstime;
    }

    /**
     * 设置离开复苏室时间
     *
     * @param lkmzfstime 离开复苏室时间
     */
    public void setLkmzfstime(Date lkmzfstime) {
        this.lkmzfstime = lkmzfstime;
    }

    /**
     * 获取Steward评分
     *
     * @return LIMZFSTIMEPF - Steward评分
     */
    public Integer getLimzfstimepf() {
        return limzfstimepf;
    }

    /**
     * 设置Steward评分
     *
     * @param limzfstimepf Steward评分
     */
    public void setLimzfstimepf(Integer limzfstimepf) {
        this.limzfstimepf = limzfstimepf;
    }

    /**
     * 获取重返手术室计划
     *
     * @return CFSSJH - 重返手术室计划
     */
    public String getCfssjh() {
        return cfssjh;
    }

    /**
     * 设置重返手术室计划
     *
     * @param cfssjh 重返手术室计划
     */
    public void setCfssjh(String cfssjh) {
        this.cfssjh = cfssjh;
    }

    /**
     * 获取手术名称
     *
     * @return SSBMNAME - 手术名称
     */
    public String getSsbmname() {
        return ssbmname;
    }

    /**
     * 设置手术名称
     *
     * @param ssbmname 手术名称
     */
    public void setSsbmname(String ssbmname) {
        this.ssbmname = ssbmname;
    }

    /**
     * 获取合并手术编码1
     *
     * @return HEBING1SSBM - 合并手术编码1
     */
    public String getHebing1ssbm() {
        return hebing1ssbm;
    }

    /**
     * 设置合并手术编码1
     *
     * @param hebing1ssbm 合并手术编码1
     */
    public void setHebing1ssbm(String hebing1ssbm) {
        this.hebing1ssbm = hebing1ssbm;
    }

    /**
     * 获取合并手术名称1
     *
     * @return HEBING1SSBMNAME - 合并手术名称1
     */
    public String getHebing1ssbmname() {
        return hebing1ssbmname;
    }

    /**
     * 设置合并手术名称1
     *
     * @param hebing1ssbmname 合并手术名称1
     */
    public void setHebing1ssbmname(String hebing1ssbmname) {
        this.hebing1ssbmname = hebing1ssbmname;
    }

    /**
     * 获取合并手术编码2
     *
     * @return HEBING2SSBM - 合并手术编码2
     */
    public String getHebing2ssbm() {
        return hebing2ssbm;
    }

    /**
     * 设置合并手术编码2
     *
     * @param hebing2ssbm 合并手术编码2
     */
    public void setHebing2ssbm(String hebing2ssbm) {
        this.hebing2ssbm = hebing2ssbm;
    }

    /**
     * 获取合并手术名称2
     *
     * @return HEBING2SSBMNAME - 合并手术名称2
     */
    public String getHebing2ssbmname() {
        return hebing2ssbmname;
    }

    /**
     * 设置合并手术名称2
     *
     * @param hebing2ssbmname 合并手术名称2
     */
    public void setHebing2ssbmname(String hebing2ssbmname) {
        this.hebing2ssbmname = hebing2ssbmname;
    }

    /**
     * 获取合并手术编码3
     *
     * @return HEBING3SSBM - 合并手术编码3
     */
    public String getHebing3ssbm() {
        return hebing3ssbm;
    }

    /**
     * 设置合并手术编码3
     *
     * @param hebing3ssbm 合并手术编码3
     */
    public void setHebing3ssbm(String hebing3ssbm) {
        this.hebing3ssbm = hebing3ssbm;
    }

    /**
     * 获取合并手术名称3
     *
     * @return HEBING3SSBMNAME - 合并手术名称3
     */
    public String getHebing3ssbmname() {
        return hebing3ssbmname;
    }

    /**
     * 设置合并手术名称3
     *
     * @param hebing3ssbmname 合并手术名称3
     */
    public void setHebing3ssbmname(String hebing3ssbmname) {
        this.hebing3ssbmname = hebing3ssbmname;
    }
}