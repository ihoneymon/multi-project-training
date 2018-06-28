package io.honeymon.springboot.multi.app.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiheon.kim on 2018. 5. 30.
 */
@Data
@ConfigurationProperties("auth")
public class AuthProperties {
    private String token;
}
