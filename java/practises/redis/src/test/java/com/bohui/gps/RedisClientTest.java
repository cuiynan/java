package com.bohui.gps;

import com.bohui.gps.common.IRedis;
import com.bohui.gps.entity.Address;
import com.bohui.gps.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisClientTest {

    @Autowired
    IRedis redisClient;

    @Test
    public void set() {
        User user = new User();
        user.setId("tongbu");
        user.setName("姓名");
        user.setPwd("pwd");

        Address add = new Address();
        List addrList = new ArrayList();
        addrList.add("1234");
        addrList.add("1234地址啊");
        addrList.add("12345");
        add.setAddrList(addrList);

        user.setAddr(add);
        //redisUtil.set(user.getId(), user,10);
        redisClient.set(user.getId(), user);
    }


    @Test
    public void get() {
        Object str = redisClient.get("user1");
        if (str instanceof User) {
            User user = (User) str;
            System.out.println(user.getName());
            Address address = user.getAddr();
            System.out.println(address.getAddrList());
        }
    }
}