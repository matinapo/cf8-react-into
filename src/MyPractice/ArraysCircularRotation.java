package MyPractice;

public class ArraysCircularRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] leftShifted = doLeftShift(arr, 2);
        int[] rightShifted = doRightShift(arr, 3);

        printArr(leftShifted);
        printArr(rightShifted);
    }

    /**
     * Rotates the elements of an array clockwise by an offset
     * @param arr source array
     * @param offset the distance to rotate
     * @return the rotated array
     */
    public static int[] doRightShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
            // to % arr.length "τυλίγει" τις θέσεις. αν i + offset > 5 -> γυρνάει στην αρχή
        }
        return rotated;
    }

    public static int[] doLeftShift(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
