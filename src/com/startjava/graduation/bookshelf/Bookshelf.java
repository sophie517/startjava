package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private int numOfBooks;
    private Book[] books = new Book[CAPACITY];
    private int lenShelves;

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, numOfBooks);
    }

    public int getNumOfFreeShelves() {
        return CAPACITY - numOfBooks;
    }

    public int getLenShelves() {
        return lenShelves;
    }

    public String add(String info) {
        if (numOfBooks >= CAPACITY) {
            throw new RuntimeException("В шкафу закончилось место");
        }
        try {
            books[numOfBooks] = new Book(info);
            lenShelves = Math.max(books[numOfBooks++].getLen(), lenShelves);
        } catch (RuntimeException e) {
            throw new RuntimeException("Информация о книге введена неверно\n");
        }
        return "Книга добавлена";
    }

    public String find(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i].toString();
            }
        }
        throw new RuntimeException("Такой книги нет в шкафу");
    }

    public String delete(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                boolean isLongest = books[i].getLen() == lenShelves;
                System.arraycopy(books, i + 1, books, i, (CAPACITY - i - 1));
                numOfBooks--;
                if (isLongest) {
                    lenShelves = 0;
                    for (int j = 0; j < numOfBooks; j++) {
                        lenShelves = Math.max(books[j].getLen(), lenShelves);
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
