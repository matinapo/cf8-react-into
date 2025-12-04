package MyPractice;

public class ArraysChallengesTwo {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 54, -3, 23, 24, 56};
        int num = 5;
        int[] doubleArray = newArray(arr);

        System.out.printf("The number %d, is in position: %d ", num, (findValue(arr, num) + 1));
        System.out.println();
        printEvens(arr);
        System.out.println();
        printArr(doubleArray);
        System.out.println();
        System.out.print("In the array exists at least one positive number: " + existsPositive(arr));
        System.out.println();
        System.out.print("Are all the elements of the array positive: " + allPositive(arr));

    }

    /**
     * Traverses the array and returns the position of a target value
     * @param arr
     * @param value
     * @return
     */
    public static int findValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Prints the even numers of the array
     * @param arr
     */
    public static void printEvens(int[] arr) {
        for (int i = 0 ; i < arr. length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Returns a new array were the elements are the elements of the initial array * 2
     * @param arr
     * @return
     */
    public static int[] newArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }

    /**
     * helper print method
     * @param arr
     */
    public static void printArr(int[] arr){
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * returns true if at least one positive numbers exists in the array
     * @param arr
     * @return
     */
    public static boolean existsPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) return true;
        }
        return false;
    }

    /**
     * returns true if all numbers are positive in the array
     * @param arr
     * @return
     */
    public static boolean allPositive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        if (count == arr.length) return true;
        return false;
    }

}
