package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.print("\nВведите математическое выражение: ");
                String expression = sc.nextLine();
                String[] partsOfExpression = expression.split(" ");
                
                calculator.setNum1(Integer.parseInt(partsOfExpression[0]));
                calculator.setSign(partsOfExpression[1].charAt(0));
                calculator.setNum2(Integer.parseInt(partsOfExpression[2]));

                calculator.calculate();
            } 
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            userAnswer = sc.next();
            sc.nextLine();
        }
    }
}