public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte bitDepth = 64;
        System.out.println("разрядность ОС: " + bitDepth);
        short displayMemory = 496;
        System.out.println("память дисплея, МБ: " + displayMemory);
        int memory = 4096;
        System.out.println("память, МБ: " + memory);
        long batteryCapacity = 6000;
        System.out.println("емкость батареи, мАч: " + batteryCapacity);
        float screenWeight = 3.546f;
        System.out.println("вес экрана, кг: " + screenWeight);
        double cpuFrequency = 2.3;
        System.out.println("частота процессора, ГГц: " + cpuFrequency);
        char firstLetterOfOs = 'W';
        System.out.println("первая буква в названии ОС: " + firstLetterOfOs);
        boolean hasFreeSpace = true;
        System.out.println("есть ли свободное место? " + hasFreeSpace);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        
        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        System.out.println("общая стоимость товаров без скидки: " + totalPrice);
        int discount = 11;
        double discountAmount = discount * totalPrice / 100;
        System.out.println("сумма скидки: " + discountAmount);
        double discountPrice = totalPrice - discountAmount;
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
        System.out.println("byte:\n" + byteMax + "\n" + ++byteMax + "\n" + --byteMax);
        short shortMax = 32767;
        System.out.println("\nshort:\n" + shortMax + "\n" + ++shortMax + "\n" + --shortMax);
        int intMax = 2147483647;
        System.out.println("\nint:\n" + intMax + "\n" + ++intMax + "\n" + --intMax);
        long longMax = 9223372036854775807l;
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
        System.out.println(dollar + " - " + (int) dollar);
        char asterisk = '*';
        System.out.println(asterisk + " - " + (int) asterisk);
        char atSign = '@';
        System.out.println(atSign + " - " + (int) atSign);
        char verticalBar = '|';
        System.out.println(verticalBar + " - " + (int) verticalBar);
        char tidle = '~';
        System.out.println(tidle + " - " + (int) tidle);

        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        
        char slash = '/';
        char backslash = '\\';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        char lowLine = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
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
        System.out.println("Число " + num  + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + ones);
        int sum = ones + tens + hundreds;
        System.out.println("Сумма его цифр = " + sum);
        int prod = ones * tens * hundreds;
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