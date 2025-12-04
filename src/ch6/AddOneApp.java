package ch6;
/**
// έστω ότι αναπαριστούμε μεγάλους ακεραίους σε μορφή πίνακα και θέλουμε να προσθέσουμε τη μονάδα
 */
public class AddOneApp {

    public static void main(String[] args) {

    }

    /**
     * προσθέτει τη μονάδα σε ένα πίνακα που αναπαριστά εναν ακέραιο
     * @param arr ο input πίνακας
     * @return ένα array με το αποτέλεσμα
     */
    public static int[] AddOne(int[] arr) {
        if (arr == null) return new int[0]; //best practice instead of null which is more error-prone

        int[] arrOut = new int[arr.length + 1]; // φτιάχνω τον νέο πίνακα με μια παραπάνω στήλη
        // initialize:
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) { // start from the end
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10; // until position 1, παίρνω τη μονάδα
            carry = sum / 10; // παίρνω τη δεκάδα
        }

        if (carry == 1) {
            arrOut[0] = 1; // for position 0
        }
        return arrOut;
    }
}
