package com.atguigu.java.chapter05.java2;

public class Program6 {
    @FunctionalInterface
    interface TestInterface {
        public void sub();
        public boolean equals(Object var1);
        public default void defaultMethod() {

        }

        public static void staticMethod() {

        }
    }

    @FunctionalInterface
    interface TestInterface2 {
        void add();
        default void sub() {

        }
    }

    public static void main(String[] args) {

    }
}
