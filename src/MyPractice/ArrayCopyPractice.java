package MyPractice;

public class ArrayCopyPractice {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        int[] arrayCopy = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arrayCopy[i] = arr[i];
        }

        printArrayCopy(arrayCopy);
    }
    public static void printArrayCopy(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");

        }
        System.out.println();
    }
}
