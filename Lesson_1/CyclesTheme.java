public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        
        int start = -10;
        int end = 21;
        int sumOfEvenNums = 0;
        int sumOfOddNums = 0;

        System.out.print("В отрезке [" + start + ", " + end + "] ");
        do {
            if (start % 2 == 0) {
                sumOfEvenNums += start;
            } else {
                sumOfOddNums += start;
            } 
            start++;
        } while (start <= end);
        System.out.println("сумма четных чисел = " + sumOfEvenNums + ", а нечетных = " + sumOfOddNums);
        
        //2. Вывод чисел в порядке убывания
        System.out.println("\n2. Вывод чисел в порядке убывания\n");
        
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num2;
        
        if (num1 > num2) {
            max = num1;
            min = num2;
        } 
        if (num3 > max) {
            max = num3;
        } else if (min > num3) {
            min = num3;
        }
        
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
         System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        
        int num = 1234;
        int sum = 0;
        
        System.out.print("число в обратном порядке: ");
        while (num > 0) {
            int currentDigit = num % 10;
            sum += currentDigit;
            num /= 10;
            System.out.print(currentDigit);
        }
        System.out.println("\nсумма: " + sum); 

        //4. Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк\n");
        
        int counter = 0;
        start = 1;
        end = 24;

        for (int i = start; i < end; i += 2) {
            counter++;
            System.out.printf("%4d", i);
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        while (counter % 5 != 0) {
            System.out.printf("%4d", 0);
            counter++;
        } 

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность\n");
        
        num = 3242592;
        int numOfTwos = 0;

        System.out.print("В " + num);
        while (num > 0) {
            if (num % 10 == 2) {
                numOfTwos++;
            }
            num /= 10;
        }

        if (numOfTwos % 2 == 0) {
            System.out.println(" четное количество двоек - " + numOfTwos);
        } else {
            System.out.println(" нечетное количество двоек - " + numOfTwos);
        }

        //6. Отображение геометрических фигур
        System.out.println("\n6. Отображение геометрических фигур\n");
        
        //прямоугольник
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //прямоугольный треугольник
        int row = 5;
        int numOfElements;

        while (row > 0) {
            numOfElements = row;
            while (numOfElements > 0) {
                System.out.print("#");
                numOfElements--;
            }
            row--;
            System.out.println();
        } 
        System.out.println();

        //треугольник
        numOfElements = 1;
        row = 1;

        do {
            counter = 0;
            do {
                System.out.print("$");
                counter++;
            } while (counter < numOfElements);
            System.out.println();
            row++;
            if (row <= 3) {
                numOfElements++;
            } else {
                numOfElements--;
            }
        } while (row <= 5);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов\n");
        
        char symbol = 33;

        System.out.printf("%-10s%-12s%s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = symbol; i < '0'; i += 2) {
            System.out.printf("%2s%-12d%-13c%s%n", "", i, i, Character.getName(i));
        }

        symbol = 'a';

        for (int i = symbol + 1; i <= 'z'; i += 2) {
            System.out.printf("%2s%-12d%-13c%s%n", "", i, i, Character.getName(i));
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        
        num = 1234321;
        int numCopy = num;
        int reversedNum = 0;

        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        } 
        System.out.print("Число " + numCopy);
        if (reversedNum == numCopy) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        //9. Проверка, является ли число счастливым
        System.out.println("\n9. Проверка, является ли число счастливым\n");
        
        num = 123456;
        int sum1 = 0;
        int sum2 = 0;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;

        System.out.print("Число " + num);

        while (num > 999) {
            sum2 += num % 10;
            num /= 10;
        }

        while (num > 0) {
            sum1 += num % 10;
            num /= 10;
        }

        if (firstHalf == secondHalf) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }

        System.out.printf("Сумма цифр %d = %d", firstHalf, sum1);
        System.out.printf(", а сумма %d = %d", secondHalf, sum2);
        
        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n\n10. Отображение таблицы умножения Пифагора\n");
        
        for (int i = 1; i < 10; i++) {
            if (i != 1) {
                System.out.printf("%4d", i);
            } else {
                System.out.print("    ");
            }
            System.out.print(" |");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            if (i == 1) {
                System.out.print("\n   -----------------------------------");
            }
            System.out.println();
        } 
    }
}