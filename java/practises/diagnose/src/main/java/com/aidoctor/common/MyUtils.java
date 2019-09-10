package com.aidoctor.common;


import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author : cuiyingnan
 * @date : 2019/7/6 10:37
 * @desc :
 */
public class MyUtils {
    public static String sortedStringHasSeparator(String sourceStr) {

        if (!StringUtils.isEmpty(sourceStr) && sourceStr.contains(AiDoctorConstant.SEPARATOR)) {
            String[] arrString = sourceStr.split(AiDoctorConstant.SEPARATOR);
            Arrays.sort(arrString, (s1, s2) -> {
                return (Integer.parseInt(s1)) < Integer.parseInt(s2) ? -1 : 1;
            });
            return Arrays.toString(arrString);
        }
        return sourceStr;
    }
}
