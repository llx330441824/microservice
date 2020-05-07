package com.scm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author linlx
 * @Date 2020/4/26 17:05
 * @Description
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient("ribbon")
@EnableFeignClients
@EnableCircuitBreaker
public class Consumer_app {

    public static void main(String[] args) {
        SpringApplication.run(Consumer_app.class, args);
    }
}
