package com.yixian.study.shejimoshi.yilaidaozhuan;

import lombok.Data;
import org.slf4j.MDC;

@Data
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    void run() {
        System.out.println("计算机正在执行");
        cpu.run();
        memory.save();
        hardDisk.run();
        System.out.println("执行完毕 ");

    }


}
