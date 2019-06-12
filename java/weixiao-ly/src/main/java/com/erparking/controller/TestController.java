package com.erparking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/15 18:50
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("")
    public String test(){
        System.out.println("here is run");
        return "hello";
    }
}
