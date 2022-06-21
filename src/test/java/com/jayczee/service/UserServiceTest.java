package com.jayczee.service;

import com.jayczee.pojo.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest //SpringBoot中测试需要添加该注解
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @org.junit.Test
    public void findById() {
        System.out.println(userService.findById(3));
    }

    @org.junit.Test
    public void saveUser() {
        User user=new User();
        user.setUid("test999");
        user.setPwd("test897");
        user.setUsername("test66");
        userService.saveUser(user);
    }
}