package com.lzw.bootframe;

import com.lzw.bootframe.util.SnowFlake;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootTest
class BootframeApplicationTests {


    @Test
    void contextLoads() {

        // 加密处理
        /*String hashpw = BCrypt.hashpw("123",BCrypt.gensalt());
                System.out.println("BC:"+hashpw);
        // 校验加密
        boolean checkpw = BCrypt.checkpw("123","$2a$10$6VVoQjq4Lh5j6m/q4LCIgeR3CUxchzAGAfloRJZbSmDDEsgMKGSva");
        */

        long id = SnowFlake.nextId();
        System.out.println("id:"+id);
    }

    @Test
    void test1(){
        HashMap hashMap = new HashMap();
        hashMap.put("","");
        hashMap.get("");
        hashMap.remove("");

        HashSet hashset = new HashSet();
        hashset.add("");
        hashset.remove("");

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.get("");
        linkedHashMap.put("","");

        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("","");
        map.get("");

       // ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        ReentrantLock reentrantLock = new ReentrantLock(true);
        reentrantLock.lock();
        System.out.println("123123");
        reentrantLock.unlock();


        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("");

        SynchronousQueue synchronousQueue = new SynchronousQueue();

        LinkedHashMap l =new LinkedHashMap<>();

        Object o;
        try {
            synchronousQueue.put("");
            o = synchronousQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
