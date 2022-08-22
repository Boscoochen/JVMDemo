package com.atguigu.java.chapter06;

public class IHaveNatives {
    public native void Native1(int x);
    native static public long Native2();
    native synchronized private float Native3(Object o);
    native void Native4(int[] ary) throws Exception;
}
