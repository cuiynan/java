package com.models.behavior.state;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

/**
 * 在设计上将所有状态进行内存化。
 * 在state模式基础上，进行flyweight后，如下类便是了，很爽。
 */
public class FlyWeightTimeContext {

    private static final Hashtable<String, ELectState> hashtable;

    static {
        hashtable = new Hashtable();
        hashtable.put(Constant.PJ, new PingJia());
        hashtable.put(Constant.GF, new GaoFeng());
        hashtable.put(Constant.DG, new DiGu());
    }

    /**
     * 按规则返回才是正宗state模式。
     */
    public ELectState getEvent(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String str = sdf.format(date);
        int hour = Integer.parseInt(str);
        if (hour < 9) {
            return hashtable.get(Constant.PJ);
        } else if (hour < 20) {
            return hashtable.get(Constant.GF);
        } else {
            return hashtable.get(Constant.DG);
        }
    }

    /**
     * 可以使用返回值，也可以内置到本类中一个key，如
     * String key;当getEvent时设置，在调用handler时再传入，不过此种设计会有安全问题，
     * 此处仅仅说明一下，在项目中不会使用此种方式进行实现。
     */
//    public void handler(String key) {
//        getEvent(key).handler();
//    }

}

class Constant {
    public final static String PJ = "PINGJIA";
    public final static String DG = "DIGU";
    public final static String GF = "GAOFENG";
}