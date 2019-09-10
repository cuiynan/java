package com.cc.eurekaconsumer.controller;


import com.cc.api.UserApi;
import com.cc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/30 10:07
 * @desc :
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserApi userApi;

    @GetMapping
    public List<User> getUsers() {
        return userApi.getUsers();
    }

    @PostMapping
    public boolean getUsers(@RequestBody User user) {
        return userApi.saveUser(user);
    }
}
