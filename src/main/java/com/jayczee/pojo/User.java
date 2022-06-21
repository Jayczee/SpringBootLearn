package com.jayczee.pojo;

import lombok.Data;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data//包含constructor getter setter  tostring gethash等等方法
@Table(name = "userinf")
public class User {
    //使用tk mybatis 下面的数据类型一定要是包装类
    @Id
    @KeySql(useGeneratedKeys = true)//主键回填 插入数据后将生成的主键ID值返回
    private Integer id;
    private String uid;
    private String pwd;
    private String username;

}
