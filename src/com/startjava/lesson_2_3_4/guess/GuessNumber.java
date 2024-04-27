package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    public static final int MAX_ATTEMPTS = 10;
    private static final int ROUNDS = 3;
    public static final int PLAYERS = 3;
    private Player[] players = new Player[PLAYERS];
    private Player currentPlayer;
    private int currentPlayerIndex;
    private int hiddenNumber;
    private Scanner sc = new Scanner(System.in);
    
    public GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        castLots();
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("\nРаунд начался! У каждого игрока по " + MAX_ATTEMPTS + " попыток.\n");

            hiddenNumber = 1 + (int) (Math.random() * 100);
            currentPlayer = players[0];
            currentPlayerIndex = 0;

            while (true) {
                inputPlayerGuess();
                if (isGuessed()) break;
                if (hasAttempts()) break;
                changePlayer();
            }
            endRound();
        }
        System.out.println(decideWinner());
        endGame();
    }

    public void castLots() {
        for (int i = PLAYERS - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            Player swap = players[i];
            players[i] = players[index];
            players[index] = swap;
        }

        System.out.println("Очередь ввода чисел:");
        for (int i = 0; i < PLAYERS; i++) {
            System.out.println((i + 1) + ". " + players[i].getName());
        }
    }

    public void inputPlayerGuess() {
        while (true) {
            System.out.print(currentPlayer.getName() + ", введи число: ");
            int playerGuess = sc.nextInt();
            try {
                currentPlayer.addNumber(playerGuess);
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean isGuessed() {
        int playerGuess = currentPlayer.getLastNumber();
        if (playerGuess == hiddenNumber) {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                    playerGuess + " с " + (currentPlayer.getAttempts()) + " попытки\n");
            currentPlayer.setWin(currentPlayer.getWins() + 1);
            return true;
        }
        System.out.print("Число " + currentPlayer.getLastNumber());
        System.out.print(currentPlayer.getLastNumber() > hiddenNumber ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер\n");
        return false;
    }

    public boolean hasAttempts() {
        if (currentPlayer.getAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
            if (currentPlayerIndex == PLAYERS - 1) {
                return true;
            }
        }
        return false;
    }

    public void changePlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % PLAYERS;
        currentPlayer = players[currentPlayerIndex];
    }

    public void endRound() {
        printAttempts();
        for (Player player : players) {
            player.clear();
        }
    }

    public void printAttempts() {
        for (Player player : players) {
            System.out.println("Попытки " + player.getName() + ": ");
            for (int number : player.getAllNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public String decideWinner() {
        boolean isDraw = true;
        for (int i = 0; i < PLAYERS - 1; i++) {
            if (players[i].getWins() != players[i + 1].getWins()) {
                isDraw = false;
                break;
            }
        }

        if (isDraw) {
            return "\nПобедила дружба!";
        }
        
        Player winner = players[0];
        for (Player player : players) {
            if (player.getWins() > winner.getWins()) {
                winner = player;
            }
        }
        return "\nПобедил игрок " + winner.getName();
    }

    public void endGame() {
        for (Player player : players) {
            player.setWin(0);
        }
    }
}