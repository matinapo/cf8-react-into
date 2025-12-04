package ch5;
import java.util.Scanner;
public class CalculatorApp {
   static Scanner in = new Scanner(System.in);
   // όλες οι μέθοδος μπορούν να χρησιμοποιήσουν τον Scanner, αφού τον δηλώσαμε σε επίπεδο κλάσης

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;
        int result = 0;

        while (true) {

            // είσοδος δεδομένων
            printMenu();
            choice = getOneInt();

            // Validation
            if (!isValid(choice)) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("Exiting..");
                break;
            }

            // Επεξεργασία- Delegation
            result = getResultOnChoice(choice);

            // Print Results
            System.out.println("Result: " + result);
        }
    }
    public static void printMenu() {
            System.out.println("Please select one of the following: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Mode");
            System.out.println("6. Exit");
        }
    public static int getOneInt() {
        return in.nextInt();
    }
    public static boolean isValid(int choice) {
       return choice >= 1 && choice <= 6;
    }
    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter 2 numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

//        switch (choice) {
//            case 1: add(num1, num2);
//            break;
//            case 2: sub(num1, num2);
//            break;
//            case 3: mul(num1, num2);
//            break;
//            case 4: div(num1, num2);
//            break;
//            case 5: mod(num1, num2);
//            break;
//            default: System.out.println("Invalid input.");
//            break;
//        }
//        return result;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    public static int mod(int a, int b) {
        if (b == 0) return 0;
     return a % b;
    }
}
