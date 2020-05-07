package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author linlx
 * @Date 2020/5/6 15:29
 * @Description
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard_app {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_app.class, args);
    }
}
