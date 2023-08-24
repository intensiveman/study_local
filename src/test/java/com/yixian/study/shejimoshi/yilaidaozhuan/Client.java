package com.yixian.study.shejimoshi.yilaidaozhuan;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        KingstonMemory kingstonMemory = new KingstonMemory();
        Inter inter = new Inter();

        computer.setCpu(inter);
        computer.setMemory(kingstonMemory);
        computer.setHardDisk(xiJieHardDisk);
        computer.run();

    }
}
