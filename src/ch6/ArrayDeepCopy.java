package ch6;
/**
 * Defensive/ Deep/ Fresh copy
 */
public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrCopy;

        arrCopy = getArrayDeepCopy(arr);
        arrCopy[0] = 1000;
        System.out.println(arr[0]); // initial copy remains unchanged

    }
    public static int[] getArrayDeepCopy(int[] arr) {
        int[] destinationArr = new int[arr.length];

        // Contents of arr are copied to destination
        for (int i = 0; i < arr.length; i++) {
            destinationArr[i] = arr[i];
        }
        return destinationArr;
    }
}
