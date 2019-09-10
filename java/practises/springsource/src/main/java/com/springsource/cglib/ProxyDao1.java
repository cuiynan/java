package com.springsource.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyDao1 implements MethodInterceptor {

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
        System.out.println("下一位请登台发言！");

        Object result = proxy.invokeSuper(obj, args);

        System.out.println("大家掌声鼓励！");
        return result;
    }
}
