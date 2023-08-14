package com.yixian.study.test;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Test08 {
    public static void main(String[] args) throws InterruptedException {
        TwoThread twoThread = new TwoThread();
        twoThread.start();
        Thread.sleep(5000);
        twoThread.stop();
    }
}

@Slf4j
class TwoThread {
    private Thread thread;

    void start() throws InterruptedException {
        thread = new Thread(() -> {
            Thread current = Thread.currentThread();//获取本地线程
            while (true) {
                if (current.isInterrupted()) {
                    //如果被打断，结束循环
                    log.info("处理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    log.info("监控任务执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    current.interrupt();//将打断标记重新设置为true
                }
            }
        });
        thread.start();
    }

    void stop() {
        thread.interrupt();
    }


}