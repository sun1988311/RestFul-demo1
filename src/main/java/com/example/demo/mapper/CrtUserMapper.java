package com.example.demo.mapper;

import com.example.demo.pojo.CrtUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface CrtUserMapper {

    CrtUser queryById(Long userId);

    Integer countByNameAndPwd(@Param("userName") String userName, @Param("pwd") String pwd);
}
