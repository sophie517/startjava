import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String playerAnswer = "yes";

        while (!playerAnswer.equals("no")) {
            if (playerAnswer.equals("yes")) {
                System.out.println();
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            playerAnswer = sc.nextLine();
        }
    }
}