package com.cc.controller;

import com.cc.aop.AuthorityAnnotation;
import com.cc.vo.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName TestController
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/14 15:44
 **/
@RequestMapping("test")
@RestController
public class TestController {

    @GetMapping()
    public User test() {
        User user = new User();
        user.setUid("1");
        user.setName("dfa");
        return user;
    }


    @PostMapping()
    public User post(@RequestBody User user) {
        return user;
    }

    @DeleteMapping
    public void delete(@RequestBody String id) {
        System.out.println("id=" + id);
    }

    @GetMapping("a")
    @AuthorityAnnotation(source = "/test/a", interfaceName = "测试接口")
    public User a() {
        User user = new User();
        user.setUid("1");
        user.setName("dfa");
        int a = 1 / 0;
        return user;
    }
}
