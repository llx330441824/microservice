package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author linlx
 * @Date 2020/4/25 10:15
 * @Description
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceA_app {
    public static void main(String[] args) {
        SpringApplication.run(ServiceA_app.class, args);
    }
}
