package ch6;

/**
 * ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός
 * δηλ αν διαβάζεται το ίδιο από την αρχή & το τέλος
 * πχ. [1, 2, 3, 3, 2, 1] // [1, 2, 3, 2, 1]
 */
public class ArraySymmetric {

    public static void main(String[] args) {

    }
    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
                if (arr[i] != arr[j]) {
                    return false;
                }
            }
        return true;
    }
}
