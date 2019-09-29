package com.cc.java;

/**
 * @author : cuiyingnan
 * @date : 2019/8/27 8:57
 * @desc :
 */
public class StringTest {


    public static void main(String[] args) {
        String a = "a";
        String b = new String("a");
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.gc();
    }

    public static void hash(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String(s2);
        char[] x = new char[s2.length()];
        s2.getChars(0,s2.length(),x,0);
        System.out.println(s1.hashCode());
        System.out.println(x);
        System.out.println(x.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s4 == s3);

    }
}
