package com.APIManager.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.APIManager.bean.User;
import com.APIManager.bean.UserExample;

public interface UserService {

	int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer ulId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer ulId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getUsers();
    
    int getUserCount();
}
