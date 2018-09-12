package cn.com.hsit.controller;

import cn.com.hsit.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/hi")
    public String sayHello(){
        return helloWorldService.doHelloWorld();
    }

}
