package com.yeqifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 落亦-
 * @Date: 2020/9/28 9:46
 */
@Controller
@RequestMapping("/handle")
public class MyFirstController {

    /**
     * @RequestMapping的其它属性
     *      method：请求方式
     *          HTTP规定的所有的请求方式    get,post,HEAD,PUT,PATCH,DELETE,OPTIONS,TRACE;
     *          method = RequestMethod.POST  只接受POST类型的请求
     *          如果不写，默认接受所有类型的请求
     *          当请求的客户端请求的类型和服务端不同时，报错
     *          HTTP Status 405 – Method Not Allowed，Request method 'GET' not supported
     *          4XX：都是客户端错误
     *
     *      params：规定请求参数
     *          params和headers支持简单的表达式：
     *          param1：表示请求必须包含名为param1的请求参数
     *              eg：params = {"username"}  请求必须携带username的请求参数，不带会404
     *          !param1：表示请求不携带名为param1的请求参数
     *              eg：params = {"!username"} 请求不能携带username的请求参数，携带了会400
     *              eg：params = {"username!=123"} 请求的参数username!=123或者不携带username
     *          {“param1=value1”, “param2”}: 请求必须包含名为param1 和param2 的两个请求参数，且param1 参数的值必须为value1
     *              eg：params = {"username=111","gender"}
     *
     *      headers：规定请求头
     *          谷歌：
     *          User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.102 Safari/537.36
     *          火狐：
     *          User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0
     *      consumes：只接受内容类型是那种请求，规定请求头中的Content-Type
     *      produces：告诉浏览器返回的内容类型是什么，给响应头中加上Content-Type:text/html;charset=utf-8
     * @return
     */
    @RequestMapping(value = "/handle01",method = RequestMethod.POST)
    public String handle01(){
        System.out.println("进入了handle01");
        return "success";
    }

    /**
     * 请求必须包含username参数
     * @return
     */
    @RequestMapping(value = "/handle02",params = {"username"})
    public String handle02(){
        System.out.println("进入了handle02");
        return "success";
    }

    /**
     * 请求不能包含username的参数
     * @return
     */
    @RequestMapping(value = "/handle03",params = {"!username"})
    public String handle03(){
        System.out.println("进入了handle02");
        return "success";
    }

    /**
     * 请求必须包含username和gender两个参数
     * @return
     */
    @RequestMapping(value = "/handle05",params = {"username=111","gender"})
    public String handle05(){
        System.out.println("进入了handle05");
        return "success";
    }

    /**
     * 火狐能访问而谷歌不能访问
     * @return
     */
    @RequestMapping(value = "/handle06",headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0"})
    public String handle06(){
        System.out.println("进入了handle06");
        return "success";
    }
}
