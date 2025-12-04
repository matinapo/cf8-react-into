package MyPractice;
import java.util.Scanner;
/**
 * Calculates the power of the integer given & checks if expected result = actual
 */
public class SquareUsingMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Please enter an integer: ");
        n = sc.nextInt();

       int expected = n * n;
       int actual = square(n);
        System.out.println("The square is: " + actual);

        boolean isCorrect = isCorrect(expected, actual);
        System.out.println("The square is correct: " + isCorrect);
    }

    /**
     * Calulates square using a method
     * @param n
     * @return
     */
    public static int square(int n) {
    return n * n;
    }

    /**
     * checks if expected == actual
     * @param expected
     * @param actual
     * @return
     */
    public static boolean isCorrect(int expected, int actual) {
        return expected == actual;
    }
}
