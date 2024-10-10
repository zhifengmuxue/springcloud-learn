package org.eurekacustomdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final MyFeignClient myFeignClient;

    @Autowired
    public ConsumerController(MyFeignClient myFeignClient) {
        this.myFeignClient = myFeignClient;
    }

    @RequestMapping("/hello")
    public String hello() {
        return myFeignClient.hello();
    }
}
