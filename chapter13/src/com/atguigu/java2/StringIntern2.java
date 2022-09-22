package com.atguigu.java2;

public class StringIntern2 {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1"); //最后调用toString()方法， 常量池没有"1"
        String s4 = "11"; //在字符串常量池中生成对象"11"
        s3.intern();
        System.out.println(s3 == s4); //true
    }
}
