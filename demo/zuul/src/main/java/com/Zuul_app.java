package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author linlx
 * @Date 2020/5/2 8:29
 * @Description
 **/
@SpringBootApplication
@EnableZuulProxy
public class Zuul_app {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_app.class, args);
    }
}
