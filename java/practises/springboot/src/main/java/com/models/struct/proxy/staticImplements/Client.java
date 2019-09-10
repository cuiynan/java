package com.models.struct.proxy.staticImplements;

/**
 *  这里是静态代理类的实现
 */
public class Client {

    public static void main(String[] args) {
        StarProxy starProxy =  new StarProxy();
        starProxy.setSar(new YueDui());
        starProxy.sing();
    }

}