package com.cc.controller;

import com.cc.utils.ThreadLocalTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2020/5/14 10:33
 * @desc :
 */
@RestController
@Slf4j
public class ThreadLocalController {

    /**
     * set值 在aop log中，测试threadlocal传递
     *
     * @return
     */
    @RequestMapping("t")
    public Integer get() {
        int i = ThreadLocalTest.getThreadLocal().get();
        log.info(String.format("本次获得threadlocal 值为 %d ", i));
        ThreadLocalTest.getThreadLocal().set(i + 111);

        log.info(String.format("输出字符 %s","a"));
        log.info(String.format("输出布尔型 %b",1>0));
        log.info(String.format("输出整数 %d",10));
        log.info(String.format("输出浮点数 %f",10f));

        return ThreadLocalTest.getThreadLocal().get();
    }


}
