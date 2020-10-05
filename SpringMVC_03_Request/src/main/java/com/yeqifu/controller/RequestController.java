package com.yeqifu.controller;

import com.yeqifu.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: 落亦-
 * @Date: 2020/10/4 14:58
 */
@Controller
public class RequestController {

    /*
     * SpringMVC如何获取请求带来的各种信息
     *      默认方式获取请求参数：
     *          直接给方法入参上写一个和请求参数名相同的变量，这个变量就来接收请求参数的值
     *          带：有值   没带：null
     * @RequestParam：获取请求参数，默认必须带，不带报错
     *      value：指定要获取的参数的key
     *      required：参数是否必须
     *      defaultValue：默认值，没带默认为null，写了这个可以自己指定
     *
     * @PathVariable
     *      /book/{user}?user=admin
     *      @RequestParam获取?右边的值，@PathVariable获取?左边的值
     *
     * @RequestHeader：获取请求头中某个key的值
     *      request.getHeader("User-Agent");
     *      @RequestHeader("User-Agent") String userAgent
     *      =
     *      userAgent=request.getHeader("User-Agent")
     *
     * @CookieValue：获取某个cookie的值
     *      以前的操作获取某个cookie
     *      Cookie[] cookies = request.getCookies();
     *      for(Cookie c:cookies){
     *          if(c.getName().equals("JSESSIONID")){
     *              String result=c.getValue();
     *          }
     *      }
     */

    /**
     * @param username
     * @return
     */
    @RequestMapping("/handle1")
    public String handle1(@RequestParam("username") String username,
                          @RequestHeader("User-Agent") String userAgent,
                          @CookieValue("JSESSIONID") String jid) {
        System.out.println("这个变量的值为：" + username);
        System.out.println("请求头中浏览器的信息：" + userAgent);
        System.out.println("Cookie中JSESSIONID的值为：" + jid);
        return "success";
    }

    /**
     * 如果我们的请求参数是一个POJO
     * SpringMVC会自动的为这个POJO进行赋值
     *      1、将POJO中的每一个属性，从request参数中尝试获取出来，并封装即可
     *      2、还可以级联封装，属性的属性
     *      3、请求参数的参数名和对象中的属性名一一对应即可
     *
     * 提交的数据可能有乱码：
     *      请求乱码：
     *          get请求：修改tomcat的server.xml，在8080端口处加 URIEncoding="UTF-8"
     *          post请求：
     *               1、在第一次获取请求参数之前设置
     *                      request.setCharacterEncoding("UTF-8");
     *               2、自己写一个filter,spring写好了，直接配置即可
     *      响应乱码：
     *          response.setContentType("text/html;charset=utf-8")
     * @param book
     * @return
     */
    @RequestMapping("/book")
    public String book(Book book){
        System.out.println("我要保存的图书："+book);
        return "success";
    }

    /**
     * SpringMVC可以直接在参数上写原生的API
     * HttpServletRequest
     * HttpServletResponse
     * HttpSession
     * @param session
     * @param request
     * @return
     */
    @RequestMapping("/handle2")
    public String handle2(HttpSession session, HttpServletRequest request){
        request.setAttribute("requestParam","我是请求域中的");
        session.setAttribute("sessionParam","我是Session域中的");
        return "success";
    }

}
