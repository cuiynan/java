package com.springsource.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyDao implements MethodInterceptor {

    Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("——————————————————————————");
        System.out.println("可以插入一部分其它功能！");
        System.out.println("开始代理 原始对象！");

        Object result = proxy.invokeSuper(obj, args);

        System.out.println("结束代理原始对象！");
        System.out.println("可以插入一部分其它功能！");
        return result;
    }
}
