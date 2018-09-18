package cn.com.hsit.zipkinservicetwo;

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
public class ZipkinServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceTwoApplication.class, args);
	}

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @RequestMapping("/test3")
    public String sayHi(){
        return "sya hi service two";
    }

    @RequestMapping("/test4")
    public String sayHello(){
        return restTemplate.getForObject("http://localhost:8012/test1", String.class);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
