package com.wlht.api.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_BA_BASE")
public class TBaBase {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "BAIDENTITY")
    private String baidentity;

    @Column(name = "ZZDM")
    private String zzdm;

    @Column(name = "ZZNAME")
    private String zzname;

    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    @Column(name = "YLFS")
    private String ylfs;

    @Column(name = "JKCARD")
    private String jkcard;

    @Column(name = "IDCARD")
    private String idcard;

    @Column(name = "HZHM")
    private String hzhm;

    @Column(name = "BANUM")
    private String banum;

    @Column(name = "ZYCS")
    private Integer zycs;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "GUOJI")
    private String guoji;

    @Column(name = "CSD")
    private String csd;

    @Column(name = "JIGUAN")
    private String jiguan;

    @Column(name = "MINZU")
    private String minzu;

    @Column(name = "ZHIYE1")
    private String zhiye1;

    @Column(name = "HUNYIN")
    private String hunyin;

    @Column(name = "JUZHUXINGZHENG")
    private String juzhuxingzheng;

    @Column(name = "XIANZHUZHI")
    private String xianzhuzhi;

    @Column(name = "XIANDIANHUA")
    private String xiandianhua;

    @Column(name = "XIANYOUBIAN")
    private String xianyoubian;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "HUKOUQUHUA")
    private String hukouquhua;

    @Column(name = "HUKOUDZ")
    private String hukoudz;

    @Column(name = "HUKOUYOUBIAN")
    private String hukouyoubian;

    @Column(name = "WORKINFO")
    private String workinfo;

    @Column(name = "DWTEL")
    private String dwtel;

    @Column(name = "DWYB")
    private String dwyb;

    @Column(name = "LXRNAME")
    private String lxrname;

    @Column(name = "LXRGUANXI")
    private String lxrguanxi;

    @Column(name = "LXRDZ")
    private String lxrdz;

    @Column(name = "LXRTEL")
    private String lxrtel;

    @Column(name = "RYLJ")
    private String rylj;

    @Column(name = "ZRYLJGDM")
    private String zryljgdm;

    @Column(name = "ZRJGNAME")
    private String zrjgname;

    @Column(name = "RYTIME")
    private Date rytime;

    @Column(name = "RYKSBM")
    private String ryksbm;

    @Column(name = "CYTIME")
    private Date cytime;

    @Column(name = "CYKSBM")
    private String cyksbm;

    @Column(name = "ZYKSNAME")
    private String zyksname;

    @Column(name = "SWYY")
    private String swyy;

    @Column(name = "SWSJ")
    private Integer swsj;

    @Column(name = "XUEXING")
    private Integer xuexing;

    @Column(name = "RHXUEXING")
    private Integer rhxuexing;

    @Column(name = "BINGANZHILIANG")
    private Integer binganzhiliang;

    @Column(name = "ZKRQ")
    private Date zkrq;

    @Column(name = "LYFS")
    private String lyfs;

    @Column(name = "NIJIESHOUYLJGDM")
    private String nijieshouyljgdm;

    @Column(name = "NIJIESHOUYLJGNAME")
    private String nijieshouyljgname;

    @Column(name = "ZZYMD")
    private String zzymd;

    @Column(name = "ZZYJGTS")
    private Integer zzyjgts;

    @Column(name = "RYLQHMTIME")
    private Date rylqhmtime;

    @Column(name = "XSECSTIZHONG")
    private BigDecimal xsecstizhong;

    @Column(name = "XSERYTIZHONG")
    private BigDecimal xserytizhong;

    @Column(name = "RYBINGQING")
    private String rybingqing;

    @Column(name = "ZHUYAOZDTIME")
    private Date zhuyaozdtime;

    @Column(name = "SFBW")
    private Integer sfbw;

    @Column(name = "QJCISHU")
    private Integer qjcishu;

    @Column(name = "QJSUCCESSCISHU")
    private Integer qjsuccesscishu;

    @Column(name = "YINANBING")
    private String yinanbing;

    @Column(name = "SUIZHEN")
    private Integer suizhen;

    @Column(name = "SZDAYS")
    private Integer szdays;

    @Column(name = "CYFHQK")
    private String cyfhqk;

    @Column(name = "RYCYFHQK")
    private String rycyfhqk;

    @Column(name = "SHOUSHUQH")
    private String shoushuqh;

    @Column(name = "YXBL")
    private String yxbl;

    @Column(name = "LCBL")
    private String lcbl;

    @Column(name = "SSBDSLBLQK")
    private String ssbdslblqk;

    @Column(name = "SQSHBLQK")
    private String sqshblqk;

    @Column(name = "LCZDSJQK")
    private String lczdsjqk;

    @Column(name = "YNHZCISHU")
    private Integer ynhzcishu;

    @Column(name = "WYHZCISHU")
    private Integer wyhzcishu;

    @Column(name = "SHUYE")
    private Integer shuye;

    @Column(name = "SHUYEFY")
    private Integer shuyefy;

    @Column(name = "KJYYMD")
    private String kjyymd;

    @Column(name = "KJYYFA")
    private String kjyyfa;

    @Column(name = "ZHUSU")
    private String zhusu;

    @Column(name = "TONGZHIDATE")
    private Date tongzhidate;

    @Column(name = "ZHIKONGPINGFEN")
    private BigDecimal zhikongpingfen;

    @Column(name = "ZHIKONGZHE")
    private String zhikongzhe;

    @Column(name = "UPDATEDATE")
    private Date updatedate;

    @Column(name = "BINGLIXIUGAIZHE")
    private String binglixiugaizhe;

    @Column(name = "SHANGBAOBIAOJI")
    private BigDecimal shangbaobiaoji;

    @Column(name = "WEISHOUSHUQI")
    private Date weishoushuqi;

    @Column(name = "WEISHOUSHUZHI")
    private Date weishoushuzhi;

    @Column(name = "JBPBM")
    private String jbpbm;

    @Column(name = "ZLFQT")
    private String zlfqt;

    @Column(name = "ZLFQN")
    private String zlfqn;

    @Column(name = "ZLFQM")
    private String zlfqm;

    @Column(name = "SFDYBZ")
    private Integer sfdybz;

    @Column(name = "SSLCLJ")
    private Integer sslclj;

    @Column(name = "WCLCLJ")
    private Integer wclclj;

    @Column(name = "TCLCLJYY")
    private String tclcljyy;

    @Column(name = "TCLCLJMS")
    private String tclcljms;

    @Column(name = "LCLJBYYY")
    private String lcljbyyy;

    @Column(name = "LCLJBYMS")
    private String lcljbyms;

    @Column(name = "ZLFQ")
    private String zlfq;

    @Column(name = "ZLFHCD")
    private String zlfhcd;

    @Column(name = "ZLZDYJ")
    private String zlzdyj;

    @Column(name = "BNBIAOSHI1")
    private String bnbiaoshi1;

    @Column(name = "AGE_SUI")
    private Integer ageSui;

    @Column(name = "AGE_MONTH")
    private Integer ageMonth;

    @Column(name = "AGE_DAYS")
    private Integer ageDays;

    @Column(name = "YCGFX")
    private Integer ycgfx;

    @Column(name = "DDGFX")
    private Integer ddgfx;

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
     * @return BAIDENTITY
     */
    public String getBaidentity() {
        return baidentity;
    }

    /**
     * @param baidentity
     */
    public void setBaidentity(String baidentity) {
        this.baidentity = baidentity;
    }

    /**
     * @return ZZDM
     */
    public String getZzdm() {
        return zzdm;
    }

    /**
     * @param zzdm
     */
    public void setZzdm(String zzdm) {
        this.zzdm = zzdm;
    }

    /**
     * @return ZZNAME
     */
    public String getZzname() {
        return zzname;
    }

    /**
     * @param zzname
     */
    public void setZzname(String zzname) {
        this.zzname = zzname;
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
     * @return YLFS
     */
    public String getYlfs() {
        return ylfs;
    }

    /**
     * @param ylfs
     */
    public void setYlfs(String ylfs) {
        this.ylfs = ylfs;
    }

    /**
     * @return JKCARD
     */
    public String getJkcard() {
        return jkcard;
    }

    /**
     * @param jkcard
     */
    public void setJkcard(String jkcard) {
        this.jkcard = jkcard;
    }

    /**
     * @return IDCARD
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * @return HZHM
     */
    public String getHzhm() {
        return hzhm;
    }

    /**
     * @param hzhm
     */
    public void setHzhm(String hzhm) {
        this.hzhm = hzhm;
    }

    /**
     * @return BANUM
     */
    public String getBanum() {
        return banum;
    }

    /**
     * @param banum
     */
    public void setBanum(String banum) {
        this.banum = banum;
    }

    /**
     * @return ZYCS
     */
    public Integer getZycs() {
        return zycs;
    }

    /**
     * @param zycs
     */
    public void setZycs(Integer zycs) {
        this.zycs = zycs;
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
     * @return SEX
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return GUOJI
     */
    public String getGuoji() {
        return guoji;
    }

    /**
     * @param guoji
     */
    public void setGuoji(String guoji) {
        this.guoji = guoji;
    }

    /**
     * @return CSD
     */
    public String getCsd() {
        return csd;
    }

    /**
     * @param csd
     */
    public void setCsd(String csd) {
        this.csd = csd;
    }

    /**
     * @return JIGUAN
     */
    public String getJiguan() {
        return jiguan;
    }

    /**
     * @param jiguan
     */
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    /**
     * @return MINZU
     */
    public String getMinzu() {
        return minzu;
    }

    /**
     * @param minzu
     */
    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    /**
     * @return ZHIYE1
     */
    public String getZhiye1() {
        return zhiye1;
    }

    /**
     * @param zhiye1
     */
    public void setZhiye1(String zhiye1) {
        this.zhiye1 = zhiye1;
    }

    /**
     * @return HUNYIN
     */
    public String getHunyin() {
        return hunyin;
    }

    /**
     * @param hunyin
     */
    public void setHunyin(String hunyin) {
        this.hunyin = hunyin;
    }

    /**
     * @return JUZHUXINGZHENG
     */
    public String getJuzhuxingzheng() {
        return juzhuxingzheng;
    }

    /**
     * @param juzhuxingzheng
     */
    public void setJuzhuxingzheng(String juzhuxingzheng) {
        this.juzhuxingzheng = juzhuxingzheng;
    }

    /**
     * @return XIANZHUZHI
     */
    public String getXianzhuzhi() {
        return xianzhuzhi;
    }

    /**
     * @param xianzhuzhi
     */
    public void setXianzhuzhi(String xianzhuzhi) {
        this.xianzhuzhi = xianzhuzhi;
    }

    /**
     * @return XIANDIANHUA
     */
    public String getXiandianhua() {
        return xiandianhua;
    }

    /**
     * @param xiandianhua
     */
    public void setXiandianhua(String xiandianhua) {
        this.xiandianhua = xiandianhua;
    }

    /**
     * @return XIANYOUBIAN
     */
    public String getXianyoubian() {
        return xianyoubian;
    }

    /**
     * @param xianyoubian
     */
    public void setXianyoubian(String xianyoubian) {
        this.xianyoubian = xianyoubian;
    }

    /**
     * @return PHONE
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @return HUKOUQUHUA
     */
    public String getHukouquhua() {
        return hukouquhua;
    }

    /**
     * @param hukouquhua
     */
    public void setHukouquhua(String hukouquhua) {
        this.hukouquhua = hukouquhua;
    }

    /**
     * @return HUKOUDZ
     */
    public String getHukoudz() {
        return hukoudz;
    }

    /**
     * @param hukoudz
     */
    public void setHukoudz(String hukoudz) {
        this.hukoudz = hukoudz;
    }

    /**
     * @return HUKOUYOUBIAN
     */
    public String getHukouyoubian() {
        return hukouyoubian;
    }

    /**
     * @param hukouyoubian
     */
    public void setHukouyoubian(String hukouyoubian) {
        this.hukouyoubian = hukouyoubian;
    }

    /**
     * @return WORKINFO
     */
    public String getWorkinfo() {
        return workinfo;
    }

    /**
     * @param workinfo
     */
    public void setWorkinfo(String workinfo) {
        this.workinfo = workinfo;
    }

    /**
     * @return DWTEL
     */
    public String getDwtel() {
        return dwtel;
    }

    /**
     * @param dwtel
     */
    public void setDwtel(String dwtel) {
        this.dwtel = dwtel;
    }

    /**
     * @return DWYB
     */
    public String getDwyb() {
        return dwyb;
    }

    /**
     * @param dwyb
     */
    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }

    /**
     * @return LXRNAME
     */
    public String getLxrname() {
        return lxrname;
    }

    /**
     * @param lxrname
     */
    public void setLxrname(String lxrname) {
        this.lxrname = lxrname;
    }

    /**
     * @return LXRGUANXI
     */
    public String getLxrguanxi() {
        return lxrguanxi;
    }

    /**
     * @param lxrguanxi
     */
    public void setLxrguanxi(String lxrguanxi) {
        this.lxrguanxi = lxrguanxi;
    }

    /**
     * @return LXRDZ
     */
    public String getLxrdz() {
        return lxrdz;
    }

    /**
     * @param lxrdz
     */
    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
    }

    /**
     * @return LXRTEL
     */
    public String getLxrtel() {
        return lxrtel;
    }

    /**
     * @param lxrtel
     */
    public void setLxrtel(String lxrtel) {
        this.lxrtel = lxrtel;
    }

    /**
     * @return RYLJ
     */
    public String getRylj() {
        return rylj;
    }

    /**
     * @param rylj
     */
    public void setRylj(String rylj) {
        this.rylj = rylj;
    }

    /**
     * @return ZRYLJGDM
     */
    public String getZryljgdm() {
        return zryljgdm;
    }

    /**
     * @param zryljgdm
     */
    public void setZryljgdm(String zryljgdm) {
        this.zryljgdm = zryljgdm;
    }

    /**
     * @return ZRJGNAME
     */
    public String getZrjgname() {
        return zrjgname;
    }

    /**
     * @param zrjgname
     */
    public void setZrjgname(String zrjgname) {
        this.zrjgname = zrjgname;
    }

    /**
     * @return RYTIME
     */
    public Date getRytime() {
        return rytime;
    }

    /**
     * @param rytime
     */
    public void setRytime(Date rytime) {
        this.rytime = rytime;
    }

    /**
     * @return RYKSBM
     */
    public String getRyksbm() {
        return ryksbm;
    }

    /**
     * @param ryksbm
     */
    public void setRyksbm(String ryksbm) {
        this.ryksbm = ryksbm;
    }

    /**
     * @return CYTIME
     */
    public Date getCytime() {
        return cytime;
    }

    /**
     * @param cytime
     */
    public void setCytime(Date cytime) {
        this.cytime = cytime;
    }

    /**
     * @return CYKSBM
     */
    public String getCyksbm() {
        return cyksbm;
    }

    /**
     * @param cyksbm
     */
    public void setCyksbm(String cyksbm) {
        this.cyksbm = cyksbm;
    }

    /**
     * @return ZYKSNAME
     */
    public String getZyksname() {
        return zyksname;
    }

    /**
     * @param zyksname
     */
    public void setZyksname(String zyksname) {
        this.zyksname = zyksname;
    }

    /**
     * @return SWYY
     */
    public String getSwyy() {
        return swyy;
    }

    /**
     * @param swyy
     */
    public void setSwyy(String swyy) {
        this.swyy = swyy;
    }

    /**
     * @return SWSJ
     */
    public Integer getSwsj() {
        return swsj;
    }

    /**
     * @param swsj
     */
    public void setSwsj(Integer swsj) {
        this.swsj = swsj;
    }

    /**
     * @return XUEXING
     */
    public Integer getXuexing() {
        return xuexing;
    }

    /**
     * @param xuexing
     */
    public void setXuexing(Integer xuexing) {
        this.xuexing = xuexing;
    }

    /**
     * @return RHXUEXING
     */
    public Integer getRhxuexing() {
        return rhxuexing;
    }

    /**
     * @param rhxuexing
     */
    public void setRhxuexing(Integer rhxuexing) {
        this.rhxuexing = rhxuexing;
    }

    /**
     * @return BINGANZHILIANG
     */
    public Integer getBinganzhiliang() {
        return binganzhiliang;
    }

    /**
     * @param binganzhiliang
     */
    public void setBinganzhiliang(Integer binganzhiliang) {
        this.binganzhiliang = binganzhiliang;
    }

    /**
     * @return ZKRQ
     */
    public Date getZkrq() {
        return zkrq;
    }

    /**
     * @param zkrq
     */
    public void setZkrq(Date zkrq) {
        this.zkrq = zkrq;
    }

    /**
     * @return LYFS
     */
    public String getLyfs() {
        return lyfs;
    }

    /**
     * @param lyfs
     */
    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }

    /**
     * @return NIJIESHOUYLJGDM
     */
    public String getNijieshouyljgdm() {
        return nijieshouyljgdm;
    }

    /**
     * @param nijieshouyljgdm
     */
    public void setNijieshouyljgdm(String nijieshouyljgdm) {
        this.nijieshouyljgdm = nijieshouyljgdm;
    }

    /**
     * @return NIJIESHOUYLJGNAME
     */
    public String getNijieshouyljgname() {
        return nijieshouyljgname;
    }

    /**
     * @param nijieshouyljgname
     */
    public void setNijieshouyljgname(String nijieshouyljgname) {
        this.nijieshouyljgname = nijieshouyljgname;
    }

    /**
     * @return ZZYMD
     */
    public String getZzymd() {
        return zzymd;
    }

    /**
     * @param zzymd
     */
    public void setZzymd(String zzymd) {
        this.zzymd = zzymd;
    }

    /**
     * @return ZZYJGTS
     */
    public Integer getZzyjgts() {
        return zzyjgts;
    }

    /**
     * @param zzyjgts
     */
    public void setZzyjgts(Integer zzyjgts) {
        this.zzyjgts = zzyjgts;
    }

    /**
     * @return RYLQHMTIME
     */
    public Date getRylqhmtime() {
        return rylqhmtime;
    }

    /**
     * @param rylqhmtime
     */
    public void setRylqhmtime(Date rylqhmtime) {
        this.rylqhmtime = rylqhmtime;
    }

    /**
     * @return XSECSTIZHONG
     */
    public BigDecimal getXsecstizhong() {
        return xsecstizhong;
    }

    /**
     * @param xsecstizhong
     */
    public void setXsecstizhong(BigDecimal xsecstizhong) {
        this.xsecstizhong = xsecstizhong;
    }

    /**
     * @return XSERYTIZHONG
     */
    public BigDecimal getXserytizhong() {
        return xserytizhong;
    }

    /**
     * @param xserytizhong
     */
    public void setXserytizhong(BigDecimal xserytizhong) {
        this.xserytizhong = xserytizhong;
    }

    /**
     * @return RYBINGQING
     */
    public String getRybingqing() {
        return rybingqing;
    }

    /**
     * @param rybingqing
     */
    public void setRybingqing(String rybingqing) {
        this.rybingqing = rybingqing;
    }

    /**
     * @return ZHUYAOZDTIME
     */
    public Date getZhuyaozdtime() {
        return zhuyaozdtime;
    }

    /**
     * @param zhuyaozdtime
     */
    public void setZhuyaozdtime(Date zhuyaozdtime) {
        this.zhuyaozdtime = zhuyaozdtime;
    }

    /**
     * @return SFBW
     */
    public Integer getSfbw() {
        return sfbw;
    }

    /**
     * @param sfbw
     */
    public void setSfbw(Integer sfbw) {
        this.sfbw = sfbw;
    }

    /**
     * @return QJCISHU
     */
    public Integer getQjcishu() {
        return qjcishu;
    }

    /**
     * @param qjcishu
     */
    public void setQjcishu(Integer qjcishu) {
        this.qjcishu = qjcishu;
    }

    /**
     * @return QJSUCCESSCISHU
     */
    public Integer getQjsuccesscishu() {
        return qjsuccesscishu;
    }

    /**
     * @param qjsuccesscishu
     */
    public void setQjsuccesscishu(Integer qjsuccesscishu) {
        this.qjsuccesscishu = qjsuccesscishu;
    }

    /**
     * @return YINANBING
     */
    public String getYinanbing() {
        return yinanbing;
    }

    /**
     * @param yinanbing
     */
    public void setYinanbing(String yinanbing) {
        this.yinanbing = yinanbing;
    }

    /**
     * @return SUIZHEN
     */
    public Integer getSuizhen() {
        return suizhen;
    }

    /**
     * @param suizhen
     */
    public void setSuizhen(Integer suizhen) {
        this.suizhen = suizhen;
    }

    /**
     * @return SZDAYS
     */
    public Integer getSzdays() {
        return szdays;
    }

    /**
     * @param szdays
     */
    public void setSzdays(Integer szdays) {
        this.szdays = szdays;
    }

    /**
     * @return CYFHQK
     */
    public String getCyfhqk() {
        return cyfhqk;
    }

    /**
     * @param cyfhqk
     */
    public void setCyfhqk(String cyfhqk) {
        this.cyfhqk = cyfhqk;
    }

    /**
     * @return RYCYFHQK
     */
    public String getRycyfhqk() {
        return rycyfhqk;
    }

    /**
     * @param rycyfhqk
     */
    public void setRycyfhqk(String rycyfhqk) {
        this.rycyfhqk = rycyfhqk;
    }

    /**
     * @return SHOUSHUQH
     */
    public String getShoushuqh() {
        return shoushuqh;
    }

    /**
     * @param shoushuqh
     */
    public void setShoushuqh(String shoushuqh) {
        this.shoushuqh = shoushuqh;
    }

    /**
     * @return YXBL
     */
    public String getYxbl() {
        return yxbl;
    }

    /**
     * @param yxbl
     */
    public void setYxbl(String yxbl) {
        this.yxbl = yxbl;
    }

    /**
     * @return LCBL
     */
    public String getLcbl() {
        return lcbl;
    }

    /**
     * @param lcbl
     */
    public void setLcbl(String lcbl) {
        this.lcbl = lcbl;
    }

    /**
     * @return SSBDSLBLQK
     */
    public String getSsbdslblqk() {
        return ssbdslblqk;
    }

    /**
     * @param ssbdslblqk
     */
    public void setSsbdslblqk(String ssbdslblqk) {
        this.ssbdslblqk = ssbdslblqk;
    }

    /**
     * @return SQSHBLQK
     */
    public String getSqshblqk() {
        return sqshblqk;
    }

    /**
     * @param sqshblqk
     */
    public void setSqshblqk(String sqshblqk) {
        this.sqshblqk = sqshblqk;
    }

    /**
     * @return LCZDSJQK
     */
    public String getLczdsjqk() {
        return lczdsjqk;
    }

    /**
     * @param lczdsjqk
     */
    public void setLczdsjqk(String lczdsjqk) {
        this.lczdsjqk = lczdsjqk;
    }

    /**
     * @return YNHZCISHU
     */
    public Integer getYnhzcishu() {
        return ynhzcishu;
    }

    /**
     * @param ynhzcishu
     */
    public void setYnhzcishu(Integer ynhzcishu) {
        this.ynhzcishu = ynhzcishu;
    }

    /**
     * @return WYHZCISHU
     */
    public Integer getWyhzcishu() {
        return wyhzcishu;
    }

    /**
     * @param wyhzcishu
     */
    public void setWyhzcishu(Integer wyhzcishu) {
        this.wyhzcishu = wyhzcishu;
    }

    /**
     * @return SHUYE
     */
    public Integer getShuye() {
        return shuye;
    }

    /**
     * @param shuye
     */
    public void setShuye(Integer shuye) {
        this.shuye = shuye;
    }

    /**
     * @return SHUYEFY
     */
    public Integer getShuyefy() {
        return shuyefy;
    }

    /**
     * @param shuyefy
     */
    public void setShuyefy(Integer shuyefy) {
        this.shuyefy = shuyefy;
    }

    /**
     * @return KJYYMD
     */
    public String getKjyymd() {
        return kjyymd;
    }

    /**
     * @param kjyymd
     */
    public void setKjyymd(String kjyymd) {
        this.kjyymd = kjyymd;
    }

    /**
     * @return KJYYFA
     */
    public String getKjyyfa() {
        return kjyyfa;
    }

    /**
     * @param kjyyfa
     */
    public void setKjyyfa(String kjyyfa) {
        this.kjyyfa = kjyyfa;
    }

    /**
     * @return ZHUSU
     */
    public String getZhusu() {
        return zhusu;
    }

    /**
     * @param zhusu
     */
    public void setZhusu(String zhusu) {
        this.zhusu = zhusu;
    }

    /**
     * @return TONGZHIDATE
     */
    public Date getTongzhidate() {
        return tongzhidate;
    }

    /**
     * @param tongzhidate
     */
    public void setTongzhidate(Date tongzhidate) {
        this.tongzhidate = tongzhidate;
    }

    /**
     * @return ZHIKONGPINGFEN
     */
    public BigDecimal getZhikongpingfen() {
        return zhikongpingfen;
    }

    /**
     * @param zhikongpingfen
     */
    public void setZhikongpingfen(BigDecimal zhikongpingfen) {
        this.zhikongpingfen = zhikongpingfen;
    }

    /**
     * @return ZHIKONGZHE
     */
    public String getZhikongzhe() {
        return zhikongzhe;
    }

    /**
     * @param zhikongzhe
     */
    public void setZhikongzhe(String zhikongzhe) {
        this.zhikongzhe = zhikongzhe;
    }

    /**
     * @return UPDATEDATE
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return BINGLIXIUGAIZHE
     */
    public String getBinglixiugaizhe() {
        return binglixiugaizhe;
    }

    /**
     * @param binglixiugaizhe
     */
    public void setBinglixiugaizhe(String binglixiugaizhe) {
        this.binglixiugaizhe = binglixiugaizhe;
    }

    /**
     * @return SHANGBAOBIAOJI
     */
    public BigDecimal getShangbaobiaoji() {
        return shangbaobiaoji;
    }

    /**
     * @param shangbaobiaoji
     */
    public void setShangbaobiaoji(BigDecimal shangbaobiaoji) {
        this.shangbaobiaoji = shangbaobiaoji;
    }

    /**
     * @return WEISHOUSHUQI
     */
    public Date getWeishoushuqi() {
        return weishoushuqi;
    }

    /**
     * @param weishoushuqi
     */
    public void setWeishoushuqi(Date weishoushuqi) {
        this.weishoushuqi = weishoushuqi;
    }

    /**
     * @return WEISHOUSHUZHI
     */
    public Date getWeishoushuzhi() {
        return weishoushuzhi;
    }

    /**
     * @param weishoushuzhi
     */
    public void setWeishoushuzhi(Date weishoushuzhi) {
        this.weishoushuzhi = weishoushuzhi;
    }

    /**
     * @return JBPBM
     */
    public String getJbpbm() {
        return jbpbm;
    }

    /**
     * @param jbpbm
     */
    public void setJbpbm(String jbpbm) {
        this.jbpbm = jbpbm;
    }

    /**
     * @return ZLFQT
     */
    public String getZlfqt() {
        return zlfqt;
    }

    /**
     * @param zlfqt
     */
    public void setZlfqt(String zlfqt) {
        this.zlfqt = zlfqt;
    }

    /**
     * @return ZLFQN
     */
    public String getZlfqn() {
        return zlfqn;
    }

    /**
     * @param zlfqn
     */
    public void setZlfqn(String zlfqn) {
        this.zlfqn = zlfqn;
    }

    /**
     * @return ZLFQM
     */
    public String getZlfqm() {
        return zlfqm;
    }

    /**
     * @param zlfqm
     */
    public void setZlfqm(String zlfqm) {
        this.zlfqm = zlfqm;
    }

    /**
     * @return SFDYBZ
     */
    public Integer getSfdybz() {
        return sfdybz;
    }

    /**
     * @param sfdybz
     */
    public void setSfdybz(Integer sfdybz) {
        this.sfdybz = sfdybz;
    }

    /**
     * @return SSLCLJ
     */
    public Integer getSslclj() {
        return sslclj;
    }

    /**
     * @param sslclj
     */
    public void setSslclj(Integer sslclj) {
        this.sslclj = sslclj;
    }

    /**
     * @return WCLCLJ
     */
    public Integer getWclclj() {
        return wclclj;
    }

    /**
     * @param wclclj
     */
    public void setWclclj(Integer wclclj) {
        this.wclclj = wclclj;
    }

    /**
     * @return TCLCLJYY
     */
    public String getTclcljyy() {
        return tclcljyy;
    }

    /**
     * @param tclcljyy
     */
    public void setTclcljyy(String tclcljyy) {
        this.tclcljyy = tclcljyy;
    }

    /**
     * @return TCLCLJMS
     */
    public String getTclcljms() {
        return tclcljms;
    }

    /**
     * @param tclcljms
     */
    public void setTclcljms(String tclcljms) {
        this.tclcljms = tclcljms;
    }

    /**
     * @return LCLJBYYY
     */
    public String getLcljbyyy() {
        return lcljbyyy;
    }

    /**
     * @param lcljbyyy
     */
    public void setLcljbyyy(String lcljbyyy) {
        this.lcljbyyy = lcljbyyy;
    }

    /**
     * @return LCLJBYMS
     */
    public String getLcljbyms() {
        return lcljbyms;
    }

    /**
     * @param lcljbyms
     */
    public void setLcljbyms(String lcljbyms) {
        this.lcljbyms = lcljbyms;
    }

    /**
     * @return ZLFQ
     */
    public String getZlfq() {
        return zlfq;
    }

    /**
     * @param zlfq
     */
    public void setZlfq(String zlfq) {
        this.zlfq = zlfq;
    }

    /**
     * @return ZLFHCD
     */
    public String getZlfhcd() {
        return zlfhcd;
    }

    /**
     * @param zlfhcd
     */
    public void setZlfhcd(String zlfhcd) {
        this.zlfhcd = zlfhcd;
    }

    /**
     * @return ZLZDYJ
     */
    public String getZlzdyj() {
        return zlzdyj;
    }

    /**
     * @param zlzdyj
     */
    public void setZlzdyj(String zlzdyj) {
        this.zlzdyj = zlzdyj;
    }

    /**
     * @return BNBIAOSHI1
     */
    public String getBnbiaoshi1() {
        return bnbiaoshi1;
    }

    /**
     * @param bnbiaoshi1
     */
    public void setBnbiaoshi1(String bnbiaoshi1) {
        this.bnbiaoshi1 = bnbiaoshi1;
    }

    /**
     * @return AGE_SUI
     */
    public Integer getAgeSui() {
        return ageSui;
    }

    /**
     * @param ageSui
     */
    public void setAgeSui(Integer ageSui) {
        this.ageSui = ageSui;
    }

    /**
     * @return AGE_MONTH
     */
    public Integer getAgeMonth() {
        return ageMonth;
    }

    /**
     * @param ageMonth
     */
    public void setAgeMonth(Integer ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * @return AGE_DAYS
     */
    public Integer getAgeDays() {
        return ageDays;
    }

    /**
     * @param ageDays
     */
    public void setAgeDays(Integer ageDays) {
        this.ageDays = ageDays;
    }

    /**
     * @return YCGFX
     */
    public Integer getYcgfx() {
        return ycgfx;
    }

    /**
     * @param ycgfx
     */
    public void setYcgfx(Integer ycgfx) {
        this.ycgfx = ycgfx;
    }

    /**
     * @return DDGFX
     */
    public Integer getDdgfx() {
        return ddgfx;
    }

    /**
     * @param ddgfx
     */
    public void setDdgfx(Integer ddgfx) {
        this.ddgfx = ddgfx;
    }
}