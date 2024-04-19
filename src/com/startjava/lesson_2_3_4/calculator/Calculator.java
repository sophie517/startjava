package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private String expression;

    public double calculate(String expression) {
        this.expression = expression;
        String[] parts = expression.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        char sign = parts[1].charAt(0);

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
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.NaN;
        }
    }

    public void printResult(double result) {
        if (!Double.isNaN(result)) {
            System.out.print(expression + " = ");
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.printf("%.3f%n", result);
            }
        }
    }
}