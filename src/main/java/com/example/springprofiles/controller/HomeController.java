package com.example.springprofiles.controller;

import com.example.springprofiles.service.goodbye.GoodbyeService;
import com.example.springprofiles.service.hello.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private HelloService helloService;
    private GoodbyeService goodbyeService;

    // Add @Qualifier("groovy") to the goodbye service to activate the other service
    public HomeController(HelloService helloService, GoodbyeService goodbyeService) {
        this.helloService = helloService;
        this.goodbyeService = goodbyeService;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return helloService.sayHello();
    }

    @RequestMapping("/goodbye")
    public String sayGoodbye() {
        return goodbyeService.sayGoodbye();
    }
}
