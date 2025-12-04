package ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result;

        while (true) {
            System.out.print("Please enter two integers (0 to exit): ");
            num1 = sc.nextInt();
            if (num1 == 0) break;

            num2 = sc.nextInt();

            // validation instead of try catch --> State Test (όπου state είναι η τιμή της μεταβλητής)
            if (num2 == 0) {
                System.out.println("Ο παρονομαστής δεν μπορεί να είναι 0");
                continue;
            }

            result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }
}
