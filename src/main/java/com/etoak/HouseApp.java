package com.etoak;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.etoak.mapper")
public class HouseApp {

    public static void main(String[] args) {
        SpringApplication.run(HouseApp.class, args);
    }
}


