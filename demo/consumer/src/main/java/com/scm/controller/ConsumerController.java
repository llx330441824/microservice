package com.scm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.scm.feign.ServiceFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author linlx
 * @Date 2020/4/26 17:01
 * @Description
 **/
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ServiceFeignInterface serviceFeignInterface;

    @RequestMapping("/testRibbon")
    @HystrixCommand(fallbackMethod = "testException")
    public String testRibbon(){
        return serviceFeignInterface.helloService();
        // return restTemplate.getForObject("http://SERVICE/service/helloService", String.class);
    }

    public String testException(){
        return "RuntimeException";
    }

    @RequestMapping("/testFallback")
    public String testFallback(){
        return serviceFeignInterface.testFallback();
    }


}
