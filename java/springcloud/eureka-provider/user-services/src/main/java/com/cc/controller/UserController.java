package com.cc.controller;

import com.cc.api.UserApi;
import com.cc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:26
 * @desc :
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserApi userImpl;

    @GetMapping
    public List<User> getUsers() {
        return userImpl.getUsers();
    }

    @PostMapping
    public boolean getUsers(@RequestBody User user) {
        return userImpl.saveUser(user);
    }
}
