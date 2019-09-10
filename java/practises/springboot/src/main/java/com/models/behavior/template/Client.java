package com.models.behavior.template;

import java.util.*;

/**
 * 模板简单易懂，多思多想。
 */
public class Client {

    public static void main(String[] args) {

        PayTmplate pay = new WX();
        pay.pay();

        PayTmplate zfb = new ZFB();
        zfb.pay();
    }

}