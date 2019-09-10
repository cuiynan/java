package com.models.struct.adapter;

/**
 * 只要有最底层实现，在接口层直接进行调用，非常爽。
 * 易于扩展
 */
public class Client {
    public static void main(String[] args) {
        Target adaptee = new Adaptee();
        Target adapter = new Adapter();
        Target other = new Other();

        adaptee.c();
        adaptee.java();
        adaptee.python();

        adapter.c();
        adapter.java();
        adapter.python();

        other.c();
        other.java();
        other.python();

    }
}
