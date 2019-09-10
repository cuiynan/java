package com.cc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2019/8/21 10:13
 * @desc :
 */
@RestController
public class TestController {

    @GetMapping("hi")
    public String hi() {
        return "hello world";
    }

}
