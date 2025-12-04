package ch8;
import java.util.Scanner;
/**
 * To {@link java.util.InputMismatchException} συμβαίνει όταν
 * ο {@link java.util.Scanner} αποτυγχάνει να διαβάσει το σωστό τύπο δεδομένων
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
         System.out.println("Please enter one int: ");
         //num = sc.nextInt();

        while (!sc.hasNextInt()) { // όσο δεν δίνει int
            System.out.println("Μη αποδεχτεί χαρακτήρες");
            sc.nextLine(); // απλά τους καταναλώνουμε (διαβάζουμε!)
        }

        num = sc.nextInt();
        System.out.println("Number is: " + num);

    }
}
