package com.neusoft.springboot_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: cxl
 * @Date: 2020/4/30 09:46
 */
@RestController
@RequestMapping("/demo")
public class HelloController {

    @Value("${my.prop}")
    private String myProp;

    /**
     * @author cxl
     * @param
     * @return java.lang.String
     * @date 2020-04-30
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!!"+myProp;
    }
}
