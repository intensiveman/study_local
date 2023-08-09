package com.yixian.study.test;

import org.springframework.web.bind.annotation.RestController;
import retrofit2.Converter;

import java.util.Date;
import java.util.concurrent.*;
@RestController
public class Test04 {
    public static void main(String[] args)  throws Exception {

        int count = 10;//
        int count_max = count * 5;
        int keepAliveTime = count;
        TimeUnit unit = TimeUnit.SECONDS;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(count);
        NameTreadFactory nameTreadFactory = new NameTreadFactory();
        ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();

/**
 *  count,//核心线程数
 *  count_max,//最大线程数
 *  keepAliveTime,//空闲队列等待时间
 *  unit, //时间单位
 *  arrayBlockingQueue,//阻塞队列
 *  nameTreadFactory,//工厂
 *  callerRunsPolicy//拒绝策略
 */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                count,              //核心线程数
                count_max,          //最大线程数
                keepAliveTime,     //空闲队列等待时间
                unit, //时间单位
                arrayBlockingQueue,//阻塞队列
                nameTreadFactory,  //工厂
                callerRunsPolicy   //拒绝策略
        );

        Thread thread = new Thread();



    }

}
