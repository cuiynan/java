package com.cc.utils;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : cuiyingnan
 * @date : 2020/5/14 14:03
 * @desc :
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ThreadLocalTest {

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static ThreadLocal<Integer> getThreadLocal() {
        return threadLocal;
    }
}
