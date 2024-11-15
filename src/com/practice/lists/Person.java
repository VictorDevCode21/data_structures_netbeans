package com.practice.lists;

/**
 *
 * @author PC
 */


public class Person {

    private int num;
    private int age;
    private String name;

    public Person(int num, int age, String name) {
        this.num = num;
        this.age = age;
        this.name = name;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Name: " + name + "Age: " + age + "Num: " + num;
    }

}
