package com.wlht.controller;

import com.github.pagehelper.PageInfo;
import com.ldg.api.vo.PageParam;
import com.ldg.api.vo.ResultMsg;
import com.wlht.api.SessionUtil;
import com.wlht.api.SysConstant;
import com.wlht.api.po.TCzy;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/cmdphd")
public class CmdpExtraController {
    @Autowired
    private ZiDianService ziDianService;
    @Autowired
    private WlhtDataService wlhtDataService;
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, LoginParam param) throws Exception {
        TCzy czy=wlhtDataService.selectCzy(param);
        if(czy!=null){
            request.getSession().setAttribute(SysConstant.sessionUSER,czy);
        }else{
            request.setAttribute("message","用户名或密码错误！");
            return "/cmdp/login.jsp";
        }
        return "redirect:/cmdp/index.jsp";
    }
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request, ImportParam param) throws Exception {
        request.getSession().invalidate();
        return "redirect:/cmdp/login.jsp";
    }
    @RequestMapping(value = "/getAllHospitalOffice")
    public String getAllHospitalOffice(HttpServletRequest request, PageParam pageParam, SearForKs param) throws Exception {
        param.setYyIdentity(SessionUtil.getYyIdentityForCZY(request));
        PageInfo<HospitalOfficeVo> page = ziDianService.getAllHospitalOffice(pageParam, param);
        request.setAttribute("page",page);
        return "/cmdp/keshi/disList.jsp";
    }

    /**
     * 检查科室名与科室编码是否重复
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/checkOfficeNameAndCode")
    @ResponseBody
    public  ResultMsg checkOfficeNameAndCode(HttpServletRequest request, HospitalOfficeVo param) {
        param.setYyidentity(SessionUtil.getYyIdentityForCZY(request));
        ResultMsg msg = new ResultMsg();
        String err=ziDianService.checkOfficeNameAndCode(param);
        if(err!=null){
            msg.setErrcode(1);
            msg.setErrmsg(err);
        }
        return msg;
    }

    /**
     * 保存科室信息
     * @param request
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/saveKSXXInfo")
    public String saveKSXXInfo(HttpServletRequest request,HospitalOfficeVo param) throws Exception {
        param.setYyidentity(SessionUtil.getYyIdentityForCZY(request));
        int insertNum=ziDianService.saveKSXXInfo(param);
        return "/cmdphd/getAllHospitalOffice";
    }

    /**
     * 获取所有医生
     * @param request
     * @param pageParam
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getAllHospitalMan")
    public String getAllHospitalMan(HttpServletRequest request, PageParam pageParam, SearForKs param) throws Exception {
        param.setYyIdentity(SessionUtil.getYyIdentityForCZY(request));
        PageInfo<HospitalDoctorVo> page = ziDianService.getAllHospitalMan(pageParam, param);
        request.setAttribute("page",page);
        return "/cmdp/doctor/disList.jsp";
    }

    /**
     * 身份证查找是否存在
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/checkIDCardForHospitalMan")
    @ResponseBody
    public  ResultMsg checkIDCardForHospitalMan(HttpServletRequest request, HospitalDoctorVo param) {
        param.setYyidentity(SessionUtil.getYyIdentityForCZY(request));
        ResultMsg msg = new ResultMsg();
        String err=ziDianService.checkIDCardForHospitalMan(param);
        if(err!=null){
            msg.setErrcode(1);
            msg.setErrmsg(err);
        }
        return msg;
    }

    /**
     * 保存医生信息
     * @param request
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/saveYSXXInfo")
    public String saveYSXXInfo(HttpServletRequest request,HospitalDoctorVo param) throws Exception {
        param.setYyidentity(SessionUtil.getYyIdentityForCZY(request));
        int insertNum=ziDianService.saveYSXXInfo(param);
        return "/cmdphd/getAllHospitalMan";
    }

    /**
     * 根据id删除医生
     * @param request
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/delHoapitalMan")
    public String delHoapitalMan(HttpServletRequest request,HospitalDoctorVo param) throws Exception {
        int insertNum=ziDianService.delHoapitalMan(param);
        return "/cmdphd/getAllHospitalMan";
    }

    /**
     * 修改医生
     * @param request
     * @param param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editHoapitalMan")
    public String editHoapitalMan(HttpServletRequest request,HospitalDoctorVo param) throws Exception {
        HospitalDoctorVo hospitalMan=ziDianService.getHoapitalManByIdForEdit(param);
        request.setAttribute("obj",hospitalMan);
        return "/cmdp/doctor/add.jsp";
    }
    /**
     * 查找科室，通过代码，简拼，汉字
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/searchKSINFO")
    @ResponseBody
    public  ResultMsg searchKSINFO(HttpServletRequest request, FbaiduParam param) {
        param.setYybaidentity(SessionUtil.getYyIdentityForCZY(request));
        ResultMsg msg = new ResultMsg();
        List<ZiDianBaseVo> ksList=ziDianService.searchKSINFO(param);
        msg.setData(ksList);
        return msg;
    }

    /**
     * 查找隶属国家标准，通过代码，简拼，汉字
     * @param request
     * @param param
     * @return
     */
    @RequestMapping(value = "/searchLSKSGJBZINFO")
    @ResponseBody
    public  ResultMsg searchLSKSGJBZINFO(HttpServletRequest request, FbaiduParam param) {
        param.setYybaidentity(SessionUtil.getYyIdentityForCZY(request));
        ResultMsg msg = new ResultMsg();
        List<ZiDianBaseVo> ksList=ziDianService.searchLSKSGJBZINFO(param);
        msg.setData(ksList);
        return msg;
    }

}
