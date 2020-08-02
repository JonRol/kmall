package com.caesar.kmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.caesar.kmall.user.mapper")
public class KmallUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(KmallUserApplication.class, args);
    }

}
