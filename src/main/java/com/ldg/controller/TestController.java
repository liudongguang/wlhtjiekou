package com.ldg.controller;

import com.ldg.api.excel.ExcelUtils;
import com.ldg.api.util.minganci.MinganciUtil;
import com.ldg.api.vo.ResultMsg;
import com.remote.api.po.Hisview;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
 * Created by LiuDongguang on 2017/6/6.
 */
@Controller
@RequestMapping("/req")
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public ResultMsg test(String text) {
        ResultMsg rs = new ResultMsg();
        return rs;
    }

    @RequestMapping("/test2")
    public String test2(HttpServletRequest request) {
        List<Hisview> rslist = ExcelUtils.readExcel("01山东病案软件接口(病案首页数据)(1).xlsx",Hisview.class);
        System.out.println(rslist);
        return "/test.jsp";
    }
}
