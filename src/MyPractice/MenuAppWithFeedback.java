package MyPractice;
import java.util.Scanner;
/**
 * Εμφανίζει επαναληπτικά μενού με επιλογές, μέχρι ο χρήστης να δώσει το 5
 * Για κάθε επιλογή από 1 – 4 θα πρέπει να εμφανίζεται feedback.
 * Επίσης ελέγχεΙ αν ο χρήστης δώσει αριθμό < 0 ή > 5
 */
public class MenuAppWithFeedback {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Enter");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Please enter a valid option!");
            } else { // to make sure it only runs when the option is valid

                switch (choice) {
                    case 1:
                        System.out.println("You have chosen to enter");
                        break;
                    case 2:
                        System.out.println("You have chosen to delete");
                        break;
                    case 3:
                        System.out.println("You have chosen to update");
                        break;
                    case 4:
                        System.out.println("You have chosen to search");
                        break;
                    case 5:
                        System.out.println("You have chosen to exit");
                        break;
                }
            }
        } while (choice != 5);
    }
}
