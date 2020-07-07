package top.chenjipdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chenjipdc.command.UserCommand;
import top.chenjipdc.feign.TestFeignClient;
import top.chenjipdc.properties.TestProperties;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-01 17:00
 */
@RestController
@RequestMapping("/test")
@EnableConfigurationProperties(TestProperties.class)
@RefreshScope
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

    /**
     * properties 不需要@RefreshScope就会刷新
     */
    @Autowired
    private TestProperties testProperties;

    /**
     * value 就需要@RefreshScope刷新
     */
    @Value("${test.name}")
    private String name;

    @Value("${test.age}")
    private String age;

    @GetMapping("/info")
    public void testInfo() {
        System.out.println(testFeignClient.info(100L));
    }

    @PostMapping("/create")
    public void testCreate() {
        System.out.println(testFeignClient.create(new UserCommand("pdc",
                "chenjipdc@gmail.com",
                "12345678900")));
    }

    @GetMapping("/name")
    public String testName() {
        return name;
    }

    @GetMapping("/age")
    public String testAge() {
        return age;
    }

    @GetMapping("/properties")
    public TestProperties testProperties(){
        return testProperties;
    }
}
