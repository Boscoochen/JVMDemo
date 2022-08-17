package com.atguigu.java.chapter05.java2;

public class Program {
    public static void main(String[] args) {
        If1 if1 = () -> {
            System.out.println("无参数，无返回值");
        };
        if1.test();

        If2 if2 = (int a) -> {
            System.out.println("有一个参数，无返回值 a=" + a);
        };
        if2.test(2);

        If3 if3 = (int a, int b) -> {
            System.out.println("有两个参数，无返回值 a=" + a + " b=" + b);
        };
        if3.test(1, 2);

        If4 if4 = () -> {
            return 4;
        };
        System.out.println("无参数，有返回值 a=" + if4.test());

        If5 if5 = (int a) -> {
            return a;
        };
        System.out.println("有一个参数，有返回值 a=" + if5.test(5));

        If6 if6 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("有两个参数，有返回值 total=" + if6.test(3, 3));
    }
}

interface If1 {
    void test();
}

interface If2 {
    void test(int a);
}

interface If3 {
    void test(int a, int b);
}

interface If4 {
    int test();
}

interface If5 {
    int test(int a);
}

interface If6 {
    int test(int a, int b);
}