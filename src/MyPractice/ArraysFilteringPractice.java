package MyPractice;
import java.util.Arrays;

public class ArraysFilteringPractice {

    public static void main(String[] args) {
        int[] grades = {4, 9, 9, 8, 7, 2, 1, 4, 10};
        int PASS = 5;

        int[] passed = getPassedGrades(grades, PASS);
        printArray(passed);
    }

    public static int[] getPassedGrades(int[] grades, int passThreshold){
        if (grades == null || grades.length == 0) return new int[0]; // new empty array

        int count = 0;
        int[] temp = new int[grades.length]; // we don't know how large the new array will be ->
                                            // Worst case: all pass
        for (int el : grades) {
            if (el >= passThreshold) {
                temp[count++] = el;
            }
        }
        return Arrays.copyOf(temp, count); // trim to actual size
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
