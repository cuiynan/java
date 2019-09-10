package com.cui.string;

/**
 * @author : cuiyingnan
 * @date : 2019/8/23 11:05
 * @desc :
 */
public class SpearatorUtilsTest {

    @org.junit.Test
    public void getFirstSymptomCode() {
        String result = CCStringUtils.getFirstSymptomCode("1234-123", "-");

        System.out.println("====:"+result);
    }
}
