package com.atguigu.java.chapter8.java1;

public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油～");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
