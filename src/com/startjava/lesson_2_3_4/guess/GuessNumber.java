package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        int maxAttempts = 10;
        System.out.println("Игра началась! У каждого игрока по " + maxAttempts + " попыток.\n");
        
        Player currentPlayer = player1;
        for (int i = 0; i < 2; i++) {
            currentPlayer.clear();
            currentPlayer = player2;
        }
        
        currentPlayer = player1;
        Scanner sc = new Scanner(System.in);
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        
        while (true) {
            System.out.print(currentPlayer.getName() + ", введи число: ");
            currentPlayer.setNumber(sc.nextInt());
            currentPlayer.addNumber(currentPlayer.getNumber());

            if (currentPlayer.getNumber() == hiddenNumber) {
                System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                        currentPlayer.getNumber() + " с " + (currentPlayer.getAttempt()) + " попытки\n");
                break;
            }
            estimateNumber(currentPlayer, hiddenNumber);

            if (currentPlayer.getAttempt() == maxAttempts - 1) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
                if (currentPlayer == player2) {
                    break;
                }
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        printAttempts();
    }

    public void estimateNumber(Player currentPlayer, int hiddenNumber) {
        if (currentPlayer.getNumber() > hiddenNumber) {
            System.out.println("Число " + currentPlayer.getNumber() +
                    " больше того, что загадал компьютер\n");
        } else {
            System.out.println("Число " + currentPlayer.getNumber() +
                    " меньше того, что загадал компьютер\n");
        }
    }

    public void printAttempts() {
        Player currentPlayer = player1;
        for (int i = 0; i < 2; i++) {
            System.out.println("Попытки " + currentPlayer.getName() + ": ");
            for (int nums : currentPlayer.getAllNumbers()) {
                System.out.print(nums + " ");
            }
            System.out.println();
            currentPlayer = player2;
        }
    }
}