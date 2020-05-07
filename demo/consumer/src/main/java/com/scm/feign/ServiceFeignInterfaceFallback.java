package com.scm.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author linlx
 * @Date 2020/5/4 9:31
 * @Description
 **/
@Component
public class ServiceFeignInterfaceFallback implements FallbackFactory<ServiceFeignInterface> {

    @Override
    public ServiceFeignInterface create(Throwable throwable) {
        return new ServiceFeignInterface() {
            @Override
            public String helloService() {
                return "test fallback";
            }

            @Override
            public String testFallback() {
                return "test fallback";
            }
        };
    }
}
