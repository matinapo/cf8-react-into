package MyPractice;
import java.util.Scanner;
/**
 * calculator που παίρνει ως είσοδο από τον χρήστη 2 int & 1 char (+, -, *, /).
 * Με την καινούργια switch/case κάντε την αντίστοιχη πράξη και επιστρέψτε το αποτέλεσμα.
 */
public class SwitchPracticeCalculator {

    public static void main(String[] args) {
        int num1, num2;
        char symbol;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Please choose a symbol between: (+, -, *, /) :");
        symbol = sc.next().charAt(0);

        result = switch(symbol) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    yield 0; // use yield to return a value in a block
                } else {
                    yield num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid Symbol");
                yield 0;
            }
        };
        System.out.println("The result is: " + result);
    }
}
