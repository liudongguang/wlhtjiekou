package com.wlht.api.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_BNSSCZ")
public class TBnsscz {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZBLSH")
    private Long zblsh;

    @Column(name = "SSIDENTITY")
    private String ssidentity;

    @Column(name = "ZZJGDM")
    private String zzjgdm;

    @Column(name = "JGMCNAME")
    private String jgmcname;

    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    @Column(name = "BAH")
    private String bah;

    @Column(name = "NAME")
    private String name;

    @Column(name = "JLH")
    private String jlh;

    @Column(name = "SSCZBS")
    private String ssczbs;

    @Column(name = "SSTARTTIME")
    private Date sstarttime;

    @Column(name = "SSENDTIME")
    private Date ssendtime;

    @Column(name = "SSLEVEL")
    private String sslevel;

    @Column(name = "SSCZBM")
    private String ssczbm;

    @Column(name = "QKLEVEL")
    private Integer qklevel;

    @Column(name = "YHLEVEL")
    private Integer yhlevel;

    @Column(name = "SSXZ")
    private String ssxz;

    @Column(name = "SSFXFJ")
    private Integer ssfxfj;

    @Column(name = "SSYPZB")
    private Integer ssypzb;

    @Column(name = "SSBW")
    private String ssbw;

    @Column(name = "SSGRBW")
    private String ssgrbw;

    @Column(name = "SSISNEW")
    private Integer ssisnew;

    @Column(name = "SSYWYL")
    private Integer ssywyl;

    @Column(name = "SSTIME")
    private String sstime;

    @Column(name = "SSCXL")
    private BigDecimal sscxl;

    @Column(name = "SSBFZ")
    private String ssbfz;

    @Column(name = "CFSSMD")
    private String cfssmd;

    @Column(name = "MZFS")
    private String mzfs;

    @Column(name = "TWXH")
    private String twxh;

    @Column(name = "MZFJ")
    private String mzfj;

    @Column(name = "MZFYQ")
    private String mzfyq;

    @Column(name = "HZSHQX")
    private String hzshqx;

    @Column(name = "JRMZFSTIME")
    private Date jrmzfstime;

    @Column(name = "LKMZFSTIME")
    private Date lkmzfstime;

    @Column(name = "LIMZFSTIMEPF")
    private Integer limzfstimepf;

    @Column(name = "CFSSJH")
    private String cfssjh;

    @Column(name = "SSBMNAME")
    private String ssbmname;

    @Column(name = "HEBING1SSBM")
    private String hebing1ssbm;

    @Column(name = "HEBING1SSBMNAME")
    private String hebing1ssbmname;

    @Column(name = "HEBING2SSBM")
    private String hebing2ssbm;

    @Column(name = "HEBING2SSBMNAME")
    private String hebing2ssbmname;

    @Column(name = "HEBING3SSBM")
    private String hebing3ssbm;

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
     * @return SSIDENTITY
     */
    public String getSsidentity() {
        return ssidentity;
    }

