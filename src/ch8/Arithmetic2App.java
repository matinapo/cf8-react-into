package ch8;

import java.util.Scanner;

public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter 2 integers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        try {
             result = (num1 / num2);
             System.out.println();
        } catch (ArithmeticException e) { // το e είναι μεταβλητή της ArithmeticException
            e.printStackTrace();
            System.out.println(e.getMessage());
            // return; // μόνο με return δεν θα προχωρούσε στο τελικό print
        }
            System.out.println("Result: " + result); // this line will be executed in any case
    }
}
