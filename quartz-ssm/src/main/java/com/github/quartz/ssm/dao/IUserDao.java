package com.github.quartz.ssm.dao;

import com.github.quartz.ssm.entity.User;

public interface IUserDao {
    
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUser(User user);
}