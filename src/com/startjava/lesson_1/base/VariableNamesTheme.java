package com.startjava.lesson_1.base;

public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Разные переменные\n");

        //цифра
        int num = 1;
        System.out.println("цифра " + num);

        //сумма чисел
        int sum = 10;
        System.out.println("сумма чисел: " + sum);

        //произведение цифр
        int productDigits = 45;
        System.out.println("произведение цифр: " + productDigits);

        //максимальное число
        int maxNum = 73;
        System.out.println("максимальное число: " + maxNum);

        //количество десятков
        int numTens = 4;
        System.out.println("количество десятков: " + numTens);

        //вес собаки
        double dogWeight = 12.3;
        System.out.println("вес собаки: " + dogWeight);

        //исходное число
        int initialNum = -2;
        System.out.println("исходное число: " + initialNum);

        //процент по вкладу
        double percent = 8.6;
        System.out.println("процент по вкладу: " + percent);

        //(переменная хранит символ) &
        String ampersand = "&";
        System.out.println("переменная хранит символ &: " + ampersand);

        //код ошибки
        int errorCode = 404;
        System.out.println("код ошибки: " + errorCode);

        //тип сообщения
        String messageType = "ошибка";
        System.out.println("тип сообщения: " + messageType);

        //число нулей
        int numOfZeros = 3;
        System.out.println("число нулей: " + numOfZeros);

        //уникальное число
        int uniqueNum = 777;
        System.out.println("уникальное число: " + uniqueNum);

        //случайное число
        int randomNum = 9;
        System.out.println("случайное число: " + randomNum);

        //математическое выражение
        String mathExpression = "5 + 2 = 7";
        System.out.println("математическое выражение: " + mathExpression);

        //выбор (чего-либо)
        String choice = "a";
        System.out.println("выбор (чего-либо): " + choice);

        //счет в игре
        int score = 145667;
        System.out.println("счет (в игре): " + score);

        //максимальная длина строки
        int maxLen = 30;
        System.out.println("максимальная длина: " + maxLen);

        //пункт меню
        String menuItem = "Справка";
        System.out.println("пункт меню: " + menuItem);

        //стоимость кофе на вынос
        double priceOfTakeawayCoffee = 150d;
        System.out.println("стоимость кофе на вынос: " + priceOfTakeawayCoffee);

        //дата начала экзаменов
        String startDate = "12.06.2024";
        System.out.println("дата начала: " + startDate);

        //окончание диапазона
        int endOfRange = 17;
        System.out.println("окончание диапазона: " + endOfRange);

        //полное имя работника месяца
        String fullNameEmployeeOfMonth = "Иванов Иван Иванович";
        System.out.println("полное имя работника месяца: " + fullNameEmployeeOfMonth);

        //заголовок электронной книги
        String ebookTitle = "Унесенные ветром";
        System.out.println("заголовок электронной книги: " + ebookTitle);

        //размер
        int size = 13;
        System.out.println("размер: " + size);

        //вместимость (чего-либо)
        int capacity = 68000;
        System.out.println("вместимость: " + capacity);

        //счетчик
        int counter = 0;
        System.out.println("счетчик: " + counter);

        //путь до файла
        String filePath = "C:\\Users\\Program Files\\file";
        System.out.println("путь до файла: " + filePath);

        //количество чисел в каждой строке
        int numOfNumsInLine = 15;
        System.out.println("количество чисел в каждой строке: " + numOfNumsInLine);
        
        System.out.println("\n2. boolean-переменные\n");

        //сотни равны?
        boolean hasEqualHundreds = false;
        System.out.println("сотни равны? " + hasEqualHundreds);

        //компьютер включен?
        boolean isComputerTurnedOn = false;
        System.out.println("компьютер включен? " + isComputerTurnedOn);

        //есть равные цифры?
        boolean hasEqualNums = true;
        System.out.println("есть равные цифры? " + !hasEqualNums);

        //(что-либо) создан?
        boolean isCreated = false;
        System.out.println("(что-либо) создано? " + !isCreated);

        //(что-либо) пустое?
        boolean isEmpty = true;
        System.out.println("(что-либо) пустое? " + isEmpty);

        //(что-либо) активное?
        boolean isActive = false;
        System.out.println("(что-либо) активное? " + isActive); 

        //новый?
        boolean isNew = true;
        System.out.println("новый? " + isNew);

        //электронная почта действительная?
        boolean isEmailValid = true;
        System.out.println("электронная почта действительная? " + !isEmailValid);

        //имеются уникальные строки?
        boolean hasUniqueStrings = false;
        System.out.println("имеются уникальные строки? " + hasUniqueStrings);

        System.out.println("\n3. Аббревиатуры\n");

        //старый universally unique identifier
        String oldUuid = "550e8400-e29b...";
        System.out.println("старый universally unique identifier: " + oldUuid);

        //производитель оперативной памяти
        String ramManufacturer = "Samsung";
        System.out.println("производитель оперативной памяти: " + ramManufacturer);

        //емкость жесткого диска
        String hddCapacity = "500GB";
        System.out.println("емкость жесткого диска: " + hddCapacity);

        //протокол передачи гипертекста
        String http = "Hypertext Transfer Protocol";
        System.out.println("протокол передачи гипертекста: " + http);

        //сокращенный uniform resource locator
        String shortUrl = "short URL";
        System.out.println("сокращенный uniform resource locator: " + shortUrl);

        //новый идентификатор клиента
        String newClientId = "new client's identifier";
        System.out.println("новый идентификатор клиента: " + newClientId);

        //кодировка american standard code for information interchange
        int asciiEncoding = 1101001;
        System.out.println("кодировка american standard code for information interchange: " + asciiEncoding);

    }
}