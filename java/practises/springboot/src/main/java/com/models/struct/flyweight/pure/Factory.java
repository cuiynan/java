package com.models.struct.flyweight.pure;

import java.util.*;

/**
 *
 */
public class Factory {

    private static Hashtable flyweight;

    static {
        flyweight = new Hashtable();
        FlyWeight black = new BlackFlyWeight();
        FlyWeight red = new RedFlyWeight();
        flyweight.put("black", black);
        flyweight.put("red", red);
    }


    /**
     * @param key
     * @return
     */
    public static FlyWeight getFlyWight(String key) {
        return (FlyWeight) flyweight.get(key);
    }

}