package ch6;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 12, 11, 15, 5, 6 };
        int[] sorted;

        System.out.println("Before sorting: ");
        print(arr);

        System.out.println();

        System.out.println("After sorting: ");
        sorted = selectionSort(arr);
        print(sorted);
    }

    public static int[] selectionSort(int[] arr) { //επιστρέφουμε ταξινομημένο πίνακα
        int minPosition = 0;
        int minValue;

        for (int i = 0; i < arr.length-1; i++ ) { // best practice να σταματήσουμε στο προτελευταίο ψηφίο
                                                // για να γλιτώσουμε μια έξτρα σύγκριση
                minPosition = i;
                minValue = arr[minPosition];

                for (int j = i + 1; j < arr.length; j++) { // ξεκινάμε από το επόμενο από αυτό που χαρακτηρίσαμε ως min (i)
                    if (arr[j] < minValue) {
                        minPosition = j;
                        minValue = arr[minPosition];
                    }
            }
            swap(arr, minPosition, i); // στο outer for

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