package ch5;

import java.util.Scanner;

public class PowerMethodApp {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        result = power(num1, num2);

        System.out.println("Result: " + result);
    }

    public static int power (int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }
}
