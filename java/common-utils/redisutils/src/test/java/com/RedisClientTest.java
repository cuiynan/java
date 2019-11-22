package com;

import com.test.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        List list = new ArrayList<>();
        list.add(userTest);
        list.add(userTest);
        list.add(userTest);

        redisClient.lSet("1", list);

        long a = redisClient.lGetListSize("1");
        Object obj = redisClient.lGet("1", 0, a);
        if (obj instanceof List) {

            List result = (List) obj;

            System.out.println(result);
        }
    }

    @Test
    public void set() {

    }
}