package com.wlht.api;

import com.wlht.api.po.TCzy;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liudo on 2017/7/2.
 */
public class SessionUtil {
    public final static String getYyIdentityForCZY(HttpServletRequest request) {
        TCzy czy = (TCzy) request.getSession().getAttribute(SysConstant.sessionUSER);
        if (czy != null) {
            return czy.getYyidentiry();
        }
        return null;
    }
}
