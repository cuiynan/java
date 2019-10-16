package com.cc.java;

import java.util.Arrays;

/**
 * @author : cuiyingnan
 * @date : 2019/8/27 8:57
 * @desc :
 */
public class StringTest {


    public static void main(String[] args) {
        listarray();
    }


    public static void listarray() {
        int[] str1 = {1, 2, 3};
        int[] str2 = {4, 5, 6};
        int[] str3 = {};

        str3 = expandsArr(str1, str3);

        str3 = expandsArr(str2, str3);

        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }

    }

    private static int[] expandsArr(int[] source, int[] target) {
        target = Arrays.copyOf(target, source.length + target.length);
        System.arraycopy(source, 0, target, target.length - source.length, source.length);
        return target;
    }

    public static void hash() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String(s2);
        char[] x = new char[s2.length()];
        s2.getChars(0, s2.length(), x, 0);
        System.out.println(s1.hashCode());
        System.out.println(x);
        System.out.println(x.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s4 == s3);


    }
}
