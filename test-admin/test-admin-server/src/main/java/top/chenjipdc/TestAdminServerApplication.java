package top.chenjipdc;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenjipdc@gmail.com
 * @date 2020/9/17 1:53 下午
 */
@SpringBootApplication
@EnableAdminServer
public class TestAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestAdminServerApplication.class, args);
    }
}
