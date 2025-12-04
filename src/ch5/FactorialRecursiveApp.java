package ch5;

/**
 * Υπολογίζει το παραγωντικό n με αναδρομή
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
    int result = 0;

    result = facto(5);
    System.out.println("The factorial of 5 is: " + result);
    }

    public static int facto(int n) {
//        if (n == 1) { // Βάση περίπτωσης, για να μην έχουμε infinite loop
//            return 1;
//        }
//        return n * facto(n - 1);

        return n <= 1 ? 1 : n * facto(n-1);
    }
}
