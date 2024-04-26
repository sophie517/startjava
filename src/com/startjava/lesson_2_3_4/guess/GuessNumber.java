package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static final int MAX_ATTEMPTS = 10;
    private Player[] players = new Player[3];
    private Player currentPlayer;
    private int hiddenNumber;
    private static final int NUMBER_OF_ROUNDS = 3;
    private Scanner sc = new Scanner(System.in);
    
    public GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
        makeQueue();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("\nРаунд начался! У каждого игрока по " + MAX_ATTEMPTS + " попыток.\n");

            hiddenNumber = 1 + (int) (Math.random() * 100);
            currentPlayer = players[0];

            while (true) {
                while (true) {
                    try {
                        inputPlayerGuess();
                        break;
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (isGuessed()) break;
                if (checkAttempts()) break;
                currentPlayer = changePlayer();
            }
            endRound();
        }
        decideWinner();
        endGame();
    }

    public void inputPlayerGuess() {
        System.out.print(currentPlayer.getName() + ", введи число: ");
        int playerGuess = sc.nextInt();
        currentPlayer.addNumber(playerGuess);
    }

    public boolean isGuessed() {
        int playerGuess = currentPlayer.getLastNumber();
        if (playerGuess == hiddenNumber) {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                    playerGuess + " с " + (currentPlayer.getAttempts()) + " попытки\n");
            currentPlayer.setWins(currentPlayer.getWins() + 1);
            return true;
        }
        System.out.print("Число " + currentPlayer.getLastNumber());
        System.out.print(currentPlayer.getLastNumber() > hiddenNumber ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер\n");
        return false;
    }

    public boolean checkAttempts() {
        if (currentPlayer.getAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
            if (currentPlayer == players[2]) {
                return true;
            }
        }
        return false;
    }

    public Player changePlayer() {
        if (currentPlayer == players[0]) {
            return players[1];
        } else if (currentPlayer == players[1]) {
            return players[2];
        }
        return players[0];
    }

    public void printAttempts() {
        for (Player player : players) {
            System.out.println("Попытки " + player.getName() + ": ");
            for (int numbers : player.getAllNumbers()) {
                System.out.print(numbers + " ");
            }
            System.out.println();
        }
    }

    public void endRound() {
        printAttempts();
        for (Player player : players) {
            player.clear();
        }
    }

    public void makeQueue() {
        int len = players.length;
        Player[] queue = new Player[len];
        for (int i = len - 1; i >= 0; i--) {
            int randomNumber = (int) (Math.random() * (i + 1));
            queue[i] = players[randomNumber];
            players[randomNumber] = players[i];
            players = Arrays.copyOf(players, i);
        }
        players = queue;
        System.out.println("Очередь ввода чисел:");
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].getName());
        }
    }

    public void decideWinner() {
        boolean isDraw = players[0].getWins() == players[1].getWins() &&
                players[1].getWins() == players[2].getWins();
        if (isDraw) {
            System.out.println("\nПобедила дружба!");
        }
        
        Player winner = players[0];
        for (Player player : players) {
            if (player.getWins() > winner.getWins()) {
                winner = player;
            }
        }
        System.out.println("\nПобедил игрок " + winner.getName());
    }

    public void endGame() {
        for (Player player : players) {
            player.setWins(0);
        }
    }
}