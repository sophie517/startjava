package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    public static final int MAX_NUM_OF_BOOKS = 10;
    private int numOfBooks;
    private Book[] books = new Book[MAX_NUM_OF_BOOKS];
    private Scanner sc = new Scanner(System.in);
    private int maxLen;

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, numOfBooks);
    }

    public int getNumOfFreeShelves() {
        return MAX_NUM_OF_BOOKS - numOfBooks;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public String add() {
        if (numOfBooks == MAX_NUM_OF_BOOKS) {
            throw new RuntimeException("В шкафу закончилось место");
        }

        System.out.println("Через запятую введите информацию о книге: автора, название и год издания");
        try {
            books[numOfBooks] = new Book(sc.nextLine());
            maxLen = Math.max(books[numOfBooks++].getLen(), maxLen);
        } catch (RuntimeException e) {
            throw new RuntimeException("Информация о книге введена неверно\n");
        }
        return "Книга добавлена";
    }

    public String find() {
        System.out.print("Введите название книги: ");
        String name = sc.nextLine();
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getName().equalsIgnoreCase(name)) {
                return books[i].toString();
            }
        }
        throw new RuntimeException("Такой книги нет в шкафу");
    }

    public String delete() {
        System.out.print("Введите название книги: ");
        String name = sc.nextLine();
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getName().equalsIgnoreCase(name)) {
                boolean isLongest = books[i].getLen() == maxLen;
                System.arraycopy(books, i + 1, books, i, (MAX_NUM_OF_BOOKS - i - 1));
                numOfBooks--;
                if (isLongest) {
                    maxLen = 0;
                    for (int j = 0; j < numOfBooks; j++) {
                        maxLen = Math.max(books[j].getLen(), maxLen);
                    }
                }
                return "Книга удалена";
            }
        }
        throw new RuntimeException("Такой книги нет в шкафу");
    }

    public String clear() {
        Arrays.fill(books, null);
        numOfBooks = 0;
        return "Шкаф пуст";
    }
}
