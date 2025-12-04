package ch8;

import java.util.Scanner;

/**
 * Δημιουργείται ένα arithmetic exception χωρίς να το χειρστούμε
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Enter two integers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        //result = num1 / num2; // Αν το num2 == 0 -> ArithmeticException & θα διακόψει το πρόγραμμα
        result = div(num1, num2);
        System.out.println("Result: " + result);  // αυτή η γραμμή δεν θα εκτελεστεί σε περίπτωση exception
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
