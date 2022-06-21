package com.jayczee.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 该注解从application文件中读取配置项
 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driveClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriveClassName() {
        return driveClassName;
    }

    public void setDriveClassName(String driveClassName) {
        this.driveClassName = driveClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
