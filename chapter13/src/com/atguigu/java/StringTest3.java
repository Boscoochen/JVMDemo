package com.atguigu.java;

import java.util.HashSet;
import java.util.Set;

public class StringTest3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
