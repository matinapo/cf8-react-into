package MyPractice;
import java.util.Scanner;
/**
 * print stars in different patterns using Methods
 */
public class StarsAppWithMethod {
    static Scanner in = new Scanner(System.in); // access to all methods

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;

        while (true) {
            // Display Menu
            printMenu();

            // Get user's choice
            choice = choosePattern();

            // Validate choice
            if (!isValid(choice)) {
                System.out.println("Invalid Choice. Please try again.");
                continue;
            }
            // Check for Exit
            if (choice == EXIT) {
                System.out.println("Goodbye.");
                break;
            }
            // Get number of stars
            System.out.print("Enter the number of stars: ");
            int n = in.nextInt();

            // Execute the chose pattern
            executePattern(choice, n);
            System.out.println(); // blank line after patten
        }
    }

    /**
     * print the menu for the user to choose action
     */
    public static void printMenu() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Print n stars horizontally");
        System.out.println("2. Print n stars vertically");
        System.out.println("3. Print n lines with n stars");
        System.out.println("4. Print n lines with 1-n stars (ascending)");
        System.out.println("5. Print n lines with n-1 stars (descending)");
        System.out.println("6. Exit");
    }

    /**
     * read user's choice
     * @return user's choice
     */
    public static int choosePattern() {
        return in.nextInt();
    }

    /**
     * User's input validation
     * @param choice user's choice
     * @return true if choice is valid, false if choice is invalid
     */
    public static boolean isValid(int choice) {
        if (choice < 1 || choice > 6 ) {
            return false;
        }
        return true;
    }

    /**
     * Execute the chosen pattern
     * @param choice user's input
     * @param n number of stars
     */
    public static void executePattern(int choice, int n) {
        switch(choice) {
            case 1 -> PrintStarsHorizontally(n);
            case 2 -> PrintStarsVertically(n);
            case 3 -> PrintStarsNxN(n);
            case 4 -> PrintStarsAscending(n);
            case 5 -> PrintStarsDescending(n);
        }
    }

    public static void PrintStarsHorizontally(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void PrintStarsVertically(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void PrintStarsNxN(int n) {
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    public static void PrintStarsAscending(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
             }
            System.out.println();
        }
    }

    public static void PrintStarsDescending(int n) {
        for (int i = n; i >= 1; i-- ) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
