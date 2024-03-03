public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean male = true;
        if (!male) {
            System.out.println("пол: женский");
        } else {
            System.out.println("пол: мужской");
        }
        int age = 25;
        if (age > 18) {
            System.out.println("совершеннолетний(ая)");
        } else {
            System.out.println("несовершеннолетний(ая)");
        }
        double height = 1.85;
        if (height < 1.8) {
            System.out.println("высокий(ая)");
        } else {
            System.out.println("невысокий(ая)");
        }
        String name = "John";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("первая буква имени: M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("первая буква имени: I");
        } else {
            System.out.println("первая буква имени не M и не I");
        }

        //2. Поиск большего числа
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

        //3. Проверка числа
        System.out.println("\n3. Проверка числа\n");

        int num = 251;
        if (num == 0) {
            System.out.println("число является нулем");
        } else  {
            if (num > 0) {
                System.out.print(num + " является положительным");
            } else {
                System.out.print(num + " является отрицательным");
            }
            if (num % 2 == 0) {
                System.out.println(" и четным");
            } else {
                System.out.println(" и нечетным");
            }
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        a = 123;
        b = 223;
        System.out.println("исходные числа: " + a + ", " + b);
        int aOnes = a % 10;
        int bOnes = b % 10;
        int aTens = (a / 10) % 10;
        int bTens = (b / 10) % 10;
        int aHundreds = (a / 100) % 10;
        int bHundreds = (b / 100) % 10;
        if (aOnes != bOnes && aTens != bTens && aHundreds != bHundreds) {
            System.out.println("нет одинаковых цифр");
        } else {
            if (aOnes == bOnes) {
                System.out.println("одинаковые цифры: " + aOnes + ", 1 разряд");
            }
            if (aTens == bTens) {
                System.out.println("одинаковые цифры: " + aTens + ", 2 разряд");
            }
            if (aHundreds == bHundreds) {
                System.out.println("одинаковые цифры: " + aHundreds + ", 3 разряд");
            }
        } 

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду\n");
        
        char symbol = '\u0057';
        if (symbol <= '9' && symbol >= '0') {
            System.out.println("символ " + symbol + " является цифрой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("символ " + symbol + " является большой буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("символ " + symbol + " является не буквой и не цифрой");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        
        int principalAmount = 301000;
        System.out.println("сумма вклада: " + principalAmount);
        int rate = 7;
        if (principalAmount < 100000) {
            rate = 5;
        }
        else if (principalAmount > 300000) {
            rate = 10;
        }
        int accuredInterest = principalAmount * rate / 100;
        System.out.println("сумма начисленного %: " + accuredInterest);
        System.out.println("итоговая сумма с %: " + (principalAmount + accuredInterest));

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");
        
        double historyScore = 59;
        double historyGrade = 2;
        if (historyScore > 60 && historyScore < 74) {
            historyGrade = 3;
        } else if (historyScore > 73 && historyScore < 92) {
            historyGrade = 4;
        } else if (historyScore > 91) {
            historyGrade = 5;
        }
        System.out.println("история             " + (int) historyGrade);
        double computerScienceScore = 92;
        double computerScienceGrade = 2;
        if (computerScienceScore > 60 && computerScienceScore < 74) {
            computerScienceGrade = 3;
        } else if (computerScienceScore > 73 && computerScienceScore < 92) {
            computerScienceGrade = 4;
        } else if (computerScienceScore > 91) {
            computerScienceGrade = 5;
        }
        System.out.println("программирование    " + (int) computerScienceGrade);
        double gpa = (historyGrade + computerScienceGrade)/2;
        double averageScore = (historyScore + computerScienceScore)/2;
        System.out.println("средний балл: " + gpa);
        System.out.println("средний %: " + averageScore);

        //Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли\n");

        int income = 13000;
        int rent = 5000;
        int productionCost = 9000;
        int profit = (income - rent - productionCost) * 12;
        System.out.print("Прибыль за год: ");
        if (profit > 0) {
            System.out.println("+" + profit + " руб.");
        } else {
            System.out.println(profit + " руб.");
        }
    }
}