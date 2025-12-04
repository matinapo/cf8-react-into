package ch6;
/**
 * βρίσκει το ελάχιστο στοιχείο του πίνακα
 */
public class ArrayMin {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i =1; i < arr.length; i++) {
            //αν ξεκινήσω από το 0, συγκρίνω με τον εαυτό του,
            // οπότε αποφεύγω την σύγκριση αυτή και ξεκινάω από τη θέση 1
            if (arr[i] < minValue) { //σύγκριση
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
        return minPosition;
    }

    public static int getMinPosition2(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE; //  έστω ότι η ελάχιστη τιμή είναι το μέγιστο,
        // οπότε το πρώτο που θα βρούμε θα είναι λογικά μικρότερο της MAX_VALUE

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
        return minPosition;
    }
}
