package com.yc.ifav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@SpringBootApplication
@EnableEurekaServer   //启用 eureka服务器
public class EurekaHaConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHaConfigApp.class, args);
    }
}
