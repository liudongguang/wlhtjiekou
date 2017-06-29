package com.remote.api.bo;

import com.remote.api.po.Hisview;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by LiuDongguang on 2017/6/29.
 */
@Table(name = "HISVIEW")
public class HisviewExt{
    private Long id;
    /**
     * 机构id
     */
    @Column(name = "JGID")
    private String jgid;

    /**
     * 机构名称
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 唯一标识码
     */
    @Column(name = "SKU")
    private String sku;

    /**
     * 医疗付费方式
     */
    @Column(name = "YLFKFS")
    private String ylfkfs;

    /**
     * 健康卡号
     */
    @Column(name = "JKKH")
    private String jkkh;

    /**
     * 住院次数
     */
    @Column(name = "ZYCS")
    private String zycs;

    /**
     * 病案号
     */
    @Column(name = "BAH")
    private String bah;

    /**
     * 姓名
     */
    @Column(name = "XM")
    private String xm;

    /**
     * 性别
     */
    @Column(name = "XB")
    private String xb;

    /**
     * 出生日期
     */
    @Column(name = "CSRQ")
    private String csrq;

    /**
     * 年龄
     */
    @Column(name = "NL")
    private Long nl;

    /**
     * 国籍
     */
    @Column(name = "GJ")
    private String gj;
    /**
     * 出生地
     */
    @Column(name = "CSD")
    private String csd;

    /**
     * 籍贯
     */
    @Column(name = "GG")
    private String gg;

    /**
     * 年龄不足一岁时(月)
     */
    @Column(name = "BAYZSNL")
    private Short bayzsnl;
    /**
     * 民族
     */
    @Column(name = "MZ")
    private String mz;
    /**
     * 身份证号
     */
    @Column(name = "SFZH")
    private String sfzh;

    /**
     * 职业
     */
    @Column(name = "ZY")
    private String zy;

    /**
     * 婚姻
     */
    @Column(name = "HY")
    private String hy;

    /**
     * 户口地址
     */
    @Column(name = "HKDZ")
    private String hkdz;

    /**
     * 邮编
     */
    @Column(name = "YB2")
    private String yb2;
    /**
     * 工作单位及地址
     */
    @Column(name = "GZDWJDZ")
    private String gzdwjdz;

    /**
     * 单位电话
     */
    @Column(name = "DWDH")
    private String dwdh;

    /**
     * 单位邮编
     */
    @Column(name = "YB3")
    private String yb3;

    /**
     * 联系人姓名
     */
    @Column(name = "LXRXM")
    private String lxrxm;

    /**
     * 关系
     */
    @Column(name = "GX")
    private String gx;

    /**
     * 电话
     */
    @Column(name = "DH2")
    private String dh2;

    /**
     * 地址
     */
    @Column(name = "DZ")
    private String dz;
    /**
     * 现住址
     */
    @Column(name = "XZZ")
    private String xzz;

    /**
     * 电话
     */
    @Column(name = "DH")
    private String dh;

    /**
     * 邮编
     */
    @Column(name = "YB1")
    private String yb1;

    /**
     * 新生儿出生体重
     */
    @Column(name = "XSECSTZ")
    private BigDecimal xsecstz;

    /**
     * 新生儿入院体重
     */
    @Column(name = "XSERYTZ")
    private BigDecimal xserytz;

    /**
     * 入院时间
     */
    @Column(name = "RYSJ")
    private Date rysj;
    /**
     * 入院时间时
     */
    @Column(name = "RYSJS")
    private BigDecimal rysjs;
    /**
     * 目的
     */
    @Column(name = "MD")
    private String md;
    /**
     * 门诊诊断名称
     */
    @Column(name = "MZZD")
    private String mzzd;

    /**
     * 门诊诊断编码
     */
    @Column(name = "JBBM")
    private String jbbm;

    /**
     * 入院科室
     */
    @Column(name = "RYKB")
    private String rykb;

    /**
     * 入院病房
     */
    @Column(name = "RYBF")
    private String rybf;
    /**
     * 离院方式
     */
    @Column(name = "LYFS")
    private String lyfs;

    /**
     * 入院途径
     */
    @Column(name = "RYTJ")
    private String rytj;

    /**
     * 住院医师
     */
    @Column(name = "ZYYS")
    private String zyys;

    /**
     * 责任护士
     */
    @Column(name = "ZRHS")
    private String zrhs;
    /**
     * 科主任
     */
    @Column(name = "KZR")
    private String kzr;

    /**
     * 主任(副主任)医师
     */
    @Column(name = "ZRYS")
    private String zrys;

    /**
     * 主治医师
     */
    @Column(name = "ZZYS")
    private String zzys;

    /**
     * 实习医师
     */
    @Column(name = "SXYS")
    private String sxys;
    /**
     * 进修医师
     */
    @Column(name = "JXYS")
    private String jxys;


    /**
     * 编码员
     */
    @Column(name = "BMY")
    private String bmy;

    /**
     * 病案质量
     */
    @Column(name = "BAZL")
    private String bazl;

    /**
     * 质控医师
     */
    @Column(name = "ZKYS")
    private String zkys;

    /**
     * 质控护士
     */
    @Column(name = "ZKHS")
    private String zkhs;

    /**
     * 质控日期
     */
    @Column(name = "ZKRQ")
    private String zkrq;
    /**
     * 病理号
     */
    @Column(name = "BLH")
    private String blh;
    /**
     * 病理诊断
     */
    @Column(name = "BLZD")
    private String blzd;

    /**
     * 病理诊断编码
     */
    @Column(name = "JBMM")
    private String jbmm;
    /**
     * 中毒、外部原因
     */
    @Column(name = "WBYY")
    private String wbyy;

    /**
     * 编码
     */
    @Column(name = "H23")
    private String h23;
    /**
     * 血型
     */
    @Column(name = "XX")
    private String xx;

    /**
     * RH血型
     */
    @Column(name = "RH")
    private String rh;
    /**
     * 主要诊断
     */
    @Column(name = "ZYZD")
    private String zyzd;
    /**
     * 入院病情
     */
    @Column(name = "RYBQ")
    private String rybq;
    /**
     * 主要诊断编码
     */
    @Column(name = "JBDM")
    private String jbdm;

    /**
     * 其他诊断1
     */
    @Column(name = "QTZD1")
    private String qtzd1;


    /**
     * 入院病情1
     */
    @Column(name = "RYBQ1")
    private String rybq1;
    /**
     * 其他诊断编码1
     */
    @Column(name = "JBDM1")
    private String jbdm1;

    /**
     * 其他诊断2
     */
    @Column(name = "QTZD2")
    private String qtzd2;


    /**
     * 入院病情2
     */
    @Column(name = "RYBQ2")
    private String rybq2;
    /**
     * 其他诊断代码2
     */
    @Column(name = "JBDM2")
    private String jbdm2;

    /**
     * 其他诊断3
     */
    @Column(name = "QTZD3")
    private String qtzd3;


    /**
     * 入院病情3
     */
    @Column(name = "RYBQ3")
    private String rybq3;
    /**
     * 其他诊断代码3
     */
    @Column(name = "JBDM3")
    private String jbdm3;

    /**
     * 其他诊断4
     */
    @Column(name = "QTZD4")
    private String qtzd4;


    /**
     * 入院病情4
     */
    @Column(name = "RYBQ4")
    private String rybq4;
    /**
     * 其他诊断代码4
     */
    @Column(name = "JBDM4")
    private String jbdm4;
    /**
     * 其他诊断5
     */
    @Column(name = "QTZD5")
    private String qtzd5;


    /**
     * 入院病情5
     */
    @Column(name = "RYBQ5")
    private String rybq5;
    /**
     * 其他诊断代码5
     */
    @Column(name = "JBDM5")
    private String jbdm5;

    /**
     * 其他诊断6
     */
    @Column(name = "QTZD6")
    private String qtzd6;


    /**
     * 入院病情6
     */
    @Column(name = "RYBQ6")
    private String rybq6;

    /**
     * 其他诊断代码6
     */
    @Column(name = "JBDM6")
    private String jbdm6;

    /**
     * 其他诊断7
     */
    @Column(name = "QTZD7")
    private String qtzd7;


    /**
     * 入院病情7
     */
    @Column(name = "RYBQ7")
    private String rybq7;
    /**
     * 其他诊断代码7
     */
    @Column(name = "JBDM7")
    private String jbdm7;

    /**
     * 其他诊断8
     */
    @Column(name = "QTZD8")
    private String qtzd8;


    /**
     * 入院病情8
     */
    @Column(name = "RYBQ8")
    private String rybq8;
    /**
     * 其他诊断代码8
     */
    @Column(name = "JBDM8")
    private String jbdm8;

