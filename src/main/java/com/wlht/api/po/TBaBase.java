package com.wlht.api.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_BA_BASE")
@SequenceGenerator(name="SEQ_T_BA_base",sequenceName="SEQ_T_BA_BASE",allocationSize=1)
public class TBaBase {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_T_BA_base")
    private Long id;

    /**
     * 标识码
     */
    @Column(name = "BAIDENTITY")
    private String baidentity;

    /**
     * 组织机构代码
     */
    @Column(name = "ZZDM")
    private String zzdm;

    /**
     * 组织机构名称
     */
    @Column(name = "ZZNAME")
    private String zzname;

    /**
     * 分支机构标识符
     */
    @Column(name = "FZJGBSF")
    private String fzjgbsf;

    /**
     * 医疗方式
     */
    @Column(name = "YLFS")
    private String ylfs;

    /**
     * 健康卡号
     */
    @Column(name = "JKCARD")
    private String jkcard;

    /**
     * 身份证号
     */
    @Column(name = "IDCARD")
    private String idcard;

    /**
     * 护照号
     */
    @Column(name = "HZHM")
    private String hzhm;

    /**
     * 病案号
     */
    @Column(name = "BANUM")
    private String banum;

    /**
     * 住院次数
     */
    @Column(name = "ZYCS")
    private Integer zycs;

    /**
     * 病人姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private Integer sex;

    /**
     * 出生日期
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 国籍
     */
    @Column(name = "GUOJI")
    private String guoji;

    /**
     * 出生地
     */
    @Column(name = "CSD")
    private String csd;

    /**
     * 籍贯
     */
    @Column(name = "JIGUAN")
    private String jiguan;

    /**
     * 民族
     */
    @Column(name = "MINZU")
    private String minzu;

    /**
     * 职业
     */
    @Column(name = "ZHIYE1")
    private String zhiye1;

    /**
     * 婚姻
     */
    @Column(name = "HUNYIN")
    private String hunyin;

    /**
     * 居住行政区划
     */
    @Column(name = "JUZHUXINGZHENG")
    private String juzhuxingzheng;

    /**
     * 现住址
     */
    @Column(name = "XIANZHUZHI")
    private String xianzhuzhi;

    /**
     * 现住址电话
     */
    @Column(name = "XIANDIANHUA")
    private String xiandianhua;

    /**
     * 现住址邮编
     */
    @Column(name = "XIANYOUBIAN")
    private String xianyoubian;

    /**
     * 现住址电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 电子邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 户口区划
     */
    @Column(name = "HUKOUQUHUA")
    private String hukouquhua;

    /**
     * 户口
     */
    @Column(name = "HUKOUDZ")
    private String hukoudz;

    /**
     * 户口邮编
     */
    @Column(name = "HUKOUYOUBIAN")
    private String hukouyoubian;

    /**
     * 工作地址
     */
    @Column(name = "WORKINFO")
    private String workinfo;

    /**
     * 单位电话
     */
    @Column(name = "DWTEL")
    private String dwtel;

    /**
     * 单位邮编
     */
    @Column(name = "DWYB")
    private String dwyb;

    /**
     * 联系人姓名
     */
    @Column(name = "LXRNAME")
    private String lxrname;

    /**
     * 联系人关系
     */
    @Column(name = "LXRGUANXI")
    private String lxrguanxi;

    /**
     * 联系人地址
     */
    @Column(name = "LXRDZ")
    private String lxrdz;

    /**
     * 联系人电话
     */
    @Column(name = "LXRTEL")
    private String lxrtel;

    /**
     * 入院途径
     */
    @Column(name = "RYLJ")
    private String rylj;

    /**
     * 转入机构
     */
    @Column(name = "ZRYLJGDM")
    private String zryljgdm;

    /**
     * 转入机构名称
     */
    @Column(name = "ZRJGNAME")
    private String zrjgname;

    /**
     * 入院时间
     */
    @Column(name = "RYTIME")
    private Date rytime;

    /**
     * 入院科室编码
     */
    @Column(name = "RYKSBM")
    private String ryksbm;

    /**
     * 出院时间
     */
    @Column(name = "CYTIME")
    private Date cytime;

    /**
     * 出院科室编码
     */
    @Column(name = "CYKSBM")
    private String cyksbm;

    /**
     * 住院科室名称
     */
    @Column(name = "ZYKSNAME")
    private String zyksname;

    /**
     * 死亡原因
     */
    @Column(name = "SWYY")
    private String swyy;

    /**
     * 患者尸检
     */
    @Column(name = "SWSJ")
    private Integer swsj;

    /**
     * ABO血型
     */
    @Column(name = "XUEXING")
    private Integer xuexing;

    /**
     * RH血型
     */
    @Column(name = "RHXUEXING")
    private Integer rhxuexing;

    /**
     * 病案质量
     */
    @Column(name = "BINGANZHILIANG")
    private Integer binganzhiliang;

    /**
     * 质控日期
     */
    @Column(name = "ZKRQ")
    private Date zkrq;

    /**
     * 离院方式
     */
    @Column(name = "LYFS")
    private String lyfs;

    /**
     * 拟接收机构
     */
    @Column(name = "NIJIESHOUYLJGDM")
    private String nijieshouyljgdm;

    /**
     * 拟接收机构代码
     */
    @Column(name = "NIJIESHOUYLJGNAME")
    private String nijieshouyljgname;

    /**
     * 再住院计划目的
     */
    @Column(name = "ZZYMD")
    private String zzymd;

    /**
     * 再住院间隔
     */
    @Column(name = "ZZYJGTS")
    private Integer zzyjgts;

