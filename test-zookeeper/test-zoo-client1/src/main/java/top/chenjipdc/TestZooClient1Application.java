package top.chenjipdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestZooClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(TestZooClient1Application.class,
                args);
    }

}
