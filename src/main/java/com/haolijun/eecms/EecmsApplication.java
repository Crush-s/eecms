package com.haolijun.eecms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haolijun.eecms.dao")
public class EecmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EecmsApplication.class, args);
    }

}
