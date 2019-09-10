package com.cc.java;

import lombok.Data;

/**
 * @Description
 *      多级连续调用
 *
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/22 14:28
 **/
public class Fluent {

    public static void main(String[] args) {
        User user = new User().setId("1")
                .setName("2")
                .setPwd("pwd");
    }
}

@Data
class User {
    String id;
    String name;
    String pwd;

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }
}