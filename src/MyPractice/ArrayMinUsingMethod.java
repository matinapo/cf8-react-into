package MyPractice;

public class ArrayMinUsingMethod {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 56, 45, 1, 4};

        // high & low -> start & end positions
        System.out.println(getMinPosition(arr, 0, arr.length-1)); // from position 0 to 6
    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1)) {
        System.out.println("Error in the array dimensions");
        return -1;
        }
        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue)  {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
