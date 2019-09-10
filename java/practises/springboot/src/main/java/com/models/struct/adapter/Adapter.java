package com.models.struct.adapter;

import java.util.*;

/**
 * 
 */
public class Adapter implements Target {


    /**
     * 
     */
    @Override
    public void c() {
        System.out.println("我不会C");
    }

    /**
     * 
     */
    @Override
    public void java() {
        System.out.println("我刚开始入门java");
    }

    /**
     * 
     */
    @Override
    public void python() {
        System.out.println("我会python");
    }

}