package ch7;
/**
 * Αντιγραφή Strings γίνεται με αντιγραφή δεικτών
 * γιατί τα Strings είναι immutable
 */
public class StrCopySubstring {
    public static void main(String[] args) {

        // Copy
        String str1 = "Coding";
        String str2 = str1; // Copy

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);

        // Substring
        String str3 = str1.substring(1); // "oding": από τη θέση 1 έως το τέλος
        String str4 = str1.substring(1, 3); // "od": από τη θέση 1 έως την 2 (το 3 δεν περιλαμβάνεται!!)
        //(i, i+1) ι+1 -> exclusive! οπότε παίρνει μόνο το i

        System.out.println(str3);
        System.out.println(str4);

    }
        // Traverse using Substring
        public static void traverse(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.substring(i, i+1) + " ");
        }
    }
}
