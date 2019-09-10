package com.cc.utils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName Map
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/18 13:52
 **/
public class Map {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //仅在put 时 synchronized使用分段锁，性能高些；
        //Segment[loadFactor]嵌套Node[hash,key,val,next]，使用可重入锁ReentrantLock进行；
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(null,"");
        concurrentHashMap.get(null);
        System.out.println(concurrentHashMap);

        //synchronized中的put/get整体在方法上锁死，性能非常的慢，出现排队现象。
        //最外层数组，数组中嵌套Entry[hash,key,v,next]；
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,null);
        hashtable.get(null);

        HashMap map = new HashMap();
        map.put(null,null);
        System.out.println(map);
    }
}
