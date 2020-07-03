package top.chenjipdc.controller;

import org.springframework.web.bind.annotation.*;
import top.chenjipdc.command.UserCommand;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-01 16:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userId}")
    public String info(@PathVariable Long userId){
        return userId.toString();
    }

    @PostMapping("/create")
    public String create(@RequestBody UserCommand userCommand){
        return userCommand.toString();
    }
}
