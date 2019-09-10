package com.models.create;

/**
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/8 14:20
 **/
public class Singleton {
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getIns() {
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getIns());
    }
}


/**
 * 本类有效解决上类中解决不了的懒加载问题
 * 20190603
 */
class NB {

    private static class LazyHodler {
        private static final NB nb = new NB();
    }


    private NB() {

    }

    public static NB getInstance() {
        return LazyHodler.nb;
    }
}
