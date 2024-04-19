package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public Calculator(String expression) {
        String[] parts = expression.split(" ");
        num1 = Integer.parseInt(parts[0]);
        num2 = Integer.parseInt(parts[2]);
        sign = parts[1].charAt(0);
    }

    public char getSign() {
        return sign;
    }

    double calculate() {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '%':
                return num1 % num2;
            case '^':
                return Math.pow(num1, num2);
            case '/':
                return (double) num1 / num2;
            default:
                return Double.NaN;
        }
    }
}