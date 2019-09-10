package com.cui.springcloudfeign;

import com.cc.servies.Test2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@EnableFeignClients(basePackages = {"com"})
public class SpringcloudFeignApplicationTests {

    @Autowired
    Test2 test2;

    /**
     * 验证feign使用service时，必须将provider 与 provider-api分离。
     * 否则启动不了或者启动后访问服务报404错误。
     */
    @Test
    public void contextLoads() {
        System.out.println(test2.save("3434"));
    }

}