    /**
     * 颅脑损伤昏迷时间
     */
    @Column(name = "RYLQHMTIME")
    private Date rylqhmtime;

    /**
     * 新生儿出生体重
     */
    @Column(name = "XSECSTIZHONG")
    private BigDecimal xsecstizhong;

    /**
     * 新生儿入院体重
     */
    @Column(name = "XSERYTIZHONG")
    private BigDecimal xserytizhong;

    /**
     * 入院状况
     */
    @Column(name = "RYBINGQING")
    private String rybingqing;

    /**
     * 诊断确诊时间
     */
    @Column(name = "ZHUYAOZDTIME")
    private Date zhuyaozdtime;

    /**
     * 病危告知
     */
    @Column(name = "SFBW")
    private Integer sfbw;

    /**
     * 抢救次数
     */
    @Column(name = "QJCISHU")
    private Integer qjcishu;

    /**
     * 抢救成功次数
     */
    @Column(name = "QJSUCCESSCISHU")
    private Integer qjsuccesscishu;

    /**
     * 疑难病例
     */
    @Column(name = "YINANBING")
    private String yinanbing;

    /**
     * 随诊
     */
    @Column(name = "SUIZHEN")
    private Integer suizhen;

    /**
     * 随诊期限
     */
    @Column(name = "SZDAYS")
    private Integer szdays;

    /**
     * 门诊与出院诊断
     */
    @Column(name = "CYFHQK")
    private String cyfhqk;

    /**
     * 入院与出院诊断
     */
    @Column(name = "RYCYFHQK")
    private String rycyfhqk;

    /**
     * 术前与术后诊断
     */
    @Column(name = "SHOUSHUQH")
    private String shoushuqh;

    /**
     * 影像与病理诊断
     */
    @Column(name = "YXBL")
    private String yxbl;

    /**
     * 临床与病理诊断
     */
    @Column(name = "LCBL")
    private String lcbl;

    /**
     * 冰冻与石蜡诊断
     */
    @Column(name = "SSBDSLBLQK")
    private String ssbdslblqk;

    /**
     * 术前与术后病理诊断
     */
    @Column(name = "SQSHBLQK")
    private String sqshblqk;

    /**
     * 临床与尸检诊断
     */
    @Column(name = "LCZDSJQK")
    private String lczdsjqk;

    /**
     * 院内会诊数
     */
    @Column(name = "YNHZCISHU")
    private Integer ynhzcishu;

    /**
     * 外院会诊数
     */
    @Column(name = "WYHZCISHU")
    private Integer wyhzcishu;

    /**
     * 输液
     */
    @Column(name = "SHUYE")
    private Integer shuye;

    /**
     * 输液反应
     */
    @Column(name = "SHUYEFY")
    private Integer shuyefy;

    /**
     * 抗菌用药目的
     */
    @Column(name = "KJYYMD")
    private String kjyymd;

    /**
     * 抗菌用药方案
     */
    @Column(name = "KJYYFA")
    private String kjyyfa;

    /**
     * 主诉
     */
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

    /**
     * 疾病谱编码
     */
    @Column(name = "JBPBM")
    private String jbpbm;

    /**
     * 肿瘤分期T
     */
    @Column(name = "ZLFQT")
    private String zlfqt;

    /**
     * 肿瘤分期N
     */
    @Column(name = "ZLFQN")
    private String zlfqn;

    /**
     * 肿瘤分期M
     */
    @Column(name = "ZLFQM")
    private String zlfqm;

    /**
     * 是否单一病种？
     */
    @Column(name = "SFDYBZ")
    private Integer sfdybz;

    /**
     * 实施临床路径
     */
    @Column(name = "SSLCLJ")
    private Integer sslclj;

    /**
     * 完成临床管理路径
     */
    @Column(name = "WCLCLJ")
    private Integer wclclj;

    /**
     * 退出临床路径原因
     */
    @Column(name = "TCLCLJYY")
    private String tclcljyy;

    /**
     * 退出临床路径原因描述
     */
    @Column(name = "TCLCLJMS")
    private String tclcljms;

    /**
     * 临床路径管理变异原因（字典）
     */
    @Column(name = "LCLJBYYY")
    private String lcljbyyy;

    /**
     * 临床路径管理原因描述
     */
    @Column(name = "LCLJBYMS")
    private String lcljbyms;

    /**
     * 肿瘤分期
     */
    @Column(name = "ZLFQ")
    private String zlfq;

    /**
     * 肿瘤分化程度
     */
    @Column(name = "ZLFHCD")
    private String zlfhcd;

    /**
     * 肿瘤诊断依据
     */
    @Column(name = "ZLZDYJ")
    private String zlzdyj;

    /**
     * 标识1
     */
    @Column(name = "BNBIAOSHI1")
    private String bnbiaoshi1;

    /**
     * 年龄（岁）
     */
    @Column(name = "AGE_SUI")
    private Integer ageSui;

    /**
     * 年龄（月）
     */
    @Column(name = "AGE_MONTH")
    private Integer ageMonth;

    /**
     * 年龄（天）
     */
    @Column(name = "AGE_DAYS")
    private Integer ageDays;

    /**
     * 压疮高风险
     */
    @Column(name = "YCGFX")
    private Integer ycgfx;

    /**
     * 跌倒高风险
     */
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
     * 获取标识码
     *
     * @return BAIDENTITY - 标识码
     */
    public String getBaidentity() {
        return baidentity;
    }

    /**
     * 设置标识码
     *
     * @param baidentity 标识码
     */
    public void setBaidentity(String baidentity) {
        this.baidentity = baidentity;
    }

