package thread;

public class VolatileTest {
    volatile int a = 1;
    volatile int b = 2;

    //赋值操作
    public void change() {
        a++;
        b = a;
    }

    //打印操作
    public void print() {
        if (a != b) {
            System.out.println("b:" + b + ",a:" + a);
        }
    }

    public static void main(String[] args) {
        VolatileTest vt = new VolatileTest();

        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    vt.change();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    vt.print();
                }
            }).start();
        }
    }
}