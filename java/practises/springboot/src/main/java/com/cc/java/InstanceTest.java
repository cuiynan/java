package com.cc.java;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/25 17:20
 **/
public class InstanceTest {
    public static void main(String[] args) {
        Father father = new Father();
        father.setAge("40");
        father.setName("cccc");

        Son son = new Son();
        son.setName("son");
        son.setAge("11");
        son.setTec("dfakl;jf;ad");

        System.out.println(son instanceof Father);
        System.out.println(father instanceof Father);
        System.out.println(father instanceof Son);
        System.out.println(null instanceof Father);
        System.out.println();

        System.out.println(son.getClass().isInstance(father));
        System.out.println(father.getClass().isInstance(father));
        System.out.println(father.getClass().isInstance(son));
        System.out.println(son.getClass().isInstance(father));


    }
}

@Data
class Father {
    String name;
    String age;
}

@Data
class Son extends Father {
    String tec;
}
