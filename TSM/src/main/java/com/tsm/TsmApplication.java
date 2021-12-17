package com.tsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tsm.mapper")
@MapperScan("com.tsm.mapper.voMapper")
public class TsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsmApplication.class, args);
    }

}
