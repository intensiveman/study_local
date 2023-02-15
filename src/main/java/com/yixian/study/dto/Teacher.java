package com.yixian.study.dto;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2023-02-11 19:53
 */
public class Teacher {

    private int age;

    private String name;


    public Teacher() {
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Teacher{age = " + age + ", name = " + name + "}";
    }


}
