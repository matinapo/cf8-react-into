package MyPractice;

import java.util.Scanner;

public class FindMaxUsingMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int expectedMax;

        System.out.println("Please enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && a >= c) {
            expectedMax = a;
        } else if ( b >= a && b >= c) {
            expectedMax = b;
        } else {
            expectedMax = c;
        }

        System.out.println("Max number is: " + expectedMax);

        int actualMax = findMax(a, b, c);
        boolean isCorrect = isMax(expectedMax, actualMax);

        System.out.println(isCorrect ? "Yes" : "No");
    }

    /**
     * calculates max using the Math.max class
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * checks if expected and actual results are the same
     * @param expected
     * @param actual
     * @return
     */
    public static boolean isMax(int expected, int actual) {
        return expected == actual;
    }
}
