package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(inputNames());
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

    public static String[] inputNames() {
        String[] names = new String[GuessNumber.PLAYERS];
        for (int i = 0; i < GuessNumber.PLAYERS; i++) {
            System.out.print("Введите имя игрока: ");
            names[i] = sc.nextLine();
        }
        return names;
    }
}