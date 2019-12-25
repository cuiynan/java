package com.commons;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {
    /**
     * 使用md5的算法进行加密
     */
    public static String md5(String key) throws NoSuchAlgorithmException {
        byte[] secretBytes = null;
        secretBytes = MessageDigest.getInstance("md5").digest(key.getBytes());
        // 16进制数字
        String md5code = new BigInteger(1, secretBytes).toString(16);
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

    public static void main(String[] args) {
        try {
            System.out.println(md5("1234"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
