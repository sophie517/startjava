package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] allNumbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, attempt);
    }

    public void addNumber(int number) {
        allNumbers[attempt] = number;
        attempt++;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(allNumbers, 0, attempt + 1, 0);
        attempt = 0;
    }
}