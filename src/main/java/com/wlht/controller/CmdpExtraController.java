package com.wlht.controller;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.ImportParam;
import com.wlht.api.vo.SearForKs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/cmdphd")
public class CmdpExtraController {
    @Autowired
    private ZiDianService ziDianService;
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, ImportParam param) throws Exception {

        return "/index.jsp";
    }
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request, ImportParam param) throws Exception {
        return "/index.jsp";
    }
    @RequestMapping(value = "/getAllHospitalOffice")
    public String getAllHospitalOffice(HttpServletRequest request, PageParam pageParam, SearForKs param) throws Exception {
        param.setYyIdentity("49557184-0");
        PageInfo<HospitalOfficeVo> page = ziDianService.getAllHospitalOffice(pageParam, param);
        request.setAttribute("page",page);
        return "/cmdp/keshi/disList.jsp";
    }

    @RequestMapping(value = "/getAllHospitalMan")
    public String getAllHospitalMan(HttpServletRequest request, ImportParam param) throws Exception {

        return "/index.jsp";
    }
}
