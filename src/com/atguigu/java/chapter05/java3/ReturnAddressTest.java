package com.atguigu.java.chapter05.java3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.regex.Pattern;

public class ReturnAddressTest {
    public static void main(String[] args) {

    }
    public boolean methodBoolean() { return false; }
    public byte methodByte() { return 0; }
    public short methodShort() { return 0; }
    public char methodChar() { return 'a'; }
    public int methodInt() { return '0'; }
    public long methodLong() { return 0L; }
    public float methodFloat() { return 0.0f; }
    public double methodDouble() { return 0.0; }
    public String methodString() { return null; }
    public Date methodDate() { return null; }
    public void methodVoid() {

    }

    static {
        int i = 10;
    }

    public void method2() {
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method1() throws IOException {
        FileReader fis = new FileReader("atguigu.txt");
        char[] cBuffer = new char[1024];
        int len;
        while ((len = fis.read(cBuffer)) != -1) {
            String str = new String(cBuffer, 0, len);
            System.out.println(str);
        }
        fis.close();
    }
}