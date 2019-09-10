package com.models.behavior.mediator;

/**
 * @author : cuiyingnan
 * @date : 2019/6/12 16:44
 * @desc :  这里是中介设计模式，将业务集成，按行为进行封装。如下所例：
 * 当关门的同时，关上音乐等；
 * 当关上音乐，关上门等；
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        Music music = new Music();

        Mediator mediator = new ConcreteMediator(door, music);
        mediator.door("打开");
        mediator.music("打开");
    }
}
