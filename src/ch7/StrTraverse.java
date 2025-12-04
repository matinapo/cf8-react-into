package ch7;

import javax.swing.*;

/**
 * traverses a string one-by-one char, με την κλασσική for
 * enhanced for-> δεν δουλεύει εδώ
 * πρόσβαση με s.CharAt(i)
 */
public class StrTraverse {
    public static void main(String[] args) {
        String str1 = "Coding Factory";

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();

        // prints the reverse string
        for (int i = str1.length()-1; i >= 0; i--) {
            System.out.print(str1.charAt(i) + " ");
        }
    }
}
