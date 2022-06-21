package com.jayczee.controller;

import com.jayczee.pojo.User;
import com.jayczee.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @GetMapping("hello")
    public String hello(){
        log.debug("数据源信息："+dataSource);
        return "Hello SpringBoot";
    }

    @GetMapping("testGet/{id}")
    public User testGet(@PathVariable int id){
        User user= userService.findById(id);
        System.out.println(user);
        return user;
    }
}
