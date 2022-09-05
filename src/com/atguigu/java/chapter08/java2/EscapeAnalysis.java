package com.atguigu.java.chapter08.java2;

/**
 * -XX:+DoEscapeAnalysis
 * -XX:+PrintEscapeAnalysis
 */
public class EscapeAnalysis {
    public static void main(String[] args) {

    }
    public EscapeAnalysis obj;

    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    public void useEscapeAnalysis1() {
        EscapeAnalysis e = getInstance();
    }
}
