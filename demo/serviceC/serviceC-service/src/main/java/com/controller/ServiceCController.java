package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linlx
 * @Date 2020/4/26 17:02
 * @Description
 **/
@RestController
@RequestMapping("/service")
public class ServiceCController {

    @RequestMapping("/helloService")
    public String helloServiceC(){
        return "helloServiceC";
    }
}
