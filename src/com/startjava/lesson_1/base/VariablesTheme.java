package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte bitDepth = 64;
        short displayMemory = 496;
        int memory = 4096;
        long batteryCapacity = 6000;
        float screenWeight = 3.546f;
        double cpuFrequency = 2.3;
        char firstLetterOfOs = 'W';
        boolean hasFreeSpace = true;

        System.out.println("разрядность ОС: " + bitDepth);
        System.out.println("память дисплея, МБ: " + displayMemory);
        System.out.println("память, МБ: " + memory);
        System.out.println("емкость батареи, мАч: " + batteryCapacity);
        System.out.println("вес экрана, кг: " + screenWeight);
        System.out.println("частота процессора, ГГц: " + cpuFrequency);
        System.out.println("первая буква в названии ОС: " + firstLetterOfOs);
        System.out.println("есть ли свободное место? " + hasFreeSpace);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        int discount = 11;
        double discountAmount = discount * totalPrice / 100;
        double discountPrice = totalPrice - discountAmount;

        System.out.println("общая стоимость товаров без скидки: " + totalPrice);
        System.out.println("сумма скидки: " + discountAmount);
        System.out.println("общая стоимость товаров со скидкой: " + discountPrice);

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");
        
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;

        System.out.println("byte:\n" + byteMax + "\n" + ++byteMax + "\n" + --byteMax);
        System.out.println("\nshort:\n" + shortMax + "\n" + ++shortMax + "\n" + --shortMax);
        System.out.println("\nint:\n" + intMax + "\n" + ++intMax + "\n" + --intMax);
        System.out.println("\nlong:\n" + longMax + "\n" + ++longMax + "\n" + --longMax);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;
        
        //меняем значения с помощью третьей переменной
        System.out.println("1)с помощью третьей переменной:");
        System.out.println("a = " + a + ", b = " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("a = " + a + ", b = " + b);
        
        //меняем значения с помощью арифметических операций
        System.out.println("2)с помощью арифметических операций:");
        System.out.println("a = " + a + ", b = " + b);
        b -= a;
        a += b;
        b = a - b;
        System.out.println("a = " + a + ", b = " + b);
        
        //меняем значения с помощью побитовой операции ^
        System.out.println("3)с помощью побитовой операции ^");
        System.out.println("a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + ", b = " + b);

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");
        
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tidle = '~';

        System.out.println(dollar + " - " + (int) dollar);
        System.out.println(asterisk + " - " + (int) asterisk);
        System.out.println(atSign + " - " + (int) atSign);
        System.out.println(verticalBar + " - " + (int) verticalBar);
        System.out.println(tidle + " - " + (int) tidle);

        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        
        char slash = '/';
        char backslash = '\\';
        char lowLine = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + lowLine + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + lowLine + lowLine + lowLine + lowLine + slash + 
                backslash + lowLine + lowLine + backslash);

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        int sum = ones + tens + hundreds;
        int prod = ones * tens * hundreds;

        System.out.println("Число " + num  + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + prod);

        //9. Вывод времени
        System.out.println("\n9. Вывод времени\n");

        int seconds = 86399;
        int ss = seconds % 60;
        int mm = (seconds / 60) % 60;
        int hh = ((seconds / 60) / 60) % 60;
        
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}