package com.yixian.study.test;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;


public class Test03 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌-52");
        list1.add("里斯-55");
        list1.add("张君宝-23");
        list1.add("谢逊-545");
        list1.add("赵敏-18");
        list1.add("宋远桥-17");
        list1.add("张三-66");

        ArrayList<String> list2 = new ArrayList<>();
        //list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

        list1.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));


        Map<String, Integer> map = list1.stream()
                .filter(s -> s.split("-")[0].startsWith("张"))
                .collect(Collectors.toMap(s -> {
                    return s.split("-")[0];
                }, s -> {
                    return Integer.parseInt(s.split("-")[1]);
                }));
        System.out.println(map);

        List<String> strings = new ArrayList<>();
        String[] arr={"shangsan","lisi"};

    }
}
