package com.yixian.study.shejimoshi.yilaidaozhuan;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inter implements CPU{
    @Override
    public void run() {
        System.out.println("inter正在下载");
        log.info("Inter正在执行");
    }
}
