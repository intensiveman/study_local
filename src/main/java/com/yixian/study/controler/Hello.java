package com.yixian.study.controler;

import com.yixian.study.dao.UserDao;
import com.yixian.study.dto.Student;
import com.yixian.study.dto.User;
import com.yixian.study.test.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @Autowired
    UserDao userDao;

    @Value(value = "${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name);
        User user = userDao.selectById(1);
        System.out.println(user);
        logger.info(user.toString());
        logger.error(user.toString());
        return name+"hello";
    }

    @PostMapping(value = "/getStudent")
    public void getStudent(@RequestBody Student student) {
        System.out.println("student = " + student);
    }
}
