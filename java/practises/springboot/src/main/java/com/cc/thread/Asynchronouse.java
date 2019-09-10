package com.cc.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cuiyingnan
 * @date : 2019/8/23 14:17
 * @desc : 异步
 */
public class Asynchronouse {

    public static void main(String[] args) {
        try {
            ExecutorService service = Executors.newFixedThreadPool(2);
            System.out.println("开始买去啦");
            CompletableFuture<String> result1 = buyBar(service);
            CompletableFuture<String> result2 = buyCigaretter(service);
            CompletableFuture<String> result3 = buyBar(service);
            CompletableFuture<String> result4 = buyCigaretter(service);

            System.out.println("here1");
            result1.thenAccept((e) -> System.out.println(e));
            result2.thenAccept((e) -> System.out.println(e));
            result3.thenAccept((e) -> System.out.println(e));
            result4.thenAccept((e) -> System.out.println(e));
            System.out.println("here2");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("哈。。。我先执行！");
    }


    /**
     * 买啤酒
     *
     * @return
     */
    public static CompletableFuture<String> buyBar(ExecutorService service) throws ExecutionException, InterruptedException {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("开始去买啤酒");
            try {
                System.out.println("正在买啤酒路上");
                Thread.sleep(5000);
                return "买回来啤酒啦";
            } catch (Exception e) {
                System.out.println("发生意外-啤酒");
                return "空手而归-啤酒";
            }
        }, service);
    }

    /**
     * 买烟
     *
     * @return
     */
    public static CompletableFuture<String> buyCigaretter(ExecutorService service) throws ExecutionException, InterruptedException {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("开始去买-买烟");
            try {
                System.out.println("正在路上-买烟");
                Thread.sleep(5000);
                return "买回来烟啦";
            } catch (Exception e) {
                System.out.println("发生意外-买烟");
                return "空手而归-买烟";
            }
        }, service);
    }

}