    /**
     * 获取组织机构代码
     *
     * @return ZZDM - 组织机构代码
     */
    public String getZzdm() {
        return zzdm;
    }

    /**
     * 设置组织机构代码
     *
     * @param zzdm 组织机构代码
     */
    public void setZzdm(String zzdm) {
        this.zzdm = zzdm;
    }

    /**
     * 获取组织机构名称
     *
     * @return ZZNAME - 组织机构名称
     */
    public String getZzname() {
        return zzname;
    }

    /**
     * 设置组织机构名称
     *
     * @param zzname 组织机构名称
     */
    public void setZzname(String zzname) {
        this.zzname = zzname;
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
     * 获取医疗方式
     *
     * @return YLFS - 医疗方式
     */
    public String getYlfs() {
        return ylfs;
    }

    /**
     * 设置医疗方式
     *
     * @param ylfs 医疗方式
     */
    public void setYlfs(String ylfs) {
        this.ylfs = ylfs;
    }

    /**
     * 获取健康卡号
     *
     * @return JKCARD - 健康卡号
     */
    public String getJkcard() {
        return jkcard;
    }

    /**
     * 设置健康卡号
     *
     * @param jkcard 健康卡号
     */
    public void setJkcard(String jkcard) {
        this.jkcard = jkcard;
    }

    /**
     * 获取身份证号
     *
     * @return IDCARD - 身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号
     *
     * @param idcard 身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取护照号
     *
     * @return HZHM - 护照号
     */
    public String getHzhm() {
        return hzhm;
    }

    /**
     * 设置护照号
     *
     * @param hzhm 护照号
     */
    public void setHzhm(String hzhm) {
        this.hzhm = hzhm;
    }

    /**
     * 获取病案号
     *
     * @return BANUM - 病案号
     */
    public String getBanum() {
        return banum;
    }

    /**
     * 设置病案号
     *
     * @param banum 病案号
     */
    public void setBanum(String banum) {
        this.banum = banum;
    }

    /**
     * 获取住院次数
     *
     * @return ZYCS - 住院次数
     */
    public Integer getZycs() {
        return zycs;
    }

    /**
     * 设置住院次数
     *
     * @param zycs 住院次数
     */
    public void setZycs(Integer zycs) {
        this.zycs = zycs;
    }

    /**
     * 获取病人姓名
     *
     * @return NAME - 病人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人姓名
     *
     * @param name 病人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取出生日期
     *
     * @return BIRTHDAY - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取国籍
     *
     * @return GUOJI - 国籍
     */
    public String getGuoji() {
        return guoji;
    }

    /**
     * 设置国籍
     *
     * @param guoji 国籍
     */
    public void setGuoji(String guoji) {
        this.guoji = guoji;
    }

    /**
     * 获取出生地
     *
     * @return CSD - 出生地
     */
    public String getCsd() {
        return csd;
    }

    /**
     * 设置出生地
     *
     * @param csd 出生地
     */
    public void setCsd(String csd) {
        this.csd = csd;
    }

    /**
     * 获取籍贯
     *
     * @return JIGUAN - 籍贯
     */
    public String getJiguan() {
        return jiguan;
    }

    /**
     * 设置籍贯
     *
     * @param jiguan 籍贯
     */
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    /**
     * 获取民族
     *
     * @return MINZU - 民族
     */
    public String getMinzu() {
        return minzu;
    }

    /**
     * 设置民族
     *
     * @param minzu 民族
     */
    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    /**
     * 获取职业
     *
     * @return ZHIYE1 - 职业
     */
    public String getZhiye1() {
        return zhiye1;
    }

    /**
     * 设置职业
     *
     * @param zhiye1 职业
     */
    public void setZhiye1(String zhiye1) {
        this.zhiye1 = zhiye1;
    }

    /**
     * 获取婚姻
     *
     * @return HUNYIN - 婚姻
     */
    public String getHunyin() {
        return hunyin;
    }

    /**
     * 设置婚姻
     *
     * @param hunyin 婚姻
     */
    public void setHunyin(String hunyin) {
        this.hunyin = hunyin;
    }

    /**
     * 获取居住行政区划
     *
     * @return JUZHUXINGZHENG - 居住行政区划
     */
    public String getJuzhuxingzheng() {
        return juzhuxingzheng;
    }

    /**
     * 设置居住行政区划
     *
     * @param juzhuxingzheng 居住行政区划
     */
    public void setJuzhuxingzheng(String juzhuxingzheng) {
        this.juzhuxingzheng = juzhuxingzheng;
    }

    /**
     * 获取现住址
     *
     * @return XIANZHUZHI - 现住址
     */
    public String getXianzhuzhi() {
        return xianzhuzhi;
    }

    /**
     * 设置现住址
     *
     * @param xianzhuzhi 现住址
     */
    public void setXianzhuzhi(String xianzhuzhi) {
        this.xianzhuzhi = xianzhuzhi;
    }

    /**
     * 获取现住址电话
     *
     * @return XIANDIANHUA - 现住址电话
     */
    public String getXiandianhua() {
        return xiandianhua;
    }

    /**
     * 设置现住址电话
     *
     * @param xiandianhua 现住址电话
     */
    public void setXiandianhua(String xiandianhua) {
        this.xiandianhua = xiandianhua;
    }

    /**
     * 获取现住址邮编
     *
     * @return XIANYOUBIAN - 现住址邮编
     */
    public String getXianyoubian() {
        return xianyoubian;
    }

    /**
     * 设置现住址邮编
     *
     * @param xianyoubian 现住址邮编
     */
    public void setXianyoubian(String xianyoubian) {
        this.xianyoubian = xianyoubian;
    }

    /**
     * 获取现住址电话
     *
     * @return PHONE - 现住址电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置现住址电话
     *
     * @param phone 现住址电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取电子邮箱
     *
     * @return EMAIL - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取户口区划
     *
     * @return HUKOUQUHUA - 户口区划
     */
    public String getHukouquhua() {
        return hukouquhua;
    }

    /**
     * 设置户口区划
     *
     * @param hukouquhua 户口区划
     */
    public void setHukouquhua(String hukouquhua) {
        this.hukouquhua = hukouquhua;
    }

    /**
     * 获取户口
     *
     * @return HUKOUDZ - 户口
     */
    public String getHukoudz() {
        return hukoudz;
    }

    /**
     * 设置户口
     *
     * @param hukoudz 户口
     */
    public void setHukoudz(String hukoudz) {
        this.hukoudz = hukoudz;
    }

    /**
     * 获取户口邮编
     *
     * @return HUKOUYOUBIAN - 户口邮编
     */
    public String getHukouyoubian() {
        return hukouyoubian;
    }

    /**
     * 设置户口邮编
     *
     * @param hukouyoubian 户口邮编
     */
    public void setHukouyoubian(String hukouyoubian) {
        this.hukouyoubian = hukouyoubian;
    }

    /**
     * 获取工作地址
     *
     * @return WORKINFO - 工作地址
     */
    public String getWorkinfo() {
        return workinfo;
    }

    /**
     * 设置工作地址
     *
     * @param workinfo 工作地址
     */
    public void setWorkinfo(String workinfo) {
        this.workinfo = workinfo;
    }

    /**
     * 获取单位电话
     *
     * @return DWTEL - 单位电话
     */
    public String getDwtel() {
        return dwtel;
    }

    /**
     * 设置单位电话
     *
     * @param dwtel 单位电话
     */
    public void setDwtel(String dwtel) {
        this.dwtel = dwtel;
    }

    /**
     * 获取单位邮编
     *
     * @return DWYB - 单位邮编
     */
    public String getDwyb() {
        return dwyb;
    }

    /**
     * 设置单位邮编
     *
     * @param dwyb 单位邮编
     */
    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }

