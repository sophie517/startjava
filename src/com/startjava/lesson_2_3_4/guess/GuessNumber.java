package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private int hiddenNumber;
    private int maxAttempts = 10;
    
    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по " + maxAttempts + " попыток.\n");

        player1.clear();
        player2.clear();
        hiddenNumber = 1 + (int) (Math.random() * 100);
        currentPlayer = player1;

        while (true) {
            setUserGuess();
            if (isGuessed()) break;
            if (checkAttempts()) break;
            changePlayer();
        }
        printAttempts(player1);
        printAttempts(player2);
    }

    public void setUserGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + ", введи число: ");
        int playerGuess = sc.nextInt();
        currentPlayer.addNumber(playerGuess);
    }

    public boolean isGuessed() {
        int playerGuess = currentPlayer.getAllNumbers()[currentPlayer.getAttempt() - 1];
        if (playerGuess == hiddenNumber) {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                    playerGuess + " с " + (currentPlayer.getAttempt()) + " попытки\n");
            return true;
        }
        if (playerGuess > hiddenNumber) {
            System.out.println("Число " + playerGuess + " больше того, что загадал компьютер\n");
        } else {
            System.out.println("Число " + playerGuess + " меньше того, что загадал компьютер\n");
        }
        return false;
    }

    public boolean checkAttempts() {
        if (currentPlayer.getAttempt() == maxAttempts) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
            if (currentPlayer == player2) {
                return true;
            }
        }
        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void printAttempts(Player currentPlayer) {
        System.out.println("Попытки " + currentPlayer.getName() + ": ");
        for (int numbers : currentPlayer.getAllNumbers()) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
}