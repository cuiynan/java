package aqs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author : cuiyingnan
 * @date : 2019/11/18 17:01
 * @desc :
 */
public class Semaphore2 {
    private final static int threadCount = 200;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //每次可接受并发3个
        final Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    //获取许可,如果 1秒内获得不到，便不再等待
                    if (semaphore.tryAcquire(1, TimeUnit.SECONDS)) {
                        test(threadNum);
                        //释放许可
                        semaphore.release();
                    }
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
