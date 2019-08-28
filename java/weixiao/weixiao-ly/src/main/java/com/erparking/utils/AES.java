package com.erparking.utils;

import com.erparking.config.Constants;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {
    private final static String cKey = Constants.appKey;
    private final static String cIv = Constants.secretKey;

    /**
     * 加密
     */
    public static String pack(String source) throws Exception {
        return AES.Encrypt(source, cKey, cIv);
    }

    /**
     * 解密
     */
    public static String unPack(String source) throws Exception {
        return AES.Decrypt(source, cKey, cIv);
    }

    public static void main(String args[]) throws Exception {
        String cSrc = "{\"code\":\"0\",\"error_msg\":\"密码错误\",\"weixiao_openid\":\"12345678\",\"student_num\":\"888888888888\",\"name\":\"洪丹丹测试\",\"sign\":\"5C6E844C23C8F0C15AF382081D0663DC\"}";
        String pack = pack(cSrc);
        System.out.println(pack);
        System.out.println(unPack(pack));
    }

    public static String Encrypt(String sSrc, String sKey, String sIv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        int blockSize = cipher.getBlockSize();
        byte[] dataBytes = sSrc.getBytes();
        int plaintextLength = dataBytes.length;
        if (plaintextLength % blockSize != 0) {
            plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
        }
        byte[] plaintext = new byte[plaintextLength];
        System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
        SecretKeySpec keyspec = new SecretKeySpec(sKey.getBytes(), "AES");
        IvParameterSpec ivspec = new IvParameterSpec(sIv.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
        byte[] encrypted = cipher.doFinal(plaintext);
        return byte2hex(encrypted).toLowerCase();
    }

    public static String Decrypt(String sSrc, String sKey, String sIv) throws Exception {
        byte[] encrypted1 = hex2byte(sSrc);
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        SecretKeySpec keyspec = new SecretKeySpec(sKey.getBytes(), "AES");
        IvParameterSpec ivspec = new IvParameterSpec(sIv.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original);
        return originalString;
    }

    public static byte[] hex2byte(String strhex) {
        if (strhex == null) {
            return null;
        }
        int l = strhex.length();
        if (l % 2 == 1) {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2),
                    16);
        }
        return b;
    }

    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }

        return hs.toUpperCase();
    }
}