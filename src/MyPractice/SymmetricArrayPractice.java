package MyPractice;
/**
 *  Ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός
 */
public class SymmetricArrayPractice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3};

        System.out.println("Array is symmetric: " + isArraySymmetric(arr));
        System.out.println("Array is symmetric: " + isArraySymmetric2(arr));
    }

    /**
     * Χρησιμοποιεί μία for με δείκτες i, j
     * ο i ξεκινάει από το μηδέν και αυξάνει & ο j ξεκινάει από το length–1 και μειώνεται
     * Ο έλεγχος γίνεται μεταξύ των τιμών των θέσεων i, j. H for τρέχει όσο i < j
     * @param arr the source array
     * @return true is array is symmetric, false otherwise
     */
    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    /**
     * Η for τρέχει η  έως n/2, όπου n = arr.length-1
     * Ο έλεγχος γίνεται μεταξύ των τιμών των θέσεων i και n-i
     * @param arr source array
     * @return true is array is symmetric, false otherwise
     */
    public static boolean isArraySymmetric2(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
