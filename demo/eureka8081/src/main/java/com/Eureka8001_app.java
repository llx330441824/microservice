package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author linlx
 * @Date 2020/4/23 8:13
 * @Description
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka8001_app {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8001_app.class, args);
    }
}
