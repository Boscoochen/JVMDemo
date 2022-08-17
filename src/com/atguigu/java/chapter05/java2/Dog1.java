package com.atguigu.java.chapter05.java2;

public class Dog1 {
    private String name;
    private int age;

    public Dog1() {
        System.out.println("无参数构造方法");
    }

    public Dog1(String name, int age) {
        System.out.println("有参数构造方法");
        this.name = name;
        this.age = age;
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
        return "Dog1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
