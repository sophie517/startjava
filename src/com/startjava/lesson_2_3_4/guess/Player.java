package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] allNumbers = new int[10];
    private int attempt;
    private int numOfWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public int getNumOfWins() {
        return numOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        this.numOfWins = numOfWins;
    }

    public int takePlayerGuess() {
        return getAllNumbers()[attempt - 1];
    }

    public void addNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new RuntimeException("Число должно быть из полуинтервала (0, 100]");
        }
        allNumbers[attempt++] = number;
    }

    public void clear() {
        Arrays.fill(allNumbers, 0, attempt, 0);
        attempt = 0;
    }
}