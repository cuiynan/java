package com.commons;

/**
 * @author : cuiyingnan
 * @date : 2019/12/23 10:10
 * @desc :
 */
public class MyStringUtils {

    /**
     * 得到. 后边扩展名
     *
     * @param fileName
     * @return
     */
    public static String getLastPrefix(String fileName) {
        String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
        return "." + prefix;
    }


    public static void main(String[] args) {
        System.out.println(getLastPrefix("aa.abb.cc"));
    }
}
