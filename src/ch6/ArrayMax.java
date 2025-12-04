package ch6;

public class ArrayMax {

    public static void main(String[] args) {

    }

    public static int getMaxPosition(int[] arr) {
        if ( arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i =1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
