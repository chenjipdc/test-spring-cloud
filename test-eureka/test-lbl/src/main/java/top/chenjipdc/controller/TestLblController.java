package top.chenjipdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author chenjipdc@gmail.com
 * @date 2020/7/7 3:02 下午
 */
@RestController
@RequestMapping("/lbl")
public class TestLblController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/port")
    public Integer port(){
        return restTemplate.getForObject(URI.create("http://" + "test-eureka-client1" + "/balanced/port"), Integer.class);
    }

}