    /**
     * @param ssidentity
     */
    public void setSsidentity(String ssidentity) {
        this.ssidentity = ssidentity;
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
     * @return JGMCNAME
     */
    public String getJgmcname() {
        return jgmcname;
    }

    /**
     * @param jgmcname
     */
    public void setJgmcname(String jgmcname) {
        this.jgmcname = jgmcname;
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
     * @return SSCZBS
     */
    public String getSsczbs() {
        return ssczbs;
    }

    /**
     * @param ssczbs
     */
    public void setSsczbs(String ssczbs) {
        this.ssczbs = ssczbs;
    }

    /**
     * @return SSTARTTIME
     */
    public Date getSstarttime() {
        return sstarttime;
    }

    /**
     * @param sstarttime
     */
    public void setSstarttime(Date sstarttime) {
        this.sstarttime = sstarttime;
    }

    /**
     * @return SSENDTIME
     */
    public Date getSsendtime() {
        return ssendtime;
    }

    /**
     * @param ssendtime
     */
    public void setSsendtime(Date ssendtime) {
        this.ssendtime = ssendtime;
    }

    /**
     * @return SSLEVEL
     */
    public String getSslevel() {
        return sslevel;
    }

    /**
     * @param sslevel
     */
    public void setSslevel(String sslevel) {
        this.sslevel = sslevel;
    }

    /**
     * @return SSCZBM
     */
    public String getSsczbm() {
        return ssczbm;
    }

    /**
     * @param ssczbm
     */
    public void setSsczbm(String ssczbm) {
        this.ssczbm = ssczbm;
    }

    /**
     * @return QKLEVEL
     */
    public Integer getQklevel() {
        return qklevel;
    }

    /**
     * @param qklevel
     */
    public void setQklevel(Integer qklevel) {
        this.qklevel = qklevel;
    }

    /**
     * @return YHLEVEL
     */
    public Integer getYhlevel() {
        return yhlevel;
    }

    /**
     * @param yhlevel
     */
    public void setYhlevel(Integer yhlevel) {
        this.yhlevel = yhlevel;
    }

    /**
     * @return SSXZ
     */
    public String getSsxz() {
        return ssxz;
    }

    /**
     * @param ssxz
     */
    public void setSsxz(String ssxz) {
        this.ssxz = ssxz;
    }

    /**
     * @return SSFXFJ
     */
    public Integer getSsfxfj() {
        return ssfxfj;
    }

    /**
     * @param ssfxfj
     */
    public void setSsfxfj(Integer ssfxfj) {
        this.ssfxfj = ssfxfj;
    }

    /**
     * @return SSYPZB
     */
    public Integer getSsypzb() {
        return ssypzb;
    }

    /**
     * @param ssypzb
     */
    public void setSsypzb(Integer ssypzb) {
        this.ssypzb = ssypzb;
    }

    /**
     * @return SSBW
     */
    public String getSsbw() {
        return ssbw;
    }

    /**
     * @param ssbw
     */
    public void setSsbw(String ssbw) {
        this.ssbw = ssbw;
    }

    /**
     * @return SSGRBW
     */
    public String getSsgrbw() {
        return ssgrbw;
    }

    /**
     * @param ssgrbw
     */
    public void setSsgrbw(String ssgrbw) {
        this.ssgrbw = ssgrbw;
    }

    /**
     * @return SSISNEW
     */
    public Integer getSsisnew() {
        return ssisnew;
    }

    /**
     * @param ssisnew
     */
    public void setSsisnew(Integer ssisnew) {
        this.ssisnew = ssisnew;
    }

    /**
     * @return SSYWYL
     */
    public Integer getSsywyl() {
        return ssywyl;
    }

    /**
     * @param ssywyl
     */
    public void setSsywyl(Integer ssywyl) {
        this.ssywyl = ssywyl;
    }

    /**
     * @return SSTIME
     */
    public String getSstime() {
        return sstime;
    }

    /**
     * @param sstime
     */
    public void setSstime(String sstime) {
        this.sstime = sstime;
    }

    /**
     * @return SSCXL
     */
    public BigDecimal getSscxl() {
        return sscxl;
    }

    /**
     * @param sscxl
     */
    public void setSscxl(BigDecimal sscxl) {
        this.sscxl = sscxl;
    }

    /**
     * @return SSBFZ
     */
    public String getSsbfz() {
        return ssbfz;
    }

    /**
     * @param ssbfz
     */
    public void setSsbfz(String ssbfz) {
        this.ssbfz = ssbfz;
    }

    /**
     * @return CFSSMD
     */
    public String getCfssmd() {
        return cfssmd;
    }

    /**
     * @param cfssmd
     */
    public void setCfssmd(String cfssmd) {
        this.cfssmd = cfssmd;
    }

    /**
     * @return MZFS
     */
    public String getMzfs() {
        return mzfs;
    }

    /**
     * @param mzfs
     */
    public void setMzfs(String mzfs) {
        this.mzfs = mzfs;
    }

    /**
     * @return TWXH
     */
    public String getTwxh() {
        return twxh;
    }

    /**
     * @param twxh
     */
    public void setTwxh(String twxh) {
        this.twxh = twxh;
    }

    /**
     * @return MZFJ
     */
    public String getMzfj() {
        return mzfj;
    }

    /**
     * @param mzfj
     */
    public void setMzfj(String mzfj) {
        this.mzfj = mzfj;
    }

    /**
     * @return MZFYQ
     */
    public String getMzfyq() {
        return mzfyq;
    }

    /**
     * @param mzfyq
     */
    public void setMzfyq(String mzfyq) {
        this.mzfyq = mzfyq;
    }

    /**
     * @return HZSHQX
     */
    public String getHzshqx() {
        return hzshqx;
    }

    /**
     * @param hzshqx
     */
    public void setHzshqx(String hzshqx) {
        this.hzshqx = hzshqx;
    }

    /**
     * @return JRMZFSTIME
     */
    public Date getJrmzfstime() {
        return jrmzfstime;
    }

    /**
     * @param jrmzfstime
     */
    public void setJrmzfstime(Date jrmzfstime) {
        this.jrmzfstime = jrmzfstime;
    }

    /**
     * @return LKMZFSTIME
     */
    public Date getLkmzfstime() {
        return lkmzfstime;
    }

    /**
     * @param lkmzfstime
     */
    public void setLkmzfstime(Date lkmzfstime) {
        this.lkmzfstime = lkmzfstime;
    }

    /**
     * @return LIMZFSTIMEPF
     */
    public Integer getLimzfstimepf() {
        return limzfstimepf;
    }

    /**
     * @param limzfstimepf
     */
    public void setLimzfstimepf(Integer limzfstimepf) {
        this.limzfstimepf = limzfstimepf;
    }

    /**
     * @return CFSSJH
     */
    public String getCfssjh() {
        return cfssjh;
    }

    /**
     * @param cfssjh
     */
    public void setCfssjh(String cfssjh) {
        this.cfssjh = cfssjh;
    }

    /**
     * @return SSBMNAME
     */
    public String getSsbmname() {
        return ssbmname;
    }

    /**
     * @param ssbmname
     */
    public void setSsbmname(String ssbmname) {
        this.ssbmname = ssbmname;
    }

    /**
     * @return HEBING1SSBM
     */
    public String getHebing1ssbm() {
        return hebing1ssbm;
    }

    /**
     * @param hebing1ssbm
     */
    public void setHebing1ssbm(String hebing1ssbm) {
        this.hebing1ssbm = hebing1ssbm;
    }

    /**
     * @return HEBING1SSBMNAME
     */
    public String getHebing1ssbmname() {
        return hebing1ssbmname;
    }

    /**
     * @param hebing1ssbmname
     */
    public void setHebing1ssbmname(String hebing1ssbmname) {
        this.hebing1ssbmname = hebing1ssbmname;
    }

    /**
     * @return HEBING2SSBM
     */
    public String getHebing2ssbm() {
        return hebing2ssbm;
    }

    /**
     * @param hebing2ssbm
     */
    public void setHebing2ssbm(String hebing2ssbm) {
        this.hebing2ssbm = hebing2ssbm;
    }

    /**
     * @return HEBING2SSBMNAME
     */
    public String getHebing2ssbmname() {
        return hebing2ssbmname;
    }

    /**
     * @param hebing2ssbmname
     */
    public void setHebing2ssbmname(String hebing2ssbmname) {
        this.hebing2ssbmname = hebing2ssbmname;
    }

    /**
     * @return HEBING3SSBM
     */
    public String getHebing3ssbm() {
        return hebing3ssbm;
    }

    /**
     * @param hebing3ssbm
     */
    public void setHebing3ssbm(String hebing3ssbm) {
        this.hebing3ssbm = hebing3ssbm;
    }

    /**
     * @return HEBING3SSBMNAME
     */
    public String getHebing3ssbmname() {
        return hebing3ssbmname;
    }

    /**
     * @param hebing3ssbmname
     */
    public void setHebing3ssbmname(String hebing3ssbmname) {
        this.hebing3ssbmname = hebing3ssbmname;
    }
}