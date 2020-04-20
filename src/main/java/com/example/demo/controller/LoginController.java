package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.CrtUser;
import com.example.demo.result.ExceptionMsg;
import com.example.demo.result.ResponseData;
import com.example.demo.service.UserServices;
import com.example.demo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
@RequestMapping(value = "api/v1/login")
public class LoginController {

    @Autowired
    public UserServices userServices;

    @CrossOrigin
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData login(@RequestBody CrtUser requestUser) {

        System.out.println("login start");
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUserLoginname();
        String pwd = requestUser.getUserPassword();
        username = HtmlUtils.htmlEscape(username);
        pwd = HtmlUtils.htmlEscape(pwd);

        boolean isExist = this.userServices.isExist(username, pwd);
        if (isExist) {
            return new ResponseData(ExceptionMsg.SUCCESS, "");
        } else {
            return new ResponseData(ExceptionMsg.LOGIN_FAILED, "");
        }
    }
}
