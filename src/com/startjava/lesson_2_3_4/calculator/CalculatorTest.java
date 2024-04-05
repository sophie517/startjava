package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.print("\nВведите первое число: ");
                calculator.setA(sc.nextInt());
                System.out.print("Введите знак математической операции: ");
                calculator.setSign(sc.next().charAt(0));
                System.out.print("Введите второе число: ");
                calculator.setB(sc.nextInt());

                calculator.calculate();
                sc.nextLine();
            } 
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            userAnswer = sc.nextLine();
        }
    }
}