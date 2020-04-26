package com.example.demo.service;

import com.example.demo.mapper.CrtUserMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.CrtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CrtUserMapper crtUserMapper;

    public boolean isExist(String userName, String pwd){

        return this.crtUserMapper.countByNameAndPwd(userName, pwd) > 0;
    }

    public CrtUser getCrtUser(Long userId){

        return this.crtUserMapper.queryById(userId);
    }
}
