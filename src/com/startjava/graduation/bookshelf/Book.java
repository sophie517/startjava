package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publicationYear;
    private int len;

    public Book(String info) {
        String[] parts = info.split(", ");
        author = parts[0];
        title = parts[1];
        publicationYear = Integer.parseInt(parts[2]);
        len = info.length();
    }

    public String getTitle() {
        return title;
    }

    public int getLen() {
        return len;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}
