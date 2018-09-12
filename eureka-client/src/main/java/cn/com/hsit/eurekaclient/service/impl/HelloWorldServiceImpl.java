package cn.com.hsit.eurekaclient.service.impl;

import cn.com.hsit.eurekaclient.service.IHelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements IHelloWorld {
    @Override
    public String sayHello(String port) {
        return "hello world ,"+port;
    }
}
