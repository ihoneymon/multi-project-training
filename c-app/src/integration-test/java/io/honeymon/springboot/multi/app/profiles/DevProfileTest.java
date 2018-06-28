package io.honeymon.springboot.multi.app.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiheon.kim on 2018. 6. 28.
 */
@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DevProfileTest {

    @Autowired
    Environment env;

    @Test
    public void test() {
        assertThat(Arrays.asList(env.getActiveProfiles()))
                .contains("dev", "a-dev", "b-dev", "auth-dev", "device-dev")
                .doesNotContain("beta", "a-beta", "b-beta", "auth-beta", "device-beta")
                .doesNotContain("major", "a-major", "b-major", "auth-major", "device-major");
    }
}
