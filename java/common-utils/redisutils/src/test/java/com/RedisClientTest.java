package com;

import com.test.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : cuiyingnan
 * @date : 2019/11/21 15:17
 * @desc :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisClientTest {

    @Autowired
    IRedis redisClient;

    @Test
    public void get() {
        UserTest userTest = UserTest.builder().username("1234").password("234").build();
        redisClient.set("user", userTest);
        Object obj = redisClient.get("user");
        if (obj instanceof UserTest){
            UserTest result = (UserTest)obj;
            System.out.println(result);
        }
    }

    @Test
    public void set() {

    }
}