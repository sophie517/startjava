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

    public static void main(String[] args) {
        while (true) {
            start();
            while (true) {
                try {
                    int operation = inputOperation();
                    if (operation == EXIT) return;
                    runOperation(operation);
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("\nДля продолжения нажмите Enter");
            sc.nextLine();
        }
    }

    private static void start() {
        if (shelf.getNumOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else printBookshelf();
        printMenu();
    }

    private static void printBookshelf() {
        System.out.print("В шкафу книг - " + shelf.getNumOfBooks());
        System.out.println(", свободно полок - " + shelf.getNumOfFreeShelves());
        System.out.println();
        int len = shelf.getLenShelves();
        for (Book book : shelf.getAllBooks()) {
            System.out.println("| " + book + " ".repeat(len - book.toString().length()) + " |");
            System.out.println("|" + "-".repeat(len + 2) + "|");
        }
        System.out.println("|" + " ".repeat(len + 2) + "|");
    }

    private static void printMenu() {
        System.out.println("""
                \nМеню:\s
                1. Добавить книгу\s
                2. Найти книгу по названию\s
                3. Удалить книгу по названию\s
                4. Очистить шкаф\s
                5. Завершить работу с шкафом""");
    }

    private static int inputOperation() {
        try {
            System.out.print("\nВведите номер операции: ");
            int operation = sc.nextInt();
            sc.nextLine();
            return operation;
        } catch (RuntimeException e) {
            sc.nextLine();
            throw new RuntimeException("Недопустимая команда");
        }
    }

    private static void runOperation(int operation) {
        switch (operation) {
            case ADD -> addBook();
            case FIND -> findBook();
            case DELETE -> deleteBook();
            case CLEAR -> clearBookshelf();
            default -> throw new RuntimeException("Такой операции нет");
        }
    }

    private static void addBook() {
        System.out.println("Через запятую введите информацию о книге: " +
                "автор, название, год издания");
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

    private static void findBook() {
        Book book = shelf.find(inputTitle());
        System.out.println(book != null ? book.toString() : "Книга не найдена");
    }

    private static String inputTitle() {
        System.out.print("Введите название книги: ");
        return sc.nextLine();
    }

    private static void deleteBook() {
        System.out.println(shelf.delete(inputTitle()) ? "Книга удалена" : "Книга не найдена");
    }

    private static void clearBookshelf() {
        shelf.clear();
        System.out.println("Шкаф пуст");
    }
}
