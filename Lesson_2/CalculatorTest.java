import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator expression = new Calculator();
        String userAnswer = "yes";
        
        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.print("\nВведите первое число: ");
                expression.a = sc.nextInt();
                System.out.print("Введите знак математической операции: ");
                expression.setSign(sc.next().charAt(0));
                System.out.print("Введите второе число: ");
                expression.b = sc.nextInt();

                expression.calculate(expression.a, expression.b, expression.getSign());

                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                sc.nextLine();
            } else {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            }
        userAnswer = sc.nextLine();
        }
    }
}