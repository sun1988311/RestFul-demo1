package com.example.demo.controller;

import com.example.demo.pojo.CrtUser;
import com.example.demo.service.UserServices;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemoController {

    @Autowired
    public UserServices userServices;

    @GetMapping("/mvcdemo/{id}")
    public ModelAndView hello(@PathVariable("id") Long userId){
        CrtUser user = this.userServices.getCrtUser(userId);
        ModelAndView modelAndView = new ModelAndView("thymeleaf/mvcdemo");
        modelAndView.addObject("user", user);
        return modelAndView;

    }
}
