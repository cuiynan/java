package com.models.struct.composite;

import com.google.gson.Gson;

/**
 * 一直困惑的技术点，现在补上了。
 * composite设计模式 常用于树型组织。
 * 本例是菜单
 */
public class Client {

    public static void main(String[] args) {
        Menu menu = new ConcrateMenu("root");
        Menu root1 = new ConcrateMenu("root1");
        Menu root2 = new ConcrateMenu("root2");
        Menu m1 = new ConcrateMenu("m1");
        Menu m2 = new ConcrateMenu("m2");

        m1.add(m2);
        root2.add(m1);
        root1.add(root2);
        menu.add(root1);

        //这块用得太爽了
//        root2.remove(m1);

        menu.display(0);

        Gson gson = new Gson();
        System.out.println(gson.toJson(menu));
    }
}