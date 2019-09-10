package com.models.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BanckInvocationHandler implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println();
        System.out.println("开始 代理 真实对象");

        Object result = method.invoke(target, args);

        System.out.println();
        System.out.println("代理 对象  已完成");
        System.out.println(result);
        return result;
    }

}
