package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private static final int MAX_ATTEMPTS = 10;
    private Player[] players = new Player[3];
    private Player currentPlayer;
    private int hiddenNumber;
    private Scanner sc = new Scanner(System.in);
    
    public GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
    }

    public void start() {
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
            changePlayer();
        }
        endRound();
    }

    public void inputPlayerGuess() {
        System.out.print(currentPlayer.getName() + ", введи число: ");
        int playerGuess = sc.nextInt();
        currentPlayer.addNumber(playerGuess);
    }

    public boolean isGuessed() {
        int playerGuess = currentPlayer.takePlayerGuess();
        if (playerGuess == hiddenNumber) {
            System.out.println("\nИгрок " + currentPlayer.getName() + " угадал число " +
                    playerGuess + " с " + (currentPlayer.getAttempt()) + " попытки\n");
            currentPlayer.setNumOfWins(currentPlayer.getNumOfWins() + 1);
            return true;
        }
        System.out.print("Число " + currentPlayer.takePlayerGuess());
        System.out.print(currentPlayer.takePlayerGuess() > hiddenNumber ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер\n");
        return false;
    }

    public boolean checkAttempts() {
        if (currentPlayer.getAttempt() == MAX_ATTEMPTS) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки\n");
            if (currentPlayer == players[2]) {
                return true;
            }
        }
        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == players[0]) ? players[1] :
                (currentPlayer == players[1]) ? players[2] : players[0];
    }

    public void printAttempts(Player currentPlayer) {
        System.out.println("Попытки " + currentPlayer.getName() + ": ");
        for (int numbers : currentPlayer.getAllNumbers()) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }

    public void endRound() {
        for (Player player : players) {
            printAttempts(player);
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

    public String decideWinner() {
        boolean isDraw = players[0].getNumOfWins() == players[1].getNumOfWins() &&
                players[1].getNumOfWins() == players[2].getNumOfWins();
        if (isDraw) {
            return "\nПобедила дружба!";
        }
        
        Player winner = players[0];
        for (Player player : players) {
            if (player.getNumOfWins() > winner.getNumOfWins()) {
                winner = player;
            }
        }
        return "\nПобедил игрок " + winner.getName();
    }

    public void endGame() {
        for (Player player : players) {
            player.setNumOfWins(0);
        }
    }
}