package thread;

import java.util.HashMap;

/**
 * @author : cuiyingnan
 * @date : 2019/10/29 8:57
 * @desc :
 */
public class StringBufferStringBuilder {

    static StringBuffer stringBuffer = new StringBuffer();

    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        stringBuffer.append(1); //源码加锁，故线程安全；
        stringBuilder.append(1);//源码并无锁，故线程不安全

        new HashMap().put(1,1);//线程不安全；
    }
}
