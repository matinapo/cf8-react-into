package MyPractice;
import java.util.Scanner;
/**
 * το πρόγραμμα δέχεται έναν ακέραιο (1-7) και
 * επιστρέφει το αντίστοιχο όνομα της ημέρας της εβδομάδας
 */
public class SwitchPracticeDayOfWeek {

    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please enter a number between 1 and 7: ");
            choice = in.nextInt();

            if (choice < 1 || choice > 7) {
                System.out.println("Incorrect input. Please enter a number between 1 and 7: ");
            }

        } while (choice < 1 || choice > 7); // continues as long as the number is outside 1-7

                switch (choice) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Please enter a number between 1 and 7");
                        break;
                }
    }
}
