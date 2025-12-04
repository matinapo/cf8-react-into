package ch6;
/**
 * Demo if how we pass an array as a formal parameter
 * and also how we return an array from a method
 */
public class ArraysAndMethods {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printArray(arr);
        printArray(arr, 0, arr.length);

        int[] arr5 = getArray5();
    }

    /**
     * Prints the contents of the array
     * Assumption: high is exclusive (< high, we don't print high)
     * @param arr the input array
     */
    public static void printArray(int[] arr) { // εδώ by value περνάει ο δείκτης, το reference! input
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
    public static void printArray(int[] arr, int low, int high) { //low & high ορίζουν το κομμάτι του πίνακα που θέλουμε να εκτυπώσουμε
        if (low < 0 || high > arr.length) {
            return; // leave
        }
        if (low > high) {
            return; // also leave
        }
        for (int i = low; i < high; i++){
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Returns a new array of size 5
     * @return
     */
    public static int[] getArray5() {
        return new int[5];
        // η new επιστρέφει τον δείκτη! όχι τα περιεχόμενα
        // επιστρέφει την διέυθυνση μνήμης
    }
}
