package com.cc.controller;

import com.cc.utils.ThreadLocalTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2020/5/14 10:33
 * @desc :
 */
@RestController
public class ThreadLocalController {

    /**
     * set值 在aop log中，测试threadlocal传递
     * @return
     */
    @RequestMapping("t")
    public Integer get() {
        int i = ThreadLocalTest.getThreadLocal().get();
        ThreadLocalTest.getThreadLocal().set(i+1);
        return i;
    }


}
