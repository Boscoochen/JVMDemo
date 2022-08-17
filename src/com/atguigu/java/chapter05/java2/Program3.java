package com.atguigu.java.chapter05.java2;

public class Program3 {
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        If51 if51 = program3::testA;
//        If51 if51 = a->a-1;
        System.out.println(if51.test(2));

        If51 if52 = program3::testA;
        System.out.println(if52.test(4));

        If51 if511 = Program3::testB;
        System.out.println(if511.test(10));

        If51 if512 = Program3::testB;
        System.out.println(if512.test(122));
    }

    public int testA(int a) {
        return a - 2;
    }

    public static int testB(int a) {
        return a - 2;
    }

    interface If51 {
        public int test(int a);
    }
}
