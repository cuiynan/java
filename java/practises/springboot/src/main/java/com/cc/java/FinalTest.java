package com.cc.java;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/10/24 9:15
 * @desc :
 */
public class FinalTest {

    /**
     * 不可变对象，JVM内置基本类型
     */
    final static int a = 1;

    /**
     * 可变对象MAP/LIST
     */
    final static Map<Integer, Integer> map = new HashMap<>();
    /**
     * 不可变对象 MAP/LIST
     * 如果后续代码对此对象操作，会返回UnsupportedOperationException异常，并终止程序运行。
     */
    private final static ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4);
    private final static ImmutableSet set = ImmutableSet.copyOf(list);
    private final static ImmutableMap<Integer, String> maps = ImmutableMap.<Integer, String>builder().put(1, "2").put(2, "3").build();

    /**
     * 可变对象
     */
    final static User user = new User();

    static {
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);

        //使用下方修饰后，map将为不可变对象，如果后续代码对此对象操作
        // 会返回UnsupportedOperationException异常，并终止程序运行。
        // map = Collections.unmodifiableMap(map);
        user.setId("1");
    }

    public static void main(String[] args) {
        map.put(1, 32323);//灰常明显final map已更改
        user.setId("2222");//灰常明显final map已更改

        System.out.println(map);
        System.out.println(user);
    }
}


