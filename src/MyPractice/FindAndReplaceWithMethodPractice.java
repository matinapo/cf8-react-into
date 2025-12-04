package MyPractice;

public class FindAndReplaceWithMethodPractice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        replace(arr, 9, 10);
        printArray(arr);
    }

    public static void replace(int[] arr, int oldValue, int newValue) {
        int positionToUpdate = -1;

        if (arr == null) return;
        positionToUpdate = getElementPosition(arr, oldValue);
        if (positionToUpdate != -1) arr[positionToUpdate] = newValue;
    }

    public static int getElementPosition(int[] arr, int value){
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // if value was not found
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
