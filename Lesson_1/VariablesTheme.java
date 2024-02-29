public class VariablesTheme {
    public static void main(String[] args) {
        //Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера\n");

        byte bitDepth = 64;
        System.out.println("разрядность ОС: " + bitDepth);
        short displayMemory = 496;
        System.out.println("память дисплея, МБ: " + displayMemory);
        int memory = 4096;
        System.out.println("память, МБ: " + memory);
        double cpuFrequency = 2.3;
        System.out.println("частота процессора, ГГц: " + cpuFrequency);
        char firstLetterOfOs = 'W';
        System.out.println("первая буква в названии ОС: " + firstLetterOfOs);
        boolean hasFreeSpace = true;
        System.out.println("есть ли свободное место? " + hasFreeSpace);

        //Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;

        //общая стоимость товаров без скидки
        int total = penPrice + bookPrice;
        System.out.println("общая стоимость товаров без скидки: " + total);

        //сумма скидки
        double amount = discount*total/100;
        System.out.println("сумма скидки: " + amount);

        //общая стоимость товаров со скидкой
        double newTotal = total - amount;
        System.out.println("общая стоимость товаров со скидкой: " + newTotal);

        //Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long ln = 9223372036854775807l;
        System.out.println("byte:\n" + b + "\n" + ++b + "\n" + --b);
        System.out.println("\nshort:\n" + s + "\n" + ++s + "\n" + --s);
        System.out.println("\nint:\n" + i + "\n" + ++i + "\n" + --i);
        System.out.println("\nlong:\n" + ln + "\n" + ++ln + "\n" + --ln);

        //Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных\n");

        int first = 2;
        int second = 5;

        //меняем значения с помощью третьей переменной
        System.out.println("1)с помощью третьей переменной:");
        System.out.println("a = " + first + ", b = " + second);
        int c = first;
        first = second;
        second = c;
        System.out.println("a = " + first + ", b = " + second);

        //меняем значения с помощью арифметических операций
        System.out.println("2)с помощью арифметических операций:");
        System.out.println("a = " + first + ", b = " + second);
        second -= first;
        first += second;
        second = first - second;
        System.out.println("a = " + first + ", b = " + second);

        //меняем значения с помощью побитовой операции ^
        System.out.println("3)с помощью побитовой операции ^");
        System.out.println("a = " + first + ", b = " + second);
        first = first^second;
        second ^= first;
        first ^= second;
        System.out.println("a = " + first + ", b = " + second);

        //Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов\n");
        
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tidle = '~';
        System.out.println(dollar + " - " + (byte)dollar);
        System.out.println(asterisk + " - " + (byte)asterisk);
        System.out.println(atSign + " - " + (byte)atSign);
        System.out.println(verticalBar + " - " + (byte)verticalBar);
        System.out.println(tidle + " - " + (byte)tidle);

        //Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        String slash = "/";
        String backslash = "\\";
        String lowLine = "_";
        String leftParenthesis = "(";
        String rightParenthesis = ")";
        //вывод Дюка
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + lowLine + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + lowLine + lowLine + lowLine + lowLine + slash + backslash + lowLine + lowLine + backslash);

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int dig1 = num%10;
        int dig2 = (num/10)%10;
        int dig3 = (num/100)%10;
        int sum = dig1 + dig2 + dig3;
        int prod = dig1*dig2*dig3;
        System.out.println("Число " + num  + " содержит:");
        System.out.println("    сотен - " + dig3);
        System.out.println("    десятков - " + dig2);
        System.out.println("    единиц - " + dig1);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + prod);

        //9. Вывод времени
        System.out.println("\n9. Вывод времени\n");

        //секунды
        int ss = 86399;
        //минуты
        int mm = (ss/60)%60;
        //часы
        int hh = ((ss/60)/60)%60;
        ss = ss%60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}