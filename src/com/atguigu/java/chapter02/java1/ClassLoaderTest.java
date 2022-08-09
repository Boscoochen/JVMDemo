package com.atguigu.java.chapter02.java1;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader extClassloader = systemClassLoader.getParent();
        System.out.println(extClassloader);

        ClassLoader bootstrapClassLoader = extClassloader.getParent();
        System.out.println(bootstrapClassLoader);

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
