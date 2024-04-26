package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Введите имя игрока: ");
            names[i] = sc.nextLine();
        }

        GuessNumber game = new GuessNumber(names[0], names[1], names[2]);
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