    /**
     * 获取联系人姓名
     *
     * @return LXRNAME - 联系人姓名
     */
    public String getLxrname() {
        return lxrname;
    }

    /**
     * 设置联系人姓名
     *
     * @param lxrname 联系人姓名
     */
    public void setLxrname(String lxrname) {
        this.lxrname = lxrname;
    }

    /**
     * 获取联系人关系
     *
     * @return LXRGUANXI - 联系人关系
     */
    public String getLxrguanxi() {
        return lxrguanxi;
    }

    /**
     * 设置联系人关系
     *
     * @param lxrguanxi 联系人关系
     */
    public void setLxrguanxi(String lxrguanxi) {
        this.lxrguanxi = lxrguanxi;
    }

    /**
     * 获取联系人地址
     *
     * @return LXRDZ - 联系人地址
     */
    public String getLxrdz() {
        return lxrdz;
    }

    /**
     * 设置联系人地址
     *
     * @param lxrdz 联系人地址
     */
    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
    }

    /**
     * 获取联系人电话
     *
     * @return LXRTEL - 联系人电话
     */
    public String getLxrtel() {
        return lxrtel;
    }

    /**
     * 设置联系人电话
     *
     * @param lxrtel 联系人电话
     */
    public void setLxrtel(String lxrtel) {
        this.lxrtel = lxrtel;
    }

    /**
     * 获取入院途径
     *
     * @return RYLJ - 入院途径
     */
    public String getRylj() {
        return rylj;
    }

    /**
     * 设置入院途径
     *
     * @param rylj 入院途径
     */
    public void setRylj(String rylj) {
        this.rylj = rylj;
    }

    /**
     * 获取转入机构
     *
     * @return ZRYLJGDM - 转入机构
     */
    public String getZryljgdm() {
        return zryljgdm;
    }

    /**
     * 设置转入机构
     *
     * @param zryljgdm 转入机构
     */
    public void setZryljgdm(String zryljgdm) {
        this.zryljgdm = zryljgdm;
    }

    /**
     * 获取转入机构名称
     *
     * @return ZRJGNAME - 转入机构名称
     */
    public String getZrjgname() {
        return zrjgname;
    }

    /**
     * 设置转入机构名称
     *
     * @param zrjgname 转入机构名称
     */
    public void setZrjgname(String zrjgname) {
        this.zrjgname = zrjgname;
    }

    /**
     * 获取入院时间
     *
     * @return RYTIME - 入院时间
     */
    public Date getRytime() {
        return rytime;
    }

    /**
     * 设置入院时间
     *
     * @param rytime 入院时间
     */
    public void setRytime(Date rytime) {
        this.rytime = rytime;
    }

    /**
     * 获取入院科室编码
     *
     * @return RYKSBM - 入院科室编码
     */
    public String getRyksbm() {
        return ryksbm;
    }

    /**
     * 设置入院科室编码
     *
     * @param ryksbm 入院科室编码
     */
    public void setRyksbm(String ryksbm) {
        this.ryksbm = ryksbm;
    }

    /**
     * 获取出院时间
     *
     * @return CYTIME - 出院时间
     */
    public Date getCytime() {
        return cytime;
    }

    /**
     * 设置出院时间
     *
     * @param cytime 出院时间
     */
    public void setCytime(Date cytime) {
        this.cytime = cytime;
    }

    /**
     * 获取出院科室编码
     *
     * @return CYKSBM - 出院科室编码
     */
    public String getCyksbm() {
        return cyksbm;
    }

    /**
     * 设置出院科室编码
     *
     * @param cyksbm 出院科室编码
     */
    public void setCyksbm(String cyksbm) {
        this.cyksbm = cyksbm;
    }

    /**
     * 获取住院科室名称
     *
     * @return ZYKSNAME - 住院科室名称
     */
    public String getZyksname() {
        return zyksname;
    }

    /**
     * 设置住院科室名称
     *
     * @param zyksname 住院科室名称
     */
    public void setZyksname(String zyksname) {
        this.zyksname = zyksname;
    }

    /**
     * 获取死亡原因
     *
     * @return SWYY - 死亡原因
     */
    public String getSwyy() {
        return swyy;
    }

    /**
     * 设置死亡原因
     *
     * @param swyy 死亡原因
     */
    public void setSwyy(String swyy) {
        this.swyy = swyy;
    }

    /**
     * 获取患者尸检
     *
     * @return SWSJ - 患者尸检
     */
    public Integer getSwsj() {
        return swsj;
    }

    /**
     * 设置患者尸检
     *
     * @param swsj 患者尸检
     */
    public void setSwsj(Integer swsj) {
        this.swsj = swsj;
    }

    /**
     * 获取ABO血型
     *
     * @return XUEXING - ABO血型
     */
    public Integer getXuexing() {
        return xuexing;
    }

    /**
     * 设置ABO血型
     *
     * @param xuexing ABO血型
     */
    public void setXuexing(Integer xuexing) {
        this.xuexing = xuexing;
    }

    /**
     * 获取RH血型
     *
     * @return RHXUEXING - RH血型
     */
    public Integer getRhxuexing() {
        return rhxuexing;
    }

    /**
     * 设置RH血型
     *
     * @param rhxuexing RH血型
     */
    public void setRhxuexing(Integer rhxuexing) {
        this.rhxuexing = rhxuexing;
    }

    /**
     * 获取病案质量
     *
     * @return BINGANZHILIANG - 病案质量
     */
    public Integer getBinganzhiliang() {
        return binganzhiliang;
    }

    /**
     * 设置病案质量
     *
     * @param binganzhiliang 病案质量
     */
    public void setBinganzhiliang(Integer binganzhiliang) {
        this.binganzhiliang = binganzhiliang;
    }

    /**
     * 获取质控日期
     *
     * @return ZKRQ - 质控日期
     */
    public Date getZkrq() {
        return zkrq;
    }

    /**
     * 设置质控日期
     *
     * @param zkrq 质控日期
     */
    public void setZkrq(Date zkrq) {
        this.zkrq = zkrq;
    }

    /**
     * 获取离院方式
     *
     * @return LYFS - 离院方式
     */
    public String getLyfs() {
        return lyfs;
    }

    /**
     * 设置离院方式
     *
     * @param lyfs 离院方式
     */
    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }

    /**
     * 获取拟接收机构
     *
     * @return NIJIESHOUYLJGDM - 拟接收机构
     */
    public String getNijieshouyljgdm() {
        return nijieshouyljgdm;
    }

    /**
     * 设置拟接收机构
     *
     * @param nijieshouyljgdm 拟接收机构
     */
    public void setNijieshouyljgdm(String nijieshouyljgdm) {
        this.nijieshouyljgdm = nijieshouyljgdm;
    }

    /**
     * 获取拟接收机构代码
     *
     * @return NIJIESHOUYLJGNAME - 拟接收机构代码
     */
    public String getNijieshouyljgname() {
        return nijieshouyljgname;
    }

    /**
     * 设置拟接收机构代码
     *
     * @param nijieshouyljgname 拟接收机构代码
     */
    public void setNijieshouyljgname(String nijieshouyljgname) {
        this.nijieshouyljgname = nijieshouyljgname;
    }

    /**
     * 获取再住院计划目的
     *
     * @return ZZYMD - 再住院计划目的
     */
    public String getZzymd() {
        return zzymd;
    }

    /**
     * 设置再住院计划目的
     *
     * @param zzymd 再住院计划目的
     */
    public void setZzymd(String zzymd) {
        this.zzymd = zzymd;
    }

    /**
     * 获取再住院间隔
     *
     * @return ZZYJGTS - 再住院间隔
     */
    public Integer getZzyjgts() {
        return zzyjgts;
    }

    /**
     * 设置再住院间隔
     *
     * @param zzyjgts 再住院间隔
     */
    public void setZzyjgts(Integer zzyjgts) {
        this.zzyjgts = zzyjgts;
    }

    /**
     * 获取颅脑损伤昏迷时间
     *
     * @return RYLQHMTIME - 颅脑损伤昏迷时间
     */
    public Date getRylqhmtime() {
        return rylqhmtime;
    }

    /**
     * 设置颅脑损伤昏迷时间
     *
     * @param rylqhmtime 颅脑损伤昏迷时间
     */
    public void setRylqhmtime(Date rylqhmtime) {
        this.rylqhmtime = rylqhmtime;
    }

    /**
     * 获取新生儿出生体重
     *
     * @return XSECSTIZHONG - 新生儿出生体重
     */
    public BigDecimal getXsecstizhong() {
        return xsecstizhong;
    }

    /**
     * 设置新生儿出生体重
     *
     * @param xsecstizhong 新生儿出生体重
     */
    public void setXsecstizhong(BigDecimal xsecstizhong) {
        this.xsecstizhong = xsecstizhong;
    }

    /**
     * 获取新生儿入院体重
     *
     * @return XSERYTIZHONG - 新生儿入院体重
     */
    public BigDecimal getXserytizhong() {
        return xserytizhong;
    }

    /**
     * 设置新生儿入院体重
     *
     * @param xserytizhong 新生儿入院体重
     */
    public void setXserytizhong(BigDecimal xserytizhong) {
        this.xserytizhong = xserytizhong;
    }

    /**
     * 获取入院状况
     *
     * @return RYBINGQING - 入院状况
     */
    public String getRybingqing() {
        return rybingqing;
    }

    /**
     * 设置入院状况
     *
     * @param rybingqing 入院状况
     */
    public void setRybingqing(String rybingqing) {
        this.rybingqing = rybingqing;
    }

    /**
     * 获取诊断确诊时间
     *
     * @return ZHUYAOZDTIME - 诊断确诊时间
     */
    public Date getZhuyaozdtime() {
        return zhuyaozdtime;
    }

    /**
     * 设置诊断确诊时间
     *
     * @param zhuyaozdtime 诊断确诊时间
     */
    public void setZhuyaozdtime(Date zhuyaozdtime) {
        this.zhuyaozdtime = zhuyaozdtime;
    }

    /**
     * 获取病危告知
     *
     * @return SFBW - 病危告知
     */
    public Integer getSfbw() {
        return sfbw;
    }

    /**
     * 设置病危告知
     *
     * @param sfbw 病危告知
     */
    public void setSfbw(Integer sfbw) {
        this.sfbw = sfbw;
    }

    /**
     * 获取抢救次数
     *
     * @return QJCISHU - 抢救次数
     */
    public Integer getQjcishu() {
        return qjcishu;
    }

    /**
     * 设置抢救次数
     *
     * @param qjcishu 抢救次数
     */
    public void setQjcishu(Integer qjcishu) {
        this.qjcishu = qjcishu;
    }

    /**
     * 获取抢救成功次数
     *
     * @return QJSUCCESSCISHU - 抢救成功次数
     */
    public Integer getQjsuccesscishu() {
        return qjsuccesscishu;
    }

    /**
     * 设置抢救成功次数
     *
     * @param qjsuccesscishu 抢救成功次数
     */
    public void setQjsuccesscishu(Integer qjsuccesscishu) {
        this.qjsuccesscishu = qjsuccesscishu;
    }

    /**
     * 获取疑难病例
     *
     * @return YINANBING - 疑难病例
     */
    public String getYinanbing() {
        return yinanbing;
    }

    /**
     * 设置疑难病例
     *
     * @param yinanbing 疑难病例
     */
    public void setYinanbing(String yinanbing) {
        this.yinanbing = yinanbing;
    }

    /**
     * 获取随诊
     *
     * @return SUIZHEN - 随诊
     */
    public Integer getSuizhen() {
        return suizhen;
    }

    /**
     * 设置随诊
     *
     * @param suizhen 随诊
     */
    public void setSuizhen(Integer suizhen) {
        this.suizhen = suizhen;
    }

    /**
     * 获取随诊期限
     *
     * @return SZDAYS - 随诊期限
     */
    public Integer getSzdays() {
        return szdays;
    }

    /**
     * 设置随诊期限
     *
     * @param szdays 随诊期限
     */
    public void setSzdays(Integer szdays) {
        this.szdays = szdays;
    }

    /**
     * 获取门诊与出院诊断
     *
     * @return CYFHQK - 门诊与出院诊断
     */
    public String getCyfhqk() {
        return cyfhqk;
    }

    /**
     * 设置门诊与出院诊断
     *
     * @param cyfhqk 门诊与出院诊断
     */
    public void setCyfhqk(String cyfhqk) {
        this.cyfhqk = cyfhqk;
    }

    /**
     * 获取入院与出院诊断
     *
     * @return RYCYFHQK - 入院与出院诊断
     */
    public String getRycyfhqk() {
        return rycyfhqk;
    }

    /**
     * 设置入院与出院诊断
     *
     * @param rycyfhqk 入院与出院诊断
     */
    public void setRycyfhqk(String rycyfhqk) {
        this.rycyfhqk = rycyfhqk;
    }

    /**
     * 获取术前与术后诊断
     *
     * @return SHOUSHUQH - 术前与术后诊断
     */
    public String getShoushuqh() {
        return shoushuqh;
    }

    /**
     * 设置术前与术后诊断
     *
     * @param shoushuqh 术前与术后诊断
     */
    public void setShoushuqh(String shoushuqh) {
        this.shoushuqh = shoushuqh;
    }

    /**
     * 获取影像与病理诊断
     *
     * @return YXBL - 影像与病理诊断
     */
    public String getYxbl() {
        return yxbl;
    }

    /**
     * 设置影像与病理诊断
     *
     * @param yxbl 影像与病理诊断
     */
    public void setYxbl(String yxbl) {
        this.yxbl = yxbl;
    }

    /**
     * 获取临床与病理诊断
     *
     * @return LCBL - 临床与病理诊断
     */
    public String getLcbl() {
        return lcbl;
    }

    /**
     * 设置临床与病理诊断
     *
     * @param lcbl 临床与病理诊断
     */
    public void setLcbl(String lcbl) {
        this.lcbl = lcbl;
    }

    /**
     * 获取冰冻与石蜡诊断
     *
     * @return SSBDSLBLQK - 冰冻与石蜡诊断
     */
    public String getSsbdslblqk() {
        return ssbdslblqk;
    }

    /**
     * 设置冰冻与石蜡诊断
     *
     * @param ssbdslblqk 冰冻与石蜡诊断
     */
    public void setSsbdslblqk(String ssbdslblqk) {
        this.ssbdslblqk = ssbdslblqk;
    }

    /**
     * 获取术前与术后病理诊断
     *
     * @return SQSHBLQK - 术前与术后病理诊断
     */
    public String getSqshblqk() {
        return sqshblqk;
    }

    /**
     * 设置术前与术后病理诊断
     *
     * @param sqshblqk 术前与术后病理诊断
     */
    public void setSqshblqk(String sqshblqk) {
        this.sqshblqk = sqshblqk;
    }

    /**
     * 获取临床与尸检诊断
     *
     * @return LCZDSJQK - 临床与尸检诊断
     */
    public String getLczdsjqk() {
        return lczdsjqk;
    }

    /**
     * 设置临床与尸检诊断
     *
     * @param lczdsjqk 临床与尸检诊断
     */
    public void setLczdsjqk(String lczdsjqk) {
        this.lczdsjqk = lczdsjqk;
    }

    /**
     * 获取院内会诊数
     *
     * @return YNHZCISHU - 院内会诊数
     */
    public Integer getYnhzcishu() {
        return ynhzcishu;
    }

    /**
     * 设置院内会诊数
     *
     * @param ynhzcishu 院内会诊数
     */
    public void setYnhzcishu(Integer ynhzcishu) {
        this.ynhzcishu = ynhzcishu;
    }

    /**
     * 获取外院会诊数
     *
     * @return WYHZCISHU - 外院会诊数
     */
    public Integer getWyhzcishu() {
        return wyhzcishu;
    }

    /**
     * 设置外院会诊数
     *
     * @param wyhzcishu 外院会诊数
     */
    public void setWyhzcishu(Integer wyhzcishu) {
        this.wyhzcishu = wyhzcishu;
    }

    /**
     * 获取输液
     *
     * @return SHUYE - 输液
     */
    public Integer getShuye() {
        return shuye;
    }

    /**
     * 设置输液
     *
     * @param shuye 输液
     */
    public void setShuye(Integer shuye) {
        this.shuye = shuye;
    }

    /**
     * 获取输液反应
     *
     * @return SHUYEFY - 输液反应
     */
    public Integer getShuyefy() {
        return shuyefy;
    }

    /**
     * 设置输液反应
     *
     * @param shuyefy 输液反应
     */
    public void setShuyefy(Integer shuyefy) {
        this.shuyefy = shuyefy;
    }

    /**
     * 获取抗菌用药目的
     *
     * @return KJYYMD - 抗菌用药目的
     */
    public String getKjyymd() {
        return kjyymd;
    }

    /**
     * 设置抗菌用药目的
     *
     * @param kjyymd 抗菌用药目的
     */
    public void setKjyymd(String kjyymd) {
        this.kjyymd = kjyymd;
    }

    /**
     * 获取抗菌用药方案
     *
     * @return KJYYFA - 抗菌用药方案
     */
    public String getKjyyfa() {
        return kjyyfa;
    }

    /**
     * 设置抗菌用药方案
     *
     * @param kjyyfa 抗菌用药方案
     */
    public void setKjyyfa(String kjyyfa) {
        this.kjyyfa = kjyyfa;
    }

    /**
     * 获取主诉
     *
     * @return ZHUSU - 主诉
     */
    public String getZhusu() {
        return zhusu;
    }

    /**
     * 设置主诉
     *
     * @param zhusu 主诉
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
     * 获取疾病谱编码
     *
     * @return JBPBM - 疾病谱编码
     */
    public String getJbpbm() {
        return jbpbm;
    }

    /**
     * 设置疾病谱编码
     *
     * @param jbpbm 疾病谱编码
     */
    public void setJbpbm(String jbpbm) {
        this.jbpbm = jbpbm;
    }

    /**
     * 获取肿瘤分期T
     *
     * @return ZLFQT - 肿瘤分期T
     */
    public String getZlfqt() {
        return zlfqt;
    }

    /**
     * 设置肿瘤分期T
     *
     * @param zlfqt 肿瘤分期T
     */
    public void setZlfqt(String zlfqt) {
        this.zlfqt = zlfqt;
    }

    /**
     * 获取肿瘤分期N
     *
     * @return ZLFQN - 肿瘤分期N
     */
    public String getZlfqn() {
        return zlfqn;
    }

    /**
     * 设置肿瘤分期N
     *
     * @param zlfqn 肿瘤分期N
     */
    public void setZlfqn(String zlfqn) {
        this.zlfqn = zlfqn;
    }

    /**
     * 获取肿瘤分期M
     *
     * @return ZLFQM - 肿瘤分期M
     */
    public String getZlfqm() {
        return zlfqm;
    }

    /**
     * 设置肿瘤分期M
     *
     * @param zlfqm 肿瘤分期M
     */
    public void setZlfqm(String zlfqm) {
        this.zlfqm = zlfqm;
    }

    /**
     * 获取是否单一病种？
     *
     * @return SFDYBZ - 是否单一病种？
     */
    public Integer getSfdybz() {
        return sfdybz;
    }

    /**
     * 设置是否单一病种？
     *
     * @param sfdybz 是否单一病种？
     */
    public void setSfdybz(Integer sfdybz) {
        this.sfdybz = sfdybz;
    }

    /**
     * 获取实施临床路径
     *
     * @return SSLCLJ - 实施临床路径
     */
    public Integer getSslclj() {
        return sslclj;
    }

    /**
     * 设置实施临床路径
     *
     * @param sslclj 实施临床路径
     */
    public void setSslclj(Integer sslclj) {
        this.sslclj = sslclj;
    }

    /**
     * 获取完成临床管理路径
     *
     * @return WCLCLJ - 完成临床管理路径
     */
    public Integer getWclclj() {
        return wclclj;
    }

    /**
     * 设置完成临床管理路径
     *
     * @param wclclj 完成临床管理路径
     */
    public void setWclclj(Integer wclclj) {
        this.wclclj = wclclj;
    }

    /**
     * 获取退出临床路径原因
     *
     * @return TCLCLJYY - 退出临床路径原因
     */
    public String getTclcljyy() {
        return tclcljyy;
    }

    /**
     * 设置退出临床路径原因
     *
     * @param tclcljyy 退出临床路径原因
     */
    public void setTclcljyy(String tclcljyy) {
        this.tclcljyy = tclcljyy;
    }

    /**
     * 获取退出临床路径原因描述
     *
     * @return TCLCLJMS - 退出临床路径原因描述
     */
    public String getTclcljms() {
        return tclcljms;
    }

    /**
     * 设置退出临床路径原因描述
     *
     * @param tclcljms 退出临床路径原因描述
     */
    public void setTclcljms(String tclcljms) {
        this.tclcljms = tclcljms;
    }

    /**
     * 获取临床路径管理变异原因（字典）
     *
     * @return LCLJBYYY - 临床路径管理变异原因（字典）
     */
    public String getLcljbyyy() {
        return lcljbyyy;
    }

    /**
     * 设置临床路径管理变异原因（字典）
     *
     * @param lcljbyyy 临床路径管理变异原因（字典）
     */
    public void setLcljbyyy(String lcljbyyy) {
        this.lcljbyyy = lcljbyyy;
    }

    /**
     * 获取临床路径管理原因描述
     *
     * @return LCLJBYMS - 临床路径管理原因描述
     */
    public String getLcljbyms() {
        return lcljbyms;
    }

    /**
     * 设置临床路径管理原因描述
     *
     * @param lcljbyms 临床路径管理原因描述
     */
    public void setLcljbyms(String lcljbyms) {
        this.lcljbyms = lcljbyms;
    }

    /**
     * 获取肿瘤分期
     *
     * @return ZLFQ - 肿瘤分期
     */
    public String getZlfq() {
        return zlfq;
    }

    /**
     * 设置肿瘤分期
     *
     * @param zlfq 肿瘤分期
     */
    public void setZlfq(String zlfq) {
        this.zlfq = zlfq;
    }

    /**
     * 获取肿瘤分化程度
     *
     * @return ZLFHCD - 肿瘤分化程度
     */
    public String getZlfhcd() {
        return zlfhcd;
    }

    /**
     * 设置肿瘤分化程度
     *
     * @param zlfhcd 肿瘤分化程度
     */
    public void setZlfhcd(String zlfhcd) {
        this.zlfhcd = zlfhcd;
    }

    /**
     * 获取肿瘤诊断依据
     *
     * @return ZLZDYJ - 肿瘤诊断依据
     */
    public String getZlzdyj() {
        return zlzdyj;
    }

    /**
     * 设置肿瘤诊断依据
     *
     * @param zlzdyj 肿瘤诊断依据
     */
    public void setZlzdyj(String zlzdyj) {
        this.zlzdyj = zlzdyj;
    }

    /**
     * 获取标识1
     *
     * @return BNBIAOSHI1 - 标识1
     */
    public String getBnbiaoshi1() {
        return bnbiaoshi1;
    }

    /**
     * 设置标识1
     *
     * @param bnbiaoshi1 标识1
     */
    public void setBnbiaoshi1(String bnbiaoshi1) {
        this.bnbiaoshi1 = bnbiaoshi1;
    }

    /**
     * 获取年龄（岁）
     *
     * @return AGE_SUI - 年龄（岁）
     */
    public Integer getAgeSui() {
        return ageSui;
    }

    /**
     * 设置年龄（岁）
     *
     * @param ageSui 年龄（岁）
     */
    public void setAgeSui(Integer ageSui) {
        this.ageSui = ageSui;
    }

    /**
     * 获取年龄（月）
     *
     * @return AGE_MONTH - 年龄（月）
     */
    public Integer getAgeMonth() {
        return ageMonth;
    }

    /**
     * 设置年龄（月）
     *
     * @param ageMonth 年龄（月）
     */
    public void setAgeMonth(Integer ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * 获取年龄（天）
     *
     * @return AGE_DAYS - 年龄（天）
     */
    public Integer getAgeDays() {
        return ageDays;
    }

    /**
     * 设置年龄（天）
     *
     * @param ageDays 年龄（天）
     */
    public void setAgeDays(Integer ageDays) {
        this.ageDays = ageDays;
    }

    /**
     * 获取压疮高风险
     *
     * @return YCGFX - 压疮高风险
     */
    public Integer getYcgfx() {
        return ycgfx;
    }

    /**
     * 设置压疮高风险
     *
     * @param ycgfx 压疮高风险
     */
    public void setYcgfx(Integer ycgfx) {
        this.ycgfx = ycgfx;
    }

    /**
     * 获取跌倒高风险
     *
     * @return DDGFX - 跌倒高风险
     */
    public Integer getDdgfx() {
        return ddgfx;
    }

    /**
     * 设置跌倒高风险
     *
     * @param ddgfx 跌倒高风险
     */
    public void setDdgfx(Integer ddgfx) {
        this.ddgfx = ddgfx;
    }
}