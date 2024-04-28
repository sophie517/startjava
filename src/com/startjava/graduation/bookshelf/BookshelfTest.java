package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner sc = new Scanner(System.in);
    private static Bookshelf shelf = new Bookshelf();
    private static int operation;

    public static void main(String[] args) {
        while (true) {
            start();
            while (true) {
                try {
                    inputOperation();
                    if (operation == 5) return;
                    System.out.println(runOperation());
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Для продолжения нажмите Enter");
            sc.nextLine();
            sc.nextLine();
        }
    }

    public static void start() {
        if (shelf.getNumOfBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else printBookshelf();
        System.out.println("""
                Меню:\s
                1. Добавить книгу\s
                2. Найти книгу по названию\s
                3. Удалить книгу по названию\s
                4. Очистить шкаф\s
                5. Завершить работу с шкафом""");
    }

    public static void printBookshelf() {
        int height = shelf.getNumOfBooks();
        int length = shelf.getMaxLen();
        System.out.println("В шкафу книг - " + height + ", сободно полок - " + shelf.getNumOfFreeShelves());
        System.out.println();
        for (int i = 0; i < height; i++) {
            String book = shelf.getAllBooks()[i].toString();
            System.out.println("| " + book + " ".repeat(length - book.length()) + " |");
            System.out.println("|" + "-".repeat(length + 2) + "|");
        }
        System.out.println(height != Bookshelf.MAX_NUM_OF_BOOKS ? "|" + " ".repeat(length + 2) + "|" : "");
    }

    public static void inputOperation() {
        try {
            System.out.print("Введите номер операции: ");
            operation = sc.nextInt();
        } catch (RuntimeException e) {
            sc.nextLine();
            throw new RuntimeException("Недопустимая команда");
        }
    }

    public static String runOperation() {
        return switch (operation) {
            case 1 -> shelf.add();
            case 2 -> shelf.find();
            case 3 -> shelf.delete();
            case 4 -> shelf.clear();
            default -> throw new RuntimeException("Такой операции нет");
        };
    }
}
