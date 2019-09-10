package com.springsource.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;


/**
 * 利用字节流进行动态代理，据说spring aop就是使用此方式进行的，后期继续看源码。
 */
public class CglibTest {

    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d:\\");

        ProxyDao proxyDao = new ProxyDao();
        Dao dao = (Dao) proxyDao.getProxy(Dao.class);
        dao.select();
        dao.delete();

    }
}
