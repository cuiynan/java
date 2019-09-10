package com.models.struct.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Data
public class ConcrateMenu extends Menu {

    String name;

    List<Menu> menus = new ArrayList<>();

    public ConcrateMenu(String name) {
        this.name = name;
    }

    @Override
    public void add(Menu menu) {
        menus.add(menu);
    }

    @Override
    public void remove(Menu menu) {
        menus.remove(menu);
    }

    @Override
    public Menu get(int i) {
        return menus.get(i);
    }


    @Override
    protected void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString() + this.getName());
        for (Menu c : menus) {
            //打印多少个'-‘字符，典型的递归
            c.display(depth + 6);
        }
    }


}