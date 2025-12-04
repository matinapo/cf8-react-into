package MyPractice;

public class ArrayMinAppPractice {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 6, 7, 6};

        // έστω ότι το ελάχιστο στοιχείο είναι στη θέση 0
        int minPosition = 0;
        int minValue = arr[minPosition];

        // ξεκινάμε να ελέγχουμε από τη θέση -1 & κάθε φορά που βρίσουμε μικρότερο από το minValue
        // ανανεώνουμε το minPosition και το minValue
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
        // actual position is 2, because we start from 0
        System.out.printf("Min value: %d, Min Position: %d ", minValue, minPosition);

        // but we can add +1 in order to be more user-friendly
        System.out.printf("Min value: %d, Min Position: %d ", minValue, minPosition + 1);
    }
}
