public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean male = true;
        int age = 25;
        double height = 1.85;
        String name = "John";
        //псевдокод
        if (!male) {
            System.out.println("пол: женский");
        } else {
            System.out.println("пол: мужской");
        }

        if (age > 18) {
            System.out.println("совершеннолетний(ая)");
        } else {
            System.out.println("несовершеннолетний(ая)");
        }

        if (height < 1.8) {
            System.out.println("высокий(ая)");
        } else {
            System.out.println("невысокий(ая)");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("первая буква имени: M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("первая буква имени: I");
        } else {
            System.out.println("первая буква имени не M и не I");
        }

        //Поиск большего числа
        System.out.println("\n2. Поиск большего числа\n");

        int a = 15;
        int b = 7;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        //Проверка числа
        System.out.println("\n3. Проверка числа\n");

        int num = 251;
        if (num == 0) {
            System.out.println(num + " является нулем");
        } else  {
            if (num > 0) {
                System.out.print(num + " является положительным");
            }
            else if (num < 0) {
                System.out.print(num + " является отрицательным");
            }
            if (num%2 == 0) {
                System.out.println(" и четным");
            }
            else if (num%2 != 0) {
                System.out.println(" и нечетным");
            }
        }

        //Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        int c = 123;
        int d = 223;
        int c1 = c%10;
        int d1 = d%10;
        int c2 = (c/10)%10;
        int d2 = (d/10)%10;
        int c3 = (c/100)%10;
        int d3 = (d/100)%10;
        System.out.println("исходные числа: " + c + ", " + d);
        if (c1 != d1 && c2 != d2 && c3 != d3) {
            System.out.println("нет одинаковых цифр");
        } else {
            if (c1 == d1) {
                System.out.println("одинаковые цифры: " + c1 + ", 1 разряд");
            }
            if (c2 == d2) {
                System.out.println("одинаковые цифры: " + c2 + ", 2 разряд");
            }
            if (c3 == d3) {
                System.out.println("одинаковые цифры: " + c3 + ", 3 разряд");
            }
        }

        //Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду\n");
        
        char symbol = '\u0057';
        if (symbol < 49 || (symbol > 57 && symbol < 65) || (symbol > 90 && symbol < 97) || symbol > 122) {
            System.out.println("символ " + symbol + " является не буквой и не цифрой");
        }
        else if (symbol < 58) {
            System.out.println("символ " + symbol + " является цифрой");
        }
        else if (symbol > 64 && symbol < 91) {
            System.out.println("символ " + symbol + " является большой буквой");
        }
        else if (symbol > 96) {
            System.out.println("символ " + symbol + " является маленькой буквой");
        }

        //Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        
        int sum = 301000;
        int interest = 0;
        if (sum < 100000) {
            interest = 5;
        }
        else if (sum >= 100000 && sum < 300000) {
            interest = 7;
        }
        else if (sum > 300000) {
            interest = 10;
        }
        double newSum = sum*interest/100 + sum;
        System.out.println("сумма вклада: " + sum);
        System.out.println("сумма начисленного %: " + (newSum - sum));
        System.out.println("итоговая сумма с %: " + newSum);

        //Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");
        
        int hPercent = 59;
        int pPercent = 92;
        int hMark = 0;
        int pMark = 0;
        if (hPercent <= 60) {
            hMark = 2;
        } else if (hPercent > 60 && hPercent < 74) {
            hMark = 3;
        } else if (hPercent > 73 && hPercent < 92) {
            hMark = 4;
        } else if (hPercent > 91) {
            hMark = 5;
        }
        if (pPercent <= 60) {
            pMark = 2;
        } else if (pPercent > 60 && pPercent < 74) {
            pMark = 3;
        } else if (pPercent > 73 && pPercent < 92) {
            pMark = 4;
        } else if (pPercent > 91) {
            pMark = 5;
        }
        double averageMark = (hMark + pMark)/2;
        double averagePercent = (hPercent + pPercent)/2;

        System.out.println("история             " + hMark);
        System.out.println("программирование    " + pMark);
        System.out.println("средний балл: " + averageMark);
        System.out.println("средний %: " + averagePercent);

        //Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли\n");

        int income = 13000;
        int rent = 5000;
        int cost = 9000;
        int profit = income - rent - cost;
        System.out.print("Прибыль за год: ");
        if (profit > 0) {
            System.out.println("+" + profit + " руб.");
        } else {
            System.out.println(profit + " руб.");
        }
    }
}