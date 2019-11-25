package thread;

import po.User;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/15 9:57
 **/
public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<User> user = new ThreadLocal<>();
        while (true) {
            //里边的设计不错，将来项目中可以直接使用。
            TimeUnit.SECONDS.sleep(5);
            new Thread(() -> {
                System.out.println("here is run");

            }).start();
        }

    }
}
