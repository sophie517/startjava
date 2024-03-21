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
        Player currentPlayer = player1;

        while (true) {
            System.out.print(currentPlayer.getName() + ", введи число: ");
            currentPlayer.setNumber(sc.nextInt());

            if (currentPlayer.getNumber() == hiddenNumber) {
                System.out.println("\nИгрок " + currentPlayer.getName() + " выиграл\n");
                break;
            }

            if (currentPlayer.getNumber() > hiddenNumber) {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " больше того, что загадал компьютер\n");
            } else {
                System.out.println("Число " + currentPlayer.getNumber() + 
                        " меньше того, что загадал компьютер\n");
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}