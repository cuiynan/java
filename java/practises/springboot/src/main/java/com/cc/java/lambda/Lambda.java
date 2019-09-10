package com.cc.java.lambda;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/22 17:19
 **/
public class Lambda {

    private static List<Integer> items = new ArrayList<>();

    static {
        for (int i = 1; i < 11; i++) {
            items.add(i);
        }
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        lamdba();
        watch.stop();
        System.out.println("-------time:" + watch.getTotalTimeMillis());
    }

    private static void lamdba() {
        //List<String> tmp = items.stream().filter(e -> 5 < e).mapToInt(a::a);
    }

    private static void fore() {
        for (int s : items) {
            if ("10000000".equals(s)) {
                System.out.println("ok");
            }
        }
    }
}
