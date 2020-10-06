package com.yeqifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 落亦-
 * @Date: 2020/10/5 15:21
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handle1(){
        System.out.println("hello");
        return "success";
    }

}
