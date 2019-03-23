package com.wlht.api.vo;

public class SimpleStdopsoperationVo {
    private Long id;
    private String name;
    private String code;
    private String stdopsoperationmark;
    private String level;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String stdopsoperationmarkName;
    private String levelName;


    public String getStdopsoperationmarkName() {
        return stdopsoperationmarkName;
    }

    public void setStdopsoperationmarkName(String stdopsoperationmarkName) {
        this.stdopsoperationmarkName = stdopsoperationmarkName;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStdopsoperationmark() {
        return stdopsoperationmark;
    }

    public void setStdopsoperationmark(String stdopsoperationmark) {
        this.stdopsoperationmark = stdopsoperationmark;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
