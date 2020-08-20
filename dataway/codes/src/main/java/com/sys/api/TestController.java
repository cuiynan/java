package com.sys.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2020/5/9 18:19
 * @desc :
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        return "hello";
    }
}
