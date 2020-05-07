package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author linlx
 * @Date 2020/4/26 16:35
 * @Description
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceB_app {
    public static void main(String[] args) {
        SpringApplication.run(ServiceB_app.class, args);
    }
}
