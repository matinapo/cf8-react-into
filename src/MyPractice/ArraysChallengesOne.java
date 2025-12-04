package MyPractice;

public class ArraysChallengesOne {

    public static void main(String[] args) {

        int[] arr = {24, 45, 56, 78, 35, 67};

        // Find position of Max
        int max = getMaxPosition(arr, 0, arr.length - 1);

        if (max == -1) {
            System.out.println("Error: Invalid Array or Range");
        } else {
            System.out.print("The max number is in position: " + (max + 1)); // user friendly
        }

        System.out.println();

        //Find position of 2nd Min

        int secondMin = getSecondMinPosition(arr);

        if (secondMin == -1) {
            System.out.println("Error: Array needs at least 2 distinct elements");
        } else {
            System.out.print("The 2nd min value is in position: " + (secondMin + 1)); // user friendly
        }

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return -1;
        if (low > high) return -1;
        if (low < 0 || high >= arr.length) return -1; // έλεγχος ορίων

        int maxPosition = low; // Αρχικοποιούμε με θέση, όχι τιμή
        int maxValue = arr[low]; // the max value

        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static int getSecondMinPosition(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;
        int secondMinPosition = -1;

        // Find Min
        for (int num : arr) {
            if (num < minValue) {
                minValue = num;
            }
        }
        // Find Second Min (the min that is > minValue)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minValue && arr[i] < secondMinValue) {
                secondMinValue = arr[i];
                secondMinPosition = i;
            }
        }
        return secondMinPosition;
    }
}
