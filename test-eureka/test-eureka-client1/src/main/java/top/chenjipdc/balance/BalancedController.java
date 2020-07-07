package top.chenjipdc.balance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjipdc@gmail.com
 * @date 2020/7/7 2:33 下午
 */
@RestController
@RequestMapping("/balanced")
public class BalancedController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/port")
    public Integer getPort(){
        return port;
    }

}
