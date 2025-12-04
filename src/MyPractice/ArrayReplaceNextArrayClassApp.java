package MyPractice;

import java.util.Arrays;

public class ArrayReplaceNextArrayClassApp {

    public static void main(String[] args) {
        int[] ages = {20, 22, 23, 24, 36};

        // Truncates one item at RHS
        ages = Arrays.copyOf(ages, ages.length - 1);

        // Adding and Padding with zero one position at RHS
        ages = Arrays.copyOf(ages, ages.length + 1);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
