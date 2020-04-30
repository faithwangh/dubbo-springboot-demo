package com.example.dubboconsumerservice.controller;

import com.example.common.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "${consumer.service.version}")
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHi();
    }
}
