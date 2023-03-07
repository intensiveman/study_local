package com.yixian.study.dto;

import com.yixian.study.extend.Service;
import lombok.Data;

/**
 * @author yixian
 * @title: User
 * @projectName study
 * @description: null
 * @date 2023-02-22 17:58
 */
@Data
public class User {


    private int id;

    private String name;

    private int age;

    private String gender;


    public User() {
    }

    public User(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
