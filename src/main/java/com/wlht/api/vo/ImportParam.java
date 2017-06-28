package com.wlht.api.vo;

import com.ldg.api.util.DateUtil;

import java.util.Date;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
public class ImportParam {
    private Date starte;
    private Date end;
    private Integer delFyState;//删除已有费用

    public Date getStarte() {
        return starte;
    }

    public void setStarte(Date starte) {
        this.starte = starte;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        if(end!=null){
            this.end = DateUtil.getDayLastTime(end);
        }
    }

    public Integer getDelFyState() {
        return delFyState;
    }

    public void setDelFyState(Integer delFyState) {
        this.delFyState = delFyState;
    }
}
