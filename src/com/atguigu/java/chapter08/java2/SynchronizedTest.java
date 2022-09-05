package com.atguigu.java.chapter08.java2;

public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized (hollis) {
            System.out.println(hollis);
        }
    }
}
