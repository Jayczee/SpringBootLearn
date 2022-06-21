package com.jayczee.service;

import com.jayczee.mapper.UserMapper;
import com.jayczee.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    //根据id查询
    public User findById(int id){
        return userMapper.selectByPrimaryKey(id);
    }
    @Transactional//事务 增删改
    //新增保存用户
    public void saveUser(User user){
        //选择性新增，空属性不会出现在insert语句中
        userMapper.insertSelective(user);
    }
}
