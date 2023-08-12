package com.yixian.study.test;

import lombok.extern.slf4j.Slf4j;

import javax.lang.model.element.VariableElement;
import java.io.IOException;

@Slf4j
public class Test07 {
    static int t1;
    static int t2;

    public static void main(String[] args) throws InterruptedException {
        testThread();
    }

    private static void testThread() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1 = 10;
            log.info("Thread1结束");
        },"thread1");
        Thread thread2 = new Thread(() -> {
            t2 = 10;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("Thread2结束");
        },"thread2");
        thread1.start();
        thread2.start();
        long start = System.currentTimeMillis();
        thread1.join();
        thread2.join();
        long end = System.currentTimeMillis();
        log.info("r1:{}, r2:{},count:{}", t1, t2,end-start);
    }
}
