package cn.com.hsit.servicefeign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sumx
 * feign 服务
 */
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "cn.com.hsit")
public class ServiceFeignApplication {
    private static final Logger logger = LoggerFactory.getLogger(ServiceFeignApplication.class);
	public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ServiceFeignApplication.class, args);

        //所有的bean,参考：http://412887952-qq-com.iteye.com/blog/2314051
        String[] beanNames = ctx.getBeanDefinitionNames();
        //String[] beanNames = ctx.getBeanNamesForAnnotation(RestController.class);//所有添加该注解的bean
        logger.info("bean总数:{}", ctx.getBeanDefinitionCount());
        System.out.println("bean总数:"+ ctx.getBeanDefinitionCount());
        int i = 0;
        for (String str : beanNames) {
            System.out.println(str);
            logger.info("{},beanName:{}", ++i, str);
        }

    }
}
