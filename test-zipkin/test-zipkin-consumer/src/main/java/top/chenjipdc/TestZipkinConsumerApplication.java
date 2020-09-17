package top.chenjipdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenjipdc@gmail.com
 * @date 2020/9/17 2:08 下午
 */
@SpringBootApplication
@EnableFeignClients
public class TestZipkinConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestZipkinConsumerApplication.class, args);
    }
}
