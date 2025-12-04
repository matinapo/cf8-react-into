package MyPractice;
import java.util.Scanner;
/**
 * since this is an Arithmetic Error:
 * a more correct way would have been to handle it with Validation!!
 * instead of try-catch
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        try {
            result = num1 / num2; // eδώ είναι πιθανό τα έχουμε exception
            System.out.println();
        } catch (ArithmeticException e) { // catch the specific exception: ArithmeticException
            // (δήλωση του exception με τη μεταβλητή e
            e.printStackTrace(); // to see what is happening
            System.err.println(e.getMessage()); // logging: "/ by zero"
        }

        System.out.println("Result: " + result); // this line will be executed with default result: 0
    }
}
