package com.example.demo.controller;


import com.example.demo.exception.BusinessException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.ValidationException;

/**
 * @author longzhonghua
 * @createdata 3/18/2019 10:25 PM
 * @description
 */
@RestController
public class TestController {

    @ApiOperation(value = "异常", notes = "异常测试")
    @RequestMapping("/BusinessException")
    public String testResponseStatusExceptionResolver(@RequestParam("i") int i){
        if (i==0){
            throw new BusinessException(600,"自定义业务错误");
        }
        throw new ValidationException();

    }

}
