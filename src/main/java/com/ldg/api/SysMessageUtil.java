package com.ldg.api;

import com.ldg.api.util.HttpClientUtil;
import com.ldg.api.util.JsonUtil;
import com.ldg.api.util.MD5Util;
import com.ldg.api.vo.MsgResult;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SysMessageUtil {
    private static Properties hospitalInterfaceProperties = new Properties();
    private static String sign;
    private static String sendServer;

    static {
        ClassPathResource hospitalInterface = new ClassPathResource("peonymsg.properties");
        try {
            hospitalInterfaceProperties.load(hospitalInterface.getInputStream());
            StringBuilder mstr = new StringBuilder(hospitalInterfaceProperties.getProperty("msg.userName"));
            mstr.append(hospitalInterfaceProperties.getProperty("msg.password"));
            sign = MD5Util.string2MD5(mstr.toString());
            sendServer = hospitalInterfaceProperties.getProperty("msg.sendServer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MsgResult sendMessage(String phoneNum, String content) {
        HttpClientUtil htc = HttpClientUtil.getInstance();
        Map<String, String> param = new HashMap<>();
        param.put("sign", sign);
        param.put("phone", phoneNum);
        param.put("content", content);
        String rsMsg = htc.sendHttpPost(sendServer, param);
        MsgResult msgObj = JsonUtil.getObjectByJSON(rsMsg, MsgResult.class);
        return msgObj;
    }

    public static void main(String[] args) {
        System.out.println(sendMessage("13608943249", "测试短信"));
    }
}
