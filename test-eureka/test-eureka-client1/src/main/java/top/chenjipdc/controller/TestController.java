package top.chenjipdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chenjipdc.command.UserCommand;
import top.chenjipdc.feign.TestFeignClient;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-01 17:00
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

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
}
