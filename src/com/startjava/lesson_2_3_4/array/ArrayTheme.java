package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTheme {
    public static void main(String[] args) throws InterruptedException {
        reverseArrayElements();
        calculateFactorial();
        deleteArrayElements();
        printAlphabet();
        fillArrayWithUniqueNumbers();
        playHangmanGame();
        printTextWithEffect();
    }

    public static void reverseArrayElements() {
        System.out.println("\n1. Реверс значений массива");
        int[] ints = {4, 7, 6, 3, 2, 5, 1};
        int len = ints.length;

        System.out.print("   До реверса: ");
        printArray(ints);

        for (int i = 0; i < len; i++) {
            int swap = ints[i];
            ints[i] = ints[--len];
            ints[len] = swap;
        }

        System.out.print("После реверса: ");
        printArray(ints);
    }

    public static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] multipliers = new int[10];
        int len = multipliers.length;

        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int factorial = 1;
        for (int i = 1; i < len - 1; i++) {
            factorial *= i;
            System.out.print(multipliers[i]);
            System.out.print((i != len - 2) ? " * " : " = ");
        }
        System.out.println(factorial);
    }

    public static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        float[] randomFloats = new float[15];
        int len = randomFloats.length;

        for (int i = 0; i < len; i++) {
            randomFloats[i] = (float) Math.random();
        }

        System.out.println("Исходный массив: ");
        printArray(randomFloats);

        float middleElement = randomFloats[len / 2];
        int numOfZeros = 0;

        for (int i = 0; i < len; i++) {
            if (randomFloats[i] > middleElement) {
                randomFloats[i] = 0.0f;
                numOfZeros++;
            }
        }

        System.out.println("\n\nИзмененный массив: ");
        printArray(randomFloats);
        System.out.println("\n\nКоличество обнуленных ячеек: " + numOfZeros);
    }

    public static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int numOfLetters = alphabet.length;
        int len = alphabet.length;

        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        while (numOfLetters > 0) {
            for (int i = len; i >= numOfLetters; i--) {
                System.out.print(alphabet[i - 1]);
            }
            numOfLetters--;
            System.out.println();
        }
    }

    public static void fillArrayWithUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNums = new int[30];
        int currentSpot = 0;
        int len = uniqueNums.length;

        while (currentSpot < len) {
            boolean isUnique = true;
            int newNum = 60 + (int) (Math.random() * 40);

            while (true) {
                for (int i = 0; i <= currentSpot; i++) {
                    if (newNum == uniqueNums[i]) {
                        isUnique = false;
                        break;
                    }
                }
                break;
            }

            if (isUnique) {
                uniqueNums[currentSpot] = newNum;
                currentSpot++;
            }
        }

        Arrays.sort(uniqueNums);
        int startOfLine = 0;

        while (startOfLine != len) {
            for (int i = startOfLine; i < startOfLine + 10; i++) {
                System.out.print(uniqueNums[i] + " ");
            }
            System.out.println();
            startOfLine += 10;
        }
    }

    public static void playHangmanGame() {
        System.out.println("\n6. Игра “Виселица”");
        String[] words = {"ВОДОЛАЗ", "ВТОРНИК", "ОВЧАРКА", "КОТЛЕТА", "АЙСБЕРГ"};
        String hiddenWord = words[(int) (Math.random() * words.length)];
        Scanner sc = new Scanner(System.in, "cp866");
        int len = hiddenWord.length();
        StringBuilder maskWord = new StringBuilder("_".repeat(len));
        int mistakeCounter = 0;
        StringBuilder wrongLetters = new StringBuilder();
        String[] gallows = {" -------",
                            " |     |",
                            " |     O",
                            " |   --|--",
                            " |     |",
                            " |    / \\",
                            " | ",
                            "---"};
        int maxAttempts = gallows.length;

        System.out.println("У вас " + maxAttempts + " попыток угадать слово");
        while (mistakeCounter < maxAttempts && !hiddenWord.contentEquals(maskWord)) {
            while (true) {
                boolean isLetterGuessed = false;

                System.out.print("Введите букву: ");
                char playerGuess = sc.next().toUpperCase().charAt(0);

                if (maskWord.toString().contains("" + playerGuess) ||
                        wrongLetters.toString().contains("" + playerGuess)) {
                    System.out.println("эту букву уже вводили!\n");
                    break;
                }

                int index = 0;
                while (index < len) {
                    int indexOfLetter = hiddenWord.indexOf(playerGuess, index);
                    if (indexOfLetter >= index) {
                        maskWord.setCharAt(indexOfLetter, playerGuess);
                        isLetterGuessed = true;
                    }
                    index++;
                }

                if (isLetterGuessed && mistakeCounter != 0) {
                    mistakeCounter--;
                } else if (!isLetterGuessed) {
                    mistakeCounter++;
                    wrongLetters.append(playerGuess).append(" ");
                    System.out.print("Ошибка!\n");
                }

                for (int i = 0; i < mistakeCounter; i++) {
                    System.out.println(gallows[i]);
                }
                for (int i = 0; i < maxAttempts - mistakeCounter; i++) {
                    System.out.println();
                }

                System.out.println("\nСлово: " + maskWord);
                System.out.println("Осталось " + (maxAttempts - mistakeCounter) + " попыток");
                System.out.println("Ошибочные буквы: " + wrongLetters);
                System.out.println();
                break;
            }
        }
        System.out.print((mistakeCounter < maxAttempts) ? "Вы победили!" : "Вы проиграли :(");
    }

    private static void printTextWithEffect() throws InterruptedException {
        System.out.println("\n\n7. Вывод текста с эффектом пишущей машинки");
        String text = "Java -- это C++, из которого убрали все пистолеты, ножи и дубинки. \n-- James Gosling";
        char[] symbols = text.toCharArray();
        String newText = "";

        for (char symbol : symbols) {
            if ((symbol >= '!' && symbol <= '"') || (symbol >= '(' && symbol <= ')') ||
                    (symbol >= ',' && symbol <= '.') || (symbol >= ':' && symbol <= ';') || symbol == '?') {
                newText += " ";
            } else {
                newText += "" + symbol;
            }
        }

        String[] words = newText.split(" ");
        String minLen = words[0];
        String maxLen = words[0];

        for (int i = 0; i < words.length; i++) {
            if (minLen.length() > words[i].length() && !words[i].isBlank()) {
                minLen = words[i];
            }
            if (maxLen.length() < words[i].length()) {
                maxLen = words[i];
            }
        }
        System.out.println("Самое короткое слово: " + minLen);
        System.out.println("Самое длинное слово: " + maxLen);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static void printArray(float[] array) {
        int len = array.length;
        for (int i = 0; i <= len / 2; i++) {
            System.out.printf("%5.3f%s", array[i], ", ");
        }
        System.out.println();
        for (int i = len / 2 + 1; i < len - 1; i++) {
            System.out.printf("%5.3f%s", array[i], ", ");
        }
        System.out.printf("%5.3f", array[len - 1]);
    }
}
