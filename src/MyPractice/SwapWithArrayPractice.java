package MyPractice;

public class SwapWithArrayPractice {

    public static void main(String[] args) {
        int[] arr = {5, 10};
        printArray(arr);

        System.out.println();

        swap(arr);
        printArray(arr);
    }

    public static void swap (int[] arr){
        if (arr.length == 1) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.print(item + " ");
        }
    }
}
