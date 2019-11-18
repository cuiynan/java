package thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : cuiyingnan
 * @date : 2019/10/23 9:11
 * @desc :
 */
@Slf4j
public class TestSynchronized {


    public static void main(String[] args) {
        TestSynchronized t = new TestSynchronized();
        TestSynchronized t2 = new TestSynchronized();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            t.test(1);
        });
        service.execute(() -> {
            t2.test(2);
        });

//        service.execute(() -> {
//            t.test2(1);
//        });
//        service.execute(() -> {
//            t2.test2(2);
//        });
    }

    private void test(int j) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                log.info("test-{},{}", i,j);
            }
        }
    }

    private synchronized  void test2(int j){
        System.out.println("test222");
        for (int i = 0; i < 10; i++) {
            log.info("test2-{},{}", i,j);
        }
    }
}
