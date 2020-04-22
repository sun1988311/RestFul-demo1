package com.example.demo.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix="com.example")
public class CoExample {

    private int age;
    private String name;
    private List<String> address;


}