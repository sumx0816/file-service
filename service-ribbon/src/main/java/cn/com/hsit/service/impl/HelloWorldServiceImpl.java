package cn.com.hsit.service.impl;

import cn.com.hsit.service.HelloWorldService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public String doHelloWorld() {

        return restTemplate.getForObject("http://EUREKA-CLIENT/hello", String.class);
    }

    public String fallback(){
        return "server error";
    }
}
