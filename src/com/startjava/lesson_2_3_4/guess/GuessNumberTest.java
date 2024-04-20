package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = sc.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = sc.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);
        String playerAnswer = "yes";

        while (!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                System.out.println();
                game.start();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            playerAnswer = sc.nextLine();
        }
    }
}