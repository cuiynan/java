package com.cc.vo;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/21 21:33
 **/
@Data
public class Test {
    private String userID;
    private String sut;

    public Test setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public Test setSut(String sut) {
        this.sut = sut;
        return this;
    }

    public static void main(String[] args) {
        Test ssss = new Test().setSut("11").setUserID("ssss");
        System.out.println(ssss);
    }
}


