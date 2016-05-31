package com.tgzhao.core.controller;

import com.tgzhao.core.common.MobileDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tgzhao on 16/5/28.
 */
@Controller
@RequestMapping("/weixin")
public class WeixinController {
    @Autowired
    private MobileDefinition mobileDefinition;
    public MobileDefinition getMobileDefinition() {
        return mobileDefinition;
    }

    @ResponseBody
    @RequestMapping("/getservice")
    public Object service(@RequestParam(value = "service", required = false) String service,
                          @RequestParam(value = "data", required = false) String data, HttpServletRequest request) {

        String ser = service;
        String da = data;
        HttpServletRequest req = request;
        MobileDefinition mobileDefinition11 = getMobileDefinition();
        System.out.println(mobileDefinition11.getKtvAvatar());
        System.out.println("测试编码");
        System.out.println(service);
        String aaaa = mobileDefinition11.getKtvAvatar();
        return mobileDefinition11;
//        return aaaa + mobileDefinition11.getKtvAvatar().toString() + "weixin service~~测试编码" + service; // "hello world";
    }
}
