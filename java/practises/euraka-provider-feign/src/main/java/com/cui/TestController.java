package com.cui;

import com.cui.entity.User;
import com.cui.services.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/28 9:31
 **/
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    ITest testImpl;

    @GetMapping("")
    public void test() {
        testImpl.test();
    }

    @PostMapping("")
    public User save(@RequestBody User user) {
        return testImpl.save(user);
    }
}
