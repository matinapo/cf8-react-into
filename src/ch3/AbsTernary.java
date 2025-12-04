package ch3;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/**
 * Υπολογίζει το απόλυτο ενός ακεραίου με τη χρήση τριαδικού τελεστή.
 * Το απόλυτο ενός ακεραίου είναι πάντα θετικός αριθμός
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // input - είσοδος δεδομένων
        System.out.println("Please enter a number: ");
        num = in.nextInt(); //data binding

        // επεξεργασία δεδομένων
//        if (num >= 0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        // ή με τριαδικό:
        abs = (num >= 0) ? num : -num; //expression -Syntactic Sugar(= συντομογραφία του πάνω)
        System.out.printf("Το απόλυτο του %d είναι %d",num,abs);
    }
}
