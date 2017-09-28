package com.remote.api.po;

import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgStringUtil;
import com.wlht.api.SysConstant;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.WlhtStringUtil;
import com.wlht.api.po.TBaBase;
import com.wlht.api.service.ZiDianService;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;

@Table(name = "HISVIEW")
public class Hisview {

    public TBaBase getBABase(ZiDianService zdService) {
        TBaBase newBase = new TBaBase();
        newBase.setZzdm(SysConstant.zzdm);
        newBase.setZzname(SysConstant.zzdmName);
        //String baidentity = WlhtStringUtil.getBaIdentity(this.sku);
        newBase.setBaidentity(this.sku);// //3.病案号标识码
        //this.sku = baidentity;
        newBase.setYlfs(WlhtDataReverseHelper.getYlfs(this.ylfkfs));// 4.医疗付款方式
        if (StringUtils.isNotBlank(this.zycs)) {
            newBase.setZycs(Integer.parseInt(this.zycs));// 5.住院次数
        }
        newBase.setBanum(this.bah);// 6.住院号
        newBase.setName(this.xm);// 7.病人姓名
        newBase.setSex(WlhtDataReverseHelper.getXb(this.xb));//8.性别
        if (StringUtils.isNotBlank(this.csrq)) {
            try {
                newBase.setBirthday(DateUtil.yyyy_MM_dd_HH_mmFormat
                        .parse(this.csrq));
            } catch (ParseException e) {
                e.printStackTrace();
            }// 9.出生日期
        }
        //10年龄
        if (this.agesui != null) {
            newBase.setAgeSui(agesui);
        } else if (this.agemonth != null) {
            newBase.setAgeMonth(agemonth);
        } else if (this.agedays != null) {
            newBase.setAgeDays(agedays);
        } else {
            if (this.cysj != null && newBase.getBirthday() != null) {
                int sagesui = DateUtil.getyearsCha(cysj, newBase.getBirthday());
                newBase.setAgeSui(sagesui);
            }
        }
        newBase.setGuoji("156");   //11.国籍
        if (this.xsecstz != null) {
            newBase.setXsecstizhong(this.xsecstz);// 12.新出生儿出生体重
        }
        if (this.xserytz != null) {
            newBase.setXserytizhong(this.xserytz);// 13.新生儿入院体重
        }
        newBase.setCsd(LdgStringUtil.getStringByLength(this.csd, 16));// 14.出生地
        newBase.setJiguan(this.gg);// 15籍贯
        if (StringUtils.isNotBlank(this.mz)) {
            newBase.setMinzu(zdService.getMinZuCodeByName(this.mz)); // 16.民族
        }
        newBase.setIdcard(this.sfzh);// 17.身份证号
        newBase.setZhiye1(WlhtDataReverseHelper.getzhiye(this.zy));// 18.职业
        newBase.setHunyin(WlhtDataReverseHelper.gethunyin(this.hy));// //19.婚姻
        newBase.setXianzhuzhi(this.xzz);// 20.现住址
        newBase.setXiandianhua(this.dh);//现住址电话
        newBase.setXianyoubian(this.yb1);// 21.现住址邮编
        newBase.setHukoudz(this.hkdz);// 22.户口地址
        newBase.setHukouyoubian(this.yb2);// 23.户口邮编
        newBase.setWorkinfo(this.gzdwjdz);// 24.工作单位及地址
        newBase.setDwtel(this.dwdh);// 25.单位电话
        newBase.setDwyb(this.yb3);// 26.单位邮编
        newBase.setLxrname(this.lxrxm);// 27.联系人姓名
        newBase.setLxrguanxi(zdService.getLXRGX(this.gx));// 28.与联系人关系
        newBase.setLxrdz(this.dz);// 29联系人地址工作单位及地址
        newBase.setLxrtel(this.dh2);// 30.联系人电话
        newBase.setRylj(WlhtDataReverseHelper.getrytj(this.rytj));// 31.入院途径
        newBase.setRytime(this.rysj);// 32.入院时间
        newBase.setRyksbm(zdService.getKeshiCodeByName(this.rykb));// 33.入院科室
        newBase.setCytime(this.cysj);// 34.出院时间
        newBase.setCyksbm(zdService.getKeshiCodeByName(this.cykb));// 35.出院科室
        if (StringUtils.isNotBlank(swhzsj)) {
            if (swhzsj.equals("-")) {
                newBase.setSwsj(0);//
            } else if (swhzsj.equals("有")) {
                newBase.setSwsj(1);// 36.死亡患者是否尸检 有
            }
        }
        newBase.setXuexing(WlhtDataReverseHelper.getXx(this.xx));// 37.血型
        newBase.setRhxuexing(WlhtDataReverseHelper.getRh(this.rh));// 38.rh 血型
        //String bazhiliang = base.getBingAnZhiLiang();
        newBase.setBinganzhiliang(1);// 39.病案质量
        String lyfs = WlhtDataReverseHelper.getYLFS(this.lyfs);
        newBase.setLyfs(lyfs);// 40.离院方式
        if (StringUtils.isNotBlank(lyfs)) {
            if (lyfs.equals("2")) {
                newBase.setNijieshouyljgname(this.yzzyYljg);// 41.医嘱转院，拟接受机构名称
            } else if (lyfs.equals("3")) {
                newBase.setNijieshouyljgname(this.wsyYljg);// 42.医嘱转院，医嘱转社区卫生机构/乡镇卫生院
            }
        }

        // String zzyjh = this.sfzzyjh;;// 43.在住院计划 1.无 2.有

        if (StringUtils.isNotBlank(this.md)) {
            newBase.setZzymd(this.md.trim());// 44.在住院目的
        }
        ////
        newBase.setQjcishu(this.getQjcishu());
        newBase.setQjsuccesscishu(this.getQjsuccesscishu());
        newBase.setCyfhqk(WlhtDataReverseHelper.getFuhestatus(this.getCyfhqk()));
        newBase.setRycyfhqk(WlhtDataReverseHelper.getFuhestatus(this.getRycyfhqk()));
        newBase.setShoushuqh(WlhtDataReverseHelper.getFuhestatus(this.getShoushuqh()));
        newBase.setYxbl(WlhtDataReverseHelper.getFuhestatus(this.getYxbl()));
        newBase.setLcbl(WlhtDataReverseHelper.getFuhestatus(this.getLcbl()));
        if (this.getSslclj() != null) {
            if (this.getSslclj().indexOf("是") != -1) {
                newBase.setSslclj(1);
            } else if (this.getSslclj().indexOf("否") != -1) {
                newBase.setSslclj(2);
            }
        }
        newBase.setHisview(this);
        return newBase;
    }

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

    @Column(name = "AGESUI")
    private Integer agesui;
    @Column(name = "AGEMONTH")
    private Integer agemonth;
    @Column(name = "AGEDAYS")
    private Integer agedays;

    /**
     * 20170928 增加8个字段
     * QJCISHU,QJSUCCESSCISHU,CYFHQK,RYCYFHQK,SHOUSHUQH,YXBL,LCBL,SSLCLJ
     *
     */
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
     * 是否实施临床路径
     */
    @Column(name = "SSLCLJ")
    private String sslclj;

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


    public Integer getQjcishu() {
        return qjcishu;
    }

    public void setQjcishu(Integer qjcishu) {
        this.qjcishu = qjcishu;
    }

    public Integer getQjsuccesscishu() {
        return qjsuccesscishu;
    }

    public void setQjsuccesscishu(Integer qjsuccesscishu) {
        this.qjsuccesscishu = qjsuccesscishu;
    }

    public String getSslclj() {
        return sslclj;
    }

    public void setSslclj(String sslclj) {
        this.sslclj = sslclj;
    }

    public String getCyfhqk() {
        return cyfhqk;
    }

    public void setCyfhqk(String cyfhqk) {
        this.cyfhqk = cyfhqk;
    }

    public String getRycyfhqk() {
        return rycyfhqk;
    }

    public void setRycyfhqk(String rycyfhqk) {
        this.rycyfhqk = rycyfhqk;
    }

    public String getShoushuqh() {
        return shoushuqh;
    }

    public void setShoushuqh(String shoushuqh) {
        this.shoushuqh = shoushuqh;
    }

    public String getYxbl() {
        return yxbl;
    }

    public void setYxbl(String yxbl) {
        this.yxbl = yxbl;
    }

    public String getLcbl() {
        return lcbl;
    }

    public void setLcbl(String lcbl) {
        this.lcbl = lcbl;
    }

    public Integer getAgesui() {
        return agesui;
    }

    public void setAgesui(Integer agesui) {
        this.agesui = agesui;
    }

    public Integer getAgemonth() {
        return agemonth;
    }

    public void setAgemonth(Integer agemonth) {
        this.agemonth = agemonth;
    }

    public Integer getAgedays() {
        return agedays;
    }

    public void setAgedays(Integer agedays) {
        this.agedays = agedays;
    }

    /**
     * 获取机构id
     *
     * @return JGID - 机构id
     */
    public String getJgid() {
        return jgid;
    }

    /**
     * 设置机构id
     *
     * @param jgid 机构id
     */
    public void setJgid(String jgid) {
        this.jgid = jgid;
    }

    /**
     * 获取机构名称
     *
     * @return USERNAME - 机构名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置机构名称
     *
     * @param username 机构名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取唯一标识码
     *
     * @return SKU - 唯一标识码
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置唯一标识码
     *
     * @param sku 唯一标识码
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 获取医疗付费方式
     *
     * @return YLFKFS - 医疗付费方式
     */
    public String getYlfkfs() {
        return ylfkfs;
    }

    /**
     * 设置医疗付费方式
     *
     * @param ylfkfs 医疗付费方式
     */
    public void setYlfkfs(String ylfkfs) {
        this.ylfkfs = ylfkfs;
    }

    /**
     * 获取健康卡号
     *
     * @return JKKH - 健康卡号
     */
    public String getJkkh() {
        return jkkh;
    }

    /**
     * 设置健康卡号
     *
     * @param jkkh 健康卡号
     */
    public void setJkkh(String jkkh) {
        this.jkkh = jkkh;
    }

    /**
     * 获取住院次数
     *
     * @return ZYCS - 住院次数
     */
    public String getZycs() {
        return zycs;
    }

