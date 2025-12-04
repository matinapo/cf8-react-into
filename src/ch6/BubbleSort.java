package ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 12, 11, 15, 5, 6 };
        int[] sorted;

        System.out.println("Before sorting: ");
        print(arr);

        System.out.println();

        System.out.println("After sorting: ");
        sorted = bubbleSort(arr);
        print(sorted);
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
