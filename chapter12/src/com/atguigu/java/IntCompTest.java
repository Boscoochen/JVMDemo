package com.atguigu.java;

/**
 * 测试解释器模式和JIT编译模式
 *  -Xint : 4904
 *  -Xcomp : 637
 *  -Xmixed : 758
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public static void testPrimeNumber(int count) {
        for(int i = 0; i < count; i++) {
            label:for (int j = 2; j < 100; j++) {
                for(int k = 2; k < Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
