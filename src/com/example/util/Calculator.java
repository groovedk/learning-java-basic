package com.example.util;

public class Calculator {

    public Calculator() {
    }

    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int vv = calc.plus(10, 100);
        System.out.println("vv = " + vv);
    }
}
