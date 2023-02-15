package com.yixian.study.dto;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @version V1.0
 * @description:
 * @author: wangdi
 * @date: 2022-12-31 9:46
 */
public class Student {

    int age;

    String name;

    ArrayList<String> habit;


    public Student() {
    }

    public Student(int age, String name, List<String> habit) {
        this.age = age;
        this.name = name;
        this.habit = (ArrayList<String>) habit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHabit() {
        return habit;
    }

    public void setHabit(List<String> habit) {
        this.habit = (ArrayList<String>) habit;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(habit, student.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, habit);
    }
}
