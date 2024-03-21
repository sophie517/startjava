import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String userAnswer = "yes";

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        while (!userAnswer.equals("no")) {
            if (userAnswer.equals("yes")) {
                System.out.println();
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            userAnswer = sc.nextLine();
        }
    }
}