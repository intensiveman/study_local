package com.yixian.study.controler;

import com.yixian.study.dao.UserDao;
import com.yixian.study.dto.Student;
import com.yixian.study.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2023-01-05 9:48
 */
@RestController
@RequestMapping("/api")
@Slf4j

public class Hello {


    @Resource(name = "userDao")
    UserDao userDao;

    @Value(value = "${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        User user = userDao.selectById(1);
        System.out.println(user);

        log.info(user.toString());
        log.error(user.toString());
        log.warn(user.toString());
        return name+"hello"+user;
    }

    @PostMapping(value = "/getStudent")
    public void getStudent(@RequestBody Student student) {
        System.out.println("student = " + student);
    }
}
