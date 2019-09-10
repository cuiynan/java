package com.cui.services;

import com.cui.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/27 17:00
 **/
@Component
public class TestImpl implements ITest {
    @Override
    public void test() {
        System.out.println("here is test");
    }

    @Override
    public User save(User user) {
        System.out.println(user);
        user.setName("----------变更喽-------");
        System.out.println("-----保存成功------");
        return user;
    }
}
