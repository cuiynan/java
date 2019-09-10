package com.models.behavior.observer.jdk;

/**
 * 这里是jdk提供相关的类，实现观察者设计模式
 * 哈。。看似这个要比自己写的那个更简练一些，不过过一段日子肯定会忘记，故需温故而知新也。
 */
public class Client {
    public static void main(String[] args) {
        NumberObservable numberObservable = new NumberObservable();
        numberObservable.addObserver(new NumberObserver("张三"));
        numberObservable.addObserver(new NumberObserver(" 李四"));
        numberObservable.setData(2);
        numberObservable.setData(21);
    }
}
