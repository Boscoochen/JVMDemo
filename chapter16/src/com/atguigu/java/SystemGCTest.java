package com.atguigu.java;

public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();

        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
