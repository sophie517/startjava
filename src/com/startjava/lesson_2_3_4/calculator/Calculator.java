package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private String expression;

    public static double calculate(String expression) {
        if (expression.length() < 5) {
            throw new RuntimeException("Неверная длина выражения");
        }

        String[] parts = expression.split(" ");
        double arg1 = Double.parseDouble(parts[0]);
        double arg2 = Double.parseDouble(parts[2]);
        char sign = parts[1].charAt(0);

        if (arg1 % 1 != 0 || arg2 % 1 != 0) {
            throw new IllegalArgumentException("Числа должны быть целыми");
        } else if (arg1 < 0 || arg2 < 0) {
            throw new IllegalArgumentException("Числа должны быть положительными");
        }

        return switch (sign) {
            case '+' -> arg1 + arg2;
            case '-' -> arg1 - arg2;
            case '*' -> arg1 * arg2;
            case '%' -> arg1 % arg2;
            case '^' -> Math.pow(arg1, arg2);
            case '/' -> {
                if (arg2 == 0) {
                    throw new ArithmeticException("На ноль делить нельзя");
                } else yield arg1 / arg2;
            }
            default -> {
                throw new IllegalArgumentException("Ошибка: знак " + sign + " не поддерживается");
            }
        };
    }
}