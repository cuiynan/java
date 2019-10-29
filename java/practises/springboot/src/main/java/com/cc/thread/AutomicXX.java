package com.cc.thread;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author : cuiyingnan
 * @date : 2019/10/11 15:24
 * @desc : 多线程下，AtomicXX 保证原子性的相关实例
 */
@Slf4j
public class AutomicXX {

    //
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void testAtomicReference() {
        count.compareAndSet(0, 1);
        count.compareAndSet(0, 2);
        count.compareAndSet(1, 3);
        count.compareAndSet(2, 4);
    }

    /**
     * 多线程环境下更新某个类中某些方法，灰常实用的东西。
     */
    public static void testAtomicIntegerFiledUpdater() {
        AtomicIntegerFieldUpdater<MyClass> fieldUpdater = AtomicIntegerFieldUpdater.newUpdater(MyClass.class, "age");
        MyClass myClass = new MyClass();
        if (fieldUpdater.compareAndSet(myClass, 10, 20)) {
            log.info("myclass#age:{}", myClass.getAge());
        }
        if (fieldUpdater.compareAndSet(myClass, 10, 30)) {
            log.info("myclass#age:{}", myClass.getAge());
        }
    }


    private static int clientTotal = 50000;
    private static int threadTotal = 50000;

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    testAtomicReference();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("count:{}", count.get());
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