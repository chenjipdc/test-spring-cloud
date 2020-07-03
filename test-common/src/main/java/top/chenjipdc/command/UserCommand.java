package top.chenjipdc.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-01 16:39
 */
@Data
@AllArgsConstructor
public class UserCommand {

    private String name;
    private String email;
    private String phone;
}
