package cn.com.hsit.servicefeign.service;

import cn.com.hsit.servicefeign.component.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="eureka-client", fallback = SchedualServiceHiHystric.class)
public interface IHelloWorldService {

    /**
     * 定义访问服务
     * @return
     */
    @RequestMapping("/hello")
    String sysHello();
}
