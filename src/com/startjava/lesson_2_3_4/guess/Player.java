package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] allNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, attempt);
    }

    public void addNumber(int number) {
        allNumbers[attempt++] = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(allNumbers, 0, attempt, 0);
        attempt = 0;
    }
}