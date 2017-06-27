package com.ldg.controller;

import com.ldg.api.util.minganci.MinganciUtil;
import com.ldg.api.vo.ResultMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
        String ss = "你好";
        System.out.println(ss);
        request.setAttribute("aaa",ss);
        return "/test.jsp";
    }
}
