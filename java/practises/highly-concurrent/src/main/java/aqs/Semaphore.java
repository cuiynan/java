package aqs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cuiyingnan
 * @date : 2019/11/18 17:01
 * @desc :
 */
public class Semaphore {
    private final static int threadCount = 200;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //每次可接受并发3个
        final java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(3);

        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            executorService.execute(() ->{
                try {
                    //获取许可
                    semaphore.acquire();
                    test(threadNum);
                    //释放许可
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }


    private static void test(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(threadNum);
    }


}
