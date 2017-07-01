package com.wlht.api.bo;

import java.security.Timestamp;

/**
 * Created by liudo on 2017/7/1.
 */
public class DelBaseInfo {
    private Long id;
    private String Identity;
    private Timestamp mintime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public Timestamp getMintime() {
        return mintime;
    }

    public void setMintime(Timestamp mintime) {
        this.mintime = mintime;
    }
}
