package com.models.struct.flyweight.pure;

/**
 * 这里是享元模式的单纯享元。
 */
public class Client {
    public static void main(String[] args) {
        FlyWeight factory = Factory.getFlyWight("black");
        FlyWeight factory1 = Factory.getFlyWight("black");
        //单纯的享元模式，返回内存数据模型相同的数据。
        System.out.println(factory == factory1);
        factory1.display();

        factory = Factory.getFlyWight("red");
        factory.display();
    }
}
