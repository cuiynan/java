package com.cc.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/8 17:28
 **/
@Component
public class SpringBootAsyncDo {
    /**
     * 置后处理
     */
    @Async
    void testSync(StringBuffer str) throws InterruptedException {
        Thread.sleep(3000);
        str.append( "  done \n  ");
        System.out.println("------------done");
    }
}
