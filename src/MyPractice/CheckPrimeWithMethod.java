package MyPractice;
import java.util.Scanner;
/**
 * Checks if a number is prime or now and checks also if expected results = actual
 */
public class CheckPrimeWithMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        boolean result = isPrime(num);
        System.out.println(num + " is prime: " + result);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

