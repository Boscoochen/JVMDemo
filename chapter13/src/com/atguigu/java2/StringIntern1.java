package com.atguigu.java2;

public class StringIntern1 {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern(); //字符串常量池里已经有"1"，返回引用地址
        String s2 = "1";
        System.out.println(s == s2); //false

        String s3 = new String("1") + new String("1"); //最后调用toString()方法， 常量池没有"1"
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4); //true
    }
}
