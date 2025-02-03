package com.starfinder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.starfinder.mapper")
public class StarFinderApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarFinderApplication.class, args);
    }
}