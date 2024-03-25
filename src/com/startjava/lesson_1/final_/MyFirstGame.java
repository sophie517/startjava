package com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 67;
        int playerNumber = 32;
        
        while (playerNumber != hiddenNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber -= 2;
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber += 3;
            }
        }
        System.out.println("Вы победили!");
    }
}