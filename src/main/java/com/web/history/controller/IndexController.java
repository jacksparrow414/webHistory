package com.web.history.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * web首页设置
 * @author jacksparrow414
 * @date 2021/5/4
 */
@RestController
public class IndexController {
    
    /**
     * 设置首页的跳转view名字，具体的HTML文件的名字.
     * 这里只需要设置HTML文件名字即可，不需要写全称，index.html这种，
     * 因为 application.properties中指定了mvc的后缀名为.html
     * @return org.springframework.web.servlet.ModelAndView ModelAndView对象
     */
    @RequestMapping(value = "/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
