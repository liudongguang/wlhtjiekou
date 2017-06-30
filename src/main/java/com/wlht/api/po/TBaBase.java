package com.wlht.api.po;

import com.remote.api.po.Hisview;
import com.wlht.api.WlhtBeanReverseHelper;
import com.wlht.api.WlhtDataReverseHelper;
import com.wlht.api.service.ZiDianService;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBaBase {
    private Hisview hisview;//保存着对应的his病案信息
    //获取责任人列表
    public List<TBnzrr> getBAZRR() {
        List<TBnzrr> zrrList=new ArrayList<>();
        String keZhuRen=hisview.getKzr();//科主任
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,keZhuRen,name,zzdm,zzname,"11");
        String zhuZhenYishi = hisview.getZrys();//主任医师
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zhuZhenYishi,name,zzdm,zzname,"21");
        String zhuZhiYiShi =hisview.getZzys() ;//主治医师
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zhuZhiYiShi,name,zzdm,zzname,"23");
        String zhuYuanYiShi = hisview.getZyys();//住院医师
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zhuYuanYiShi,name,zzdm,zzname,"24");
        String zeRenHuShi = hisview.getZrhs();//责任护士
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zeRenHuShi,name,zzdm,zzname,"81");
        String jinXiuZhiShi =hisview.getJxys();//进修医师
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,jinXiuZhiShi,name,zzdm,zzname,"25");
        String shiXiYiShi = hisview.getSxys();//实习
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,shiXiYiShi,name,zzdm,zzname,"26");
        String bianMaYuan = hisview.getBmy();//编码员
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,bianMaYuan,name,zzdm,zzname,"9");
        String zhiKongYiShi = hisview.getZkys();//质控医师
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zhiKongYiShi,name,zzdm,zzname,"91");
        String zhiKongHuShi = hisview.getZkhs();//质控护士
        WlhtBeanReverseHelper.handlerZrr(zrrList,id,baidentity,banum,zhiKongHuShi,name,zzdm,zzname,"92");
        return zrrList;
    }
    public List<TBnsscz> getSSCZ(List<TBnzrr> zrrList) throws ParseException {
        List<TBnsscz> ssczList=new ArrayList<>();
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"1",zrrList,ssczList,hisview.getSsjczbm1(),hisview.getSsjczrq1(),hisview.getSsjb1(),hisview.getSsjczmc1(),hisview.getSz1(),hisview.getYz1(),hisview.getEz1(),hisview.getQkdj1(),hisview.getQkyhlb1(),hisview.getMzfs1(),hisview.getMzys1());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"2",zrrList,ssczList,hisview.getSsjczbm2(),hisview.getSsjczrq2(),hisview.getSsjb2(),hisview.getSsjczmc2(),hisview.getSz2(),hisview.getYz2(),hisview.getEz2(),hisview.getQkdj2(),hisview.getQkyhlb2(),hisview.getMzfs2(),hisview.getMzys2());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"3",zrrList,ssczList,hisview.getSsjczbm3(),hisview.getSsjczrq3(),hisview.getSsjb3(),hisview.getSsjczmc3(),hisview.getSz3(),hisview.getYz3(),hisview.getEz3(),hisview.getQkdj3(),hisview.getQkyhlb3(),hisview.getMzfs3(),hisview.getMzys3());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"4",zrrList,ssczList,hisview.getSsjczbm4(),hisview.getSsjczrq4(),hisview.getSsjb4(),hisview.getSsjczmc4(),hisview.getSz4(),hisview.getYz4(),hisview.getEz4(),hisview.getQkdj4(),hisview.getQkyhlb4(),hisview.getMzfs4(),hisview.getMzys4());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"5",zrrList,ssczList,hisview.getSsjczbm5(),hisview.getSsjczrq5(),hisview.getSsjb5(),hisview.getSsjczmc5(),hisview.getSz5(),hisview.getYz5(),hisview.getEz5(),hisview.getQkdj5(),hisview.getQkyhlb5(),hisview.getMzfs5(),hisview.getMzys5());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"6",zrrList,ssczList,hisview.getSsjczbm6(),hisview.getSsjczrq6(),hisview.getSsjb6(),hisview.getSsjczmc6(),hisview.getSz6(),hisview.getYz6(),hisview.getEz6(),hisview.getQkdj6(),hisview.getQkyhlb6(),hisview.getMzfs6(),hisview.getMzys6());
        WlhtBeanReverseHelper.handlerSSCZ(id,baidentity,banum,name,"7",zrrList,ssczList,hisview.getSsjczbm7(),hisview.getSsjczrq7(),hisview.getSsjb7(),hisview.getSsjczmc7(),hisview.getSz7(),hisview.getYz7(),hisview.getEz7(),hisview.getQkdj7(),hisview.getQkyhlb7(),hisview.getMzfs7(),hisview.getMzys7());
        return ssczList;
    }
    public List<TBnjbzd> getJBZD() {
        List<TBnjbzd> jbzdList=new ArrayList<>();
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getMzzd(),hisview.getJbbm(),null,"11");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getZyzd(),hisview.getJbdm(),hisview.getRybq(),"22");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd1(),hisview.getJbdm1(),hisview.getRybq1(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd2(),hisview.getJbdm2(),hisview.getRybq2(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd3(),hisview.getJbdm3(),hisview.getRybq3(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd4(),hisview.getJbdm4(),hisview.getRybq4(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd5(),hisview.getJbdm5(),hisview.getRybq5(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd6(),hisview.getJbdm6(),hisview.getRybq6(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd7(),hisview.getJbdm7(),hisview.getRybq7(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd8(),hisview.getJbdm8(),hisview.getRybq8(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd9(),hisview.getJbdm9(),hisview.getRybq9(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd10(),hisview.getJbdm10(),hisview.getRybq10(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd11(),hisview.getJbdm11(),hisview.getRybq11(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd12(),hisview.getJbdm12(),hisview.getRybq12(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd13(),hisview.getJbdm13(),hisview.getRybq13(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd14(),hisview.getJbdm14(),hisview.getRybq14(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getQtzd15(),hisview.getJbdm15(),hisview.getRybq15(),"23");
        WlhtBeanReverseHelper.handlerJBZD(id,baidentity,banum,name,jbzdList,hisview.getWbyy(),hisview.getH23(),null,"91");
        return jbzdList;
    }
    public List<TBnzyfy> getZLFY() {
        List<TBnzyfy> ylfsList=new ArrayList<>();
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZfy(),"01");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZfje(),"02");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getYlfuf(),"03");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZlczf(),"04");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getHlf(),"05");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getQtfy(),"06");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getBlzdf(),"07");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getSyszdf(),"08");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getYxxzdf(),"09");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getLczdxmf(),"10");
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getFsszlxmf(),"11");/////非手术治疗项目费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getWlzlf(),"12");//临床物理治疗费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getSszlf(),"13");//手术治疗费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getMaf(),"14");//麻醉费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getSsf(),"15");//手术费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getKff(),"16");//康复费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZyzlf(),"17");//中医治疗费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getXyf(),"18");//西药费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getKjywf(),"19");//抗菌药物费用
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZcyf(),"20");//中成药费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getZcyf1(),"21");//中草药费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getXf(),"22");//血费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getBdblzpf(),"23");//白蛋白类制品费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getQdblzpf(),"24");//球蛋白类制品费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getNxyzlzpf(),"25");//凝血因子类制品费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getXbyzlzpf(),"26");//细胞因子类制品费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getHcyyclf(),"27");//检查用一次性医用材料费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getYyclf(),"28");//治疗用一次性医用材料费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getYcxyyclf(),"29");//手术用一次性医用材料费
        WlhtBeanReverseHelper.handlerFY(id,baidentity,banum,name,ylfsList,hisview.getQtf(),"30");//其他费
        return ylfsList;
    }
    private Long id;

    private String baidentity;

    private String zzdm;

    private String zzname;

    private String fzjgbsf;

    private String ylfs;

    private String jkcard;

    private String idcard;

    private String hzhm;

    private String banum;

    private Integer zycs;

    private String name;

    private Integer sex;

    private Date birthday;

    private String guoji;

    private String csd;

    private String jiguan;

    private String minzu;

    private String zhiye1;

    private String hunyin;

    private String juzhuxingzheng;

    private String xianzhuzhi;

    private String xiandianhua;

    private String xianyoubian;

    private String phone;

    private String email;

    private String hukouquhua;

    private String hukoudz;

    private String hukouyoubian;

    private String workinfo;

    private String dwtel;

    private String dwyb;

    private String lxrname;

    private String lxrguanxi;

    private String lxrdz;

    private String lxrtel;

    private String rylj;

    private String zryljgdm;

    private String zrjgname;

    private Date rytime;

    private String ryksbm;

    private Date cytime;

    private String cyksbm;

    private String zyksname;

    private String swyy;

    private Integer swsj;

    private Integer xuexing;

    private Integer rhxuexing;

    private Integer binganzhiliang;

    private Date zkrq;

    private String lyfs;

    private String nijieshouyljgdm;

    private String nijieshouyljgname;

    private String zzymd;

    private Integer zzyjgts;

    private Date rylqhmtime;

    private BigDecimal xsecstizhong;

    private BigDecimal xserytizhong;

    private String rybingqing;

    private Date zhuyaozdtime;

    private Integer sfbw;

    private Integer qjcishu;

    private Integer qjsuccesscishu;

    private String yinanbing;

    private Integer suizhen;

    private Integer szdays;

    private String cyfhqk;

    private String rycyfhqk;

    private String shoushuqh;

    private String yxbl;

    private String lcbl;

    private String ssbdslblqk;

    private String sqshblqk;

    private String lczdsjqk;

    private Integer ynhzcishu;

    private Integer wyhzcishu;

    private Integer shuye;

    private Integer shuyefy;

    private String kjyymd;

    private String kjyyfa;

    private String zhusu;

    private Date tongzhidate;

    private BigDecimal zhikongpingfen;

    private String zhikongzhe;

    private Date updatedate;

    private String binglixiugaizhe;

    private BigDecimal shangbaobiaoji;

    private Date weishoushuqi;

    private Date weishoushuzhi;

    private String jbpbm;

    private String zlfqt;

    private String zlfqn;

    private String zlfqm;

    private Integer sfdybz;

    private Integer sslclj;

    private Integer wclclj;

    private String tclcljyy;

    private String tclcljms;

    private String lcljbyyy;

    private String lcljbyms;

    private String zlfq;

    private String zlfhcd;

    private String zlzdyj;

    private String bnbiaoshi1;

    private Integer ageSui;

    private Integer ageMonth;

    private Integer ageDays;

    private Integer ycgfx;

    private Integer ddgfx;

    public Hisview getHisview() {
        return hisview;
    }

    public void setHisview(Hisview hisview) {
        this.hisview = hisview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaidentity() {
        return baidentity;
    }

    public void setBaidentity(String baidentity) {
        this.baidentity = baidentity;
    }

    public String getZzdm() {
        return zzdm;
    }

    public void setZzdm(String zzdm) {
        this.zzdm = zzdm;
    }

    public String getZzname() {
        return zzname;
    }

    public void setZzname(String zzname) {
        this.zzname = zzname;
    }

    public String getFzjgbsf() {
        return fzjgbsf;
    }

    public void setFzjgbsf(String fzjgbsf) {
        this.fzjgbsf = fzjgbsf;
    }

    public String getYlfs() {
        return ylfs;
    }

    public void setYlfs(String ylfs) {
        this.ylfs = ylfs;
    }

    public String getJkcard() {
        return jkcard;
    }

    public void setJkcard(String jkcard) {
        this.jkcard = jkcard;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getHzhm() {
        return hzhm;
    }

    public void setHzhm(String hzhm) {
        this.hzhm = hzhm;
    }

    public String getBanum() {
        return banum;
    }

    public void setBanum(String banum) {
        this.banum = banum;
    }

    public Integer getZycs() {
        return zycs;
    }

    public void setZycs(Integer zycs) {
        this.zycs = zycs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGuoji() {
        return guoji;
    }

    public void setGuoji(String guoji) {
        this.guoji = guoji;
    }

    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    public String getZhiye1() {
        return zhiye1;
    }

    public void setZhiye1(String zhiye1) {
        this.zhiye1 = zhiye1;
    }

    public String getHunyin() {
        return hunyin;
    }

    public void setHunyin(String hunyin) {
        this.hunyin = hunyin;
    }

    public String getJuzhuxingzheng() {
        return juzhuxingzheng;
    }

    public void setJuzhuxingzheng(String juzhuxingzheng) {
        this.juzhuxingzheng = juzhuxingzheng;
    }

    public String getXianzhuzhi() {
        return xianzhuzhi;
    }

    public void setXianzhuzhi(String xianzhuzhi) {
        this.xianzhuzhi = xianzhuzhi;
    }

    public String getXiandianhua() {
        return xiandianhua;
    }

    public void setXiandianhua(String xiandianhua) {
        this.xiandianhua = xiandianhua;
    }

    public String getXianyoubian() {
        return xianyoubian;
    }

    public void setXianyoubian(String xianyoubian) {
        this.xianyoubian = xianyoubian;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHukouquhua() {
        return hukouquhua;
    }

    public void setHukouquhua(String hukouquhua) {
        this.hukouquhua = hukouquhua;
    }

    public String getHukoudz() {
        return hukoudz;
    }

    public void setHukoudz(String hukoudz) {
        this.hukoudz = hukoudz;
    }

    public String getHukouyoubian() {
        return hukouyoubian;
    }

    public void setHukouyoubian(String hukouyoubian) {
        this.hukouyoubian = hukouyoubian;
    }

    public String getWorkinfo() {
        return workinfo;
    }

    public void setWorkinfo(String workinfo) {
        this.workinfo = workinfo;
    }

    public String getDwtel() {
        return dwtel;
    }

    public void setDwtel(String dwtel) {
        this.dwtel = dwtel;
    }

    public String getDwyb() {
        return dwyb;
    }

    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }

    public String getLxrname() {
        return lxrname;
    }

    public void setLxrname(String lxrname) {
        this.lxrname = lxrname;
    }

    public String getLxrguanxi() {
        return lxrguanxi;
    }

    public void setLxrguanxi(String lxrguanxi) {
        this.lxrguanxi = lxrguanxi;
    }

    public String getLxrdz() {
        return lxrdz;
    }

    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
    }

    public String getLxrtel() {
        return lxrtel;
    }

    public void setLxrtel(String lxrtel) {
        this.lxrtel = lxrtel;
    }

    public String getRylj() {
        return rylj;
    }

    public void setRylj(String rylj) {
        this.rylj = rylj;
    }

    public String getZryljgdm() {
        return zryljgdm;
    }

    public void setZryljgdm(String zryljgdm) {
        this.zryljgdm = zryljgdm;
    }

    public String getZrjgname() {
        return zrjgname;
    }

    public void setZrjgname(String zrjgname) {
        this.zrjgname = zrjgname;
    }

    public Date getRytime() {
        return rytime;
    }

    public void setRytime(Date rytime) {
        this.rytime = rytime;
    }

    public String getRyksbm() {
        return ryksbm;
    }

    public void setRyksbm(String ryksbm) {
        this.ryksbm = ryksbm;
    }

    public Date getCytime() {
        return cytime;
    }

    public void setCytime(Date cytime) {
        this.cytime = cytime;
    }

    public String getCyksbm() {
        return cyksbm;
    }

    public void setCyksbm(String cyksbm) {
        this.cyksbm = cyksbm;
    }

    public String getZyksname() {
        return zyksname;
    }

    public void setZyksname(String zyksname) {
        this.zyksname = zyksname;
    }

    public String getSwyy() {
        return swyy;
    }

    public void setSwyy(String swyy) {
        this.swyy = swyy;
    }

    public Integer getSwsj() {
        return swsj;
    }

    public void setSwsj(Integer swsj) {
        this.swsj = swsj;
    }

    public Integer getXuexing() {
        return xuexing;
    }

    public void setXuexing(Integer xuexing) {
        this.xuexing = xuexing;
    }

    public Integer getRhxuexing() {
        return rhxuexing;
    }

    public void setRhxuexing(Integer rhxuexing) {
        this.rhxuexing = rhxuexing;
    }

    public Integer getBinganzhiliang() {
        return binganzhiliang;
    }

    public void setBinganzhiliang(Integer binganzhiliang) {
        this.binganzhiliang = binganzhiliang;
    }

    public Date getZkrq() {
        return zkrq;
    }

    public void setZkrq(Date zkrq) {
        this.zkrq = zkrq;
    }

    public String getLyfs() {
        return lyfs;
    }

    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }

    public String getNijieshouyljgdm() {
        return nijieshouyljgdm;
    }

    public void setNijieshouyljgdm(String nijieshouyljgdm) {
        this.nijieshouyljgdm = nijieshouyljgdm;
    }

    public String getNijieshouyljgname() {
        return nijieshouyljgname;
    }

    public void setNijieshouyljgname(String nijieshouyljgname) {
        this.nijieshouyljgname = nijieshouyljgname;
    }

    public String getZzymd() {
        return zzymd;
    }

    public void setZzymd(String zzymd) {
        this.zzymd = zzymd;
    }

    public Integer getZzyjgts() {
        return zzyjgts;
    }

    public void setZzyjgts(Integer zzyjgts) {
        this.zzyjgts = zzyjgts;
    }

    public Date getRylqhmtime() {
        return rylqhmtime;
    }

    public void setRylqhmtime(Date rylqhmtime) {
        this.rylqhmtime = rylqhmtime;
    }

    public BigDecimal getXsecstizhong() {
        return xsecstizhong;
    }

    public void setXsecstizhong(BigDecimal xsecstizhong) {
        this.xsecstizhong = xsecstizhong;
    }

    public BigDecimal getXserytizhong() {
        return xserytizhong;
    }

    public void setXserytizhong(BigDecimal xserytizhong) {
        this.xserytizhong = xserytizhong;
    }

    public String getRybingqing() {
        return rybingqing;
    }

    public void setRybingqing(String rybingqing) {
        this.rybingqing = rybingqing;
    }

    public Date getZhuyaozdtime() {
        return zhuyaozdtime;
    }

    public void setZhuyaozdtime(Date zhuyaozdtime) {
        this.zhuyaozdtime = zhuyaozdtime;
    }

    public Integer getSfbw() {
        return sfbw;
    }

    public void setSfbw(Integer sfbw) {
        this.sfbw = sfbw;
    }

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

    public String getYinanbing() {
        return yinanbing;
    }

    public void setYinanbing(String yinanbing) {
        this.yinanbing = yinanbing;
    }

    public Integer getSuizhen() {
        return suizhen;
    }

    public void setSuizhen(Integer suizhen) {
        this.suizhen = suizhen;
    }

    public Integer getSzdays() {
        return szdays;
    }

    public void setSzdays(Integer szdays) {
        this.szdays = szdays;
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

    public String getSsbdslblqk() {
        return ssbdslblqk;
    }

    public void setSsbdslblqk(String ssbdslblqk) {
        this.ssbdslblqk = ssbdslblqk;
    }

    public String getSqshblqk() {
        return sqshblqk;
    }

    public void setSqshblqk(String sqshblqk) {
        this.sqshblqk = sqshblqk;
    }

    public String getLczdsjqk() {
        return lczdsjqk;
    }

    public void setLczdsjqk(String lczdsjqk) {
        this.lczdsjqk = lczdsjqk;
    }

    public Integer getYnhzcishu() {
        return ynhzcishu;
    }

    public void setYnhzcishu(Integer ynhzcishu) {
        this.ynhzcishu = ynhzcishu;
    }

    public Integer getWyhzcishu() {
        return wyhzcishu;
    }

    public void setWyhzcishu(Integer wyhzcishu) {
        this.wyhzcishu = wyhzcishu;
    }

    public Integer getShuye() {
        return shuye;
    }

    public void setShuye(Integer shuye) {
        this.shuye = shuye;
    }

    public Integer getShuyefy() {
        return shuyefy;
    }

    public void setShuyefy(Integer shuyefy) {
        this.shuyefy = shuyefy;
    }

    public String getKjyymd() {
        return kjyymd;
    }

    public void setKjyymd(String kjyymd) {
        this.kjyymd = kjyymd;
    }

    public String getKjyyfa() {
        return kjyyfa;
    }

    public void setKjyyfa(String kjyyfa) {
        this.kjyyfa = kjyyfa;
    }

    public String getZhusu() {
        return zhusu;
    }

    public void setZhusu(String zhusu) {
        this.zhusu = zhusu;
    }

    public Date getTongzhidate() {
        return tongzhidate;
    }

    public void setTongzhidate(Date tongzhidate) {
        this.tongzhidate = tongzhidate;
    }

    public BigDecimal getZhikongpingfen() {
        return zhikongpingfen;
    }

    public void setZhikongpingfen(BigDecimal zhikongpingfen) {
        this.zhikongpingfen = zhikongpingfen;
    }

    public String getZhikongzhe() {
        return zhikongzhe;
    }

    public void setZhikongzhe(String zhikongzhe) {
        this.zhikongzhe = zhikongzhe;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getBinglixiugaizhe() {
        return binglixiugaizhe;
    }

    public void setBinglixiugaizhe(String binglixiugaizhe) {
        this.binglixiugaizhe = binglixiugaizhe;
    }

    public BigDecimal getShangbaobiaoji() {
        return shangbaobiaoji;
    }

    public void setShangbaobiaoji(BigDecimal shangbaobiaoji) {
        this.shangbaobiaoji = shangbaobiaoji;
    }

    public Date getWeishoushuqi() {
        return weishoushuqi;
    }

    public void setWeishoushuqi(Date weishoushuqi) {
        this.weishoushuqi = weishoushuqi;
    }

    public Date getWeishoushuzhi() {
        return weishoushuzhi;
    }

    public void setWeishoushuzhi(Date weishoushuzhi) {
        this.weishoushuzhi = weishoushuzhi;
    }

    public String getJbpbm() {
        return jbpbm;
    }

    public void setJbpbm(String jbpbm) {
        this.jbpbm = jbpbm;
    }

    public String getZlfqt() {
        return zlfqt;
    }

    public void setZlfqt(String zlfqt) {
        this.zlfqt = zlfqt;
    }

    public String getZlfqn() {
        return zlfqn;
    }

    public void setZlfqn(String zlfqn) {
        this.zlfqn = zlfqn;
    }

    public String getZlfqm() {
        return zlfqm;
    }

    public void setZlfqm(String zlfqm) {
        this.zlfqm = zlfqm;
    }

    public Integer getSfdybz() {
        return sfdybz;
    }

    public void setSfdybz(Integer sfdybz) {
        this.sfdybz = sfdybz;
    }

    public Integer getSslclj() {
        return sslclj;
    }

    public void setSslclj(Integer sslclj) {
        this.sslclj = sslclj;
    }

    public Integer getWclclj() {
        return wclclj;
    }

    public void setWclclj(Integer wclclj) {
        this.wclclj = wclclj;
    }

    public String getTclcljyy() {
        return tclcljyy;
    }

    public void setTclcljyy(String tclcljyy) {
        this.tclcljyy = tclcljyy;
    }

    public String getTclcljms() {
        return tclcljms;
    }

    public void setTclcljms(String tclcljms) {
        this.tclcljms = tclcljms;
    }

    public String getLcljbyyy() {
        return lcljbyyy;
    }

    public void setLcljbyyy(String lcljbyyy) {
        this.lcljbyyy = lcljbyyy;
    }

    public String getLcljbyms() {
        return lcljbyms;
    }

    public void setLcljbyms(String lcljbyms) {
        this.lcljbyms = lcljbyms;
    }

    public String getZlfq() {
        return zlfq;
    }

    public void setZlfq(String zlfq) {
        this.zlfq = zlfq;
    }

    public String getZlfhcd() {
        return zlfhcd;
    }

    public void setZlfhcd(String zlfhcd) {
        this.zlfhcd = zlfhcd;
    }

    public String getZlzdyj() {
        return zlzdyj;
    }

    public void setZlzdyj(String zlzdyj) {
        this.zlzdyj = zlzdyj;
    }

    public String getBnbiaoshi1() {
        return bnbiaoshi1;
    }

    public void setBnbiaoshi1(String bnbiaoshi1) {
        this.bnbiaoshi1 = bnbiaoshi1;
    }

    public Integer getAgeSui() {
        return ageSui;
    }

    public void setAgeSui(Integer ageSui) {
        this.ageSui = ageSui;
    }

    public Integer getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(Integer ageMonth) {
        this.ageMonth = ageMonth;
    }

    public Integer getAgeDays() {
        return ageDays;
    }

    public void setAgeDays(Integer ageDays) {
        this.ageDays = ageDays;
    }

    public Integer getYcgfx() {
        return ycgfx;
    }

    public void setYcgfx(Integer ycgfx) {
        this.ycgfx = ycgfx;
    }

    public Integer getDdgfx() {
        return ddgfx;
    }

    public void setDdgfx(Integer ddgfx) {
        this.ddgfx = ddgfx;
    }

    @Override
    public String toString() {
        return "TBaBase{" +
                "id=" + id +
                ", baidentity='" + baidentity + '\'' +
                ", zzdm='" + zzdm + '\'' +
                ", zzname='" + zzname + '\'' +
                ", fzjgbsf='" + fzjgbsf + '\'' +
                ", ylfs='" + ylfs + '\'' +
                ", jkcard='" + jkcard + '\'' +
                ", idcard='" + idcard + '\'' +
                ", hzhm='" + hzhm + '\'' +
                ", banum='" + banum + '\'' +
                ", zycs=" + zycs +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", guoji='" + guoji + '\'' +
                ", csd='" + csd + '\'' +
                ", jiguan='" + jiguan + '\'' +
                ", minzu='" + minzu + '\'' +
                ", zhiye1='" + zhiye1 + '\'' +
                ", hunyin='" + hunyin + '\'' +
                ", juzhuxingzheng='" + juzhuxingzheng + '\'' +
                ", xianzhuzhi='" + xianzhuzhi + '\'' +
                ", xiandianhua='" + xiandianhua + '\'' +
                ", xianyoubian='" + xianyoubian + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hukouquhua='" + hukouquhua + '\'' +
                ", hukoudz='" + hukoudz + '\'' +
                ", hukouyoubian='" + hukouyoubian + '\'' +
                ", workinfo='" + workinfo + '\'' +
                ", dwtel='" + dwtel + '\'' +
                ", dwyb='" + dwyb + '\'' +
                ", lxrname='" + lxrname + '\'' +
                ", lxrguanxi='" + lxrguanxi + '\'' +
                ", lxrdz='" + lxrdz + '\'' +
                ", lxrtel='" + lxrtel + '\'' +
                ", rylj='" + rylj + '\'' +
                ", zryljgdm='" + zryljgdm + '\'' +
                ", zrjgname='" + zrjgname + '\'' +
                ", rytime=" + rytime +
                ", ryksbm='" + ryksbm + '\'' +
                ", cytime=" + cytime +
                ", cyksbm='" + cyksbm + '\'' +
                ", zyksname='" + zyksname + '\'' +
                ", swyy='" + swyy + '\'' +
                ", swsj=" + swsj +
                ", xuexing=" + xuexing +
                ", rhxuexing=" + rhxuexing +
                ", binganzhiliang=" + binganzhiliang +
                ", zkrq=" + zkrq +
                ", lyfs='" + lyfs + '\'' +
                ", nijieshouyljgdm='" + nijieshouyljgdm + '\'' +
                ", nijieshouyljgname='" + nijieshouyljgname + '\'' +
                ", zzymd='" + zzymd + '\'' +
                ", zzyjgts=" + zzyjgts +
                ", rylqhmtime=" + rylqhmtime +
                ", xsecstizhong=" + xsecstizhong +
                ", xserytizhong=" + xserytizhong +
                ", rybingqing='" + rybingqing + '\'' +
                ", zhuyaozdtime=" + zhuyaozdtime +
                ", sfbw=" + sfbw +
                ", qjcishu=" + qjcishu +
                ", qjsuccesscishu=" + qjsuccesscishu +
                ", yinanbing='" + yinanbing + '\'' +
                ", suizhen=" + suizhen +
                ", szdays=" + szdays +
                ", cyfhqk='" + cyfhqk + '\'' +
                ", rycyfhqk='" + rycyfhqk + '\'' +
                ", shoushuqh='" + shoushuqh + '\'' +
                ", yxbl='" + yxbl + '\'' +
                ", lcbl='" + lcbl + '\'' +
                ", ssbdslblqk='" + ssbdslblqk + '\'' +
                ", sqshblqk='" + sqshblqk + '\'' +
                ", lczdsjqk='" + lczdsjqk + '\'' +
                ", ynhzcishu=" + ynhzcishu +
                ", wyhzcishu=" + wyhzcishu +
                ", shuye=" + shuye +
                ", shuyefy=" + shuyefy +
                ", kjyymd='" + kjyymd + '\'' +
                ", kjyyfa='" + kjyyfa + '\'' +
                ", zhusu='" + zhusu + '\'' +
                ", tongzhidate=" + tongzhidate +
                ", zhikongpingfen=" + zhikongpingfen +
                ", zhikongzhe='" + zhikongzhe + '\'' +
                ", updatedate=" + updatedate +
                ", binglixiugaizhe='" + binglixiugaizhe + '\'' +
                ", shangbaobiaoji=" + shangbaobiaoji +
                ", weishoushuqi=" + weishoushuqi +
                ", weishoushuzhi=" + weishoushuzhi +
                ", jbpbm='" + jbpbm + '\'' +
                ", zlfqt='" + zlfqt + '\'' +
                ", zlfqn='" + zlfqn + '\'' +
                ", zlfqm='" + zlfqm + '\'' +
                ", sfdybz=" + sfdybz +
                ", sslclj=" + sslclj +
                ", wclclj=" + wclclj +
                ", tclcljyy='" + tclcljyy + '\'' +
                ", tclcljms='" + tclcljms + '\'' +
                ", lcljbyyy='" + lcljbyyy + '\'' +
                ", lcljbyms='" + lcljbyms + '\'' +
                ", zlfq='" + zlfq + '\'' +
                ", zlfhcd='" + zlfhcd + '\'' +
                ", zlzdyj='" + zlzdyj + '\'' +
                ", bnbiaoshi1='" + bnbiaoshi1 + '\'' +
                ", ageSui=" + ageSui +
                ", ageMonth=" + ageMonth +
                ", ageDays=" + ageDays +
                ", ycgfx=" + ycgfx +
                ", ddgfx=" + ddgfx +
                '}';
    }



}