package MyPractice;
import java.util.Scanner;
/**
 * το πρόγραμμα να αποφαίνεται αν ένα έτος είναι δίσεκτο ή όχι
 */
public class LeapYearCalculation {

    public static void main(String[] args) {
        int year;
        boolean isLeap;

        System.out.println("Enter the year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            isLeap = true;
        } else if (year % 400 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.printf("The year %d is leap year", year);
        } else {
            System.out.printf("The year %d is not leap year", year);
        }
    }
}
