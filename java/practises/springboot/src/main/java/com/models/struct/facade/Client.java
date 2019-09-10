package com.models.struct.facade;

/**
 * 我要建房，直接调用门面或者总包工头便可，剩余不用操心。
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new ConcreteFacade();
        facade.buildHourse();
    }

}