package MyPractice;

public class ArraysBooleanAggregatesPractice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("The array contains: ");
        System.out.println("More than 2 even numbers: " + moreThanTwoEvens(arr));
        System.out.println("More than 2 odd numbers: " + moreThanTwoOdds(arr));
        System.out.println("More than 2 consecutive numbers: " + moreThanTwoConsecutive(arr));
        System.out.println("More than 2 numbers with same ending: " + moreThanTwoSameEndings(arr));

    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count > 2;
    }

    public static boolean moreThanTwoOdds(int[] arr){
        int count = 0;

        for (int el: arr) {
            if (el % 2 != 0) count++;
        }
        return count > 2;
    }

    /**
     * Διασχίζει τον πίνακα μέχρι i < length - 2 (μιας και κοιτάμε 2 στοιχεία μπροστά) &
     * ελέγχει για κάθε στοιχείο αν έχει σχέση με το επόμενο (μικρότερο κατά 1) και το
     * μεθεπόμενο (μικρότερο κατά 2)
     * @param arr source array
     * @return
     */
    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0;  i < arr.length - 2; i++) { // γτ κοιτάμε 2 στοιχεία μπροστά
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    /**
     * Διασχίζει τον arr & σε κάθε αντίστοιχη θέση του endings--endings[item % 10]--αυξάνει κατά 1.
     * Άρα για κάθε στοιχείο του αρχικού πίνακα βρίσκει τον λήγοντα (item % 10)
     * μετά πάει στην αντίστοιχη θέση του endings και αυξάνει κατά 1
     * @param arr
     * @return
     */
    public static boolean moreThanTwoSameEndings(int[] arr) {
        if (arr == null) return false;

        int[] endings = new int[10];
            for (int num : arr) {
                endings[num % 10]++;
                if (endings[num % 10] >= 3) {
                    return true;
                }
            }
            return false;
    }
}
