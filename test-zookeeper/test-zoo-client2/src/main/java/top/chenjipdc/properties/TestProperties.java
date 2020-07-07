package top.chenjipdc.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-07-03 10:19
 */
@Data
@ConfigurationProperties(prefix = "test")
public class TestProperties {

    private String name;
    private Integer age;
}
