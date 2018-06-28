package io.honeymon.springboot.multi.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * @author jiheon.kim on 2018. 5. 11.
 */
@Slf4j
@Service
public class SimpleService {
    private Environment environment;

    @Value("${a.name}")
    private String aName;

    @Value("${b.name}")
    private String bName;

    @Value("${c.name}")
    private String cName;

    @Value("${device.username}")
    private String username;

    public SimpleService(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    public void setUp() {
        log.debug("Profiles: {}", Arrays.asList(environment.getActiveProfiles()));
        log.debug("A name: {}", aName);
        log.debug("B name: {}", bName);
        log.debug("C name: {}", cName);
        log.debug("Username: {}", username);
    }
}
