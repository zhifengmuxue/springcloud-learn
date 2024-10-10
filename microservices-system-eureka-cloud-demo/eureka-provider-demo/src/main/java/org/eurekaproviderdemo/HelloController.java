package org.eurekaproviderdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${provider}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from " + name + ":" + port;
    }
}
