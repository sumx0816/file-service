package cn.com.hsit.servicefeign.controller;

import cn.com.hsit.servicefeign.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private IHelloWorldService helloWorldService;

    @RequestMapping("/hi")
    public String sayHello(){
        return helloWorldService.sysHello();
    }

}
