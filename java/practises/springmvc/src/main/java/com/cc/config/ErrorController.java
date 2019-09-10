package com.cc.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2019/8/21 14:22
 * @desc :
 */
@RestController
public class ErrorController {

    @GetMapping("/404.html")
    public String pageNotFound() {
        return "客官儿，404啦";
    }

    @GetMapping("/500.html")
    public String sysError() {
        return "客官儿，500啦";
    }
}
