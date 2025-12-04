package MyPractice;
import java.util.Scanner;
/**
 * το πρόγραμμα λαμβάνει από τον χρήστη ένα χαρακτήρα ελληνικό & ελέγχει
 * (επιστρέφει true ή false) αν είναι φωνήεν
 */
public class SwitchPracticeVocals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char character = Character.toUpperCase(sc.next().charAt(0));
        boolean isVowel = false;

        isVowel = switch (character) {
            case 'Α', 'Ο', 'Ε', 'Ι', 'Η', 'Ω', 'Υ' -> true;
            default -> false;
            };
        System.out.println("Is Vowel?: " + isVowel);
    }
}
