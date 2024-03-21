import java.util.Scanner;

public class GuessNumber {

    private int hiddenNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        hiddenNumber = 1 + (int) (Math.random() * 100);
        Player player = player1;

        while (true) {
            System.out.print(player.getName() + ", введи число: ");
            player.setNumber(sc.nextInt());

            if (player.getNumber() > hiddenNumber) {
                System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер\n");
            } else if (player.getNumber() < hiddenNumber) {
                System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер\n");
            } else {
                System.out.println("\nИгрок " + player.getName() + " выиграл\n");
                break;
            }

            if (player == player1) {
                player = player2;
            } else {
                player = player1;
            }
        }
    }
}