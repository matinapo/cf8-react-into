package ch6;

import org.w3c.dom.ls.LSOutput;

/**
 * Διάσχιση, Επίσκεψη & Εκτύπωση
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] grades = { 10, 9, 8, 7, 6 }; // unsized initialization
        int[] scores = new int[] { 100, 90, 80, 70, 60 }; // with initializer (μπορείς να το σπάσεις σε 2 γραμμές)

        //Traverse
        for (int i = 0; i < arr1.length; i++) { // if: i <= arr1.length -> exception: ArrayIndexOutOfBounds
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // Enhanced For (για να είναι λιγότερο error prone)-> δεν δίνει ArrayIndexOutOfBounds exception
        for (int grade : grades) { // αυτόματα το grade κάνει traverse τα στοιχεία του πίνακα
            System.out.println(grade);
        }
        for (int score : scores) {
            System.out.println(score);
        }
        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}

