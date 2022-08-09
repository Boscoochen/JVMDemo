package com.atguigu.java.chapter02.java1;

import java.net.URL;

public class ClassLoaderTest1 {
    public static void main(String[] args) {

        String extDirs = System.getProperty("java.ext.dirs");
        for (String path:extDirs.split(";")) {
            System.out.println(path);
        }
    }
}