package com.caesar.kmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.caesar.kmall.user.mapper")
public class KmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(KmallUserApplication.class, args);
    }

}
