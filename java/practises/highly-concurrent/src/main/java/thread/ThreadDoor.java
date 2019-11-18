package thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author : cuiyingnan
 * @date : 2019/10/8 9:28
 * @desc : N年后的再次入门
 */
@Slf4j
public class ThreadDoor {


    private static int threadTotal = 1;
    private static int clientTotal = 5000;


    static int count;

    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for (int index = 0; index < clientTotal; index++) {
            exec.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        exec.shutdown();
        log.info("count:{}", count);
    }


    private synchronized static void add() {
        count++;
    }
}
