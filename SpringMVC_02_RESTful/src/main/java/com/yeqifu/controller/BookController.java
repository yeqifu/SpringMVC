package com.yeqifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 落亦-
 * @Date: 2020/10/4 13:31
 */
@Controller
public class BookController {

    /**
     * 以get方式处理查询图书请求
     * @param bookId    图书ID
     * @return
     */
    @RequestMapping(value = "/book/{bookId}",method = RequestMethod.GET)
    public String getBook(@PathVariable("bookId") Integer bookId){
        System.out.println("查询到了"+bookId+"号图书");
        return "success";
    }

    /**
     * 以DELETE方式处理删除图书的请求
     * @param bookId    图书ID
     * @return
     */
    @RequestMapping(value = "/book/{bookId}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("bookId") Integer bookId){
        System.out.println("删除了"+bookId+"号图书");
        return "success";
    }

    /**
     * 以PUT方式处理更新图书的请求
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/book/{bookId}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable("bookId") Integer bookId){
        System.out.println("更新了"+bookId+"号图书");
        return "success";
    }

    /**
     * 以POST方式处理添加图书的请求
     * @return
     */
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String addBook(){
        System.out.println("添加了图书");
        return "success";
    }
}
