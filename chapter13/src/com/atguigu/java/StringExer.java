package com.atguigu.java;

public class StringExer {
    String str = new String("good");
    String str2 = "good";
    //str = good 字符串常量池
    char[] ch = {'t', 'e', 's', 't'};
    //ch[] = test 堆

    public void change(String str, char[] ch) {

        str = "test ok";

        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
//        System.out.println(System.identityHashCode(ex.str));
//        System.out.println(System.identityHashCode(ex.str2));
        ex.change(ex.str, ex.ch);

        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}
