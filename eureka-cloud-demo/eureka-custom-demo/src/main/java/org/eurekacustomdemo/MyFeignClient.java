package org.eurekacustomdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-provider-demo")
public interface MyFeignClient {
    @RequestMapping("/hello")
    String hello();
}
