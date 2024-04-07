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
            len--;
            int swap = ints[i];
            ints[i] = ints[len];
            ints[len] = swap;
        }

        System.out.print("После реверса: ");
        printArray(ints);
    }

    public static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] factorialNums = new int[10];
        int len = factorialNums.length;

        for (int i = 0; i < len; i++) {
            factorialNums[i] = i;
        }

        int factorial = 1;

        for (int i = factorialNums[1]; i < factorialNums[len - 1]; i++) {
            factorial *= i;
            System.out.print((i != factorialNums[len - 2]) ? factorialNums[i] + " * " : factorialNums[i]);
        }
        System.out.println(" = " + factorial);
    }

    public static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");
        float[] floats = new float[15];
        int len = floats.length;

        for (int i = 0; i < len; i++) {
            floats[i] = (float) Math.random();
        }

        System.out.println("Исходный массив: ");
        printArray(floats);

        float middleElement = floats[len / 2];
        int numOfZeros = 0;

        for (int i = 0; i < len; i++) {
            if (floats[i] > middleElement) {
                floats[i] = 0.0f;
                numOfZeros++;
            }
        }

        System.out.println("\n\nИзмененный массив: ");
        printArray(floats);
        System.out.println("\n\nКоличество обнуленных ячеек: " + numOfZeros);
    }

    public static void printAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] letters = new char[26];
        int numOfLetters = letters.length;
        int len = letters.length;

        for (int i = 0; i < len; i++) {
            letters[i] = (char) ('A' + i);
        }

        while (numOfLetters > 0) {
            for (int i = len; i >= numOfLetters; i--) {
                System.out.print(letters[i - 1]);
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
            boolean isNumNew = true;
            int newNum = 60 + (int) (Math.random() * 40);

            while (true) {
                for (int i = 0; i <= currentSpot; i++) {
                    if (newNum == uniqueNums[i]) {
                        isNumNew = false;
                        break;
                    }
                }
                break;
            }

            if (isNumNew) {
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
        System.out.println("У вас 8 попыток угадать слово");
        char[] word = {'в', 'о', 'д', 'о', 'л', 'а', 'з'};
        float choiceOfWord = (float) Math.random();

        if (choiceOfWord < 0.2) {
            word = new char[]{'в', 'т', 'о', 'р', 'н', 'и', 'к'};
        } else if (choiceOfWord < 0.4) {
            word = new char[]{'о', 'в', 'ч', 'а', 'р', 'к', 'а'};
        } else if (choiceOfWord < 0.6) {
            word = new char[]{'к', 'о', 'т', 'л', 'е', 'т', 'а'};
        } else if (choiceOfWord < 0.8) {
            word = new char[]{'а', 'й', 'с', 'б', 'е', 'р', 'г'};
        }

        Scanner sc = new Scanner(System.in);
        StringBuilder enteredLetters = new StringBuilder();
        StringBuilder wordStatus = new StringBuilder("_______");
        int guessedLettersCounter = 0;
        int mistakeCounter = 0;
        StringBuilder wrongLetters = new StringBuilder();
        int len = word.length;
        String[] picture = {" -------",
                            " |     |",
                            " |     O",
                            " |   --|--",
                            " |     |",
                            " |    / \\",
                            " | ",
                            "---"};

        while (mistakeCounter < picture.length && guessedLettersCounter < len) {
            while (true) {
                boolean isLetterGuessed = false;

                System.out.print("Введите букву: ");
                char playerGuess = sc.next().toLowerCase().charAt(0);

                if (enteredLetters.toString().contains("" + playerGuess)) {
                    System.out.println("эту букву уже вводили!\n");
                    break;
                }

                for (int i = 0; i < len; i++) {
                    if (word[i] == playerGuess) {
                        wordStatus.replace(i, i + 1, ("" + playerGuess));
                        isLetterGuessed = true;
                        guessedLettersCounter++;
                    }
                    enteredLetters.append(" ").append(playerGuess);
                }

                if (isLetterGuessed && mistakeCounter != 0) {
                    mistakeCounter--;
                } else if (!isLetterGuessed) {
                    mistakeCounter++;
                    wrongLetters.append(playerGuess).append(" ");
                    System.out.print("Ошибка!\n");
                    for (int j = 0; j < mistakeCounter; j++) {
                        System.out.println(picture[j]);
                    }
                    for (int j = 0; j < 8 - mistakeCounter; j++) {
                        System.out.println();
                    }
                }

                System.out.println("\nСлово: " + wordStatus);
                System.out.println("Осталось " + (8 - mistakeCounter) + " попыток");
                System.out.println("Ошибочные буквы: " + wrongLetters);
                System.out.println();
                break;
            }
        }
        System.out.print((guessedLettersCounter == len) ? "Вы победили!" : "Вы проиграли :(");
    }

    private static void printTextWithEffect() throws InterruptedException {
        System.out.println("\n\n7. Вывод текста с эффектом пишущей машинки");
        String str = "Java -- это C++, из которого убрали все пистолеты, ножи и дубинки. \n-- James Gosling";
        
        String[] words = str.split(" ");
        String minLen = words[0];
        String maxLen = words[0];
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int i = 0; i < words.length; i++) {
            if (minLen.length() > words[i].length()) {
                minLen = words[i];
                minIndex = i;
            }
            if (maxLen.length() < words[i].length()) {
                maxLen = words[i];
                maxIndex = i;
            }
        }

        int swap;
        if (minIndex > maxIndex) {
            swap = minIndex;
            minIndex = maxIndex;
            maxIndex = swap;
        }

        StringBuilder fixedStr = new StringBuilder();
        for (int i = minIndex; i <= maxIndex; i++) {
            words[i] = words[i].toUpperCase();
        }
        for (String word : words) {
            fixedStr.append(word).append(" ");
        }

        String[] letters = fixedStr.toString().split("");
        for (String letter : letters) {
            System.out.print(letter);
            Thread.sleep(100);
        }
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) System.out.print(array[i] + ", ");
        System.out.println(array[array.length - 1] + "]");
    }

    private static void printArray(float[] array) {
        for (int i = 0; i < 8; i++) System.out.printf("%5.3f%s", array[i], ", ");
        System.out.println();
        for (int i = 8; i < array.length - 1; i++) System.out.printf("%5.3f%s", array[i], ", ");
        System.out.printf("%5.3f", array[array.length - 1]);
    }
}
