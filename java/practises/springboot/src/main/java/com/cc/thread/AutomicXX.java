package com.cc.thread;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author : cuiyingnan
 * @date : 2019/10/11 15:24
 * @desc : 多线程下，AtomicXX 保证原子性的相关实例
 */
@Slf4j
public class AutomicXX {


    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    //
    public void testAtomicReference() {
        count.compareAndSet(0, 1);
        count.compareAndSet(0, 2);
        count.compareAndSet(1, 3);
        count.compareAndSet(2, 4);
        log.info("count:{}", count.get());
    }

    /**
     * 多线程环境下更新某个类中某些方法，灰常实用的东西。
     */
    public static void testAtomicIntegerFiledUpdater() {
        AtomicIntegerFieldUpdater<MyClass> updater = AtomicIntegerFieldUpdater.newUpdater(MyClass.class, "age");
        MyClass myClass = new MyClass();
        if (updater.compareAndSet(myClass, 10, 20)) {
            log.info("myclass#age:{}", myClass.getAge());
        }
        if (updater.compareAndSet(myClass, 10, 30)) {
            log.info("myclass#age:{}", myClass.getAge());
        }
    }

    public static void main(String[] args) {
        testAtomicIntegerFiledUpdater();
    }
}

@Data
class MyClass {
    private String name;
    /**
     * 注意这里必须不能 是static
     */
    public volatile int age = 10;
}