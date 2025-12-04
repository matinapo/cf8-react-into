package MyPractice;

/**
 * Demonstrates reducing an array to a single value, like SUM, AVG..
 */
public class ArraysReducingPractice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Total: " + getTotal(arr));
        System.out.printf("Average: %.2f", getAvg(arr));
    }

    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;

        for (int item : arr) {
            total += item;
        }
        return total;
    }

    public static double getAvg(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        double avg = 0;

        for (int item : arr) {
            total += item;
        }
        return (double) total / arr.length;
    }
}
