package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private int year;
    private int len;

    public Book(String info) {
        String[] parts = info.split(", ");
        author = parts[0];
        name = parts[1];
        year = Integer.parseInt(parts[2]);
        len = info.length();
    }

    public String getName() {
        return name;
    }

    public int getLen() {
        return len;
    }

    public String toString() {
        return author + ", " + name + ", " + year;
    }
}
