package com.wlht.controller;


import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.SessionUtil;
import com.wlht.api.service.ShoushuService;
import com.wlht.api.vo.SearForShoushu;
import com.wlht.api.vo.SimpleStdopsoperationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/shoushu")
public class ShoushuController {
    @Autowired
    private ShoushuService shoushuService;

    @RequestMapping(value = "/getAllShoushu")
    public String getAllHospitalOffice(HttpServletRequest request, PageParam pageParam, SearForShoushu param) throws Exception {
        param.setYyIdentity(SessionUtil.getYyIdentityForCZY(request));
        PageInfo<SimpleStdopsoperationVo> page = shoushuService.getAllHospitalShoushu(pageParam, param);
        request.setAttribute("page",page);
        return "/cmdp/shoushu/disList.jsp";
    }
}
