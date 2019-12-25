package com.commons;

import java.util.UUID;

/**
 * @author : cuiyingnan
 * @date : 2019/12/25 15:31
 * @desc : 生成惟一码
 */
public class UUIDUtils {
    /**
     * 生成32位uuid
     * @return
     */
    public static String random() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(random());
    }
}
