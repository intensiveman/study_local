package com.yixian.study.test;

import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yixian
 * @title: Test02
 * @projectName study
 * @description: null
 * @date 2023-02-13 14:59
 */
@RetrofitClient(baseUrl = "${text.uri}")
public class Test02 {

    private String test8888;

    public static void main(String[] args) {
        System.out.println("重生之我叫王迪");

        //迪哥专属
        System.out.println("我是王迪");
    }

    private String lllll;

    public void Av() {
        System.out.println("迪哥看这里");
    }

    @GetMapping("add")
    public String Add() {
        return "zhangsan";
    }

}
