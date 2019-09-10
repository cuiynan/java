package com.cui.string;

import java.util.Objects;

/**
 * @author : cuiyingnan
 * @date : 2019/8/1 13:49
 * @desc :
 */
public class CCStringUtils {


    /**
     * 获得组合串中第一个串，如：
     * -1234-123  返回1234
     * 1234-1233   返回1234
     */
    public static String getFirstSymptomCode(String str, String sparator) {
        String symptom = "";
        if (str.contains(sparator)) {
            int index = 0;
            if (str.startsWith(sparator)) {
                index = 1;
            }
            //string#slit入参为正则，性能比较弱鸡
            String[] stringArr = org.springframework.util.StringUtils.delimitedListToStringArray(str, sparator);
            symptom = stringArr[index];
        }
        return symptom;
    }

    /**
     * 判断 两串是否相等
     */
    public boolean equls(String source, String target) {
        return Objects.equals(source, target);
    }

}
