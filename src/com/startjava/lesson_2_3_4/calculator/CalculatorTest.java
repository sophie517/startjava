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
                Calculator calculator = new Calculator();
                double result = calculator.calculate(expression);
                calculator.printResult(result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            userAnswer = sc.next();
            sc.nextLine();
        }
    }
}