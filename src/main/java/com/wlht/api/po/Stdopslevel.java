package com.wlht.api.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "STDOPSLEVEL_")
public class Stdopslevel {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "ACCODE_")
    private String accode;

    @Column(name = "ATTRIBUTES_")
    private String attributes;

    @Column(name = "CODE_")
    private String code;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "FLAG_")
    private Long flag;

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

    @Column(name = "PARENT_")
    private String parent;

    @Column(name = "PARENTID_")
    private BigDecimal parentid;

    @Column(name = "SEQNO_")
    private String seqno;

    @Column(name = "STATCODE_")
    private String statcode;

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
     * @return ACCODE_
     */
    public String getAccode() {
        return accode;
    }

    /**
     * @param accode
     */
    public void setAccode(String accode) {
        this.accode = accode;
    }

    /**
     * @return ATTRIBUTES_
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
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
     * @return STATCODE_
     */
    public String getStatcode() {
        return statcode;
    }

    /**
     * @param statcode
     */
    public void setStatcode(String statcode) {
        this.statcode = statcode;
    }
}