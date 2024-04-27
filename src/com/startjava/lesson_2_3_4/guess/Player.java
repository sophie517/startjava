package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;
    private String name;
    private int[] allNumbers = new int[GuessNumber.MAX_ATTEMPTS];
    private int attempts;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getWins() {
        return wins;
    }

    public void setWin(int win) {
        wins = win;
    }

    public void addNumber(int number) {
        if (number <= MIN_VALUE || number > MAX_VALUE) {
            throw new RuntimeException("Число должно быть из полуинтервала (0, 100]");
        }
        allNumbers[attempts++] = number;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, attempts);
    }

    public int getLastNumber() {
        return allNumbers[attempts - 1];
    }

    public void clear() {
        Arrays.fill(allNumbers, 0, attempts, 0);
        attempts = 0;
    }
}