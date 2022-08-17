package com.atguigu.java.chapter05.java2;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        List<Dog1> list = new ArrayList<Dog1>();
        list.add(new Dog1("aa", 1));
        list.add(new Dog1("bb", 4));
        list.add(new Dog1("cc", 3));
        list.add(new Dog1("dd", 2));
        list.add(new Dog1("ee", 5));

        System.out.println("lambda集合排序");
        list.sort((o1, o2)->{return o1.getAge() - o2.getAge();});
        System.out.println(list);
        list.forEach(System.out::println);
    }
}
