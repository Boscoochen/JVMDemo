package com.atguigu.java.chapter05.java2;

public class Program2 {
    public static void main(String[] args) {
        If11 if1 = () -> System.out.println("无参数，无返回值");

        if1.test();

        If22 if2 = a -> System.out.println("有一个参数，无返回值 a=" + a);
        if2.test(2);

        If33 if3 = (a, b) -> System.out.println("有两个参数，无返回值 a=" + a + " b=" + b);
        if3.test(1, 2);

        If44 if4 = () -> 4;

        System.out.println("无参数，有返回值 a=" + if4.test());

        If55 if5 = a -> a;
        System.out.println("有一个参数，有返回值 a=" + if5.test(5));

        If66 if6 = (a, b) -> a + b;
        System.out.println("有两个参数，有返回值 total=" + if6.test(3, 3));
    }
}

interface If11 {
    void test();
}

interface If22 {
    void test(int a);
}

interface If33 {
    void test(int a, int b);
}

interface If44 {
    int test();
}

interface If55 {
    int test(int a);
}

interface If66 {
    int test(int a, int b);
}