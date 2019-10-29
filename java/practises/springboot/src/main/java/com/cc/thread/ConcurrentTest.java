package com.cc.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @author : cuiyingnan
 * @date : 2019/10/29 9:42
 * @desc : 用来测试数据结构的原子性是否安全，比较爽。
 */
@Slf4j
public class ConcurrentTest {
    //请求数
    private static int clientTotal = 5000;
    //并发线程数
    private static int threadTotal = 200;
    /**
     * 下方为测试的结构
     */
    //线程不安全
    private static Map<Integer, Integer> exm = new HashMap<>();
    //线程安全
    private static Map<Integer, Integer> ex = new ConcurrentSkipListMap<>();
    //线程安全
    private static Map<Integer, Integer> ex1 = new ConcurrentHashMap();
    //线程安全
    private static Set ex3 = new CopyOnWriteArraySet();
    //线程安全
    private static List ex4 = new CopyOnWriteArrayList();

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //信号量
        final Semaphore semaphore = new Semaphore(threadTotal);

        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            int c = i;
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add(c);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //一定注意这里，开始放在外边，不生效
                countDownLatch.countDown();
            });
        }

        countDownLatch.await();
        executorService.shutdown();
        log.info("count:{}", ex1.size());
    }

    private static void add(int i) {
        ex1.put(i, i);
    }
}
