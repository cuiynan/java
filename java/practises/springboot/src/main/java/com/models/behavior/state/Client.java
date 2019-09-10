package com.models.behavior.state;

import java.util.Date;

/**
 * your code is your card.
 */
public class Client {
    public static void main(String[] args) {

        //这里是经典state设计模式
        ELectState state = new GaoFeng();
        TimeContext context = new TimeContext(new Date());
        context.handler();

        //这里显然与策略模式有异曲同功之效
        TimeContext tmp = new TimeContext(state);
        tmp.handler();

        //这里是与flyweight进行合并使用，在数据量大的情况下，节省空间，注意线程安全。
        FlyWeightTimeContext timeContext = new FlyWeightTimeContext();
        timeContext.getEvent(new Date()).handler();
    }
}
