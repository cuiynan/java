package com.cc.java;

import java.util.regex.Pattern;

/**
 * @author : cuiyingnan
 * @date : 2019/10/8 14:03
 * @desc :
 */
public class PatternTest {

    public static void main(String[] args) {
        String source = "1001|";
        String pattern = "1001|2002";

        System.out.println(source);
        System.out.println(pattern);
        boolean result = Pattern.matches(pattern, source);
        System.out.println(result);
    }
}
