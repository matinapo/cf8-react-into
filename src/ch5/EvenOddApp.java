package ch5;

import java.util.Scanner;

/**
 * ορίζει 2 μεθόδους, τις isEven & isOdd για τον έλεγχο ενός ακεραίου
 */
public class EvenOddApp {

    public static void main(String[] args) {
        int num = 0;
        boolean isEven = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = sc.nextInt();

        isEven = isEven(num);

        System.out.println(isEven ? "is Even" : "is Odd");
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
       return !isEven(a); // return a % 2 != 0;
    }

}
