package MyPractice;

import java.util.Arrays;

public class ArrayCopyWithMethodsDemo {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] arrCopy = new int[4];

        System.arraycopy(arr, 0, arrCopy, 0 , arr.length);
        printArray(arrCopy);

        System.out.println();

        arrCopy = Arrays.copyOf(arr, arr.length);
        printArray(arrCopy);

        System.out.println();

        arrCopy = Arrays.copyOfRange(arr, 0, arr.length);
        printArray(arrCopy);

        System.out.println();

        int[] arrCopy2 = Arrays.copyOfRange(arr, 0, 3);
        printArray(arrCopy2);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
