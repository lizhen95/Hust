package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;
import com.cn.hnust.pojo.canshu;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(canshu cs);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}