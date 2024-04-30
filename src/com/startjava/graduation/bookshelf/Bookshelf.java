package com.startjava.graduation.bookshelf;

import java.util.Arrays;

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

    public void add(Book book) {
        if (numOfBooks >= CAPACITY) {
            throw new RuntimeException("В шкафу закончилось место");
        }
        books[numOfBooks++] = book;
        lenShelves = Math.max(book.getLen(), lenShelves);
    }

    public Book find(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean isDeleted(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                int len = books[i].getLen();
                System.arraycopy(books, i + 1, books, i, (CAPACITY - i - 1));
                numOfBooks--;
                if (len == lenShelves) {
                    lenShelves = 0;
                    for (Book book : getAllBooks()) {
                        lenShelves = Math.max(book.getLen(), lenShelves);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, numOfBooks, null);
        numOfBooks = 0;
    }
}
