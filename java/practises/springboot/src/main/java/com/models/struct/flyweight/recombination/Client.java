package com.models.struct.flyweight.recombination;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

/**
 * 这里是享元模式的复合享元。
 *  在单纯享元的基础上增加其它对象，其它对象不是共享的，单纯享元还是共享的。
 *  这里有点绕，具体还是看pure/recombination 两包中的具体代码，便得到其中原委
 */
public class Client {
    public static void main(String[] args) {
        FlyWeight black = Factory.getFlyWight("black");
        FlyWeight red = Factory.getFlyWight("red");


        black.display(new Coordinates(1, 1));
        black.display(new Coordinates(1, 2));
        black.display(new Coordinates(1, 3));


        red.display(new Coordinates(2, 1));
        red.display(new Coordinates(2, 2));
        red.display(new Coordinates(2, 3));

    }
}
