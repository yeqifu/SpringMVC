package com.yeqifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 落亦-
 * @Date: 2020/9/28 14:39
 */
@Controller
@RequestMapping("ant")
public class RequestMappingTest {

    /**
     * URL地址可以写模糊的通配符：
     *      ?：能替代任意一个字符
     *      *：能替代任意多个字符和一层路径
     *      **：能替代多层路径
     * @return
     */

    /**
     * ?匹配一个字符,0个 多个都不行
     *      模糊和精确多个匹配的情况下，精确优先
     * @return
     */
    @RequestMapping("/antTest0?")
    public String antTest01(){
        System.out.println("antTest01");
        return "success";
    }

    /**
     * 拿到路径上的占位符
     * @param id
     * @return
     */
    @RequestMapping("/pathVariableTest/{id}")
    public String pathVariableTest(@PathVariable("id")String id){
        System.out.println(id);
        return "success";
    }
}
