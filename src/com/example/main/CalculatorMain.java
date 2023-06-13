package com.example.main;

import com.example.util.Calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int vv = calc.plus(11, 22);
        System.out.println("vv = " + vv);

        com.example.util2.Calculator calc2 = new com.example.util2.Calculator();
        int vv2 = calc2.devide(100, 10);
        System.out.println("vv2 = " + vv2);
    }

}
