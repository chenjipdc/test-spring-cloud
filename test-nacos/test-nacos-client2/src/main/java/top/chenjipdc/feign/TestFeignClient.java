package top.chenjipdc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import top.chenjipdc.command.UserCommand;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-01 17:03
 */
@FeignClient("test-nacos-client1")
public interface TestFeignClient {

    @GetMapping("/user/{userId}")
    String info(@PathVariable Long userId);

    @PostMapping("/user/create")
    String create(UserCommand userCommand);

}
