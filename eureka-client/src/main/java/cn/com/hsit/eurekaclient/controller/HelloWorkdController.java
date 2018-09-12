package cn.com.hsit.eurekaclient.controller;

import cn.com.hsit.eurekaclient.service.IHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorkdController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private IHelloWorld helloWorld;

    @RequestMapping("/hello")
    public String hello(){
        return helloWorld.sayHello(port);
    }
}
