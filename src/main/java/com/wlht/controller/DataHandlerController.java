package com.wlht.controller;

import com.ldg.api.vo.ResultMsg;
import com.wlht.api.service.WlhtDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by LiuDongguang on 2017/6/28.
 */
@Controller
@RequestMapping(value = "/wlhtData")
public class DataHandlerController {
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
    public String wlthDR(HttpServletRequest request) throws Exception {
        return "/index.jsp";
    }

    /**
     * 选择日期范围进行导入费用数据，将没有费用的记录进行导入！日期范围最大不要超过3个月！
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/wlthDRFY")
    public String wlthDRFY(HttpServletRequest request) throws Exception {
        return "/index.jsp";
    }
}
