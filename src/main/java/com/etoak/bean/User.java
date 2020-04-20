package com.etoak.bean;


import lombok.Data;

@Data
/**
 * Created by 18474 on 2020/4/20.
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String gender;
    private Integer age;
    private String birthday;

}
