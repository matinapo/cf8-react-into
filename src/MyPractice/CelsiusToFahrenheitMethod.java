package MyPractice;
import java.util.Scanner;

public class CelsiusToFahrenheitMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        double actual = 0;

        System.out.println("Please enter a temperature in Celsius: ");
        celsius = sc.nextDouble();

        // expected result using the formula directly
        double expected = (celsius * 9 / 5) + 32;

        // actual result from method
        actual = celsiusToFahrenheit(celsius);

        // print result
        System.out.println("The temperature in Fahrenheit is " + actual);

        //verify the result
        boolean isCorrect = correctResult(actual, expected);

        //print
        System.out.println("Is the conversion correct? " + isCorrect);
    }

    /**
     * Converts Celsius to Fahrenheit using the formula C * 9/5 + 32
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Returns true if expected equals actual
     *
     * @param expected
     * @param actual
     */
    public static boolean correctResult(double expected, double actual) {
        if (Math.abs(actual - expected) < 0.00005) {
            return true;
        } else {
        }
        return false;
    }
}
