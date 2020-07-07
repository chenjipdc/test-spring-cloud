package top.chenjipdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjipdc@gmail.com
 * @date 2020/7/7 3:01 下午
 */
@SpringBootApplication
public class TestLblApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestLblApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
