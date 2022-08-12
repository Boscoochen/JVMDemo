package com.atguigu.java.chapter02.java1;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        ClassLoader classLoader = null;
        try {
            classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            System.out.println(contextClassLoader);

            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
