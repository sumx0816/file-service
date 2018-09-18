package cn.com.hsit.zipkinserviceone;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceOneApplication.class, args);
	}

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @RequestMapping("/test1")
    public String sayHi(){
        return "sya hi service one";
    }

    @RequestMapping("/test2")
    public String sayHello(){
        return restTemplate.getForObject("http://localhost:8013/test3", String.class);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