    /**
     * 其他诊断9
     */
    @Column(name = "QTZD9")
    private String qtzd9;


    /**
     * 入院病情9
     */
    @Column(name = "RYBQ9")
    private String rybq9;
    /**
     * 其他诊断代码9
     */
    @Column(name = "JBDM9")
    private String jbdm9;

    /**
     * 其他诊断10
     */
    @Column(name = "QTZD10")
    private String qtzd10;


    /**
     * 入院病情10
     */
    @Column(name = "RYBQ10")
    private String rybq10;

    /**
     * 其他诊断代码10
     */
    @Column(name = "JBDM10")
    private String jbdm10;

    /**
     * 其他诊断11
     */
    @Column(name = "QTZD11")
    private String qtzd11;


    /**
     * 入院病情11
     */
    @Column(name = "RYBQ11")
    private String rybq11;
    /**
     * 其他诊断代码11
     */
    @Column(name = "JBDM11")
    private String jbdm11;

    /**
     * 其他诊断12
     */
    @Column(name = "QTZD12")
    private String qtzd12;


    /**
     * 入院病情12
     */
    @Column(name = "RYBQ12")
    private String rybq12;
    /**
     * 其他诊断代码12
     */
    @Column(name = "JBDM12")
    private String jbdm12;

    /**
     * 其他诊断13
     */
    @Column(name = "QTZD13")
    private String qtzd13;


    /**
     * 入院病情13
     */
    @Column(name = "RYBQ13")
    private String rybq13;

    /**
     * 其他诊断代码13
     */
    @Column(name = "JBDM13")
    private String jbdm13;

    /**
     * 其他诊断14
     */
    @Column(name = "QTZD14")
    private String qtzd14;


    /**
     * 入院病情14
     */
    @Column(name = "RYBQ14")
    private String rybq14;

    /**
     * 其他诊断代码14
     */
    @Column(name = "JBDM14")
    private String jbdm14;


    /**
     * 其他诊断15
     */
    @Column(name = "QTZD15")
    private String qtzd15;


    /**
     * 入院病情15
     */
    @Column(name = "RYBQ15")
    private String rybq15;


    /**
     * 其他诊断代码15
     */
    @Column(name = "JBDM15")
    private String jbdm15;


    /**
     * 手术及操作编码1
     */
    @Column(name = "SSJCZBM1")
    private String ssjczbm1;

    /**
     * 手术及操作日期1
     */
    @Column(name = "SSJCZRQ1")
    private String ssjczrq1;

    /**
     * 手术级别1
     */
    @Column(name = "SSJB1")
    private String ssjb1;

    /**
     * 手术及操作名称1
     */
    @Column(name = "SSJCZMC1")
    private String ssjczmc1;

    /**
     * 术者1
     */
    @Column(name = "SZ1")
    private String sz1;

    /**
     * I助1
     */
    @Column(name = "YZ1")
    private String yz1;

    /**
     * II助1
     */
    @Column(name = "EZ1")
    private String ez1;

    /**
     * 切口等级1
     */
    @Column(name = "QKDJ1")
    private String qkdj1;

    /**
     * 切口愈合类别1
     */
    @Column(name = "QKYHLB1")
    private String qkyhlb1;

    /**
     * 麻醉方式1
     */
    @Column(name = "MZFS1")
    private String mzfs1;

    /**
     * 麻醉医师1
     */
    @Column(name = "MZYS1")
    private String mzys1;

    /**
     * 手术及操作编码2
     */
    @Column(name = "SSJCZBM2")
    private String ssjczbm2;

    /**
     * 手术及操作日期2
     */
    @Column(name = "SSJCZRQ2")
    private String ssjczrq2;

    /**
     * 手术级别2
     */
    @Column(name = "SSJB2")
    private String ssjb2;

    /**
     * 手术及操作名称2
     */
    @Column(name = "SSJCZMC2")
    private String ssjczmc2;

    /**
     * 术者2
     */
    @Column(name = "SZ2")
    private String sz2;

    /**
     * I助2
     */
    @Column(name = "YZ2")
    private String yz2;

    /**
     * II助2
     */
    @Column(name = "EZ2")
    private String ez2;

    /**
     * 切口等级2
     */
    @Column(name = "QKDJ2")
    private String qkdj2;

    /**
     * 切口愈合类别2
     */
    @Column(name = "QKYHLB2")
    private String qkyhlb2;

    /**
     * 麻醉方式2
     */
    @Column(name = "MZFS2")
    private String mzfs2;

    /**
     * 麻醉医师2
     */
    @Column(name = "MZYS2")
    private String mzys2;

    /**
     * 手术及操作编码3
     */
    @Column(name = "SSJCZBM3")
    private String ssjczbm3;

    /**
     * 手术及操作日期3
     */
    @Column(name = "SSJCZRQ3")
    private String ssjczrq3;

    /**
     * 手术级别3
     */
    @Column(name = "SSJB3")
    private String ssjb3;

    /**
     * 手术及操作名称3
     */
    @Column(name = "SSJCZMC3")
    private String ssjczmc3;

    /**
     * 术者3
     */
    @Column(name = "SZ3")
    private String sz3;

    /**
     * I助3
     */
    @Column(name = "YZ3")
    private String yz3;

    /**
     * II助3
     */
    @Column(name = "EZ3")
    private String ez3;

    /**
     * 切口等级3
     */
    @Column(name = "QKDJ3")
    private String qkdj3;

    /**
     * 切口愈合类别3
     */
    @Column(name = "QKYHLB3")
    private String qkyhlb3;

    /**
     * 麻醉方式3
     */
    @Column(name = "MZFS3")
    private String mzfs3;

    /**
     * 麻醉医师3
     */
    @Column(name = "MZYS3")
    private String mzys3;

    /**
     * 手术及操作编码4
     */
    @Column(name = "SSJCZBM4")
    private String ssjczbm4;

    /**
     * 手术及操作日期4
     */
    @Column(name = "SSJCZRQ4")
    private String ssjczrq4;

    /**
     * 手术级别4
     */
    @Column(name = "SSJB4")
    private String ssjb4;

    /**
     * 手术及操作名称4
     */
    @Column(name = "SSJCZMC4")
    private String ssjczmc4;

    /**
     * 术者4
     */
    @Column(name = "SZ4")
    private String sz4;

    /**
     * I助4
     */
    @Column(name = "YZ4")
    private String yz4;

    /**
     * II助4
     */
    @Column(name = "EZ4")
    private String ez4;

    /**
     * 切口等级4
     */
    @Column(name = "QKDJ4")
    private String qkdj4;

    /**
     * 切口愈合类别4
     */
    @Column(name = "QKYHLB4")
    private String qkyhlb4;

    /**
     * 麻醉方式4
     */
    @Column(name = "MZFS4")
    private String mzfs4;

    /**
     * 麻醉医师4
     */
    @Column(name = "MZYS4")
    private String mzys4;

    /**
     * 手术及操作编码5
     */
    @Column(name = "SSJCZBM5")
    private String ssjczbm5;

    /**
     * 手术及操作日期5
     */
    @Column(name = "SSJCZRQ5")
    private String ssjczrq5;

    /**
     * 手术级别5
     */
    @Column(name = "SSJB5")
    private String ssjb5;

    /**
     * 手术及操作名称5
     */
    @Column(name = "SSJCZMC5")
    private String ssjczmc5;

    /**
     * 术者5
     */
    @Column(name = "SZ5")
    private String sz5;

    /**
     * I助5
     */
    @Column(name = "YZ5")
    private String yz5;

    /**
     * II助5
     */
    @Column(name = "EZ5")
    private String ez5;

    /**
     * 切口等级5
     */
    @Column(name = "QKDJ5")
    private String qkdj5;

    /**
     * 切口愈合类别5
     */
    @Column(name = "QKYHLB5")
    private String qkyhlb5;

    /**
     * 麻醉方式5
     */
    @Column(name = "MZFS5")
    private String mzfs5;

    /**
     * 麻醉医师5
     */
    @Column(name = "MZYS5")
    private String mzys5;

    /**
     * 手术及操作编码6
     */
    @Column(name = "SSJCZBM6")
    private String ssjczbm6;

    /**
     * 手术及操作日期6
     */
    @Column(name = "SSJCZRQ6")
    private String ssjczrq6;

    /**
     * 手术级别6
     */
    @Column(name = "SSJB6")
    private String ssjb6;

    /**
     * 手术及操作名称6
     */
    @Column(name = "SSJCZMC6")
    private String ssjczmc6;

    /**
     * 术者6
     */
    @Column(name = "SZ6")
    private String sz6;

    /**
     * I助6
     */
    @Column(name = "YZ6")
    private String yz6;

    /**
     * II助6
     */
    @Column(name = "EZ6")
    private String ez6;

