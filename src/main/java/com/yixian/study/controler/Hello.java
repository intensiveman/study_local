package com.yixian.study.controler;

import com.yixian.study.dto.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2023-01-05 9:48
 */
@RestController
@RequestMapping("/api")
public class Hello {

    @Value(value = "${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name);
        return name;
    }

    @PostMapping(value = "/getStudent")
    public void getStudent(@RequestBody Student student) {
        System.out.println("student = " + student);
    }
}
