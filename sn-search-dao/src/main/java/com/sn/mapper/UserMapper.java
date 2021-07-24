package com.sn.mapper;

import com.sn.pojo.User;
import com.sn.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);


    User selectByPrimaryKey(String username);

    int updateBypassword(@Param("password") String password, @Param("username") String username);

     String selectPwd(@Param("username") String username);



}