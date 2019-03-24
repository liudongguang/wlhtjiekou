package com.wlht.controller;


import com.ldg.api.vo.ResultMsg;
import com.wlht.api.SysConstant;
import com.wlht.api.service.ZiDianService;
import com.wlht.api.vo.HospitalDoctorVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "/providehis")
public class HisDiaoyongController {
    @Autowired
    private ZiDianService ziDianService;

    @RequestMapping(value = "/addDoctor")
    @ResponseBody
    public ResultMsg addDoctor(HospitalDoctorVo param) throws Exception{
        ResultMsg msg = new ResultMsg();
        String ysname = param.getYsname();
        if (StringUtils.isBlank(ysname)) {
            msg.setErrcode(1);
            msg.setErrmsg("医生姓名不能为空！");
            return msg;
        }
        String idcard = param.getIdcard();
        if (StringUtils.isBlank(idcard)) {
            msg.setErrcode(1);
            msg.setErrmsg("医生身份证号不能为空！");
            return msg;
        }
        Date workday=param.getWorkday();// yyyy-MM-dd
        if (workday==null) {
            msg.setErrcode(1);
            msg.setErrmsg("医生不参加工作时间能为空！");
            return msg;
        }
        String suozaiks=param.getSuozaiks();
        if (StringUtils.isBlank(suozaiks)) {
            msg.setErrcode(1);
            msg.setErrmsg("医生所在科室不能为空！");
            return msg;
        }else{
            //获取科室编码
            String keshiCode = ziDianService.getKeshiCodeByName(suozaiks);
            if(null==keshiCode){
                msg.setErrcode(1);
                msg.setErrmsg("无此科室名称，请输入存在的科室名或联系病案管理员添加该科室名称！");
                return msg;
            }
            param.setSuozaiks(keshiCode);
        }
        String err = ziDianService.checkIDCardForHospitalMan(param);
        if (err != null) {
            msg.setErrcode(1);
            msg.setErrmsg(err);
            return msg;
        }
        param.setYyidentity(SysConstant.zzdm);
        int insertNum=ziDianService.saveYSXXInfo(param);
        if(0==insertNum){
            msg.setErrcode(1);
            msg.setErrmsg("添加失败！");
            return msg;
        }
        return msg;
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public ResultMsg test(HospitalDoctorVo param) throws Exception{
        System.out.println("66666");
        return new ResultMsg();
    }
}
