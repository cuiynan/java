package com.cc.thread;

/**
 * @author : cuiyingnan
 * @date : 2019/9/29 10:09
 * @desc : 测试volatile
 */
public class TestVoliatile {

    //共享区
    static volatile int shareInt = 0;

    public static void main(String[] args) {
        //鸡
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (shareInt < 2) {
                        shareInt = 20;
                    }
                    System.out.println("aaaa" + shareInt);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        //蛋
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (shareInt > 1) {
                        shareInt--;
                        System.out.println("bbbb" + shareInt);
                    } else {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("bbbb" + shareInt);
                    }

                }
            }
        }).start();
    }


}
