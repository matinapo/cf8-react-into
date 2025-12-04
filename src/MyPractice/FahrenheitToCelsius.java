package MyPractice;
import java.util.Scanner;
/**
 * μετατρέπει ακέραιες θερμοκρασίες Fahrenheit στην κλίμακα Κελσίου
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        int temp = 0;
        int tempCelsius = 0;

        System.out.println("Please enter the value in Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();

        tempCelsius = (5 * (temp - 32)) / 9;

        System.out.printf("%d degrees Fahrenheit is %d degrees Celsius", temp, tempCelsius);
    }
}
