package com.tgzhao.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tgzhao on 16/5/27.
 */

@Controller
@RequestMapping("/")
public class MobileController {
    @ResponseBody
    @RequestMapping("/do")
    public Object service(@RequestParam(value = "service", required = false) String service,
                          @RequestParam(value = "data", required = false) String data, HttpServletRequest request) {

        String ser = service;
        String da = data;
        HttpServletRequest req = request;
        return "hello world";
    }
}
