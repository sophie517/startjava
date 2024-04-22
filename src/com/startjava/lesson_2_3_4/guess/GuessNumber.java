package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private boolean isGuessedNumber;
    
    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        int maxAttempts = 10;
        System.out.println("Игра началась! У каждого игрока по " + maxAttempts + " попыток.\n");

        player1.clear();
        player2.clear();
        Scanner sc = new Scanner(System.in);
        hiddenNumber = 1 + (int) (Math.random() * 100);
        Player currentPlayer = player1;
        isGuessedNumber = false;

        while (true) {
            System.out.print(currentPlayer.getName() + ", введи число: ");
            int playerGuess = sc.nextInt();
            currentPlayer.addNumber(playerGuess);

            estimateNumber(currentPlayer, playerGuess);
            if (isGuessedNumber) {
                break;
            }

            if (currentPlayer.getAttempt() == maxAttempts - 1) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
                if (currentPlayer == player2) {
                    break;
                }
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        printAttempts(player1);
        printAttempts(player2);
    }

    public void estimateNumber(Player currentPlayer, int playerGuess) {
        if (playerGuess == hiddenNumber) {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                    playerGuess + " с " + (currentPlayer.getAttempt()) + " попытки\n");
            isGuessedNumber = true;
            return;
        }
        if (playerGuess > hiddenNumber) {
            System.out.println("Число " + playerGuess + " больше того, что загадал компьютер\n");
        } else {
            System.out.println("Число " + playerGuess + " меньше того, что загадал компьютер\n");
        }
    }

    public void printAttempts(Player currentPlayer) {
        System.out.println("Попытки " + currentPlayer.getName() + ": ");
        for (int nums : currentPlayer.getAllNumbers()) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}