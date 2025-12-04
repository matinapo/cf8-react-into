package MyPractice;
import java.util.Scanner;
/**
 * Δημιουργούμε τον αλγόριθμο κρυπτογράφησης & αποκρυπτογράφησης του Καίσαρα
 * με κλειδί: 1
 */
public class StringChallenge {
    static final int KEY = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a string: ");
        String plaintext = sc.nextLine();

        String ciphertext = createCiphertext(plaintext);

        System.out.println("The ciphertext is: " + ciphertext);
        System.out.println("The initial text is: " + reverseCiphertext(ciphertext));
    }

    /**
     * Μέθοδος που κρυπτογραφεί το string
     * @param plaintext initial string
     * @return  Ciphertext
     */
    public static String createCiphertext(String plaintext) {

        StringBuilder ciphertext = new StringBuilder(); // to fill later/ mutable container

        for (char c : plaintext.toCharArray()) {
            c += KEY;
            ciphertext.append(c);
            // ciphertext.append(String.valueOf(c)); // append() can accept both chars and Strings
        }
        return ciphertext.toString();  // convert the StringBuilder to a regular immutable String
    }

    /**
     * Μέθοδος που αποκρυπτογραφεί το string
     * @param ciphertext το κρυπτογραφημένο string
     * @return  το αρχικό string
     */
    public static String reverseCiphertext(String ciphertext) {

        StringBuilder sb = new StringBuilder();

        for (char c : ciphertext.toCharArray()) {
            c -= KEY;
            sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}
