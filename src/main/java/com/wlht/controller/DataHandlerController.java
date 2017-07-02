package com.wlht.controller;

import com.ldg.api.util.DateUtil;
import com.ldg.api.util.LdgRequestUtil;
import com.ldg.api.util.RequestFileUtil;
import com.ldg.api.vo.ResultMsg;
import com.wlht.api.SessionUtil;
import com.wlht.api.service.WlhtDataService;
import com.wlht.api.vo.HospitalOfficeVo;
import com.wlht.api.vo.ImportParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/wlhtData")
public class DataHandlerController {
    public static final Logger logger = LoggerFactory.getLogger(DataHandlerController.class);
    @Autowired
   private WlhtDataService wlhtDataService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public ResultMsg test(HttpServletRequest request) throws Exception {
        ResultMsg rs = new ResultMsg();
        wlhtDataService.test();
        return rs;
    }

    /**
     * 选择日期范围进行导入病案数据，已导入的数据部会再次导入！日期范围最大不要超过6个月！
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/wlthDR")
    public String wlthDR(HttpServletRequest request, ImportParam param) throws Exception {
        if(param.getStarte()==null||param.getEnd()==null){
            request.setAttribute("errmsg","时间必填！");
            return "/index.jsp";
        }
        String handlerMsg=wlhtDataService.importDataByDate(param);
        request.setAttribute("errmsg",handlerMsg);
        return "/index.jsp";
    }

    /**
     * 选择日期范围进行导入费用数据，将没有费用的记录进行导入！日期范围最大不要超过3个月！
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/wlthDRFY")
    public String wlthDRFY(HttpServletRequest request, ImportParam param) throws Exception {
        if(param.getStarte()==null||param.getEnd()==null){
            request.setAttribute("errmsg","时间必填！");
            return "/index.jsp";
        }
        String handlerMsg=wlhtDataService.importFeiYongDataByDate(param);
        request.setAttribute("errmsg",handlerMsg);
        return "/index.jsp";
    }

    /**
     * 任务1
     * @return
     * @throws Exception
     */
    public String wlthDRForTast() throws Exception{
        Date[] date=DateUtil.getBeforeDATEBetween(new Date(),20);
        ImportParam param=new ImportParam();
        param.setStarte(date[0]);
        param.setEnd(date[1]);
        String handlerMsg=wlhtDataService.importDataByDate(param);
        wlhtDataService.delChongfuInfo(); // 删除重复记录
        System.out.println("-------执行了信息插入task-------");
        logger.info(handlerMsg);
        return "/index.jsp";
    }

    /**
     * 导入科室
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/ksExcelImport")
    public  String ksExcelImport(HttpServletRequest request) throws Exception {
        String msg=wlhtDataService.ksExcelImport(request);
        request.setAttribute("ksmessage",msg);
        return "/cmdp/importexcel/index.jsp";
    }
    /**
     * 导入医师
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/yishiExcelImport")
    public  String yishiExcelImport(HttpServletRequest request) throws Exception {
        String  msg=wlhtDataService.yishiExcelImport(request);
        request.setAttribute("yishimessage",msg);
        return "/cmdp/importexcel/index.jsp";
    }
}
