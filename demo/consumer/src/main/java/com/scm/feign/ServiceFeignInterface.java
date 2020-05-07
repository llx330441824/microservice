package com.scm.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author linlx
 * @Date 2020/4/28 18:03
 * @Description
 **/
@FeignClient(value = "SERVICE",fallbackFactory = ServiceFeignInterfaceFallback.class)
public interface ServiceFeignInterface{

    @RequestMapping("service/helloService")
    String helloService();

    @RequestMapping("service/testFallback")
    String testFallback();
}
