package com.wlht.api.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "STDHOSPITALMAN_")
public class Stdhospitalman {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "ADDRESS_")
    private String address;

    @Column(name = "ADMINPOST_")
    private String adminpost;

    @Column(name = "BIRTHDAY_")
    private Date birthday;

    @Column(name = "CCCODE_")
    private String cccode;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "EDUCATION_")
    private String education;

    @Column(name = "EMAIL_")
    private String email;

    @Column(name = "FLAG_")
    private Long flag;

    @Column(name = "HOMEADDRESS_")
    private String homeaddress;

    @Column(name = "HOMEPAGE_")
    private String homepage;

    @Column(name = "HOMETEL_")
    private String hometel;

    @Column(name = "IDCARD_")
    private String idcard;

    @Column(name = "INDEXCODE_")
    private String indexcode;

    @Column(name = "INTRO_")
    private String intro;

    @Column(name = "ISLEAF_")
    private Long isleaf;

    @Column(name = "LEVEL_")
    private Long level;

    @Column(name = "MAJOR_")
    private String major;

    @Column(name = "MOBILE_")
    private String mobile;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "NATION_")
    private String nation;

    @Column(name = "NATIONALITY_")
    private String nationality;

    @Column(name = "OFFICECODE_")
    private String officecode;

    @Column(name = "OPERATIONSPECIALITY_")
    private String operationspeciality;

    @Column(name = "ORGCODE_")
    private String orgcode;

    @Column(name = "OTHERLINK_")
    private String otherlink;

    @Column(name = "PARENT_")
    private String parent;

    @Column(name = "PARENTID_")
    private BigDecimal parentid;

    @Column(name = "PHONE_")
    private String phone;

    @Column(name = "POSTRANK_")
    private String postrank;

    @Column(name = "POSTTECHNOLOGY_")
    private String posttechnology;

    @Column(name = "SEQNO_")
    private String seqno;

    @Column(name = "SEX_")
    private String sex;

    @Column(name = "SPECIALITY_")
    private String speciality;

    @Column(name = "SUBORGCODE_")
    private String suborgcode;

    @Column(name = "SUBJECTCLASS_")
    private String subjectclass;

    @Column(name = "PHOTOURL_")
    private String photourl;

    @Column(name = "SIGNATUREURL_")
    private String signatureurl;

    @Column(name = "OUTPATIENTSERVICEOFFICE_")
    private String outpatientserviceoffice;

    @Column(name = "DOCTORPRACTICERANGE_")
    private String doctorpracticerange;

    @Column(name = "EDUCATIONALLEVEL_")
    private String educationallevel;

    @Column(name = "MARRIAGE_")
    private String marriage;

    @Column(name = "PRACTISINGCERTIFICATE_")
    private String practisingcertificate;

    @Column(name = "WORKDAY_")
    private Date workday;

    @Column(name = "ISACTIVED_")
    private Long isactived;

    @Column(name = "PHOTO_")
    private byte[] photo;

    @Column(name = "SIGNATURE_")
    private byte[] signature;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return ADDRESS_
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return ADMINPOST_
     */
    public String getAdminpost() {
        return adminpost;
    }

    /**
     * @param adminpost
     */
    public void setAdminpost(String adminpost) {
        this.adminpost = adminpost;
    }

    /**
     * @return BIRTHDAY_
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
     * @return CCCODE_
     */
    public String getCccode() {
        return cccode;
    }

    /**
     * @param cccode
     */
    public void setCccode(String cccode) {
        this.cccode = cccode;
    }

    /**
     * @return COMMENT_
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return EDUCATION_
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return EMAIL_
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
     * @return FLAG_
     */
    public Long getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Long flag) {
        this.flag = flag;
    }

    /**
     * @return HOMEADDRESS_
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
     * @param homeaddress
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    /**
     * @return HOMEPAGE_
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * @param homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * @return HOMETEL_
     */
    public String getHometel() {
        return hometel;
    }

    /**
     * @param hometel
     */
    public void setHometel(String hometel) {
        this.hometel = hometel;
    }

    /**
     * @return IDCARD_
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
     * @return INDEXCODE_
     */
    public String getIndexcode() {
        return indexcode;
    }

    /**
     * @param indexcode
     */
    public void setIndexcode(String indexcode) {
        this.indexcode = indexcode;
    }

    /**
     * @return INTRO_
     */
    public String getIntro() {
        return intro;
    }

    /**
     * @param intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * @return ISLEAF_
     */
    public Long getIsleaf() {
        return isleaf;
    }

    /**
     * @param isleaf
     */
    public void setIsleaf(Long isleaf) {
        this.isleaf = isleaf;
    }

    /**
     * @return LEVEL_
     */
    public Long getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Long level) {
        this.level = level;
    }

    /**
     * @return MAJOR_
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return MOBILE_
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return NAME_
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
     * @return NATION_
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * @return NATIONALITY_
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return OFFICECODE_
     */
    public String getOfficecode() {
        return officecode;
    }

    /**
     * @param officecode
     */
    public void setOfficecode(String officecode) {
        this.officecode = officecode;
    }

    /**
     * @return OPERATIONSPECIALITY_
     */
    public String getOperationspeciality() {
        return operationspeciality;
    }

    /**
     * @param operationspeciality
     */
    public void setOperationspeciality(String operationspeciality) {
        this.operationspeciality = operationspeciality;
    }

    /**
     * @return ORGCODE_
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * @param orgcode
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    /**
     * @return OTHERLINK_
     */
    public String getOtherlink() {
        return otherlink;
    }

    /**
     * @param otherlink
     */
    public void setOtherlink(String otherlink) {
        this.otherlink = otherlink;
    }

    /**
     * @return PARENT_
     */
    public String getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * @return PARENTID_
     */
    public BigDecimal getParentid() {
        return parentid;
    }

    /**
     * @param parentid
     */
    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    /**
     * @return PHONE_
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
     * @return POSTRANK_
     */
    public String getPostrank() {
        return postrank;
    }

    /**
     * @param postrank
     */
    public void setPostrank(String postrank) {
        this.postrank = postrank;
    }

    /**
     * @return POSTTECHNOLOGY_
     */
    public String getPosttechnology() {
        return posttechnology;
    }

    /**
     * @param posttechnology
     */
    public void setPosttechnology(String posttechnology) {
        this.posttechnology = posttechnology;
    }

    /**
     * @return SEQNO_
     */
    public String getSeqno() {
        return seqno;
    }

    /**
     * @param seqno
     */
    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    /**
     * @return SEX_
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return SPECIALITY_
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * @return SUBORGCODE_
     */
    public String getSuborgcode() {
        return suborgcode;
    }

    /**
     * @param suborgcode
     */
    public void setSuborgcode(String suborgcode) {
        this.suborgcode = suborgcode;
    }

    /**
     * @return SUBJECTCLASS_
     */
    public String getSubjectclass() {
        return subjectclass;
    }

    /**
     * @param subjectclass
     */
    public void setSubjectclass(String subjectclass) {
        this.subjectclass = subjectclass;
    }

    /**
     * @return PHOTOURL_
     */
    public String getPhotourl() {
        return photourl;
    }

    /**
     * @param photourl
     */
    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    /**
     * @return SIGNATUREURL_
     */
    public String getSignatureurl() {
        return signatureurl;
    }

    /**
     * @param signatureurl
     */
    public void setSignatureurl(String signatureurl) {
        this.signatureurl = signatureurl;
    }

    /**
     * @return OUTPATIENTSERVICEOFFICE_
     */
    public String getOutpatientserviceoffice() {
        return outpatientserviceoffice;
    }

    /**
     * @param outpatientserviceoffice
     */
    public void setOutpatientserviceoffice(String outpatientserviceoffice) {
        this.outpatientserviceoffice = outpatientserviceoffice;
    }

    /**
     * @return DOCTORPRACTICERANGE_
     */
    public String getDoctorpracticerange() {
        return doctorpracticerange;
    }

    /**
     * @param doctorpracticerange
     */
    public void setDoctorpracticerange(String doctorpracticerange) {
        this.doctorpracticerange = doctorpracticerange;
    }

    /**
     * @return EDUCATIONALLEVEL_
     */
    public String getEducationallevel() {
        return educationallevel;
    }

    /**
     * @param educationallevel
     */
    public void setEducationallevel(String educationallevel) {
        this.educationallevel = educationallevel;
    }

    /**
     * @return MARRIAGE_
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * @param marriage
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    /**
     * @return PRACTISINGCERTIFICATE_
     */
    public String getPractisingcertificate() {
        return practisingcertificate;
    }

    /**
     * @param practisingcertificate
     */
    public void setPractisingcertificate(String practisingcertificate) {
        this.practisingcertificate = practisingcertificate;
    }

    /**
     * @return WORKDAY_
     */
    public Date getWorkday() {
        return workday;
    }

    /**
     * @param workday
     */
    public void setWorkday(Date workday) {
        this.workday = workday;
    }

    /**
     * @return ISACTIVED_
     */
    public Long getIsactived() {
        return isactived;
    }

    /**
     * @param isactived
     */
    public void setIsactived(Long isactived) {
        this.isactived = isactived;
    }

    /**
     * @return PHOTO_
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    /**
     * @return SIGNATURE_
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * @param signature
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
}