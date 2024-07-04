package com.ohgiraffers.spring_project.login.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


public class IndexController {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @GetMapping("/admin/page")
    public ModelAndView admin(ModelAndView mv){
        mv.setViewName("admin/page");
        return mv;
    }

    @GetMapping("/user/page")
    public ModelAndView user(ModelAndView mv){
        mv.setViewName("user/page");
        return mv;
    }
}
