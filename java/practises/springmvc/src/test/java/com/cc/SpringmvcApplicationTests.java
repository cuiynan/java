package com.cc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringmvcApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("=========" + new ApplicationPid());
    }

}
