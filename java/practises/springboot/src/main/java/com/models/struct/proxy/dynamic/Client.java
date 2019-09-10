package com.models.struct.proxy.dynamic;

/**
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
//        Class<?> proxyClass = Proxy.getProxyClass(Bank.class.getClass().getClassLoader(), new Class[]{Bank.class});


        BanckInvocationHandler handler = new BanckInvocationHandler();
        Bank proxy = (Bank) handler.bind(new ProxyPerson());

        //存入
        proxy.saveMoney(20);

        //查询
        proxy.checkMoney();
    }
}
