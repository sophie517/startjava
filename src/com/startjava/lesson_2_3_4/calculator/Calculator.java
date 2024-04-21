package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    public static double calculate(String expression) {
        String[] parts = expression.split(" ");
        int arg1;
        int arg2;

        try {
            arg1 = Integer.parseInt(parts[0]);
            arg2 = Integer.parseInt(parts[2]);
        } catch (RuntimeException e) {
            throw new RuntimeException("Числа должны быть целыми");
        }

        if (parts.length != 3) {
            throw new RuntimeException("Неверная длина выражения");
        }
        if (arg1 <= 0 || arg2 <= 0) {
            throw new RuntimeException("Числа должны быть положительными");
        }

        char sign = parts[1].charAt(0);
        return switch (sign) {
            case '+' -> arg1 + arg2;
            case '-' -> arg1 - arg2;
            case '*' -> arg1 * arg2;
            case '%' -> arg1 % arg2;
            case '^' -> Math.pow(arg1, arg2);
            case '/' -> (double) arg1 / arg2;
            default -> {
                throw new RuntimeException("Ошибка: знак " + sign + " не поддерживается");
            }
        };
    }
}