    /**
     * 设置住院次数
     *
     * @param zycs 住院次数
     */
    public void setZycs(String zycs) {
        this.zycs = zycs;
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
     * @return XM - 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 设置姓名
     *
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * 获取性别
     *
     * @return XB - 性别
     */
    public String getXb() {
        return xb;
    }

    /**
     * 设置性别
     *
     * @param xb 性别
     */
    public void setXb(String xb) {
        this.xb = xb;
    }

    /**
     * 获取出生日期
     *
     * @return CSRQ - 出生日期
     */
    public String getCsrq() {
        return csrq;
    }

    /**
     * 设置出生日期
     *
     * @param csrq 出生日期
     */
    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    /**
     * 获取年龄
     *
     * @return NL - 年龄
     */
    public Long getNl() {
        return nl;
    }

    /**
     * 设置年龄
     *
     * @param nl 年龄
     */
    public void setNl(Long nl) {
        this.nl = nl;
    }

    /**
     * 获取国籍
     *
     * @return GJ - 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 设置国籍
     *
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj;
    }

    /**
     * 获取年龄不足一岁时(月)
     *
     * @return BAYZSNL - 年龄不足一岁时(月)
     */
    public Short getBayzsnl() {
        return bayzsnl;
    }

    /**
     * 设置年龄不足一岁时(月)
     *
     * @param bayzsnl 年龄不足一岁时(月)
     */
    public void setBayzsnl(Short bayzsnl) {
        this.bayzsnl = bayzsnl;
    }

    /**
     * 获取新生儿出生体重
     *
     * @return XSECSTZ - 新生儿出生体重
     */
    public BigDecimal getXsecstz() {
        return xsecstz;
    }

    /**
     * 设置新生儿出生体重
     *
     * @param xsecstz 新生儿出生体重
     */
    public void setXsecstz(BigDecimal xsecstz) {
        this.xsecstz = xsecstz;
    }

    /**
     * 获取新生儿入院体重
     *
     * @return XSERYTZ - 新生儿入院体重
     */
    public BigDecimal getXserytz() {
        return xserytz;
    }

    /**
     * 设置新生儿入院体重
     *
     * @param xserytz 新生儿入院体重
     */
    public void setXserytz(BigDecimal xserytz) {
        this.xserytz = xserytz;
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
     * @return GG - 籍贯
     */
    public String getGg() {
        return gg;
    }

    /**
     * 设置籍贯
     *
     * @param gg 籍贯
     */
    public void setGg(String gg) {
        this.gg = gg;
    }

    /**
     * 获取民族
     *
     * @return MZ - 民族
     */
    public String getMz() {
        return mz;
    }

    /**
     * 设置民族
     *
     * @param mz 民族
     */
    public void setMz(String mz) {
        this.mz = mz;
    }

    /**
     * 获取身份证号
     *
     * @return SFZH - 身份证号
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * 设置身份证号
     *
     * @param sfzh 身份证号
     */
    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    /**
     * 获取职业
     *
     * @return ZY - 职业
     */
    public String getZy() {
        return zy;
    }

    /**
     * 设置职业
     *
     * @param zy 职业
     */
    public void setZy(String zy) {
        this.zy = zy;
    }

    /**
     * 获取婚姻
     *
     * @return HY - 婚姻
     */
    public String getHy() {
        return hy;
    }

    /**
     * 设置婚姻
     *
     * @param hy 婚姻
     */
    public void setHy(String hy) {
        this.hy = hy;
    }

    /**
     * 获取现住址
     *
     * @return XZZ - 现住址
     */
    public String getXzz() {
        return xzz;
    }

    /**
     * 设置现住址
     *
     * @param xzz 现住址
     */
    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    /**
     * 获取电话
     *
     * @return DH - 电话
     */
    public String getDh() {
        return dh;
    }

    /**
     * 设置电话
     *
     * @param dh 电话
     */
    public void setDh(String dh) {
        this.dh = dh;
    }

    /**
     * 获取邮编
     *
     * @return YB1 - 邮编
     */
    public String getYb1() {
        return yb1;
    }

    /**
     * 设置邮编
     *
     * @param yb1 邮编
     */
    public void setYb1(String yb1) {
        this.yb1 = yb1;
    }

    /**
     * 获取户口地址
     *
     * @return HKDZ - 户口地址
     */
    public String getHkdz() {
        return hkdz;
    }

    /**
     * 设置户口地址
     *
     * @param hkdz 户口地址
     */
    public void setHkdz(String hkdz) {
        this.hkdz = hkdz;
    }

    /**
     * 获取邮编
     *
     * @return YB2 - 邮编
     */
    public String getYb2() {
        return yb2;
    }

    /**
     * 设置邮编
     *
     * @param yb2 邮编
     */
    public void setYb2(String yb2) {
        this.yb2 = yb2;
    }

    /**
     * 获取工作单位及地址
     *
     * @return GZDWJDZ - 工作单位及地址
     */
    public String getGzdwjdz() {
        return gzdwjdz;
    }

    /**
     * 设置工作单位及地址
     *
     * @param gzdwjdz 工作单位及地址
     */
    public void setGzdwjdz(String gzdwjdz) {
        this.gzdwjdz = gzdwjdz;
    }

    /**
     * 获取单位电话
     *
     * @return DWDH - 单位电话
     */
    public String getDwdh() {
        return dwdh;
    }

    /**
     * 设置单位电话
     *
     * @param dwdh 单位电话
     */
    public void setDwdh(String dwdh) {
        this.dwdh = dwdh;
    }

    /**
     * 获取单位邮编
     *
     * @return YB3 - 单位邮编
     */
    public String getYb3() {
        return yb3;
    }

    /**
     * 设置单位邮编
     *
     * @param yb3 单位邮编
     */
    public void setYb3(String yb3) {
        this.yb3 = yb3;
    }

    /**
     * 获取联系人姓名
     *
     * @return LXRXM - 联系人姓名
     */
    public String getLxrxm() {
        return lxrxm;
    }

    /**
     * 设置联系人姓名
     *
     * @param lxrxm 联系人姓名
     */
    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
    }

    /**
     * 获取关系
     *
     * @return GX - 关系
     */
    public String getGx() {
        return gx;
    }

    /**
     * 设置关系
     *
     * @param gx 关系
     */
    public void setGx(String gx) {
        this.gx = gx;
    }

    /**
     * 获取地址
     *
     * @return DZ - 地址
     */
    public String getDz() {
        return dz;
    }

    /**
     * 设置地址
     *
     * @param dz 地址
     */
    public void setDz(String dz) {
        this.dz = dz;
    }

    /**
     * 获取电话
     *
     * @return DH2 - 电话
     */
    public String getDh2() {
        return dh2;
    }

    /**
     * 设置电话
     *
     * @param dh2 电话
     */
    public void setDh2(String dh2) {
        this.dh2 = dh2;
    }

    /**
     * 获取入院途径
     *
     * @return RYTJ - 入院途径
     */
    public String getRytj() {
        return rytj;
    }

    /**
     * 设置入院途径
     *
     * @param rytj 入院途径
     */
    public void setRytj(String rytj) {
        this.rytj = rytj;
    }

    /**
     * 获取入院时间
     *
     * @return RYSJ - 入院时间
     */
    public Date getRysj() {
        return rysj;
    }

    /**
     * 设置入院时间
     *
     * @param rysj 入院时间
     */
    public void setRysj(Date rysj) {
        this.rysj = rysj;
    }

    /**
     * 获取入院时间时
     *
     * @return RYSJS - 入院时间时
     */
    public BigDecimal getRysjs() {
        return rysjs;
    }

    /**
     * 设置入院时间时
     *
     * @param rysjs 入院时间时
     */
    public void setRysjs(BigDecimal rysjs) {
        this.rysjs = rysjs;
    }

    /**
     * 获取入院科室
     *
     * @return RYKB - 入院科室
     */
    public String getRykb() {
        return rykb;
    }

    /**
     * 设置入院科室
     *
     * @param rykb 入院科室
     */
    public void setRykb(String rykb) {
        this.rykb = rykb;
    }

    /**
     * 获取入院病房
     *
     * @return RYBF - 入院病房
     */
    public String getRybf() {
        return rybf;
    }

    /**
     * 设置入院病房
     *
     * @param rybf 入院病房
     */
    public void setRybf(String rybf) {
        this.rybf = rybf;
    }

    /**
     * 获取转科科室
     *
     * @return ZKKB - 转科科室
     */
    public String getZkkb() {
        return zkkb;
    }

    /**
     * 设置转科科室
     *
     * @param zkkb 转科科室
     */
    public void setZkkb(String zkkb) {
        this.zkkb = zkkb;
    }

    /**
     * 获取出院时间
     *
     * @return CYSJ - 出院时间
     */
    public Date getCysj() {
        return cysj;
    }

    /**
     * 设置出院时间
     *
     * @param cysj 出院时间
     */
    public void setCysj(Date cysj) {
        this.cysj = cysj;
    }

    /**
     * 获取出院时间时
     *
     * @return CYSJS - 出院时间时
     */
    public BigDecimal getCysjs() {
        return cysjs;
    }

    /**
     * 设置出院时间时
     *
     * @param cysjs 出院时间时
     */
    public void setCysjs(BigDecimal cysjs) {
        this.cysjs = cysjs;
    }

    /**
     * 获取出院科室
     *
     * @return CYKB - 出院科室
     */
    public String getCykb() {
        return cykb;
    }

    /**
     * 设置出院科室
     *
     * @param cykb 出院科室
     */
    public void setCykb(String cykb) {
        this.cykb = cykb;
    }

    /**
     * 获取出院病房
     *
     * @return CYBF - 出院病房
     */
    public String getCybf() {
        return cybf;
    }

    /**
     * 设置出院病房
     *
     * @param cybf 出院病房
     */
    public void setCybf(String cybf) {
        this.cybf = cybf;
    }

    /**
     * 获取时间住院天数
     *
     * @return SJZYTS - 时间住院天数
     */
    public String getSjzyts() {
        return sjzyts;
    }

    /**
     * 设置时间住院天数
     *
     * @param sjzyts 时间住院天数
     */
    public void setSjzyts(String sjzyts) {
        this.sjzyts = sjzyts;
    }

    /**
     * 获取门诊诊断名称
     *
     * @return MZZD - 门诊诊断名称
     */
    public String getMzzd() {
        return mzzd;
    }

    /**
     * 设置门诊诊断名称
     *
     * @param mzzd 门诊诊断名称
     */
    public void setMzzd(String mzzd) {
        this.mzzd = mzzd;
    }

    /**
     * 获取门诊诊断编码
     *
     * @return JBBM - 门诊诊断编码
     */
    public String getJbbm() {
        return jbbm;
    }

    /**
     * 设置门诊诊断编码
     *
     * @param jbbm 门诊诊断编码
     */
    public void setJbbm(String jbbm) {
        this.jbbm = jbbm;
    }

    /**
     * 获取主要诊断
     *
     * @return ZYZD - 主要诊断
     */
    public String getZyzd() {
        return zyzd;
    }

    /**
     * 设置主要诊断
     *
     * @param zyzd 主要诊断
     */
    public void setZyzd(String zyzd) {
        this.zyzd = zyzd;
    }

    /**
     * 获取主要诊断编码
     *
     * @return JBDM - 主要诊断编码
     */
    public String getJbdm() {
        return jbdm;
    }

    /**
     * 设置主要诊断编码
     *
     * @param jbdm 主要诊断编码
     */
    public void setJbdm(String jbdm) {
        this.jbdm = jbdm;
    }

    /**
     * 获取入院病情
     *
     * @return RYBQ - 入院病情
     */
    public String getRybq() {
        return rybq;
    }

    /**
     * 设置入院病情
     *
     * @param rybq 入院病情
     */
    public void setRybq(String rybq) {
        this.rybq = rybq;
    }

    /**
     * 获取其他诊断1
     *
     * @return QTZD1 - 其他诊断1
     */
    public String getQtzd1() {
        return qtzd1;
    }

    /**
     * 设置其他诊断1
     *
     * @param qtzd1 其他诊断1
     */
    public void setQtzd1(String qtzd1) {
        this.qtzd1 = qtzd1;
    }

    /**
     * 获取其他诊断编码1
     *
     * @return JBDM1 - 其他诊断编码1
     */
    public String getJbdm1() {
        return jbdm1;
    }

    /**
     * 设置其他诊断编码1
     *
     * @param jbdm1 其他诊断编码1
     */
    public void setJbdm1(String jbdm1) {
        this.jbdm1 = jbdm1;
    }

    /**
     * 获取入院病情1
     *
     * @return RYBQ1 - 入院病情1
     */
    public String getRybq1() {
        return rybq1;
    }

    /**
     * 设置入院病情1
     *
     * @param rybq1 入院病情1
     */
    public void setRybq1(String rybq1) {
        this.rybq1 = rybq1;
    }

    /**
     * 获取其他诊断2
     *
     * @return QTZD2 - 其他诊断2
     */
    public String getQtzd2() {
        return qtzd2;
    }

    /**
     * 设置其他诊断2
     *
     * @param qtzd2 其他诊断2
     */
    public void setQtzd2(String qtzd2) {
        this.qtzd2 = qtzd2;
    }

    /**
     * 获取其他诊断代码2
     *
     * @return JBDM2 - 其他诊断代码2
     */
    public String getJbdm2() {
        return jbdm2;
    }

    /**
     * 设置其他诊断代码2
     *
     * @param jbdm2 其他诊断代码2
     */
    public void setJbdm2(String jbdm2) {
        this.jbdm2 = jbdm2;
    }

    /**
     * 获取入院病情2
     *
     * @return RYBQ2 - 入院病情2
     */
    public String getRybq2() {
        return rybq2;
    }

    /**
     * 设置入院病情2
     *
     * @param rybq2 入院病情2
     */
    public void setRybq2(String rybq2) {
        this.rybq2 = rybq2;
    }

    /**
     * 获取其他诊断3
     *
     * @return QTZD3 - 其他诊断3
     */
    public String getQtzd3() {
        return qtzd3;
    }

    /**
     * 设置其他诊断3
     *
     * @param qtzd3 其他诊断3
     */
    public void setQtzd3(String qtzd3) {
        this.qtzd3 = qtzd3;
    }

    /**
     * 获取其他诊断代码3
     *
     * @return JBDM3 - 其他诊断代码3
     */
    public String getJbdm3() {
        return jbdm3;
    }

    /**
     * 设置其他诊断代码3
     *
     * @param jbdm3 其他诊断代码3
     */
    public void setJbdm3(String jbdm3) {
        this.jbdm3 = jbdm3;
    }

    /**
     * 获取入院病情3
     *
     * @return RYBQ3 - 入院病情3
     */
    public String getRybq3() {
        return rybq3;
    }

    /**
     * 设置入院病情3
     *
     * @param rybq3 入院病情3
     */
    public void setRybq3(String rybq3) {
        this.rybq3 = rybq3;
    }

    /**
     * 获取其他诊断4
     *
     * @return QTZD4 - 其他诊断4
     */
    public String getQtzd4() {
        return qtzd4;
    }

    /**
     * 设置其他诊断4
     *
     * @param qtzd4 其他诊断4
     */
    public void setQtzd4(String qtzd4) {
        this.qtzd4 = qtzd4;
    }

    /**
     * 获取其他诊断代码4
     *
     * @return JBDM4 - 其他诊断代码4
     */
    public String getJbdm4() {
        return jbdm4;
    }

    /**
     * 设置其他诊断代码4
     *
     * @param jbdm4 其他诊断代码4
     */
    public void setJbdm4(String jbdm4) {
        this.jbdm4 = jbdm4;
    }

    /**
     * 获取入院病情4
     *
     * @return RYBQ4 - 入院病情4
     */
    public String getRybq4() {
        return rybq4;
    }

    /**
     * 设置入院病情4
     *
     * @param rybq4 入院病情4
     */
    public void setRybq4(String rybq4) {
        this.rybq4 = rybq4;
    }

    /**
     * 获取其他诊断5
     *
     * @return QTZD5 - 其他诊断5
     */
    public String getQtzd5() {
        return qtzd5;
    }

    /**
     * 设置其他诊断5
     *
     * @param qtzd5 其他诊断5
     */
    public void setQtzd5(String qtzd5) {
        this.qtzd5 = qtzd5;
    }

    /**
     * 获取其他诊断代码5
     *
     * @return JBDM5 - 其他诊断代码5
     */
    public String getJbdm5() {
        return jbdm5;
    }

    /**
     * 设置其他诊断代码5
     *
     * @param jbdm5 其他诊断代码5
     */
    public void setJbdm5(String jbdm5) {
        this.jbdm5 = jbdm5;
    }

    /**
     * 获取入院病情5
     *
     * @return RYBQ5 - 入院病情5
     */
    public String getRybq5() {
        return rybq5;
    }

    /**
     * 设置入院病情5
     *
     * @param rybq5 入院病情5
     */
    public void setRybq5(String rybq5) {
        this.rybq5 = rybq5;
    }

    /**
     * 获取其他诊断6
     *
     * @return QTZD6 - 其他诊断6
     */
    public String getQtzd6() {
        return qtzd6;
    }

    /**
     * 设置其他诊断6
     *
     * @param qtzd6 其他诊断6
     */
    public void setQtzd6(String qtzd6) {
        this.qtzd6 = qtzd6;
    }

    /**
     * 获取其他诊断代码6
     *
     * @return JBDM6 - 其他诊断代码6
     */
    public String getJbdm6() {
        return jbdm6;
    }

    /**
     * 设置其他诊断代码6
     *
     * @param jbdm6 其他诊断代码6
     */
    public void setJbdm6(String jbdm6) {
        this.jbdm6 = jbdm6;
    }

    /**
     * 获取入院病情6
     *
     * @return RYBQ6 - 入院病情6
     */
    public String getRybq6() {
        return rybq6;
    }

    /**
     * 设置入院病情6
     *
     * @param rybq6 入院病情6
     */
    public void setRybq6(String rybq6) {
        this.rybq6 = rybq6;
    }

    /**
     * 获取其他诊断7
     *
     * @return QTZD7 - 其他诊断7
     */
    public String getQtzd7() {
        return qtzd7;
    }

    /**
     * 设置其他诊断7
     *
     * @param qtzd7 其他诊断7
     */
    public void setQtzd7(String qtzd7) {
        this.qtzd7 = qtzd7;
    }

    /**
     * 获取其他诊断代码7
     *
     * @return JBDM7 - 其他诊断代码7
     */
    public String getJbdm7() {
        return jbdm7;
    }

    /**
     * 设置其他诊断代码7
     *
     * @param jbdm7 其他诊断代码7
     */
    public void setJbdm7(String jbdm7) {
        this.jbdm7 = jbdm7;
    }

    /**
     * 获取入院病情7
     *
     * @return RYBQ7 - 入院病情7
     */
    public String getRybq7() {
        return rybq7;
    }

    /**
     * 设置入院病情7
     *
     * @param rybq7 入院病情7
     */
    public void setRybq7(String rybq7) {
        this.rybq7 = rybq7;
    }

    /**
     * 获取其他诊断8
     *
     * @return QTZD8 - 其他诊断8
     */
    public String getQtzd8() {
        return qtzd8;
    }

    /**
     * 设置其他诊断8
     *
     * @param qtzd8 其他诊断8
     */
    public void setQtzd8(String qtzd8) {
        this.qtzd8 = qtzd8;
    }

    /**
     * 获取其他诊断代码8
     *
     * @return JBDM8 - 其他诊断代码8
     */
    public String getJbdm8() {
        return jbdm8;
    }

    /**
     * 设置其他诊断代码8
     *
     * @param jbdm8 其他诊断代码8
     */
    public void setJbdm8(String jbdm8) {
        this.jbdm8 = jbdm8;
    }

    /**
     * 获取入院病情8
     *
     * @return RYBQ8 - 入院病情8
     */
    public String getRybq8() {
        return rybq8;
    }

    /**
     * 设置入院病情8
     *
     * @param rybq8 入院病情8
     */
    public void setRybq8(String rybq8) {
        this.rybq8 = rybq8;
    }

    /**
     * 获取其他诊断9
     *
     * @return QTZD9 - 其他诊断9
     */
    public String getQtzd9() {
        return qtzd9;
    }

    /**
     * 设置其他诊断9
     *
     * @param qtzd9 其他诊断9
     */
    public void setQtzd9(String qtzd9) {
        this.qtzd9 = qtzd9;
    }

    /**
     * 获取其他诊断代码9
     *
     * @return JBDM9 - 其他诊断代码9
     */
    public String getJbdm9() {
        return jbdm9;
    }

    /**
     * 设置其他诊断代码9
     *
     * @param jbdm9 其他诊断代码9
     */
    public void setJbdm9(String jbdm9) {
        this.jbdm9 = jbdm9;
    }

    /**
     * 获取入院病情9
     *
     * @return RYBQ9 - 入院病情9
     */
    public String getRybq9() {
        return rybq9;
    }

    /**
     * 设置入院病情9
     *
     * @param rybq9 入院病情9
     */
    public void setRybq9(String rybq9) {
        this.rybq9 = rybq9;
    }

    /**
     * 获取其他诊断10
     *
     * @return QTZD10 - 其他诊断10
     */
    public String getQtzd10() {
        return qtzd10;
    }

    /**
     * 设置其他诊断10
     *
     * @param qtzd10 其他诊断10
     */
    public void setQtzd10(String qtzd10) {
        this.qtzd10 = qtzd10;
    }

    /**
     * 获取其他诊断代码10
     *
     * @return JBDM10 - 其他诊断代码10
     */
    public String getJbdm10() {
        return jbdm10;
    }

    /**
     * 设置其他诊断代码10
     *
     * @param jbdm10 其他诊断代码10
     */
    public void setJbdm10(String jbdm10) {
        this.jbdm10 = jbdm10;
    }

    /**
     * 获取入院病情10
     *
     * @return RYBQ10 - 入院病情10
     */
    public String getRybq10() {
        return rybq10;
    }

    /**
     * 设置入院病情10
     *
     * @param rybq10 入院病情10
     */
    public void setRybq10(String rybq10) {
        this.rybq10 = rybq10;
    }

    /**
     * 获取其他诊断11
     *
     * @return QTZD11 - 其他诊断11
     */
    public String getQtzd11() {
        return qtzd11;
    }

    /**
     * 设置其他诊断11
     *
     * @param qtzd11 其他诊断11
     */
    public void setQtzd11(String qtzd11) {
        this.qtzd11 = qtzd11;
    }

    /**
     * 获取其他诊断代码11
     *
     * @return JBDM11 - 其他诊断代码11
     */
    public String getJbdm11() {
        return jbdm11;
    }

    /**
     * 设置其他诊断代码11
     *
     * @param jbdm11 其他诊断代码11
     */
    public void setJbdm11(String jbdm11) {
        this.jbdm11 = jbdm11;
    }

    /**
     * 获取入院病情11
     *
     * @return RYBQ11 - 入院病情11
     */
    public String getRybq11() {
        return rybq11;
    }

    /**
     * 设置入院病情11
     *
     * @param rybq11 入院病情11
     */
    public void setRybq11(String rybq11) {
        this.rybq11 = rybq11;
    }

    /**
     * 获取其他诊断12
     *
     * @return QTZD12 - 其他诊断12
     */
    public String getQtzd12() {
        return qtzd12;
    }

    /**
     * 设置其他诊断12
     *
     * @param qtzd12 其他诊断12
     */
    public void setQtzd12(String qtzd12) {
        this.qtzd12 = qtzd12;
    }

    /**
     * 获取其他诊断代码12
     *
     * @return JBDM12 - 其他诊断代码12
     */
    public String getJbdm12() {
        return jbdm12;
    }

    /**
     * 设置其他诊断代码12
     *
     * @param jbdm12 其他诊断代码12
     */
    public void setJbdm12(String jbdm12) {
        this.jbdm12 = jbdm12;
    }

    /**
     * 获取入院病情12
     *
     * @return RYBQ12 - 入院病情12
     */
    public String getRybq12() {
        return rybq12;
    }

    /**
     * 设置入院病情12
     *
     * @param rybq12 入院病情12
     */
    public void setRybq12(String rybq12) {
        this.rybq12 = rybq12;
    }

    /**
     * 获取其他诊断13
     *
     * @return QTZD13 - 其他诊断13
     */
    public String getQtzd13() {
        return qtzd13;
    }

    /**
     * 设置其他诊断13
     *
     * @param qtzd13 其他诊断13
     */
    public void setQtzd13(String qtzd13) {
        this.qtzd13 = qtzd13;
    }

    /**
     * 获取其他诊断代码13
     *
     * @return JBDM13 - 其他诊断代码13
     */
    public String getJbdm13() {
        return jbdm13;
    }

    /**
     * 设置其他诊断代码13
     *
     * @param jbdm13 其他诊断代码13
     */
    public void setJbdm13(String jbdm13) {
        this.jbdm13 = jbdm13;
    }

    /**
     * 获取入院病情13
     *
     * @return RYBQ13 - 入院病情13
     */
    public String getRybq13() {
        return rybq13;
    }

    /**
     * 设置入院病情13
     *
     * @param rybq13 入院病情13
     */
    public void setRybq13(String rybq13) {
        this.rybq13 = rybq13;
    }

    /**
     * 获取其他诊断14
     *
     * @return QTZD14 - 其他诊断14
     */
    public String getQtzd14() {
        return qtzd14;
    }

    /**
     * 设置其他诊断14
     *
     * @param qtzd14 其他诊断14
     */
    public void setQtzd14(String qtzd14) {
        this.qtzd14 = qtzd14;
    }

    /**
     * 获取其他诊断代码14
     *
     * @return JBDM14 - 其他诊断代码14
     */
    public String getJbdm14() {
        return jbdm14;
    }

    /**
     * 设置其他诊断代码14
     *
     * @param jbdm14 其他诊断代码14
     */
    public void setJbdm14(String jbdm14) {
        this.jbdm14 = jbdm14;
    }

    /**
     * 获取入院病情14
     *
     * @return RYBQ14 - 入院病情14
     */
    public String getRybq14() {
        return rybq14;
    }

    /**
     * 设置入院病情14
     *
     * @param rybq14 入院病情14
     */
    public void setRybq14(String rybq14) {
        this.rybq14 = rybq14;
    }

    /**
     * 获取其他诊断15
     *
     * @return QTZD15 - 其他诊断15
     */
    public String getQtzd15() {
        return qtzd15;
    }

    /**
     * 设置其他诊断15
     *
     * @param qtzd15 其他诊断15
     */
    public void setQtzd15(String qtzd15) {
        this.qtzd15 = qtzd15;
    }

    /**
     * 获取其他诊断代码15
     *
     * @return JBDM15 - 其他诊断代码15
     */
    public String getJbdm15() {
        return jbdm15;
    }

    /**
     * 设置其他诊断代码15
     *
     * @param jbdm15 其他诊断代码15
     */
    public void setJbdm15(String jbdm15) {
        this.jbdm15 = jbdm15;
    }

    /**
     * 获取入院病情15
     *
     * @return RYBQ15 - 入院病情15
     */
    public String getRybq15() {
        return rybq15;
    }

    /**
     * 设置入院病情15
     *
     * @param rybq15 入院病情15
     */
    public void setRybq15(String rybq15) {
        this.rybq15 = rybq15;
    }

    /**
     * 获取中毒、外部原因
     *
     * @return WBYY - 中毒、外部原因
     */
    public String getWbyy() {
        return wbyy;
    }

    /**
     * 设置中毒、外部原因
     *
     * @param wbyy 中毒、外部原因
     */
    public void setWbyy(String wbyy) {
        this.wbyy = wbyy;
    }

    /**
     * 获取编码
     *
     * @return H23 - 编码
     */
    public String getH23() {
        return h23;
    }

    /**
     * 设置编码
     *
     * @param h23 编码
     */
    public void setH23(String h23) {
        this.h23 = h23;
    }

    /**
     * 获取病理诊断
     *
     * @return BLZD - 病理诊断
     */
    public String getBlzd() {
        return blzd;
    }

    /**
     * 设置病理诊断
     *
     * @param blzd 病理诊断
     */
    public void setBlzd(String blzd) {
        this.blzd = blzd;
    }

    /**
     * 获取病理诊断编码
     *
     * @return JBMM - 病理诊断编码
     */
    public String getJbmm() {
        return jbmm;
    }

    /**
     * 设置病理诊断编码
     *
     * @param jbmm 病理诊断编码
     */
    public void setJbmm(String jbmm) {
        this.jbmm = jbmm;
    }

    /**
     * 获取病理号
     *
     * @return BLH - 病理号
     */
    public String getBlh() {
        return blh;
    }

    /**
     * 设置病理号
     *
     * @param blh 病理号
     */
    public void setBlh(String blh) {
        this.blh = blh;
    }

    /**
     * 获取是否有过敏药物
     *
     * @return YWGM - 是否有过敏药物
     */
    public String getYwgm() {
        return ywgm;
    }

    /**
     * 设置是否有过敏药物
     *
     * @param ywgm 是否有过敏药物
     */
    public void setYwgm(String ywgm) {
        this.ywgm = ywgm;
    }

    /**
     * 获取过敏药物名称
     *
     * @return GMYW - 过敏药物名称
     */
    public String getGmyw() {
        return gmyw;
    }

    /**
     * 设置过敏药物名称
     *
     * @param gmyw 过敏药物名称
     */
    public void setGmyw(String gmyw) {
        this.gmyw = gmyw;
    }

    /**
     * 获取死亡患者是否尸检
     *
     * @return SWHZSJ - 死亡患者是否尸检
     */
    public String getSwhzsj() {
        return swhzsj;
    }

    /**
     * 设置死亡患者是否尸检
     *
     * @param swhzsj 死亡患者是否尸检
     */
    public void setSwhzsj(String swhzsj) {
        this.swhzsj = swhzsj;
    }

    /**
     * 获取血型
     *
     * @return XX - 血型
     */
    public String getXx() {
        return xx;
    }

    /**
     * 设置血型
     *
     * @param xx 血型
     */
    public void setXx(String xx) {
        this.xx = xx;
    }

    /**
     * 获取RH血型
     *
     * @return RH - RH血型
     */
    public String getRh() {
        return rh;
    }

    /**
     * 设置RH血型
     *
     * @param rh RH血型
     */
    public void setRh(String rh) {
        this.rh = rh;
    }

    /**
     * 获取科主任
     *
     * @return KZR - 科主任
     */
    public String getKzr() {
        return kzr;
    }

    /**
     * 设置科主任
     *
     * @param kzr 科主任
     */
    public void setKzr(String kzr) {
        this.kzr = kzr;
    }

    /**
     * 获取主任(副主任)医师
     *
     * @return ZRYS - 主任(副主任)医师
     */
    public String getZrys() {
        return zrys;
    }

    /**
     * 设置主任(副主任)医师
     *
     * @param zrys 主任(副主任)医师
     */
    public void setZrys(String zrys) {
        this.zrys = zrys;
    }

    /**
     * 获取主治医师
     *
     * @return ZZYS - 主治医师
     */
    public String getZzys() {
        return zzys;
    }

    /**
     * 设置主治医师
     *
     * @param zzys 主治医师
     */
    public void setZzys(String zzys) {
        this.zzys = zzys;
    }

    /**
     * 获取住院医师
     *
     * @return ZYYS - 住院医师
     */
    public String getZyys() {
        return zyys;
    }

    /**
     * 设置住院医师
     *
     * @param zyys 住院医师
     */
    public void setZyys(String zyys) {
        this.zyys = zyys;
    }

    /**
     * 获取责任护士
     *
     * @return ZRHS - 责任护士
     */
    public String getZrhs() {
        return zrhs;
    }

    /**
     * 设置责任护士
     *
     * @param zrhs 责任护士
     */
    public void setZrhs(String zrhs) {
        this.zrhs = zrhs;
    }

    /**
     * 获取进修医师
     *
     * @return JXYS - 进修医师
     */
    public String getJxys() {
        return jxys;
    }

    /**
     * 设置进修医师
     *
     * @param jxys 进修医师
     */
    public void setJxys(String jxys) {
        this.jxys = jxys;
    }

    /**
     * 获取实习医师
     *
     * @return SXYS - 实习医师
     */
    public String getSxys() {
        return sxys;
    }

    /**
     * 设置实习医师
     *
     * @param sxys 实习医师
     */
    public void setSxys(String sxys) {
        this.sxys = sxys;
    }

    /**
     * 获取编码员
     *
     * @return BMY - 编码员
     */
    public String getBmy() {
        return bmy;
    }

    /**
     * 设置编码员
     *
     * @param bmy 编码员
     */
    public void setBmy(String bmy) {
        this.bmy = bmy;
    }

    /**
     * 获取病案质量
     *
     * @return BAZL - 病案质量
     */
    public String getBazl() {
        return bazl;
    }

    /**
     * 设置病案质量
     *
     * @param bazl 病案质量
     */
    public void setBazl(String bazl) {
        this.bazl = bazl;
    }

    /**
     * 获取质控医师
     *
     * @return ZKYS - 质控医师
     */
    public String getZkys() {
        return zkys;
    }

    /**
     * 设置质控医师
     *
     * @param zkys 质控医师
     */
    public void setZkys(String zkys) {
        this.zkys = zkys;
    }

    /**
     * 获取质控护士
     *
     * @return ZKHS - 质控护士
     */
    public String getZkhs() {
        return zkhs;
    }

    /**
     * 设置质控护士
     *
     * @param zkhs 质控护士
     */
    public void setZkhs(String zkhs) {
        this.zkhs = zkhs;
    }

    /**
     * 获取质控日期
     *
     * @return ZKRQ - 质控日期
     */
    public String getZkrq() {
        return zkrq;
    }

    /**
     * 设置质控日期
     *
     * @param zkrq 质控日期
     */
    public void setZkrq(String zkrq) {
        this.zkrq = zkrq;
    }

    /**
     * 获取手术及操作编码1
     *
     * @return SSJCZBM1 - 手术及操作编码1
     */
    public String getSsjczbm1() {
        return ssjczbm1;
    }

    /**
     * 设置手术及操作编码1
     *
     * @param ssjczbm1 手术及操作编码1
     */
    public void setSsjczbm1(String ssjczbm1) {
        this.ssjczbm1 = ssjczbm1;
    }

    /**
     * 获取手术及操作日期1
     *
     * @return SSJCZRQ1 - 手术及操作日期1
     */
    public String getSsjczrq1() {
        return ssjczrq1;
    }

    /**
     * 设置手术及操作日期1
     *
     * @param ssjczrq1 手术及操作日期1
     */
    public void setSsjczrq1(String ssjczrq1) {
        this.ssjczrq1 = ssjczrq1;
    }

    /**
     * 获取手术级别1
     *
     * @return SSJB1 - 手术级别1
     */
    public String getSsjb1() {
        return ssjb1;
    }

    /**
     * 设置手术级别1
     *
     * @param ssjb1 手术级别1
     */
    public void setSsjb1(String ssjb1) {
        this.ssjb1 = ssjb1;
    }

    /**
     * 获取手术及操作名称1
     *
     * @return SSJCZMC1 - 手术及操作名称1
     */
    public String getSsjczmc1() {
        return ssjczmc1;
    }

    /**
     * 设置手术及操作名称1
     *
     * @param ssjczmc1 手术及操作名称1
     */
    public void setSsjczmc1(String ssjczmc1) {
        this.ssjczmc1 = ssjczmc1;
    }

    /**
     * 获取术者1
     *
     * @return SZ1 - 术者1
     */
    public String getSz1() {
        return sz1;
    }

    /**
     * 设置术者1
     *
     * @param sz1 术者1
     */
    public void setSz1(String sz1) {
        this.sz1 = sz1;
    }

    /**
     * 获取I助1
     *
     * @return YZ1 - I助1
     */
    public String getYz1() {
        return yz1;
    }

    /**
     * 设置I助1
     *
     * @param yz1 I助1
     */
    public void setYz1(String yz1) {
        this.yz1 = yz1;
    }

    /**
     * 获取II助1
     *
     * @return EZ1 - II助1
     */
    public String getEz1() {
        return ez1;
    }

    /**
     * 设置II助1
     *
     * @param ez1 II助1
     */
    public void setEz1(String ez1) {
        this.ez1 = ez1;
    }

    /**
     * 获取切口等级1
     *
     * @return QKDJ1 - 切口等级1
     */
    public String getQkdj1() {
        return qkdj1;
    }

    /**
     * 设置切口等级1
     *
     * @param qkdj1 切口等级1
     */
    public void setQkdj1(String qkdj1) {
        this.qkdj1 = qkdj1;
    }

    /**
     * 获取切口愈合类别1
     *
     * @return QKYHLB1 - 切口愈合类别1
     */
    public String getQkyhlb1() {
        return qkyhlb1;
    }

    /**
     * 设置切口愈合类别1
     *
     * @param qkyhlb1 切口愈合类别1
     */
    public void setQkyhlb1(String qkyhlb1) {
        this.qkyhlb1 = qkyhlb1;
    }

    /**
     * 获取麻醉方式1
     *
     * @return MZFS1 - 麻醉方式1
     */
    public String getMzfs1() {
        return mzfs1;
    }

    /**
     * 设置麻醉方式1
     *
     * @param mzfs1 麻醉方式1
     */
    public void setMzfs1(String mzfs1) {
        this.mzfs1 = mzfs1;
    }

    /**
     * 获取麻醉医师1
     *
     * @return MZYS1 - 麻醉医师1
     */
    public String getMzys1() {
        return mzys1;
    }

    /**
     * 设置麻醉医师1
     *
     * @param mzys1 麻醉医师1
     */
    public void setMzys1(String mzys1) {
        this.mzys1 = mzys1;
    }

    /**
     * 获取手术及操作编码2
     *
     * @return SSJCZBM2 - 手术及操作编码2
     */
    public String getSsjczbm2() {
        return ssjczbm2;
    }

    /**
     * 设置手术及操作编码2
     *
     * @param ssjczbm2 手术及操作编码2
     */
    public void setSsjczbm2(String ssjczbm2) {
        this.ssjczbm2 = ssjczbm2;
    }

    /**
     * 获取手术及操作日期2
     *
     * @return SSJCZRQ2 - 手术及操作日期2
     */
    public String getSsjczrq2() {
        return ssjczrq2;
    }

    /**
     * 设置手术及操作日期2
     *
     * @param ssjczrq2 手术及操作日期2
     */
    public void setSsjczrq2(String ssjczrq2) {
        this.ssjczrq2 = ssjczrq2;
    }

    /**
     * 获取手术级别2
     *
     * @return SSJB2 - 手术级别2
     */
    public String getSsjb2() {
        return ssjb2;
    }

    /**
     * 设置手术级别2
     *
     * @param ssjb2 手术级别2
     */
    public void setSsjb2(String ssjb2) {
        this.ssjb2 = ssjb2;
    }

    /**
     * 获取手术及操作名称2
     *
     * @return SSJCZMC2 - 手术及操作名称2
     */
    public String getSsjczmc2() {
        return ssjczmc2;
    }

    /**
     * 设置手术及操作名称2
     *
     * @param ssjczmc2 手术及操作名称2
     */
    public void setSsjczmc2(String ssjczmc2) {
        this.ssjczmc2 = ssjczmc2;
    }

    /**
     * 获取术者2
     *
     * @return SZ2 - 术者2
     */
    public String getSz2() {
        return sz2;
    }

    /**
     * 设置术者2
     *
     * @param sz2 术者2
     */
    public void setSz2(String sz2) {
        this.sz2 = sz2;
    }

    /**
     * 获取I助2
     *
     * @return YZ2 - I助2
     */
    public String getYz2() {
        return yz2;
    }

    /**
     * 设置I助2
     *
     * @param yz2 I助2
     */
    public void setYz2(String yz2) {
        this.yz2 = yz2;
    }

    /**
     * 获取II助2
     *
     * @return EZ2 - II助2
     */
    public String getEz2() {
        return ez2;
    }

    /**
     * 设置II助2
     *
     * @param ez2 II助2
     */
    public void setEz2(String ez2) {
        this.ez2 = ez2;
    }

    /**
     * 获取切口等级2
     *
     * @return QKDJ2 - 切口等级2
     */
    public String getQkdj2() {
        return qkdj2;
    }

    /**
     * 设置切口等级2
     *
     * @param qkdj2 切口等级2
     */
    public void setQkdj2(String qkdj2) {
        this.qkdj2 = qkdj2;
    }

    /**
     * 获取切口愈合类别2
     *
     * @return QKYHLB2 - 切口愈合类别2
     */
    public String getQkyhlb2() {
        return qkyhlb2;
    }

    /**
     * 设置切口愈合类别2
     *
     * @param qkyhlb2 切口愈合类别2
     */
    public void setQkyhlb2(String qkyhlb2) {
        this.qkyhlb2 = qkyhlb2;
    }

    /**
     * 获取麻醉方式2
     *
     * @return MZFS2 - 麻醉方式2
     */
    public String getMzfs2() {
        return mzfs2;
    }

    /**
     * 设置麻醉方式2
     *
     * @param mzfs2 麻醉方式2
     */
    public void setMzfs2(String mzfs2) {
        this.mzfs2 = mzfs2;
    }

    /**
     * 获取麻醉医师2
     *
     * @return MZYS2 - 麻醉医师2
     */
    public String getMzys2() {
        return mzys2;
    }

    /**
     * 设置麻醉医师2
     *
     * @param mzys2 麻醉医师2
     */
    public void setMzys2(String mzys2) {
        this.mzys2 = mzys2;
    }

    /**
     * 获取手术及操作编码3
     *
     * @return SSJCZBM3 - 手术及操作编码3
     */
    public String getSsjczbm3() {
        return ssjczbm3;
    }

    /**
     * 设置手术及操作编码3
     *
     * @param ssjczbm3 手术及操作编码3
     */
    public void setSsjczbm3(String ssjczbm3) {
        this.ssjczbm3 = ssjczbm3;
    }

    /**
     * 获取手术及操作日期3
     *
     * @return SSJCZRQ3 - 手术及操作日期3
     */
    public String getSsjczrq3() {
        return ssjczrq3;
    }

    /**
     * 设置手术及操作日期3
     *
     * @param ssjczrq3 手术及操作日期3
     */
    public void setSsjczrq3(String ssjczrq3) {
        this.ssjczrq3 = ssjczrq3;
    }

    /**
     * 获取手术级别3
     *
     * @return SSJB3 - 手术级别3
     */
    public String getSsjb3() {
        return ssjb3;
    }

    /**
     * 设置手术级别3
     *
     * @param ssjb3 手术级别3
     */
    public void setSsjb3(String ssjb3) {
        this.ssjb3 = ssjb3;
    }

    /**
     * 获取手术及操作名称3
     *
     * @return SSJCZMC3 - 手术及操作名称3
     */
    public String getSsjczmc3() {
        return ssjczmc3;
    }

    /**
     * 设置手术及操作名称3
     *
     * @param ssjczmc3 手术及操作名称3
     */
    public void setSsjczmc3(String ssjczmc3) {
        this.ssjczmc3 = ssjczmc3;
    }

    /**
     * 获取术者3
     *
     * @return SZ3 - 术者3
     */
    public String getSz3() {
        return sz3;
    }

    /**
     * 设置术者3
     *
     * @param sz3 术者3
     */
    public void setSz3(String sz3) {
        this.sz3 = sz3;
    }

    /**
     * 获取I助3
     *
     * @return YZ3 - I助3
     */
    public String getYz3() {
        return yz3;
    }

    /**
     * 设置I助3
     *
     * @param yz3 I助3
     */
    public void setYz3(String yz3) {
        this.yz3 = yz3;
    }

    /**
     * 获取II助3
     *
     * @return EZ3 - II助3
     */
    public String getEz3() {
        return ez3;
    }

    /**
     * 设置II助3
     *
     * @param ez3 II助3
     */
    public void setEz3(String ez3) {
        this.ez3 = ez3;
    }

    /**
     * 获取切口等级3
     *
     * @return QKDJ3 - 切口等级3
     */
    public String getQkdj3() {
        return qkdj3;
    }

    /**
     * 设置切口等级3
     *
     * @param qkdj3 切口等级3
     */
    public void setQkdj3(String qkdj3) {
        this.qkdj3 = qkdj3;
    }

    /**
     * 获取切口愈合类别3
     *
     * @return QKYHLB3 - 切口愈合类别3
     */
    public String getQkyhlb3() {
        return qkyhlb3;
    }

    /**
     * 设置切口愈合类别3
     *
     * @param qkyhlb3 切口愈合类别3
     */
    public void setQkyhlb3(String qkyhlb3) {
        this.qkyhlb3 = qkyhlb3;
    }

    /**
     * 获取麻醉方式3
     *
     * @return MZFS3 - 麻醉方式3
     */
    public String getMzfs3() {
        return mzfs3;
    }

    /**
     * 设置麻醉方式3
     *
     * @param mzfs3 麻醉方式3
     */
    public void setMzfs3(String mzfs3) {
        this.mzfs3 = mzfs3;
    }

    /**
     * 获取麻醉医师3
     *
     * @return MZYS3 - 麻醉医师3
     */
    public String getMzys3() {
        return mzys3;
    }

    /**
     * 设置麻醉医师3
     *
     * @param mzys3 麻醉医师3
     */
    public void setMzys3(String mzys3) {
        this.mzys3 = mzys3;
    }

    /**
     * 获取手术及操作编码4
     *
     * @return SSJCZBM4 - 手术及操作编码4
     */
    public String getSsjczbm4() {
        return ssjczbm4;
    }

    /**
     * 设置手术及操作编码4
     *
     * @param ssjczbm4 手术及操作编码4
     */
    public void setSsjczbm4(String ssjczbm4) {
        this.ssjczbm4 = ssjczbm4;
    }

    /**
     * 获取手术及操作日期4
     *
     * @return SSJCZRQ4 - 手术及操作日期4
     */
    public String getSsjczrq4() {
        return ssjczrq4;
    }

    /**
     * 设置手术及操作日期4
     *
     * @param ssjczrq4 手术及操作日期4
     */
    public void setSsjczrq4(String ssjczrq4) {
        this.ssjczrq4 = ssjczrq4;
    }

    /**
     * 获取手术级别4
     *
     * @return SSJB4 - 手术级别4
     */
    public String getSsjb4() {
        return ssjb4;
    }

    /**
     * 设置手术级别4
     *
     * @param ssjb4 手术级别4
     */
    public void setSsjb4(String ssjb4) {
        this.ssjb4 = ssjb4;
    }

    /**
     * 获取手术及操作名称4
     *
     * @return SSJCZMC4 - 手术及操作名称4
     */
    public String getSsjczmc4() {
        return ssjczmc4;
    }

    /**
     * 设置手术及操作名称4
     *
     * @param ssjczmc4 手术及操作名称4
     */
    public void setSsjczmc4(String ssjczmc4) {
        this.ssjczmc4 = ssjczmc4;
    }

    /**
     * 获取术者4
     *
     * @return SZ4 - 术者4
     */
    public String getSz4() {
        return sz4;
    }

    /**
     * 设置术者4
     *
     * @param sz4 术者4
     */
    public void setSz4(String sz4) {
        this.sz4 = sz4;
    }

    /**
     * 获取I助4
     *
     * @return YZ4 - I助4
     */
    public String getYz4() {
        return yz4;
    }

    /**
     * 设置I助4
     *
     * @param yz4 I助4
     */
    public void setYz4(String yz4) {
        this.yz4 = yz4;
    }

    /**
     * 获取II助4
     *
     * @return EZ4 - II助4
     */
    public String getEz4() {
        return ez4;
    }

    /**
     * 设置II助4
     *
     * @param ez4 II助4
     */
    public void setEz4(String ez4) {
        this.ez4 = ez4;
    }

    /**
     * 获取切口等级4
     *
     * @return QKDJ4 - 切口等级4
     */
    public String getQkdj4() {
        return qkdj4;
    }

    /**
     * 设置切口等级4
     *
     * @param qkdj4 切口等级4
     */
    public void setQkdj4(String qkdj4) {
        this.qkdj4 = qkdj4;
    }

    /**
     * 获取切口愈合类别4
     *
     * @return QKYHLB4 - 切口愈合类别4
     */
    public String getQkyhlb4() {
        return qkyhlb4;
    }

    /**
     * 设置切口愈合类别4
     *
     * @param qkyhlb4 切口愈合类别4
     */
    public void setQkyhlb4(String qkyhlb4) {
        this.qkyhlb4 = qkyhlb4;
    }

    /**
     * 获取麻醉方式4
     *
     * @return MZFS4 - 麻醉方式4
     */
    public String getMzfs4() {
        return mzfs4;
    }

    /**
     * 设置麻醉方式4
     *
     * @param mzfs4 麻醉方式4
     */
    public void setMzfs4(String mzfs4) {
        this.mzfs4 = mzfs4;
    }

    /**
     * 获取麻醉医师4
     *
     * @return MZYS4 - 麻醉医师4
     */
    public String getMzys4() {
        return mzys4;
    }

    /**
     * 设置麻醉医师4
     *
     * @param mzys4 麻醉医师4
     */
    public void setMzys4(String mzys4) {
        this.mzys4 = mzys4;
    }

    /**
     * 获取手术及操作编码5
     *
     * @return SSJCZBM5 - 手术及操作编码5
     */
    public String getSsjczbm5() {
        return ssjczbm5;
    }

    /**
     * 设置手术及操作编码5
     *
     * @param ssjczbm5 手术及操作编码5
     */
    public void setSsjczbm5(String ssjczbm5) {
        this.ssjczbm5 = ssjczbm5;
    }

    /**
     * 获取手术及操作日期5
     *
     * @return SSJCZRQ5 - 手术及操作日期5
     */
    public String getSsjczrq5() {
        return ssjczrq5;
    }

    /**
     * 设置手术及操作日期5
     *
     * @param ssjczrq5 手术及操作日期5
     */
    public void setSsjczrq5(String ssjczrq5) {
        this.ssjczrq5 = ssjczrq5;
    }

    /**
     * 获取手术级别5
     *
     * @return SSJB5 - 手术级别5
     */
    public String getSsjb5() {
        return ssjb5;
    }

    /**
     * 设置手术级别5
     *
     * @param ssjb5 手术级别5
     */
    public void setSsjb5(String ssjb5) {
        this.ssjb5 = ssjb5;
    }

    /**
     * 获取手术及操作名称5
     *
     * @return SSJCZMC5 - 手术及操作名称5
     */
    public String getSsjczmc5() {
        return ssjczmc5;
    }

    /**
     * 设置手术及操作名称5
     *
     * @param ssjczmc5 手术及操作名称5
     */
    public void setSsjczmc5(String ssjczmc5) {
        this.ssjczmc5 = ssjczmc5;
    }

    /**
     * 获取术者5
     *
     * @return SZ5 - 术者5
     */
    public String getSz5() {
        return sz5;
    }

    /**
     * 设置术者5
     *
     * @param sz5 术者5
     */
    public void setSz5(String sz5) {
        this.sz5 = sz5;
    }

    /**
     * 获取I助5
     *
     * @return YZ5 - I助5
     */
    public String getYz5() {
        return yz5;
    }

    /**
     * 设置I助5
     *
     * @param yz5 I助5
     */
    public void setYz5(String yz5) {
        this.yz5 = yz5;
    }

    /**
     * 获取II助5
     *
     * @return EZ5 - II助5
     */
    public String getEz5() {
        return ez5;
    }

    /**
     * 设置II助5
     *
     * @param ez5 II助5
     */
    public void setEz5(String ez5) {
        this.ez5 = ez5;
    }

    /**
     * 获取切口等级5
     *
     * @return QKDJ5 - 切口等级5
     */
    public String getQkdj5() {
        return qkdj5;
    }

    /**
     * 设置切口等级5
     *
     * @param qkdj5 切口等级5
     */
    public void setQkdj5(String qkdj5) {
        this.qkdj5 = qkdj5;
    }

    /**
     * 获取切口愈合类别5
     *
     * @return QKYHLB5 - 切口愈合类别5
     */
    public String getQkyhlb5() {
        return qkyhlb5;
    }

    /**
     * 设置切口愈合类别5
     *
     * @param qkyhlb5 切口愈合类别5
     */
    public void setQkyhlb5(String qkyhlb5) {
        this.qkyhlb5 = qkyhlb5;
    }

    /**
     * 获取麻醉方式5
     *
     * @return MZFS5 - 麻醉方式5
     */
    public String getMzfs5() {
        return mzfs5;
    }

    /**
     * 设置麻醉方式5
     *
     * @param mzfs5 麻醉方式5
     */
    public void setMzfs5(String mzfs5) {
        this.mzfs5 = mzfs5;
    }

    /**
     * 获取麻醉医师5
     *
     * @return MZYS5 - 麻醉医师5
     */
    public String getMzys5() {
        return mzys5;
    }

    /**
     * 设置麻醉医师5
     *
     * @param mzys5 麻醉医师5
     */
    public void setMzys5(String mzys5) {
        this.mzys5 = mzys5;
    }

    /**
     * 获取手术及操作编码6
     *
     * @return SSJCZBM6 - 手术及操作编码6
     */
    public String getSsjczbm6() {
        return ssjczbm6;
    }

    /**
     * 设置手术及操作编码6
     *
     * @param ssjczbm6 手术及操作编码6
     */
    public void setSsjczbm6(String ssjczbm6) {
        this.ssjczbm6 = ssjczbm6;
    }

    /**
     * 获取手术及操作日期6
     *
     * @return SSJCZRQ6 - 手术及操作日期6
     */
    public String getSsjczrq6() {
        return ssjczrq6;
    }

    /**
     * 设置手术及操作日期6
     *
     * @param ssjczrq6 手术及操作日期6
     */
    public void setSsjczrq6(String ssjczrq6) {
        this.ssjczrq6 = ssjczrq6;
    }

    /**
     * 获取手术级别6
     *
     * @return SSJB6 - 手术级别6
     */
    public String getSsjb6() {
        return ssjb6;
    }

    /**
     * 设置手术级别6
     *
     * @param ssjb6 手术级别6
     */
    public void setSsjb6(String ssjb6) {
        this.ssjb6 = ssjb6;
    }

    /**
     * 获取手术及操作名称6
     *
     * @return SSJCZMC6 - 手术及操作名称6
     */
    public String getSsjczmc6() {
        return ssjczmc6;
    }

    /**
     * 设置手术及操作名称6
     *
     * @param ssjczmc6 手术及操作名称6
     */
    public void setSsjczmc6(String ssjczmc6) {
        this.ssjczmc6 = ssjczmc6;
    }

    /**
     * 获取术者6
     *
     * @return SZ6 - 术者6
     */
    public String getSz6() {
        return sz6;
    }

    /**
     * 设置术者6
     *
     * @param sz6 术者6
     */
    public void setSz6(String sz6) {
        this.sz6 = sz6;
    }

    /**
     * 获取I助6
     *
     * @return YZ6 - I助6
     */
    public String getYz6() {
        return yz6;
    }

    /**
     * 设置I助6
     *
     * @param yz6 I助6
     */
    public void setYz6(String yz6) {
        this.yz6 = yz6;
    }

    /**
     * 获取II助6
     *
     * @return EZ6 - II助6
     */
    public String getEz6() {
        return ez6;
    }

    /**
     * 设置II助6
     *
     * @param ez6 II助6
     */
    public void setEz6(String ez6) {
        this.ez6 = ez6;
    }

    /**
     * 获取切口等级6
     *
     * @return QKDJ6 - 切口等级6
     */
    public String getQkdj6() {
        return qkdj6;
    }

    /**
     * 设置切口等级6
     *
     * @param qkdj6 切口等级6
     */
    public void setQkdj6(String qkdj6) {
        this.qkdj6 = qkdj6;
    }

    /**
     * 获取切口愈合类别6
     *
     * @return QKYHLB6 - 切口愈合类别6
     */
    public String getQkyhlb6() {
        return qkyhlb6;
    }

    /**
     * 设置切口愈合类别6
     *
     * @param qkyhlb6 切口愈合类别6
     */
    public void setQkyhlb6(String qkyhlb6) {
        this.qkyhlb6 = qkyhlb6;
    }

    /**
     * 获取麻醉方式6
     *
     * @return MZFS6 - 麻醉方式6
     */
    public String getMzfs6() {
        return mzfs6;
    }

    /**
     * 设置麻醉方式6
     *
     * @param mzfs6 麻醉方式6
     */
    public void setMzfs6(String mzfs6) {
        this.mzfs6 = mzfs6;
    }

    /**
     * 获取麻醉医师6
     *
     * @return MZYS6 - 麻醉医师6
     */
    public String getMzys6() {
        return mzys6;
    }

    /**
     * 设置麻醉医师6
     *
     * @param mzys6 麻醉医师6
     */
    public void setMzys6(String mzys6) {
        this.mzys6 = mzys6;
    }

    /**
     * 获取手术及操作编码7
     *
     * @return SSJCZBM7 - 手术及操作编码7
     */
    public String getSsjczbm7() {
        return ssjczbm7;
    }

    /**
     * 设置手术及操作编码7
     *
     * @param ssjczbm7 手术及操作编码7
     */
    public void setSsjczbm7(String ssjczbm7) {
        this.ssjczbm7 = ssjczbm7;
    }

    /**
     * 获取手术及操作日期7
     *
     * @return SSJCZRQ7 - 手术及操作日期7
     */
    public String getSsjczrq7() {
        return ssjczrq7;
    }

    /**
     * 设置手术及操作日期7
     *
     * @param ssjczrq7 手术及操作日期7
     */
    public void setSsjczrq7(String ssjczrq7) {
        this.ssjczrq7 = ssjczrq7;
    }

    /**
     * 获取手术级别7
     *
     * @return SSJB7 - 手术级别7
     */
    public String getSsjb7() {
        return ssjb7;
    }

    /**
     * 设置手术级别7
     *
     * @param ssjb7 手术级别7
     */
    public void setSsjb7(String ssjb7) {
        this.ssjb7 = ssjb7;
    }

    /**
     * 获取手术及操作名称7
     *
     * @return SSJCZMC7 - 手术及操作名称7
     */
    public String getSsjczmc7() {
        return ssjczmc7;
    }

    /**
     * 设置手术及操作名称7
     *
     * @param ssjczmc7 手术及操作名称7
     */
    public void setSsjczmc7(String ssjczmc7) {
        this.ssjczmc7 = ssjczmc7;
    }

    /**
     * 获取术者7
     *
     * @return SZ7 - 术者7
     */
    public String getSz7() {
        return sz7;
    }

    /**
     * 设置术者7
     *
     * @param sz7 术者7
     */
    public void setSz7(String sz7) {
        this.sz7 = sz7;
    }

    /**
     * 获取I助7
     *
     * @return YZ7 - I助7
     */
    public String getYz7() {
        return yz7;
    }

    /**
     * 设置I助7
     *
     * @param yz7 I助7
     */
    public void setYz7(String yz7) {
        this.yz7 = yz7;
    }

    /**
     * 获取II助7
     *
     * @return EZ7 - II助7
     */
    public String getEz7() {
        return ez7;
    }

    /**
     * 设置II助7
     *
     * @param ez7 II助7
     */
    public void setEz7(String ez7) {
        this.ez7 = ez7;
    }

    /**
     * 获取切口等级7
     *
     * @return QKDJ7 - 切口等级7
     */
    public String getQkdj7() {
        return qkdj7;
    }

    /**
     * 设置切口等级7
     *
     * @param qkdj7 切口等级7
     */
    public void setQkdj7(String qkdj7) {
        this.qkdj7 = qkdj7;
    }

    /**
     * 获取切口愈合类别7
     *
     * @return QKYHLB7 - 切口愈合类别7
     */
    public String getQkyhlb7() {
        return qkyhlb7;
    }

    /**
     * 设置切口愈合类别7
     *
     * @param qkyhlb7 切口愈合类别7
     */
    public void setQkyhlb7(String qkyhlb7) {
        this.qkyhlb7 = qkyhlb7;
    }

    /**
     * 获取麻醉方式7
     *
     * @return MZFS7 - 麻醉方式7
     */
    public String getMzfs7() {
        return mzfs7;
    }

    /**
     * 设置麻醉方式7
     *
     * @param mzfs7 麻醉方式7
     */
    public void setMzfs7(String mzfs7) {
        this.mzfs7 = mzfs7;
    }

    /**
     * 获取麻醉医师7
     *
     * @return MZYS7 - 麻醉医师7
     */
    public String getMzys7() {
        return mzys7;
    }

    /**
     * 设置麻醉医师7
     *
     * @param mzys7 麻醉医师7
     */
    public void setMzys7(String mzys7) {
        this.mzys7 = mzys7;
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
     * 获取遗嘱转院—医疗机构
     *
     * @return YZZY_YLJG - 遗嘱转院—医疗机构
     */
    public String getYzzyYljg() {
        return yzzyYljg;
    }

    /**
     * 设置遗嘱转院—医疗机构
     *
     * @param yzzyYljg 遗嘱转院—医疗机构
     */
    public void setYzzyYljg(String yzzyYljg) {
        this.yzzyYljg = yzzyYljg;
    }

    /**
     * 获取遗嘱转乡镇卫生院-机构名称
     *
     * @return WSY_YLJG - 遗嘱转乡镇卫生院-机构名称
     */
    public String getWsyYljg() {
        return wsyYljg;
    }

    /**
     * 设置遗嘱转乡镇卫生院-机构名称
     *
     * @param wsyYljg 遗嘱转乡镇卫生院-机构名称
     */
    public void setWsyYljg(String wsyYljg) {
        this.wsyYljg = wsyYljg;
    }

    /**
     * 获取是否有31天再住院计划
     *
     * @return SFZZYJH - 是否有31天再住院计划
     */
    public String getSfzzyjh() {
        return sfzzyjh;
    }

    /**
     * 设置是否有31天再住院计划
     *
     * @param sfzzyjh 是否有31天再住院计划
     */
    public void setSfzzyjh(String sfzzyjh) {
        this.sfzzyjh = sfzzyjh;
    }

    /**
     * 获取目的
     *
     * @return MD - 目的
     */
    public String getMd() {
        return md;
    }

    /**
     * 设置目的
     *
     * @param md 目的
     */
    public void setMd(String md) {
        this.md = md;
    }

    /**
     * 获取颅脑损伤患者入院前时间：天
     *
     * @return RYQ_T - 颅脑损伤患者入院前时间：天
     */
    public Long getRyqT() {
        return ryqT;
    }

    /**
     * 设置颅脑损伤患者入院前时间：天
     *
     * @param ryqT 颅脑损伤患者入院前时间：天
     */
    public void setRyqT(Long ryqT) {
        this.ryqT = ryqT;
    }

    /**
     * 获取颅脑损伤患者入院前时间：小时
     *
     * @return RYQ_XS - 颅脑损伤患者入院前时间：小时
     */
    public BigDecimal getRyqXs() {
        return ryqXs;
    }

    /**
     * 设置颅脑损伤患者入院前时间：小时
     *
     * @param ryqXs 颅脑损伤患者入院前时间：小时
     */
    public void setRyqXs(BigDecimal ryqXs) {
        this.ryqXs = ryqXs;
    }

    /**
     * 获取颅脑损伤患者入院前时间：分
     *
     * @return RYQ_F - 颅脑损伤患者入院前时间：分
     */
    public Long getRyqF() {
        return ryqF;
    }

    /**
     * 设置颅脑损伤患者入院前时间：分
     *
     * @param ryqF 颅脑损伤患者入院前时间：分
     */
    public void setRyqF(Long ryqF) {
        this.ryqF = ryqF;
    }

    /**
     * 获取总费用
     *
     * @return ZFY - 总费用
     */
    public BigDecimal getZfy() {
        return zfy;
    }

    /**
     * 设置总费用
     *
     * @param zfy 总费用
     */
    public void setZfy(BigDecimal zfy) {
        this.zfy = zfy;
    }

    /**
     * 获取自付金额
     *
     * @return ZFJE - 自付金额
     */
    public BigDecimal getZfje() {
        return zfje;
    }

    /**
     * 设置自付金额
     *
     * @param zfje 自付金额
     */
    public void setZfje(BigDecimal zfje) {
        this.zfje = zfje;
    }

    /**
     * 获取综合医疗服务类：一般医疗服务费
     *
     * @return YLFUF - 综合医疗服务类：一般医疗服务费
     */
    public BigDecimal getYlfuf() {
        return ylfuf;
    }

    /**
     * 设置综合医疗服务类：一般医疗服务费
     *
     * @param ylfuf 综合医疗服务类：一般医疗服务费
     */
    public void setYlfuf(BigDecimal ylfuf) {
        this.ylfuf = ylfuf;
    }

    /**
     * 获取一般治疗操作费
     *
     * @return ZLCZF - 一般治疗操作费
     */
    public BigDecimal getZlczf() {
        return zlczf;
    }

    /**
     * 设置一般治疗操作费
     *
     * @param zlczf 一般治疗操作费
     */
    public void setZlczf(BigDecimal zlczf) {
        this.zlczf = zlczf;
    }

    /**
     * 获取护理住院费
     *
     * @return HLF - 护理住院费
     */
    public BigDecimal getHlf() {
        return hlf;
    }

    /**
     * 设置护理住院费
     *
     * @param hlf 护理住院费
     */
    public void setHlf(BigDecimal hlf) {
        this.hlf = hlf;
    }

    /**
     * 获取其他费用
     *
     * @return QTFY - 其他费用
     */
    public BigDecimal getQtfy() {
        return qtfy;
    }

    /**
     * 设置其他费用
     *
     * @param qtfy 其他费用
     */
    public void setQtfy(BigDecimal qtfy) {
        this.qtfy = qtfy;
    }

    /**
     * 获取诊断类：病理诊断费
     *
     * @return BLZDF - 诊断类：病理诊断费
     */
    public BigDecimal getBlzdf() {
        return blzdf;
    }

    /**
     * 设置诊断类：病理诊断费
     *
     * @param blzdf 诊断类：病理诊断费
     */
    public void setBlzdf(BigDecimal blzdf) {
        this.blzdf = blzdf;
    }

    /**
     * 获取实验室诊断费
     *
     * @return SYSZDF - 实验室诊断费
     */
    public BigDecimal getSyszdf() {
        return syszdf;
    }

    /**
     * 设置实验室诊断费
     *
     * @param syszdf 实验室诊断费
     */
    public void setSyszdf(BigDecimal syszdf) {
        this.syszdf = syszdf;
    }

    /**
     * 获取影像学诊断费
     *
     * @return YXXZDF - 影像学诊断费
     */
    public BigDecimal getYxxzdf() {
        return yxxzdf;
    }

    /**
     * 设置影像学诊断费
     *
     * @param yxxzdf 影像学诊断费
     */
    public void setYxxzdf(BigDecimal yxxzdf) {
        this.yxxzdf = yxxzdf;
    }

    /**
     * 获取临床诊断项目费
     *
     * @return LCZDXMF - 临床诊断项目费
     */
    public BigDecimal getLczdxmf() {
        return lczdxmf;
    }

    /**
     * 设置临床诊断项目费
     *
     * @param lczdxmf 临床诊断项目费
     */
    public void setLczdxmf(BigDecimal lczdxmf) {
        this.lczdxmf = lczdxmf;
    }

    /**
     * 获取治疗类：非手术治疗费
     *
     * @return FSSZLXMF - 治疗类：非手术治疗费
     */
    public BigDecimal getFsszlxmf() {
        return fsszlxmf;
    }

    /**
     * 设置治疗类：非手术治疗费
     *
     * @param fsszlxmf 治疗类：非手术治疗费
     */
    public void setFsszlxmf(BigDecimal fsszlxmf) {
        this.fsszlxmf = fsszlxmf;
    }

    /**
     * 获取临床物理治疗费
     *
     * @return WLZLF - 临床物理治疗费
     */
    public BigDecimal getWlzlf() {
        return wlzlf;
    }

    /**
     * 设置临床物理治疗费
     *
     * @param wlzlf 临床物理治疗费
     */
    public void setWlzlf(BigDecimal wlzlf) {
        this.wlzlf = wlzlf;
    }

    /**
     * 获取手术治疗费
     *
     * @return SSZLF - 手术治疗费
     */
    public BigDecimal getSszlf() {
        return sszlf;
    }

    /**
     * 设置手术治疗费
     *
     * @param sszlf 手术治疗费
     */
    public void setSszlf(BigDecimal sszlf) {
        this.sszlf = sszlf;
    }

    /**
     * 获取麻醉费
     *
     * @return MAF - 麻醉费
     */
    public BigDecimal getMaf() {
        return maf;
    }

    /**
     * 设置麻醉费
     *
     * @param maf 麻醉费
     */
    public void setMaf(BigDecimal maf) {
        this.maf = maf;
    }

    /**
     * 获取手术费
     *
     * @return SSF - 手术费
     */
    public BigDecimal getSsf() {
        return ssf;
    }

    /**
     * 设置手术费
     *
     * @param ssf 手术费
     */
    public void setSsf(BigDecimal ssf) {
        this.ssf = ssf;
    }

    /**
     * 获取康复类：康复费
     *
     * @return KFF - 康复类：康复费
     */
    public BigDecimal getKff() {
        return kff;
    }

    /**
     * 设置康复类：康复费
     *
     * @param kff 康复类：康复费
     */
    public void setKff(BigDecimal kff) {
        this.kff = kff;
    }

    /**
     * 获取中医类：中医治疗费
     *
     * @return ZYZLF - 中医类：中医治疗费
     */
    public BigDecimal getZyzlf() {
        return zyzlf;
    }

    /**
     * 设置中医类：中医治疗费
     *
     * @param zyzlf 中医类：中医治疗费
     */
    public void setZyzlf(BigDecimal zyzlf) {
        this.zyzlf = zyzlf;
    }

    /**
     * 获取西药类：西药费
     *
     * @return XYF - 西药类：西药费
     */
    public BigDecimal getXyf() {
        return xyf;
    }

    /**
     * 设置西药类：西药费
     *
     * @param xyf 西药类：西药费
     */
    public void setXyf(BigDecimal xyf) {
        this.xyf = xyf;
    }

    /**
     * 获取抗菌药物费
     *
     * @return KJYWF - 抗菌药物费
     */
    public BigDecimal getKjywf() {
        return kjywf;
    }

    /**
     * 设置抗菌药物费
     *
     * @param kjywf 抗菌药物费
     */
    public void setKjywf(BigDecimal kjywf) {
        this.kjywf = kjywf;
    }

    /**
     * 获取中药类：中成药费
     *
     * @return ZCYF - 中药类：中成药费
     */
    public BigDecimal getZcyf() {
        return zcyf;
    }

    /**
     * 设置中药类：中成药费
     *
     * @param zcyf 中药类：中成药费
     */
    public void setZcyf(BigDecimal zcyf) {
        this.zcyf = zcyf;
    }

    /**
     * 获取中草药费
     *
     * @return ZCYF1 - 中草药费
     */
    public BigDecimal getZcyf1() {
        return zcyf1;
    }

    /**
     * 设置中草药费
     *
     * @param zcyf1 中草药费
     */
    public void setZcyf1(BigDecimal zcyf1) {
        this.zcyf1 = zcyf1;
    }

    /**
     * 获取血液和血液制品类：血费
     *
     * @return XF - 血液和血液制品类：血费
     */
    public BigDecimal getXf() {
        return xf;
    }

    /**
     * 设置血液和血液制品类：血费
     *
     * @param xf 血液和血液制品类：血费
     */
    public void setXf(BigDecimal xf) {
        this.xf = xf;
    }

    /**
     * 获取白蛋白类制品费
     *
     * @return BDBLZPF - 白蛋白类制品费
     */
    public BigDecimal getBdblzpf() {
        return bdblzpf;
    }

    /**
     * 设置白蛋白类制品费
     *
     * @param bdblzpf 白蛋白类制品费
     */
    public void setBdblzpf(BigDecimal bdblzpf) {
        this.bdblzpf = bdblzpf;
    }

    /**
     * 获取球蛋白类制品费
     *
     * @return QDBLZPF - 球蛋白类制品费
     */
    public BigDecimal getQdblzpf() {
        return qdblzpf;
    }

    /**
     * 设置球蛋白类制品费
     *
     * @param qdblzpf 球蛋白类制品费
     */
    public void setQdblzpf(BigDecimal qdblzpf) {
        this.qdblzpf = qdblzpf;
    }

    /**
     * 获取凝血因子类制品费
     *
     * @return NXYZLZPF - 凝血因子类制品费
     */
    public BigDecimal getNxyzlzpf() {
        return nxyzlzpf;
    }

    /**
     * 设置凝血因子类制品费
     *
     * @param nxyzlzpf 凝血因子类制品费
     */
    public void setNxyzlzpf(BigDecimal nxyzlzpf) {
        this.nxyzlzpf = nxyzlzpf;
    }

    /**
     * 获取细胞因子类制品费
     *
     * @return XBYZLZPF - 细胞因子类制品费
     */
    public BigDecimal getXbyzlzpf() {
        return xbyzlzpf;
    }

    /**
     * 设置细胞因子类制品费
     *
     * @param xbyzlzpf 细胞因子类制品费
     */
    public void setXbyzlzpf(BigDecimal xbyzlzpf) {
        this.xbyzlzpf = xbyzlzpf;
    }

    /**
     * 获取耗材类：检查用一次性医用材料费
     *
     * @return HCYYCLF - 耗材类：检查用一次性医用材料费
     */
    public BigDecimal getHcyyclf() {
        return hcyyclf;
    }

    /**
     * 设置耗材类：检查用一次性医用材料费
     *
     * @param hcyyclf 耗材类：检查用一次性医用材料费
     */
    public void setHcyyclf(BigDecimal hcyyclf) {
        this.hcyyclf = hcyyclf;
    }

    /**
     * 获取治疗用一次性医用材料费
     *
     * @return YYCLF - 治疗用一次性医用材料费
     */
    public BigDecimal getYyclf() {
        return yyclf;
    }

    /**
     * 设置治疗用一次性医用材料费
     *
     * @param yyclf 治疗用一次性医用材料费
     */
    public void setYyclf(BigDecimal yyclf) {
        this.yyclf = yyclf;
    }

    /**
     * 获取手术用一次性医用材料费
     *
     * @return YCXYYCLF - 手术用一次性医用材料费
     */
    public BigDecimal getYcxyyclf() {
        return ycxyyclf;
    }

    /**
     * 设置手术用一次性医用材料费
     *
     * @param ycxyyclf 手术用一次性医用材料费
     */
    public void setYcxyyclf(BigDecimal ycxyyclf) {
        this.ycxyyclf = ycxyyclf;
    }

    /**
     * 获取其他类：其他费用
     *
     * @return QTF - 其他类：其他费用
     */
    public BigDecimal getQtf() {
        return qtf;
    }

    /**
     * 设置其他类：其他费用
     *
     * @param qtf 其他类：其他费用
     */
    public void setQtf(BigDecimal qtf) {
        this.qtf = qtf;
    }

    /**
     * 获取颅脑损伤患者入院后时间：天
     *
     * @return RYH_T - 颅脑损伤患者入院后时间：天
     */
    public Long getRyhT() {
        return ryhT;
    }

    /**
     * 设置颅脑损伤患者入院后时间：天
     *
     * @param ryhT 颅脑损伤患者入院后时间：天
     */
    public void setRyhT(Long ryhT) {
        this.ryhT = ryhT;
    }

    /**
     * 获取颅脑损伤患者入院后时间：小时
     *
     * @return RYH_XS - 颅脑损伤患者入院后时间：小时
     */
    public BigDecimal getRyhXs() {
        return ryhXs;
    }

    /**
     * 设置颅脑损伤患者入院后时间：小时
     *
     * @param ryhXs 颅脑损伤患者入院后时间：小时
     */
    public void setRyhXs(BigDecimal ryhXs) {
        this.ryhXs = ryhXs;
    }

    /**
     * 获取颅脑损伤患者入院后时间：分
     *
     * @return RYH_F - 颅脑损伤患者入院后时间：分
     */
    public Long getRyhF() {
        return ryhF;
    }

    /**
     * 设置颅脑损伤患者入院后时间：分
     *
     * @param ryhF 颅脑损伤患者入院后时间：分
     */
    public void setRyhF(Long ryhF) {
        this.ryhF = ryhF;
    }


    @Override
    public String toString() {
        return "Hisview{" +
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