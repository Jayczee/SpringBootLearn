package com.jayczee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SpringBoot的启动类，入口类
 */
@SpringBootApplication
//扫描mapper接口
@MapperScan(basePackages = "com.jayczee.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
