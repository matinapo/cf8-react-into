package ch7;
/**
 * Δήλωση και Αρχικοποίηση (populate) ενός {@link String}.
 */
public class StrInit {

    public static void main(String[] args) {
        String s1 = "Athena"; // popular
        String s2 = new String("Athens"); // not popular
        String s3 = "";
        String s4 = null;
        boolean isEmpty;

        // isEmpty = s3.length() == 0;
        isEmpty = s3.isEmpty();

        System.out.println(s1);
        System.out.println("Lenght of string: " + s1.length());
        System.out.printf("City: %s1\n", s1);
    }
}