    /**
     * 切口等级6
     */
    @Column(name = "QKDJ6")
    private String qkdj6;

    /**
     * 切口愈合类别6
     */
    @Column(name = "QKYHLB6")
    private String qkyhlb6;

    /**
     * 麻醉方式6
     */
    @Column(name = "MZFS6")
    private String mzfs6;

    /**
     * 麻醉医师6
     */
    @Column(name = "MZYS6")
    private String mzys6;

    /**
     * 手术及操作编码7
     */
    @Column(name = "SSJCZBM7")
    private String ssjczbm7;

    /**
     * 手术及操作日期7
     */
    @Column(name = "SSJCZRQ7")
    private String ssjczrq7;

    /**
     * 手术级别7
     */
    @Column(name = "SSJB7")
    private String ssjb7;

    /**
     * 手术及操作名称7
     */
    @Column(name = "SSJCZMC7")
    private String ssjczmc7;

    /**
     * 术者7
     */
    @Column(name = "SZ7")
    private String sz7;

    /**
     * I助7
     */
    @Column(name = "YZ7")
    private String yz7;

    /**
     * II助7
     */
    @Column(name = "EZ7")
    private String ez7;

    /**
     * 切口等级7
     */
    @Column(name = "QKDJ7")
    private String qkdj7;

    /**
     * 切口愈合类别7
     */
    @Column(name = "QKYHLB7")
    private String qkyhlb7;

    /**
     * 麻醉方式7
     */
    @Column(name = "MZFS7")
    private String mzfs7;
    /**
     * 颅脑损伤患者入院前时间：天
     */
    @Column(name = "RYQ_T")
    private Long ryqT;

    /**
     * 颅脑损伤患者入院前时间：小时
     */
    @Column(name = "RYQ_XS")
    private BigDecimal ryqXs;

    /**
     * 颅脑损伤患者入院前时间：分
     */
    @Column(name = "RYQ_F")
    private Long ryqF;
    /**
     * 颅脑损伤患者入院后时间：天
     */
    @Column(name = "RYH_T")
    private Long ryhT;

    /**
     * 颅脑损伤患者入院后时间：小时
     */
    @Column(name = "RYH_XS")
    private BigDecimal ryhXs;

    /**
     * 颅脑损伤患者入院后时间：分
     */
    @Column(name = "RYH_F")
    private Long ryhF;
    /**
     * 麻醉医师7
     */
    @Column(name = "MZYS7")
    private String mzys7;


    /**
     * 是否有过敏药物
     */
    @Column(name = "YWGM")
    private String ywgm;

    /**
     * 过敏药物名称
     */
    @Column(name = "GMYW")
    private String gmyw;
    /**
     * 转科科室
     */
    @Column(name = "ZKKB")
    private String zkkb;
    /**
     * 出院科室
     */
    @Column(name = "CYKB")
    private String cykb;

    /**
     * 死亡患者是否尸检
     */
    @Column(name = "SWHZSJ")
    private String swhzsj;
    /**
     * 出院病房
     */
    @Column(name = "CYBF")
    private String cybf;


    /**
     * 出院时间
     */
    @Column(name = "CYSJ")
    private Date cysj;

    /**
     * 出院时间时
     */
    @Column(name = "CYSJS")
    private BigDecimal cysjs;
    /**
     * 时间住院天数
     */
    @Column(name = "SJZYTS")
    private String sjzyts;
    /**
     * 是否有31天再住院计划
     */
    @Column(name = "SFZZYJH")
    private String sfzzyjh;
    /**
     * 遗嘱转院—医疗机构
     */
    @Column(name = "YZZY_YLJG")
    private String yzzyYljg;

    /**
     * 遗嘱转乡镇卫生院-机构名称
     */
    @Column(name = "WSY_YLJG")
    private String wsyYljg;


    /**
     * 手术费
     */
    @Column(name = "SSF")
    private BigDecimal ssf;
    /**
     * 护理住院费
     */
    @Column(name = "HLF")
    private BigDecimal hlf;
    /**
     * 中草药费
     */
    @Column(name = "ZCYF1")
    private BigDecimal zcyf1;
    /**
     * 中药类：中成药费
     */
    @Column(name = "ZCYF")
    private BigDecimal zcyf;

    /**
     * 麻醉费
     */
    @Column(name = "MAF")
    private BigDecimal maf;


    /**
     * 西药类：西药费
     */
    @Column(name = "XYF")
    private BigDecimal xyf;

    /**
     * 血液和血液制品类：血费
     */
    @Column(name = "XF")
    private BigDecimal xf;

    /**
     * 治疗类：非手术治疗费
     */
    @Column(name = "FSSZLXMF")
    private BigDecimal fsszlxmf;

    /**
     * 其他费用
     */
    @Column(name = "QTFY")
    private BigDecimal qtfy;
    /**
     * 总费用
     */
    @Column(name = "ZFY")
    private BigDecimal zfy;

    /**
     * 自付金额
     */
    @Column(name = "ZFJE")
    private BigDecimal zfje;

    /**
     * 综合医疗服务类：一般医疗服务费
     */
    @Column(name = "YLFUF")
    private BigDecimal ylfuf;

    /**
     * 一般治疗操作费
     */
    @Column(name = "ZLCZF")
    private BigDecimal zlczf;

    /**
     * 诊断类：病理诊断费
     */
    @Column(name = "BLZDF")
    private BigDecimal blzdf;

    /**
     * 实验室诊断费
     */
    @Column(name = "SYSZDF")
    private BigDecimal syszdf;

    /**
     * 影像学诊断费
     */
    @Column(name = "YXXZDF")
    private BigDecimal yxxzdf;

    /**
     * 临床诊断项目费
     */
    @Column(name = "LCZDXMF")
    private BigDecimal lczdxmf;


    /**
     * 临床物理治疗费
     */
    @Column(name = "WLZLF")
    private BigDecimal wlzlf;

    /**
     * 康复类：康复费
     */
    @Column(name = "KFF")
    private BigDecimal kff;


    /**
     * 手术治疗费
     */
    @Column(name = "SSZLF")
    private BigDecimal sszlf;


    /**
     * 中医类：中医治疗费
     */
    @Column(name = "ZYZLF")
    private BigDecimal zyzlf;


    /**
     * 抗菌药物费
     */
    @Column(name = "KJYWF")
    private BigDecimal kjywf;


    /**
     * 白蛋白类制品费
     */
    @Column(name = "BDBLZPF")
    private BigDecimal bdblzpf;

    /**
     * 球蛋白类制品费
     */
    @Column(name = "QDBLZPF")
    private BigDecimal qdblzpf;

    /**
     * 耗材类：检查用一次性医用材料费
     */
    @Column(name = "HCYYCLF")
    private BigDecimal hcyyclf;

    /**
     * 凝血因子类制品费
     */
    @Column(name = "NXYZLZPF")
    private BigDecimal nxyzlzpf;

    /**
     * 细胞因子类制品费
     */
    @Column(name = "XBYZLZPF")
    private BigDecimal xbyzlzpf;


    /**
     * 治疗用一次性医用材料费
     */
    @Column(name = "YYCLF")
    private BigDecimal yyclf;

    /**
     * 手术用一次性医用材料费
     */
    @Column(name = "YCXYYCLF")
    private BigDecimal ycxyyclf;

    /**
     * 其他类：其他费用
     */
    @Column(name = "QTF")
    private BigDecimal qtf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJgid() {
        return jgid;
    }

    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getYlfkfs() {
        return ylfkfs;
    }

    public void setYlfkfs(String ylfkfs) {
        this.ylfkfs = ylfkfs;
    }

    public String getJkkh() {
        return jkkh;
    }

    public void setJkkh(String jkkh) {
        this.jkkh = jkkh;
    }

    public String getZycs() {
        return zycs;
    }

    public void setZycs(String zycs) {
        this.zycs = zycs;
    }

    public String getBah() {
        return bah;
    }

