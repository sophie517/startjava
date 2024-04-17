package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    void calculate() {
        double result;

        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case '/':
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                result = Double.NaN;
                break;
        }

        if (!Double.isNaN(result)) {
            System.out.print(num1 + " " + sign + " " + num2 + " = ");
            if (result % 1 == 0) {
                System.out.println((int) result);
            } else {
                System.out.printf("%.3f%n", result);
            }
        }
        System.out.println();
    }
}