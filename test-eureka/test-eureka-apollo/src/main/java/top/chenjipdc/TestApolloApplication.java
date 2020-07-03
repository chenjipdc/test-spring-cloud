package top.chenjipdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApolloApplication.class,
                args);
    }

}
