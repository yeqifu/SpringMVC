package com.yeqifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 *
 * SpringMVC除过在方法上传入原生的request和session外还可以通过以下三种方式把数据带给页面
 * 1、可以在方法处传入Map、Model或者ModelMap
 *          给这些参数里面保存的所有数据都会放在请求域中，可以在页面获取
 *    关系：
 *      Map、Model、ModelMap最终都是BindingAwareModelMap在工作
 *      相当于给BindingAwareModelMap中保存的东西都会被放在请求域中
 *
 *      Map(interface(jdk))     Model(interface(spring))
 *              ||                     //
 *              ||                    //
 *              \/                   //
 *          ModelMap(class)         //实现
 *                 \\              //
 *                  \\ 继承        //
 *                   \/          //
 *                    ExtendedModelMap
 *                          ||
 *                          \/
 *                    BindingAwareModelMap
 *
 * 3、SpringMVC提供了一种可以临时给Session域中保存数据的方式
 *      使用一个注解      @SessionAttributes(只能标在类上)
 *      @SessionAttributes(value="msg")：
 *              给BindingAwareModelMap中或者ModelAndView中保存的数据，同时给session中放一份；
 *              value指定保存数据时要给session中放的数据的key
 *      value={"msg"}：只要保存的是这种key的数据，给session中放一份
 *      types={String.class}：只要保存的是这种类型的数据，也给session中放一份
 *
 *      不推荐使用@SessionAttributes，可能会引发异常
 *      给session中存放数据推荐使用原生API
 *
 * @Author: 落亦-
 * @Date: 2020/10/5 15:39
 */
@SessionAttributes(value = {"msg","info"},types = {Integer.class})
@Controller
public class OutputController {

    @RequestMapping("/handle1")
    public String handle1(Map<String,Object> map){
        map.put("msg","您好");
        System.out.println("map的类型："+map.getClass());
        return "success";
    }

    /**
     * Model：一个接口
     * @param model
     * @return
     */
    @RequestMapping("/handle2")
    public String handle2(Model model){
        model.addAttribute("msg","戒骄戒躁，稳扎稳打！");
        model.addAttribute("info",21);
        System.out.println("model的类型："+model.getClass());
        return "success";
    }

    /**
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/handle3")
    public String handle3(ModelMap modelMap){
        modelMap.addAttribute("msg","自己的技术和能力是最重要的！！！");
        System.out.println("modelMap的类型："+modelMap.getClass());
        return "success";
    }

    /**
     * 2、方法的返回值可以变为ModelAndView类型；
     *      既包含视图信息（页面地址）也包含模型数据（给页面带的数据）
     *      而且数据是放在请求域中的
     */
    /**
     * 返回一个ModelAndView，可以为页面携带数据
     * @return
     */
    @RequestMapping("/handle5")
    public ModelAndView handle5() {
        ModelAndView view = new ModelAndView("success");
        view.addObject("info", "做这个年龄该做的事！");
        return view;
    }
}
