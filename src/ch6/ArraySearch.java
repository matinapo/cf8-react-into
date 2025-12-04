package ch6;
import java.util.Scanner;
/**
 * Αναζητά ένα στοιχείο (την τιμή) σε ένα πίνακα
 */
public class ArraySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11, 34, 33, 67, 68, 34, 77, 78, 93, 15};
        int[] arr2 = null;
        int value = 0;
        int position = 0;

        System.out.println("Enter the value to be searched: ");
        value = sc.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Vaule: " +value + " found at position " + (position + 1)); // (position + 1) για να είναι πιο κατανοητή η θέση για το χρήστη
        }
    }

    /**
     * Επιστέφει την θέση του 1ου στοιχείου του πινακα
     * που ισούται με την τιμή αναζήτησης (value)
     * αν το στοιχείο δεν υπάρχει επιστρέφει -1 (μη έγκυρη τιμή γιατί οι δείκτες είναι 0 και θετικοί)
     * @param arr ο input πίνακας
     * @param value η τιμή αναζήτησης
     * @return το position του πίνακα που βρέθηκε το στοιχείο (ή -1)
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { // σύκριση
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) { // σύκριση
                return i;
            }
        }
        return -1;
    }
}
// o 1os τρόπος είναι πιο εύκολα testable γιατί έχει μόνο ένα return (ένα μόνο σημείο εξόδου)
