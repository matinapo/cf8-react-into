package ch4;
import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Please choose one of the following options:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");

            choice = in.nextInt();

            switch (choice) { // fall through -- needs "break"
                case 1:
                    System.out.println("Start One-player game");
                    break;
                case 2:
                    System.out.println("Start Two-player game");
                    break;
                case 3:
                    System.out.println("Start Team game");
                    break;
                case 4:
                    System.out.println("Exit Game");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != EXIT);
        System.out.println("Goodbye!");
    }
}
