package com.demo.echarts.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author ls
 * @Date 2019/05/14 16:35:00
 * @Description
 * @Version 1.0
 **/
@RestController
public class Test {
    @GetMapping("/")
    public ModelAndView helloGet(String p) {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;

    }
    @GetMapping("/test")
    public String test(){
        System.out.println("----1111-----");
        return "index";
    }
}
