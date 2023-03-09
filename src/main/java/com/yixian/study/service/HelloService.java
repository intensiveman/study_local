package com.yixian.study.service;

import com.yixian.study.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author yixian
 * @title: HelloService
 * @projectName study
 * @description: null
 * @date 2023-03-08 17:07
 */
@Service
public class HelloService {

    @Autowired
    private UserDao userDao;


    public void hello() {
        System.out.println();
    }
}
