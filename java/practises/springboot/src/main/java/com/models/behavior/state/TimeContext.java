package com.models.behavior.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 可以使用享元设计模式进行改造，将状态固定在内存中。具体参见：FlyWeightTimeContext
 */
public class TimeContext {


    /**
     *
     */
    private ELectState state;


    /**
     * @param state
     */
    public TimeContext(ELectState state) {
        this.state = state;
    }


    /**
     * 扩展，这里依据规则进行按条件状态方式进行返回对象
     */
    public TimeContext(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String str = sdf.format(date);
        int hour = Integer.parseInt(str);
        if (hour < 9) {
            this.state = new PingJia();
        } else if (hour < 20) {
            this.state = new GaoFeng();
        } else {
            this.state = new DiGu();
        }
    }

    /**
     *
     */
    public void handler() {
        state.handler();
    }

}