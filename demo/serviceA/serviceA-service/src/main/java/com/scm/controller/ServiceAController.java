package com.scm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linlx
 * @Date 2020/4/26 17:02
 * @Description
 **/
@RestController
@RequestMapping("/service")
public class ServiceAController {

    @RequestMapping("/helloService")
    public String helloServiceA(){
        return "helloServiceA";
    }
}
