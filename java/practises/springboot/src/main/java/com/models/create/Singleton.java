package com.models.create;

/**
 * 简章的一个单例，真心关联过多的知识。
 * 如指令重排，JVM顺序加载，线程安全等等
 */


/**
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/8 14:20
 * 优缺点明显：
 * 是线程安全，但是在初始化的时候就分配内存，容易造成空间浪费。
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


class SingletonDoubleCheck {
    /**
     * 单例的双重判断，线程不安全的；
     * 原因，CPU和JVM有指令重排，如：
     * 当多线程时,当A分配对象时，B进入判断，若存在内存，便返回，这时其实还没有创建实例。
     *
     * 重排：
     * 1，memory = allocate()//分配空间
     * 2，ctorInstgance //初始化对象
     * 3，instance = memory //设置instance指向刚分配的内存
     *
     * 当123重排后变为132时，便会直接回空，所以此种方式并不是线程安全的实现。
     */
    //private static SingletonDoubleCheck singleton;

    /**
     * 将实例对象强制加上volatile后便是线程安全的了
     */
    private volatile static SingletonDoubleCheck singleton;

    private SingletonDoubleCheck() {

    }

    private SingletonDoubleCheck getIns() {
        if (singleton == null) { // B
            synchronized (this.getClass()) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheck(); //A
                }
            }
        }
        return singleton;
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

/**
 * 最终的还是使用的ENUM进行最佳的实现
 * 即解决懒汉的线程不安全，也解决了饿汉的空间浪费
 * 20191024 将来若遇到此场景时，强烈推荐使用此方式进行实现。
 */
class SingtonPerfect {

    private SingtonPerfect() {

    }

    public SingtonPerfect getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;
        private SingtonPerfect instance;

        Singleton() {
            instance = new SingtonPerfect();
        }

        public SingtonPerfect getInstance() {
            return instance;
        }
    }
}
