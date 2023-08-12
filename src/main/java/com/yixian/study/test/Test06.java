package com.yixian.study.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
public class Test06 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //new Thread(() -> log.info("runnable线程在执行"), "runnable").start();

        FutureTask<String> stringFutureTask = new FutureTask<String>(() -> {
            Thread.sleep(100);
            log.info("futureTask线程正在执行");
            return "zhangsan ";
        });
        Thread funtureTask = new Thread(stringFutureTask, "funtureTask");
        funtureTask.start();
        System.out.println(stringFutureTask.get());
        Thread thread = new Thread();
        thread.start();
        thread.run();

    }

}
