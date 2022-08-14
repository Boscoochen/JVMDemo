package com.atguigu.java.chapter05;

public class StackError {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
