package com.cc.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/6/13 9:37
 * @desc :
 */
public class TestFinal {

    private final static Map map;
    private final static String str;
    private final static StringBuffer stringBuffer;


    static {
        map = new HashMap<>();
        stringBuffer = new StringBuffer();
        str = "";
    }

    public static void main(String[] args) {
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        System.out.println("ok");
        map.put("a", "a");
        System.out.println("yeah");

        map.clear();
        System.out.println("hehe");

        Map tmp = new HashMap();


        //str不能再重新赋值
        //str = "a";

        //本对象可以继续操作，但在内存中不能将指针再切换到其它位置
        stringBuffer.append("ssafkas");
        stringBuffer.append("ssafkas;");
    }
}
