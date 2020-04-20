package com.example.demo.mapper;

import com.example.demo.pojo.CrtUser;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Results({
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "userLoginName", column = "USER_LOGINNAME"),
            @Result(property = "userPassword", column = "USER_PASSWORD")
    })
    @Select("SELECT * FROM CRT_USER WHERE USER_ID = #{id}")
    CrtUser queryById(@Param("id") int id);

    @Select("SELECT COUNT(1) FROM CRT_USER WHERE USER_LOGINNAME = #{userName} AND USER_PASSWORD = #{pwd}")
    Integer countByNameAndPwd(@Param("userName") String userName, @Param("pwd") String pwd);
}
