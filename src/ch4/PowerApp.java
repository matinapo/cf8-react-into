package ch4;

import java.util.Scanner;
import java.util.Scanner;
/**
 * Ο χρήστης εισάγει τα base & power και το σύστημα υπολογίζει base^power
 */
public class PowerApp {

    public static void main(String[] args) {
        int base;
        int power;
        int result = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Please give 2 numbers for base & power:");
        base = in.nextInt();
        power = in.nextInt();

        for (int i = 0; i < power; i++) {
            result = base * result;
        }
        System.out.printf("%d ^ %d = %d", base, power, result);
    }
}
