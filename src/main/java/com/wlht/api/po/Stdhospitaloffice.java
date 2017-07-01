package com.wlht.api.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "STDHOSPITALOFFICE_")
public class Stdhospitaloffice {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CCCODE_")
    private String cccode;

    @Column(name = "CODE_")
    private String code;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "EXISTINGBED_")
    private Long existingbed;

    @Column(name = "FLAG_")
    private Long flag;

    @Column(name = "FORMATIONBED_")
    private Long formationbed;

    @Column(name = "INDEXCODE_")
    private String indexcode;

    @Column(name = "ISLEAF_")
    private Long isleaf;

    @Column(name = "LEVEL_")
    private Long level;

    @Column(name = "NAME_")
    private String name;

    @Column(name = "NAMEEN_")
    private String nameen;

    @Column(name = "NAMES_")
    private String names;

    @Column(name = "NAMESEN_")
    private String namesen;

    @Column(name = "ORGCODE_")
    private String orgcode;

    @Column(name = "PARENT_")
    private String parent;

    @Column(name = "PARENTID_")
    private BigDecimal parentid;

    @Column(name = "SEQNO_")
    private String seqno;

    @Column(name = "SUBORGCODE_")
    private String suborgcode;

    @Column(name = "INTRO_")
    private String intro;

    @Column(name = "OFFICETYPE_")
    private String officetype;

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
     * @return CODE_
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return EXISTINGBED_
     */
    public Long getExistingbed() {
        return existingbed;
    }

    /**
     * @param existingbed
     */
    public void setExistingbed(Long existingbed) {
        this.existingbed = existingbed;
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
     * @return FORMATIONBED_
     */
    public Long getFormationbed() {
        return formationbed;
    }

    /**
     * @param formationbed
     */
    public void setFormationbed(Long formationbed) {
        this.formationbed = formationbed;
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
     * @return NAMEEN_
     */
    public String getNameen() {
        return nameen;
    }

    /**
     * @param nameen
     */
    public void setNameen(String nameen) {
        this.nameen = nameen;
    }

    /**
     * @return NAMES_
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return NAMESEN_
     */
    public String getNamesen() {
        return namesen;
    }

    /**
     * @param namesen
     */
    public void setNamesen(String namesen) {
        this.namesen = namesen;
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
     * @return OFFICETYPE_
     */
    public String getOfficetype() {
        return officetype;
    }

    /**
     * @param officetype
     */
    public void setOfficetype(String officetype) {
        this.officetype = officetype;
    }
}