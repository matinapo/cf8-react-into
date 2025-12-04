package ch5;

import java.util.Scanner;

/**
 * Διαίρεση & Υπόλοιπο δεκαδικών
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.print("Please enter two numbers (doubles): ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        result = num1 / num2; // Διαίρεση δεκαδικών είναι δεκαδικός, Διάιρεση με το 0 δίνει Infinity!
        remaining = num1 % num2; // Το υπόλοιπο είναι το υπόλοιπο της διαίρεσης με το ακέραιο μέρος!

        System.out.println("Result: " + result);
        System.out.println("Remaining: " + remaining);
    }
}
