package com.models.behavior.mediator;

/**
 * 代码的耦合度非常高，基本在常用的项目中很少使用类似代码进行。虽说是内聚，但是内聚应该是本对象内的行为等，明显与其它对象进行的耦合。
 * 可能没有具体场景，也或者是通过其它方式进行，待下次有机会类似项目时，更新此处。
 * 这里是中介，也称为调停者，通过中介对其它对象进行操作。
 * @author cuiyingnan
 */
public class ConcreteMediator extends Mediator {

    public ConcreteMediator(Door door, Music music) {
        super(door, music);
    }

    /**
     * 这里就是所谓的调停者
     * 意思 就是当我操作音乐 的时候，其它设备要做点什么事儿。
     */
    @Override
    public void music(String state) {
        door.ready();
        door.operation(state);
    }

    /**
     * 这里就是所谓的调停者
     * 意思就是通过中介，当我打开门的时候还要做点什么事儿。
     */
    @Override
    public void door(String state) {
        music.ready();
        music.operation(state);
    }

}