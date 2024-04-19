package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAnswer = "yes";
        
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.print("\nВведите математическое выражение: ");
                String expression = sc.nextLine();
                double result = Calculator.calculate();

                if (!Double.isNaN(result)) {
                    System.out.print(expression + " = ");
                    System.out.println((result % 1 == 0) ? (int) result : String.format("%.3f%n", result));
                } else {
                    System.out.println("Ошибка: знак " + calculator.getSign() + " не поддерживается");
                }
            } 
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            userAnswer = sc.next();
            sc.nextLine();
        }
    }
}