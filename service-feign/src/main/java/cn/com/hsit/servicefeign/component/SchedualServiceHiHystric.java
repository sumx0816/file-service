package cn.com.hsit.servicefeign.component;

import cn.com.hsit.servicefeign.service.IHelloWorldService;
import org.springframework.stereotype.Component;


@Component
public class SchedualServiceHiHystric implements IHelloWorldService {

    @Override
    public String sysHello() {
        return "system error 11";
    }
}
