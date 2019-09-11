package com.cc.service;

import com.cc.api.UserApi;
import com.cc.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:21
 * @desc :
 */
@Service
@Slf4j
public class UserImpl implements UserApi {
    @Override
    public List<User> getUsers(@PathVariable("id") String id) {
        System.out.println("here is run");
        List list = new ArrayList();
        list.add(new User(" 传入 ID是：", id));
        list.add(new User("入地", "18612526681"));
        list.add(new User("封神", "18612526681"));
        return list;
    }

    @Override
    public boolean saveUser(@RequestBody User user) {
        log.info("保存用户成功", user);
        return true;
    }
}