    public void setBah(String bah) {
        this.bah = bah;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public Long getNl() {
        return nl;
    }

    public void setNl(Long nl) {
        this.nl = nl;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public Short getBayzsnl() {
        return bayzsnl;
    }

    public void setBayzsnl(Short bayzsnl) {
        this.bayzsnl = bayzsnl;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getHkdz() {
        return hkdz;
    }

    public void setHkdz(String hkdz) {
        this.hkdz = hkdz;
    }

    public String getYb2() {
        return yb2;
    }

    public void setYb2(String yb2) {
        this.yb2 = yb2;
    }

    public String getGzdwjdz() {
        return gzdwjdz;
    }

    public void setGzdwjdz(String gzdwjdz) {
        this.gzdwjdz = gzdwjdz;
    }

    public String getDwdh() {
        return dwdh;
    }

    public void setDwdh(String dwdh) {
        this.dwdh = dwdh;
    }

    public String getYb3() {
        return yb3;
    }

    public void setYb3(String yb3) {
        this.yb3 = yb3;
    }

    public String getLxrxm() {
        return lxrxm;
    }

    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
    }

    public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx;
    }

    public String getDh2() {
        return dh2;
    }

    public void setDh2(String dh2) {
        this.dh2 = dh2;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getYb1() {
        return yb1;
    }

    public void setYb1(String yb1) {
        this.yb1 = yb1;
    }

    public BigDecimal getXsecstz() {
        return xsecstz;
    }

    public void setXsecstz(BigDecimal xsecstz) {
        this.xsecstz = xsecstz;
    }

    public BigDecimal getXserytz() {
        return xserytz;
    }

    public void setXserytz(BigDecimal xserytz) {
        this.xserytz = xserytz;
    }

    public Date getRysj() {
        return rysj;
    }

    public void setRysj(Date rysj) {
        this.rysj = rysj;
    }

    public BigDecimal getRysjs() {
        return rysjs;
    }

    public void setRysjs(BigDecimal rysjs) {
        this.rysjs = rysjs;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getMzzd() {
        return mzzd;
    }

    public void setMzzd(String mzzd) {
        this.mzzd = mzzd;
    }

    public String getJbbm() {
        return jbbm;
    }

    public void setJbbm(String jbbm) {
        this.jbbm = jbbm;
    }

    public String getRykb() {
        return rykb;
    }

    public void setRykb(String rykb) {
        this.rykb = rykb;
    }

    public String getRybf() {
        return rybf;
    }

    public void setRybf(String rybf) {
        this.rybf = rybf;
    }

    public String getLyfs() {
        return lyfs;
    }

    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }

    public String getRytj() {
        return rytj;
    }

    public void setRytj(String rytj) {
        this.rytj = rytj;
    }

    public String getZyys() {
        return zyys;
    }

    public void setZyys(String zyys) {
        this.zyys = zyys;
    }

    public String getZrhs() {
        return zrhs;
    }

    public void setZrhs(String zrhs) {
        this.zrhs = zrhs;
    }

    public String getKzr() {
        return kzr;
    }

    public void setKzr(String kzr) {
        this.kzr = kzr;
    }

    public String getZrys() {
        return zrys;
    }

    public void setZrys(String zrys) {
        this.zrys = zrys;
    }

    public String getZzys() {
        return zzys;
    }

    public void setZzys(String zzys) {
        this.zzys = zzys;
    }

    public String getSxys() {
        return sxys;
    }

    public void setSxys(String sxys) {
        this.sxys = sxys;
    }

    public String getJxys() {
        return jxys;
    }

    public void setJxys(String jxys) {
        this.jxys = jxys;
    }

    public String getBmy() {
        return bmy;
    }

    public void setBmy(String bmy) {
        this.bmy = bmy;
    }

    public String getBazl() {
        return bazl;
    }

    public void setBazl(String bazl) {
        this.bazl = bazl;
    }

    public String getZkys() {
        return zkys;
    }

    public void setZkys(String zkys) {
        this.zkys = zkys;
    }

    public String getZkhs() {
        return zkhs;
    }

    public void setZkhs(String zkhs) {
        this.zkhs = zkhs;
    }

    public String getZkrq() {
        return zkrq;
    }

    public void setZkrq(String zkrq) {
        this.zkrq = zkrq;
    }

    public String getBlh() {
        return blh;
    }

    public void setBlh(String blh) {
        this.blh = blh;
    }

    public String getBlzd() {
        return blzd;
    }

    public void setBlzd(String blzd) {
        this.blzd = blzd;
    }

    public String getJbmm() {
        return jbmm;
    }

    public void setJbmm(String jbmm) {
        this.jbmm = jbmm;
    }

    public String getWbyy() {
        return wbyy;
    }

    public void setWbyy(String wbyy) {
        this.wbyy = wbyy;
    }

    public String getH23() {
        return h23;
    }

    public void setH23(String h23) {
        this.h23 = h23;
    }

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getZyzd() {
        return zyzd;
    }

    public void setZyzd(String zyzd) {
        this.zyzd = zyzd;
    }

    public String getRybq() {
        return rybq;
    }

    public void setRybq(String rybq) {
        this.rybq = rybq;
    }

    public String getJbdm() {
        return jbdm;
    }

    public void setJbdm(String jbdm) {
        this.jbdm = jbdm;
    }

    public String getQtzd1() {
        return qtzd1;
    }

    public void setQtzd1(String qtzd1) {
        this.qtzd1 = qtzd1;
    }

    public String getRybq1() {
        return rybq1;
    }

    public void setRybq1(String rybq1) {
        this.rybq1 = rybq1;
    }

    public String getJbdm1() {
        return jbdm1;
    }

    public void setJbdm1(String jbdm1) {
        this.jbdm1 = jbdm1;
    }

    public String getQtzd2() {
        return qtzd2;
    }

    public void setQtzd2(String qtzd2) {
        this.qtzd2 = qtzd2;
    }

    public String getRybq2() {
        return rybq2;
    }

    public void setRybq2(String rybq2) {
        this.rybq2 = rybq2;
    }

    public String getJbdm2() {
        return jbdm2;
    }

    public void setJbdm2(String jbdm2) {
        this.jbdm2 = jbdm2;
    }

    public String getQtzd3() {
        return qtzd3;
    }

    public void setQtzd3(String qtzd3) {
        this.qtzd3 = qtzd3;
    }

    public String getRybq3() {
        return rybq3;
    }

    public void setRybq3(String rybq3) {
        this.rybq3 = rybq3;
    }

    public String getJbdm3() {
        return jbdm3;
    }

    public void setJbdm3(String jbdm3) {
        this.jbdm3 = jbdm3;
    }

    public String getQtzd4() {
        return qtzd4;
    }

    public void setQtzd4(String qtzd4) {
        this.qtzd4 = qtzd4;
    }

    public String getRybq4() {
        return rybq4;
    }

    public void setRybq4(String rybq4) {
        this.rybq4 = rybq4;
    }

    public String getJbdm4() {
        return jbdm4;
    }

    public void setJbdm4(String jbdm4) {
        this.jbdm4 = jbdm4;
    }

    public String getQtzd5() {
        return qtzd5;
    }

    public void setQtzd5(String qtzd5) {
        this.qtzd5 = qtzd5;
    }

    public String getRybq5() {
        return rybq5;
    }

    public void setRybq5(String rybq5) {
        this.rybq5 = rybq5;
    }

    public String getJbdm5() {
        return jbdm5;
    }

    public void setJbdm5(String jbdm5) {
        this.jbdm5 = jbdm5;
    }

    public String getQtzd6() {
        return qtzd6;
    }

    public void setQtzd6(String qtzd6) {
        this.qtzd6 = qtzd6;
    }

    public String getRybq6() {
        return rybq6;
    }

    public void setRybq6(String rybq6) {
        this.rybq6 = rybq6;
    }

    public String getJbdm6() {
        return jbdm6;
    }

    public void setJbdm6(String jbdm6) {
        this.jbdm6 = jbdm6;
    }

    public String getQtzd7() {
        return qtzd7;
    }

    public void setQtzd7(String qtzd7) {
        this.qtzd7 = qtzd7;
    }

    public String getRybq7() {
        return rybq7;
    }

    public void setRybq7(String rybq7) {
        this.rybq7 = rybq7;
    }

    public String getJbdm7() {
        return jbdm7;
    }

    public void setJbdm7(String jbdm7) {
        this.jbdm7 = jbdm7;
    }

    public String getQtzd8() {
        return qtzd8;
    }

    public void setQtzd8(String qtzd8) {
        this.qtzd8 = qtzd8;
    }

    public String getRybq8() {
        return rybq8;
    }

    public void setRybq8(String rybq8) {
        this.rybq8 = rybq8;
    }

    public String getJbdm8() {
        return jbdm8;
    }

    public void setJbdm8(String jbdm8) {
        this.jbdm8 = jbdm8;
    }

    public String getQtzd9() {
        return qtzd9;
    }

    public void setQtzd9(String qtzd9) {
        this.qtzd9 = qtzd9;
    }

    public String getRybq9() {
        return rybq9;
    }

    public void setRybq9(String rybq9) {
        this.rybq9 = rybq9;
    }

    public String getJbdm9() {
        return jbdm9;
    }

    public void setJbdm9(String jbdm9) {
        this.jbdm9 = jbdm9;
    }

    public String getQtzd10() {
        return qtzd10;
    }

    public void setQtzd10(String qtzd10) {
        this.qtzd10 = qtzd10;
    }

    public String getRybq10() {
        return rybq10;
    }

    public void setRybq10(String rybq10) {
        this.rybq10 = rybq10;
    }

    public String getJbdm10() {
        return jbdm10;
    }

    public void setJbdm10(String jbdm10) {
        this.jbdm10 = jbdm10;
    }

    public String getQtzd11() {
        return qtzd11;
    }

    public void setQtzd11(String qtzd11) {
        this.qtzd11 = qtzd11;
    }

    public String getRybq11() {
        return rybq11;
    }

    public void setRybq11(String rybq11) {
        this.rybq11 = rybq11;
    }

    public String getJbdm11() {
        return jbdm11;
    }

    public void setJbdm11(String jbdm11) {
        this.jbdm11 = jbdm11;
    }

    public String getQtzd12() {
        return qtzd12;
    }

    public void setQtzd12(String qtzd12) {
        this.qtzd12 = qtzd12;
    }

    public String getRybq12() {
        return rybq12;
    }

    public void setRybq12(String rybq12) {
        this.rybq12 = rybq12;
    }

    public String getJbdm12() {
        return jbdm12;
    }

    public void setJbdm12(String jbdm12) {
        this.jbdm12 = jbdm12;
    }

    public String getQtzd13() {
        return qtzd13;
    }

    public void setQtzd13(String qtzd13) {
        this.qtzd13 = qtzd13;
    }

    public String getRybq13() {
        return rybq13;
    }

    public void setRybq13(String rybq13) {
        this.rybq13 = rybq13;
    }

    public String getJbdm13() {
        return jbdm13;
    }

    public void setJbdm13(String jbdm13) {
        this.jbdm13 = jbdm13;
    }

    public String getQtzd14() {
        return qtzd14;
    }

    public void setQtzd14(String qtzd14) {
        this.qtzd14 = qtzd14;
    }

    public String getRybq14() {
        return rybq14;
    }

    public void setRybq14(String rybq14) {
        this.rybq14 = rybq14;
    }

    public String getJbdm14() {
        return jbdm14;
    }

    public void setJbdm14(String jbdm14) {
        this.jbdm14 = jbdm14;
    }

    public String getQtzd15() {
        return qtzd15;
    }

    public void setQtzd15(String qtzd15) {
        this.qtzd15 = qtzd15;
    }

    public String getRybq15() {
        return rybq15;
    }

    public void setRybq15(String rybq15) {
        this.rybq15 = rybq15;
    }

    public String getJbdm15() {
        return jbdm15;
    }

    public void setJbdm15(String jbdm15) {
        this.jbdm15 = jbdm15;
    }

    public String getSsjczbm1() {
        return ssjczbm1;
    }

    public void setSsjczbm1(String ssjczbm1) {
        this.ssjczbm1 = ssjczbm1;
    }

    public String getSsjczrq1() {
        return ssjczrq1;
    }

    public void setSsjczrq1(String ssjczrq1) {
        this.ssjczrq1 = ssjczrq1;
    }

    public String getSsjb1() {
        return ssjb1;
    }

    public void setSsjb1(String ssjb1) {
        this.ssjb1 = ssjb1;
    }

    public String getSsjczmc1() {
        return ssjczmc1;
    }

    public void setSsjczmc1(String ssjczmc1) {
        this.ssjczmc1 = ssjczmc1;
    }

    public String getSz1() {
        return sz1;
    }

    public void setSz1(String sz1) {
        this.sz1 = sz1;
    }

    public String getYz1() {
        return yz1;
    }

    public void setYz1(String yz1) {
        this.yz1 = yz1;
    }

    public String getEz1() {
        return ez1;
    }

    public void setEz1(String ez1) {
        this.ez1 = ez1;
    }

    public String getQkdj1() {
        return qkdj1;
    }

    public void setQkdj1(String qkdj1) {
        this.qkdj1 = qkdj1;
    }

    public String getQkyhlb1() {
        return qkyhlb1;
    }

    public void setQkyhlb1(String qkyhlb1) {
        this.qkyhlb1 = qkyhlb1;
    }

    public String getMzfs1() {
        return mzfs1;
    }

    public void setMzfs1(String mzfs1) {
        this.mzfs1 = mzfs1;
    }

    public String getMzys1() {
        return mzys1;
    }

    public void setMzys1(String mzys1) {
        this.mzys1 = mzys1;
    }

    public String getSsjczbm2() {
        return ssjczbm2;
    }

    public void setSsjczbm2(String ssjczbm2) {
        this.ssjczbm2 = ssjczbm2;
    }

    public String getSsjczrq2() {
        return ssjczrq2;
    }

    public void setSsjczrq2(String ssjczrq2) {
        this.ssjczrq2 = ssjczrq2;
    }

    public String getSsjb2() {
        return ssjb2;
    }

    public void setSsjb2(String ssjb2) {
        this.ssjb2 = ssjb2;
    }

    public String getSsjczmc2() {
        return ssjczmc2;
    }

    public void setSsjczmc2(String ssjczmc2) {
        this.ssjczmc2 = ssjczmc2;
    }

    public String getSz2() {
        return sz2;
    }

    public void setSz2(String sz2) {
        this.sz2 = sz2;
    }

    public String getYz2() {
        return yz2;
    }

    public void setYz2(String yz2) {
        this.yz2 = yz2;
    }

    public String getEz2() {
        return ez2;
    }

    public void setEz2(String ez2) {
        this.ez2 = ez2;
    }

    public String getQkdj2() {
        return qkdj2;
    }

    public void setQkdj2(String qkdj2) {
        this.qkdj2 = qkdj2;
    }

    public String getQkyhlb2() {
        return qkyhlb2;
    }

    public void setQkyhlb2(String qkyhlb2) {
        this.qkyhlb2 = qkyhlb2;
    }

    public String getMzfs2() {
        return mzfs2;
    }

    public void setMzfs2(String mzfs2) {
        this.mzfs2 = mzfs2;
    }

    public String getMzys2() {
        return mzys2;
    }

    public void setMzys2(String mzys2) {
        this.mzys2 = mzys2;
    }

    public String getSsjczbm3() {
        return ssjczbm3;
    }

    public void setSsjczbm3(String ssjczbm3) {
        this.ssjczbm3 = ssjczbm3;
    }

    public String getSsjczrq3() {
        return ssjczrq3;
    }

    public void setSsjczrq3(String ssjczrq3) {
        this.ssjczrq3 = ssjczrq3;
    }

    public String getSsjb3() {
        return ssjb3;
    }

    public void setSsjb3(String ssjb3) {
        this.ssjb3 = ssjb3;
    }

    public String getSsjczmc3() {
        return ssjczmc3;
    }

    public void setSsjczmc3(String ssjczmc3) {
        this.ssjczmc3 = ssjczmc3;
    }

    public String getSz3() {
        return sz3;
    }

    public void setSz3(String sz3) {
        this.sz3 = sz3;
    }

    public String getYz3() {
        return yz3;
    }

    public void setYz3(String yz3) {
        this.yz3 = yz3;
    }

    public String getEz3() {
        return ez3;
    }

    public void setEz3(String ez3) {
        this.ez3 = ez3;
    }

    public String getQkdj3() {
        return qkdj3;
    }

    public void setQkdj3(String qkdj3) {
        this.qkdj3 = qkdj3;
    }

    public String getQkyhlb3() {
        return qkyhlb3;
    }

    public void setQkyhlb3(String qkyhlb3) {
        this.qkyhlb3 = qkyhlb3;
    }

    public String getMzfs3() {
        return mzfs3;
    }

    public void setMzfs3(String mzfs3) {
        this.mzfs3 = mzfs3;
    }

    public String getMzys3() {
        return mzys3;
    }

    public void setMzys3(String mzys3) {
        this.mzys3 = mzys3;
    }

    public String getSsjczbm4() {
        return ssjczbm4;
    }

    public void setSsjczbm4(String ssjczbm4) {
        this.ssjczbm4 = ssjczbm4;
    }

    public String getSsjczrq4() {
        return ssjczrq4;
    }

    public void setSsjczrq4(String ssjczrq4) {
        this.ssjczrq4 = ssjczrq4;
    }

    public String getSsjb4() {
        return ssjb4;
    }

    public void setSsjb4(String ssjb4) {
        this.ssjb4 = ssjb4;
    }

    public String getSsjczmc4() {
        return ssjczmc4;
    }

    public void setSsjczmc4(String ssjczmc4) {
        this.ssjczmc4 = ssjczmc4;
    }

    public String getSz4() {
        return sz4;
    }

    public void setSz4(String sz4) {
        this.sz4 = sz4;
    }

    public String getYz4() {
        return yz4;
    }

    public void setYz4(String yz4) {
        this.yz4 = yz4;
    }

    public String getEz4() {
        return ez4;
    }

    public void setEz4(String ez4) {
        this.ez4 = ez4;
    }

    public String getQkdj4() {
        return qkdj4;
    }

    public void setQkdj4(String qkdj4) {
        this.qkdj4 = qkdj4;
    }

    public String getQkyhlb4() {
        return qkyhlb4;
    }

    public void setQkyhlb4(String qkyhlb4) {
        this.qkyhlb4 = qkyhlb4;
    }

    public String getMzfs4() {
        return mzfs4;
    }

    public void setMzfs4(String mzfs4) {
        this.mzfs4 = mzfs4;
    }

    public String getMzys4() {
        return mzys4;
    }

    public void setMzys4(String mzys4) {
        this.mzys4 = mzys4;
    }

    public String getSsjczbm5() {
        return ssjczbm5;
    }

    public void setSsjczbm5(String ssjczbm5) {
        this.ssjczbm5 = ssjczbm5;
    }

    public String getSsjczrq5() {
        return ssjczrq5;
    }

    public void setSsjczrq5(String ssjczrq5) {
        this.ssjczrq5 = ssjczrq5;
    }

    public String getSsjb5() {
        return ssjb5;
    }

    public void setSsjb5(String ssjb5) {
        this.ssjb5 = ssjb5;
    }

    public String getSsjczmc5() {
        return ssjczmc5;
    }

    public void setSsjczmc5(String ssjczmc5) {
        this.ssjczmc5 = ssjczmc5;
    }

    public String getSz5() {
        return sz5;
    }

    public void setSz5(String sz5) {
        this.sz5 = sz5;
    }

    public String getYz5() {
        return yz5;
    }

    public void setYz5(String yz5) {
        this.yz5 = yz5;
    }

    public String getEz5() {
        return ez5;
    }

    public void setEz5(String ez5) {
        this.ez5 = ez5;
    }

    public String getQkdj5() {
        return qkdj5;
    }

    public void setQkdj5(String qkdj5) {
        this.qkdj5 = qkdj5;
    }

    public String getQkyhlb5() {
        return qkyhlb5;
    }

    public void setQkyhlb5(String qkyhlb5) {
        this.qkyhlb5 = qkyhlb5;
    }

    public String getMzfs5() {
        return mzfs5;
    }

    public void setMzfs5(String mzfs5) {
        this.mzfs5 = mzfs5;
    }

    public String getMzys5() {
        return mzys5;
    }

    public void setMzys5(String mzys5) {
        this.mzys5 = mzys5;
    }

    public String getSsjczbm6() {
        return ssjczbm6;
    }

    public void setSsjczbm6(String ssjczbm6) {
        this.ssjczbm6 = ssjczbm6;
    }

    public String getSsjczrq6() {
        return ssjczrq6;
    }

    public void setSsjczrq6(String ssjczrq6) {
        this.ssjczrq6 = ssjczrq6;
    }

    public String getSsjb6() {
        return ssjb6;
    }

    public void setSsjb6(String ssjb6) {
        this.ssjb6 = ssjb6;
    }

    public String getSsjczmc6() {
        return ssjczmc6;
    }

    public void setSsjczmc6(String ssjczmc6) {
        this.ssjczmc6 = ssjczmc6;
    }

    public String getSz6() {
        return sz6;
    }

    public void setSz6(String sz6) {
        this.sz6 = sz6;
    }

    public String getYz6() {
        return yz6;
    }

    public void setYz6(String yz6) {
        this.yz6 = yz6;
    }

    public String getEz6() {
        return ez6;
    }

    public void setEz6(String ez6) {
        this.ez6 = ez6;
    }

    public String getQkdj6() {
        return qkdj6;
    }

    public void setQkdj6(String qkdj6) {
        this.qkdj6 = qkdj6;
    }

    public String getQkyhlb6() {
        return qkyhlb6;
    }

    public void setQkyhlb6(String qkyhlb6) {
        this.qkyhlb6 = qkyhlb6;
    }

    public String getMzfs6() {
        return mzfs6;
    }

    public void setMzfs6(String mzfs6) {
        this.mzfs6 = mzfs6;
    }

    public String getMzys6() {
        return mzys6;
    }

    public void setMzys6(String mzys6) {
        this.mzys6 = mzys6;
    }

    public String getSsjczbm7() {
        return ssjczbm7;
    }

    public void setSsjczbm7(String ssjczbm7) {
        this.ssjczbm7 = ssjczbm7;
    }

    public String getSsjczrq7() {
        return ssjczrq7;
    }

    public void setSsjczrq7(String ssjczrq7) {
        this.ssjczrq7 = ssjczrq7;
    }

    public String getSsjb7() {
        return ssjb7;
    }

    public void setSsjb7(String ssjb7) {
        this.ssjb7 = ssjb7;
    }

    public String getSsjczmc7() {
        return ssjczmc7;
    }

    public void setSsjczmc7(String ssjczmc7) {
        this.ssjczmc7 = ssjczmc7;
    }

    public String getSz7() {
        return sz7;
    }

    public void setSz7(String sz7) {
        this.sz7 = sz7;
    }

    public String getYz7() {
        return yz7;
    }

    public void setYz7(String yz7) {
        this.yz7 = yz7;
    }

    public String getEz7() {
        return ez7;
    }

    public void setEz7(String ez7) {
        this.ez7 = ez7;
    }

    public String getQkdj7() {
        return qkdj7;
    }

    public void setQkdj7(String qkdj7) {
        this.qkdj7 = qkdj7;
    }

    public String getQkyhlb7() {
        return qkyhlb7;
    }

    public void setQkyhlb7(String qkyhlb7) {
        this.qkyhlb7 = qkyhlb7;
    }

    public String getMzfs7() {
        return mzfs7;
    }

    public void setMzfs7(String mzfs7) {
        this.mzfs7 = mzfs7;
    }

    public Long getRyqT() {
        return ryqT;
    }

    public void setRyqT(Long ryqT) {
        this.ryqT = ryqT;
    }

    public BigDecimal getRyqXs() {
        return ryqXs;
    }

    public void setRyqXs(BigDecimal ryqXs) {
        this.ryqXs = ryqXs;
    }

    public Long getRyqF() {
        return ryqF;
    }

    public void setRyqF(Long ryqF) {
        this.ryqF = ryqF;
    }

    public Long getRyhT() {
        return ryhT;
    }

    public void setRyhT(Long ryhT) {
        this.ryhT = ryhT;
    }

    public BigDecimal getRyhXs() {
        return ryhXs;
    }

    public void setRyhXs(BigDecimal ryhXs) {
        this.ryhXs = ryhXs;
    }

    public Long getRyhF() {
        return ryhF;
    }

    public void setRyhF(Long ryhF) {
        this.ryhF = ryhF;
    }

    public String getMzys7() {
        return mzys7;
    }

    public void setMzys7(String mzys7) {
        this.mzys7 = mzys7;
    }

    public String getYwgm() {
        return ywgm;
    }

    public void setYwgm(String ywgm) {
        this.ywgm = ywgm;
    }

    public String getGmyw() {
        return gmyw;
    }

    public void setGmyw(String gmyw) {
        this.gmyw = gmyw;
    }

    public String getZkkb() {
        return zkkb;
    }

    public void setZkkb(String zkkb) {
        this.zkkb = zkkb;
    }

    public String getCykb() {
        return cykb;
    }

    public void setCykb(String cykb) {
        this.cykb = cykb;
    }

    public String getSwhzsj() {
        return swhzsj;
    }

    public void setSwhzsj(String swhzsj) {
        this.swhzsj = swhzsj;
    }

    public String getCybf() {
        return cybf;
    }

    public void setCybf(String cybf) {
        this.cybf = cybf;
    }

    public Date getCysj() {
        return cysj;
    }

    public void setCysj(Date cysj) {
        this.cysj = cysj;
    }

    public BigDecimal getCysjs() {
        return cysjs;
    }

    public void setCysjs(BigDecimal cysjs) {
        this.cysjs = cysjs;
    }

    public String getSjzyts() {
        return sjzyts;
    }

    public void setSjzyts(String sjzyts) {
        this.sjzyts = sjzyts;
    }

    public String getSfzzyjh() {
        return sfzzyjh;
    }

    public void setSfzzyjh(String sfzzyjh) {
        this.sfzzyjh = sfzzyjh;
    }

    public String getYzzyYljg() {
        return yzzyYljg;
    }

    public void setYzzyYljg(String yzzyYljg) {
        this.yzzyYljg = yzzyYljg;
    }

    public String getWsyYljg() {
        return wsyYljg;
    }

    public void setWsyYljg(String wsyYljg) {
        this.wsyYljg = wsyYljg;
    }

    public BigDecimal getSsf() {
        return ssf;
    }

    public void setSsf(BigDecimal ssf) {
        this.ssf = ssf;
    }

    public BigDecimal getHlf() {
        return hlf;
    }

    public void setHlf(BigDecimal hlf) {
        this.hlf = hlf;
    }

    public BigDecimal getZcyf1() {
        return zcyf1;
    }

    public void setZcyf1(BigDecimal zcyf1) {
        this.zcyf1 = zcyf1;
    }

    public BigDecimal getZcyf() {
        return zcyf;
    }

    public void setZcyf(BigDecimal zcyf) {
        this.zcyf = zcyf;
    }

    public BigDecimal getMaf() {
        return maf;
    }

    public void setMaf(BigDecimal maf) {
        this.maf = maf;
    }

    public BigDecimal getXyf() {
        return xyf;
    }

    public void setXyf(BigDecimal xyf) {
        this.xyf = xyf;
    }

    public BigDecimal getXf() {
        return xf;
    }

    public void setXf(BigDecimal xf) {
        this.xf = xf;
    }

    public BigDecimal getFsszlxmf() {
        return fsszlxmf;
    }

    public void setFsszlxmf(BigDecimal fsszlxmf) {
        this.fsszlxmf = fsszlxmf;
    }

    public BigDecimal getQtfy() {
        return qtfy;
    }

    public void setQtfy(BigDecimal qtfy) {
        this.qtfy = qtfy;
    }

    public BigDecimal getZfy() {
        return zfy;
    }

    public void setZfy(BigDecimal zfy) {
        this.zfy = zfy;
    }

    public BigDecimal getZfje() {
        return zfje;
    }

    public void setZfje(BigDecimal zfje) {
        this.zfje = zfje;
    }

    public BigDecimal getYlfuf() {
        return ylfuf;
    }

    public void setYlfuf(BigDecimal ylfuf) {
        this.ylfuf = ylfuf;
    }

    public BigDecimal getZlczf() {
        return zlczf;
    }

    public void setZlczf(BigDecimal zlczf) {
        this.zlczf = zlczf;
    }

    public BigDecimal getBlzdf() {
        return blzdf;
    }

    public void setBlzdf(BigDecimal blzdf) {
        this.blzdf = blzdf;
    }

    public BigDecimal getSyszdf() {
        return syszdf;
    }

    public void setSyszdf(BigDecimal syszdf) {
        this.syszdf = syszdf;
    }

    public BigDecimal getYxxzdf() {
        return yxxzdf;
    }

    public void setYxxzdf(BigDecimal yxxzdf) {
        this.yxxzdf = yxxzdf;
    }

    public BigDecimal getLczdxmf() {
        return lczdxmf;
    }

    public void setLczdxmf(BigDecimal lczdxmf) {
        this.lczdxmf = lczdxmf;
    }

    public BigDecimal getWlzlf() {
        return wlzlf;
    }

    public void setWlzlf(BigDecimal wlzlf) {
        this.wlzlf = wlzlf;
    }

    public BigDecimal getKff() {
        return kff;
    }

    public void setKff(BigDecimal kff) {
        this.kff = kff;
    }

    public BigDecimal getSszlf() {
        return sszlf;
    }

    public void setSszlf(BigDecimal sszlf) {
        this.sszlf = sszlf;
    }

    public BigDecimal getZyzlf() {
        return zyzlf;
    }

    public void setZyzlf(BigDecimal zyzlf) {
        this.zyzlf = zyzlf;
    }

    public BigDecimal getKjywf() {
        return kjywf;
    }

    public void setKjywf(BigDecimal kjywf) {
        this.kjywf = kjywf;
    }

    public BigDecimal getBdblzpf() {
        return bdblzpf;
    }

    public void setBdblzpf(BigDecimal bdblzpf) {
        this.bdblzpf = bdblzpf;
    }

    public BigDecimal getQdblzpf() {
        return qdblzpf;
    }

    public void setQdblzpf(BigDecimal qdblzpf) {
        this.qdblzpf = qdblzpf;
    }

    public BigDecimal getHcyyclf() {
        return hcyyclf;
    }

    public void setHcyyclf(BigDecimal hcyyclf) {
        this.hcyyclf = hcyyclf;
    }

    public BigDecimal getNxyzlzpf() {
        return nxyzlzpf;
    }

    public void setNxyzlzpf(BigDecimal nxyzlzpf) {
        this.nxyzlzpf = nxyzlzpf;
    }

    public BigDecimal getXbyzlzpf() {
        return xbyzlzpf;
    }

    public void setXbyzlzpf(BigDecimal xbyzlzpf) {
        this.xbyzlzpf = xbyzlzpf;
    }

    public BigDecimal getYyclf() {
        return yyclf;
    }

    public void setYyclf(BigDecimal yyclf) {
        this.yyclf = yyclf;
    }

    public BigDecimal getYcxyyclf() {
        return ycxyyclf;
    }

    public void setYcxyyclf(BigDecimal ycxyyclf) {
        this.ycxyyclf = ycxyyclf;
    }

    public BigDecimal getQtf() {
        return qtf;
    }

    public void setQtf(BigDecimal qtf) {
        this.qtf = qtf;
    }

    @Override
    public String toString() {
        return "HisviewExt{" +
                "id=" + id +
                ", jgid='" + jgid + '\'' +
                ", username='" + username + '\'' +
                ", sku='" + sku + '\'' +
                ", ylfkfs='" + ylfkfs + '\'' +
                ", jkkh='" + jkkh + '\'' +
                ", zycs='" + zycs + '\'' +
                ", bah='" + bah + '\'' +
                ", xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", csrq='" + csrq + '\'' +
                ", nl=" + nl +
                ", gj='" + gj + '\'' +
                ", csd='" + csd + '\'' +
                ", gg='" + gg + '\'' +
                ", bayzsnl=" + bayzsnl +
                ", mz='" + mz + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", zy='" + zy + '\'' +
                ", hy='" + hy + '\'' +
                ", hkdz='" + hkdz + '\'' +
                ", yb2='" + yb2 + '\'' +
                ", gzdwjdz='" + gzdwjdz + '\'' +
                ", dwdh='" + dwdh + '\'' +
                ", yb3='" + yb3 + '\'' +
                ", lxrxm='" + lxrxm + '\'' +
                ", gx='" + gx + '\'' +
                ", dh2='" + dh2 + '\'' +
                ", dz='" + dz + '\'' +
                ", xzz='" + xzz + '\'' +
                ", dh='" + dh + '\'' +
                ", yb1='" + yb1 + '\'' +
                ", xsecstz=" + xsecstz +
                ", xserytz=" + xserytz +
                ", rysj=" + rysj +
                ", rysjs=" + rysjs +
                ", md='" + md + '\'' +
                ", mzzd='" + mzzd + '\'' +
                ", jbbm='" + jbbm + '\'' +
                ", rykb='" + rykb + '\'' +
                ", rybf='" + rybf + '\'' +
                ", lyfs='" + lyfs + '\'' +
                ", rytj='" + rytj + '\'' +
                ", zyys='" + zyys + '\'' +
                ", zrhs='" + zrhs + '\'' +
                ", kzr='" + kzr + '\'' +
                ", zrys='" + zrys + '\'' +
                ", zzys='" + zzys + '\'' +
                ", sxys='" + sxys + '\'' +
                ", jxys='" + jxys + '\'' +
                ", bmy='" + bmy + '\'' +
                ", bazl='" + bazl + '\'' +
                ", zkys='" + zkys + '\'' +
                ", zkhs='" + zkhs + '\'' +
                ", zkrq='" + zkrq + '\'' +
                ", blh='" + blh + '\'' +
                ", blzd='" + blzd + '\'' +
                ", jbmm='" + jbmm + '\'' +
                ", wbyy='" + wbyy + '\'' +
                ", h23='" + h23 + '\'' +
                ", xx='" + xx + '\'' +
                ", rh='" + rh + '\'' +
                ", zyzd='" + zyzd + '\'' +
                ", rybq='" + rybq + '\'' +
                ", jbdm='" + jbdm + '\'' +
                ", qtzd1='" + qtzd1 + '\'' +
                ", rybq1='" + rybq1 + '\'' +
                ", jbdm1='" + jbdm1 + '\'' +
                ", qtzd2='" + qtzd2 + '\'' +
                ", rybq2='" + rybq2 + '\'' +
                ", jbdm2='" + jbdm2 + '\'' +
                ", qtzd3='" + qtzd3 + '\'' +
                ", rybq3='" + rybq3 + '\'' +
                ", jbdm3='" + jbdm3 + '\'' +
                ", qtzd4='" + qtzd4 + '\'' +
                ", rybq4='" + rybq4 + '\'' +
                ", jbdm4='" + jbdm4 + '\'' +
                ", qtzd5='" + qtzd5 + '\'' +
                ", rybq5='" + rybq5 + '\'' +
                ", jbdm5='" + jbdm5 + '\'' +
                ", qtzd6='" + qtzd6 + '\'' +
                ", rybq6='" + rybq6 + '\'' +
                ", jbdm6='" + jbdm6 + '\'' +
                ", qtzd7='" + qtzd7 + '\'' +
                ", rybq7='" + rybq7 + '\'' +
                ", jbdm7='" + jbdm7 + '\'' +
                ", qtzd8='" + qtzd8 + '\'' +
                ", rybq8='" + rybq8 + '\'' +
                ", jbdm8='" + jbdm8 + '\'' +
                ", qtzd9='" + qtzd9 + '\'' +
                ", rybq9='" + rybq9 + '\'' +
                ", jbdm9='" + jbdm9 + '\'' +
                ", qtzd10='" + qtzd10 + '\'' +
                ", rybq10='" + rybq10 + '\'' +
                ", jbdm10='" + jbdm10 + '\'' +
                ", qtzd11='" + qtzd11 + '\'' +
                ", rybq11='" + rybq11 + '\'' +
                ", jbdm11='" + jbdm11 + '\'' +
                ", qtzd12='" + qtzd12 + '\'' +
                ", rybq12='" + rybq12 + '\'' +
                ", jbdm12='" + jbdm12 + '\'' +
                ", qtzd13='" + qtzd13 + '\'' +
                ", rybq13='" + rybq13 + '\'' +
                ", jbdm13='" + jbdm13 + '\'' +
                ", qtzd14='" + qtzd14 + '\'' +
                ", rybq14='" + rybq14 + '\'' +
                ", jbdm14='" + jbdm14 + '\'' +
                ", qtzd15='" + qtzd15 + '\'' +
                ", rybq15='" + rybq15 + '\'' +
                ", jbdm15='" + jbdm15 + '\'' +
                ", ssjczbm1='" + ssjczbm1 + '\'' +
                ", ssjczrq1='" + ssjczrq1 + '\'' +
                ", ssjb1='" + ssjb1 + '\'' +
                ", ssjczmc1='" + ssjczmc1 + '\'' +
                ", sz1='" + sz1 + '\'' +
                ", yz1='" + yz1 + '\'' +
                ", ez1='" + ez1 + '\'' +
                ", qkdj1='" + qkdj1 + '\'' +
                ", qkyhlb1='" + qkyhlb1 + '\'' +
                ", mzfs1='" + mzfs1 + '\'' +
                ", mzys1='" + mzys1 + '\'' +
                ", ssjczbm2='" + ssjczbm2 + '\'' +
                ", ssjczrq2='" + ssjczrq2 + '\'' +
                ", ssjb2='" + ssjb2 + '\'' +
                ", ssjczmc2='" + ssjczmc2 + '\'' +
                ", sz2='" + sz2 + '\'' +
                ", yz2='" + yz2 + '\'' +
                ", ez2='" + ez2 + '\'' +
                ", qkdj2='" + qkdj2 + '\'' +
                ", qkyhlb2='" + qkyhlb2 + '\'' +
                ", mzfs2='" + mzfs2 + '\'' +
                ", mzys2='" + mzys2 + '\'' +
                ", ssjczbm3='" + ssjczbm3 + '\'' +
                ", ssjczrq3='" + ssjczrq3 + '\'' +
                ", ssjb3='" + ssjb3 + '\'' +
                ", ssjczmc3='" + ssjczmc3 + '\'' +
                ", sz3='" + sz3 + '\'' +
                ", yz3='" + yz3 + '\'' +
                ", ez3='" + ez3 + '\'' +
                ", qkdj3='" + qkdj3 + '\'' +
                ", qkyhlb3='" + qkyhlb3 + '\'' +
                ", mzfs3='" + mzfs3 + '\'' +
                ", mzys3='" + mzys3 + '\'' +
                ", ssjczbm4='" + ssjczbm4 + '\'' +
                ", ssjczrq4='" + ssjczrq4 + '\'' +
                ", ssjb4='" + ssjb4 + '\'' +
                ", ssjczmc4='" + ssjczmc4 + '\'' +
                ", sz4='" + sz4 + '\'' +
                ", yz4='" + yz4 + '\'' +
                ", ez4='" + ez4 + '\'' +
                ", qkdj4='" + qkdj4 + '\'' +
                ", qkyhlb4='" + qkyhlb4 + '\'' +
                ", mzfs4='" + mzfs4 + '\'' +
                ", mzys4='" + mzys4 + '\'' +
                ", ssjczbm5='" + ssjczbm5 + '\'' +
                ", ssjczrq5='" + ssjczrq5 + '\'' +
                ", ssjb5='" + ssjb5 + '\'' +
                ", ssjczmc5='" + ssjczmc5 + '\'' +
                ", sz5='" + sz5 + '\'' +
                ", yz5='" + yz5 + '\'' +
                ", ez5='" + ez5 + '\'' +
                ", qkdj5='" + qkdj5 + '\'' +
                ", qkyhlb5='" + qkyhlb5 + '\'' +
                ", mzfs5='" + mzfs5 + '\'' +
                ", mzys5='" + mzys5 + '\'' +
                ", ssjczbm6='" + ssjczbm6 + '\'' +
                ", ssjczrq6='" + ssjczrq6 + '\'' +
                ", ssjb6='" + ssjb6 + '\'' +
                ", ssjczmc6='" + ssjczmc6 + '\'' +
                ", sz6='" + sz6 + '\'' +
                ", yz6='" + yz6 + '\'' +
                ", ez6='" + ez6 + '\'' +
                ", qkdj6='" + qkdj6 + '\'' +
                ", qkyhlb6='" + qkyhlb6 + '\'' +
                ", mzfs6='" + mzfs6 + '\'' +
                ", mzys6='" + mzys6 + '\'' +
                ", ssjczbm7='" + ssjczbm7 + '\'' +
                ", ssjczrq7='" + ssjczrq7 + '\'' +
                ", ssjb7='" + ssjb7 + '\'' +
                ", ssjczmc7='" + ssjczmc7 + '\'' +
                ", sz7='" + sz7 + '\'' +
                ", yz7='" + yz7 + '\'' +
                ", ez7='" + ez7 + '\'' +
                ", qkdj7='" + qkdj7 + '\'' +
                ", qkyhlb7='" + qkyhlb7 + '\'' +
                ", mzfs7='" + mzfs7 + '\'' +
                ", ryqT=" + ryqT +
                ", ryqXs=" + ryqXs +
                ", ryqF=" + ryqF +
                ", ryhT=" + ryhT +
                ", ryhXs=" + ryhXs +
                ", ryhF=" + ryhF +
                ", mzys7='" + mzys7 + '\'' +
                ", ywgm='" + ywgm + '\'' +
                ", gmyw='" + gmyw + '\'' +
                ", zkkb='" + zkkb + '\'' +
                ", cykb='" + cykb + '\'' +
                ", swhzsj='" + swhzsj + '\'' +
                ", cybf='" + cybf + '\'' +
                ", cysj=" + cysj +
                ", cysjs=" + cysjs +
                ", sjzyts='" + sjzyts + '\'' +
                ", sfzzyjh='" + sfzzyjh + '\'' +
                ", yzzyYljg='" + yzzyYljg + '\'' +
                ", wsyYljg='" + wsyYljg + '\'' +
                ", ssf=" + ssf +
                ", hlf=" + hlf +
                ", zcyf1=" + zcyf1 +
                ", zcyf=" + zcyf +
                ", maf=" + maf +
                ", xyf=" + xyf +
                ", xf=" + xf +
                ", fsszlxmf=" + fsszlxmf +
                ", qtfy=" + qtfy +
                ", zfy=" + zfy +
                ", zfje=" + zfje +
                ", ylfuf=" + ylfuf +
                ", zlczf=" + zlczf +
                ", blzdf=" + blzdf +
                ", syszdf=" + syszdf +
                ", yxxzdf=" + yxxzdf +
                ", lczdxmf=" + lczdxmf +
                ", wlzlf=" + wlzlf +
                ", kff=" + kff +
                ", sszlf=" + sszlf +
                ", zyzlf=" + zyzlf +
                ", kjywf=" + kjywf +
                ", bdblzpf=" + bdblzpf +
                ", qdblzpf=" + qdblzpf +
                ", hcyyclf=" + hcyyclf +
                ", nxyzlzpf=" + nxyzlzpf +
                ", xbyzlzpf=" + xbyzlzpf +
                ", yyclf=" + yyclf +
                ", ycxyyclf=" + ycxyyclf +
                ", qtf=" + qtf +
                '}';
    }
}
