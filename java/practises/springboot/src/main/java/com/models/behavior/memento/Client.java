package com.models.behavior.memento;

/**
 * 将关心的数据通过Originator缓存至memento，当依据不同的业务进行变更后，可以将之前的状态恢复如初。
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.nextQuestion();
        o.nextQuestion();

        //这里便是存储了
        Caretaker manager = new Caretaker();
        manager.setMemento(o.save());

        o.nextQuestion();
        o.clear();
        System.out.println(o.getState());

        //这里便是复原喽，oh yeah
        o.recover(manager.getMemento());
        System.out.println(o.getState());
    }
}
