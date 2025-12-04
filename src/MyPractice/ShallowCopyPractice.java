package MyPractice;

public class ShallowCopyPractice {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arrShallowCopy;

        arrShallowCopy = arr; // δεν αντιγράφουμε περιεχόμενα, μόνο αναφορά
        arrShallowCopy[0] = 100;

        printArray(arr);
// since both references show to the same elements in Heap, any changes we make effect both arrays.
    }
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
