package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int ADD = 1;
    private static final int FIND = 2;
    private static final int DELETE = 3;
    private static final int CLEAR = 4;
    private static final int EXIT = 5;
    private static Scanner sc = new Scanner(System.in);
    private static Bookshelf shelf = new Bookshelf();
    private static int operation;

    public static void main(String[] args) {
        while (true) {
            start();
            while (true) {
                try {
                    inputOperation();
                    if (operation == EXIT) return;
                    runOperation();
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Для продолжения нажмите Enter");
            sc.nextLine();
        }
    }

    public static void start() {
        if (shelf.getNumOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else printBookshelf();
        printMenu();
    }

    public static void printBookshelf() {
        System.out.print("В шкафу книг - " + shelf.getNumOfBooks());
        System.out.println(", свободно полок - " + shelf.getNumOfFreeShelves());
        System.out.println();
        int len = shelf.getLenShelves();
        for (Book book : shelf.getAllBooks()) {
            System.out.print("| " + book.toString());
            System.out.println(" ".repeat(len - book.toString().length()) + " |");
            System.out.println("|" + "-".repeat(len + 2) + "|");
        }
        System.out.println("|" + " ".repeat(len + 2) + "|");
    }

    public static void printMenu() {
        System.out.println("Меню: \n" +
                           ADD + ". Добавить книгу \n" +
                           FIND + ". Найти книгу по названию \n" +
                           DELETE + ". Удалить книгу по названию \n" +
                           CLEAR + ". Очистить шкаф \n" +
                           EXIT + ". Завершить работу с шкафом");
    }

    public static void inputOperation() {
        try {
            System.out.print("Введите номер операции: ");
            operation = sc.nextInt();
            sc.nextLine();
        } catch (RuntimeException e) {
            sc.nextLine();
            throw new RuntimeException("Недопустимая команда");
        }
    }

    public static void runOperation() {
        switch (operation) {
            case ADD -> addBook();
            case FIND -> findBook();
            case DELETE -> deleteBook();
            case CLEAR -> clearBookshelf();
            default -> throw new RuntimeException("Такой операции нет");
        }
    }

    public static void addBook() {
        System.out.println("Через запятую введите информацию о книге: " +
                "автора, название и год издания");
        try {
            Book book;
            try {
                book = new Book(sc.nextLine());
            } catch (RuntimeException e) {
                throw new RuntimeException("Информация о книге введена неверно");
            }
            shelf.add(book);
            System.out.println("Книга добавлена");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findBook() {
        Book book = shelf.find(inputBookTitle());
        System.out.println(book != null ? book.toString() : "Книга не найдена");
    }

    public static String inputBookTitle() {
        System.out.print("Введите название книги: ");
        return sc.nextLine();
    }

    public static void deleteBook() {
        System.out.println(shelf.isDeleted(inputBookTitle()) ? "Книга удалена" : "Книга не найдена");
    }

    public static void clearBookshelf() {
        shelf.clear();
        System.out.println("Шкаф пуст");
    }
}
