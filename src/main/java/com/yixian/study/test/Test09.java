package com.yixian.study.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test09 {
    public static void main(String[] args) throws InterruptedException {
        //烧水哥
        Thread t1 = new Thread(() -> {
            try {
                log.info("洗水壶");
                Thread.sleep(100);
                log.info("烧水");
                Thread.sleep(1500);
                log.info("水开了");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1");
        //准备哥
        Thread t2 = new Thread(() -> {
            try {
                log.info("洗chahu");
                Thread.sleep(100);
                log.info("洗茶杯");
                Thread.sleep(100);
                log.info("拿茶叶");
                Thread.sleep(200);
                t1.join();
                log.info("泡茶");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");
        t1.start();
        t2.start();


    }


}
