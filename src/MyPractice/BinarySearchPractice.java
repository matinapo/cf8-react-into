package MyPractice;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9};
        int low = 0; // position 0 -> 1st position
        int high = arr.length - 1; // 5th position, last // (arr.length = 6)
        int position = -1;

        position = binarySearch(arr,7,low, high);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value was found in position: " + (position + 1)); // +1 user friendly
        }
    }

    /**
     * Returns the position of a target value in a sorted array
     * @param target the searched value
     * @param low the start index
     * @param high the end index
     * @return the position the target value was found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target, int low, int high) {
        int mid = 0;

        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length - 1)) return -1;
        if (high < low) return -1;

        mid = (low + high) /2;

        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, low, mid - 1);
        }
        else {
            return binarySearch(arr,target, mid + 1, high);
        }
    }
}
