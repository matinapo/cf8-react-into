package MyPractice;

import java.util.Arrays;

public class ArraysChallengesFour {

    public static void main(String[] args) {

        int [] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] result = getLowAndHighIndexOf(arr, key); // returns an array with 2 elements: {low,high}
        System.out.println("Low index: " + result[0] + ", High index: " + result[1]);

    }

    public static int[] getLowAndHighIndexOf(int [] arr, int key) {

        int low = -1;
        int high = -1;

        // Find low index:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        if (low == -1) { // key not found
            return null;
    }
        // Find High Index
        for (int i = low; i < arr.length; i++) {
            if (arr[i] != key) {
                high = i - 1; // the last index of key is at position i - 1
                break;
            }
        }
        if (high == -1) { //key goes until the end
            high = arr.length - 1;
        }
        return new int[] {low, high};
    }
}
