package com.atguigu.java.chapter05.java1;

public class OperandStackTest {
    public void testAddOperation() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        int i = getSum();
        int j = 10;
    }

    public void add() {
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        int i9 = 10;
        int i10 = i9++ + ++i9;
    }
}
