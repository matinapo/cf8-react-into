package MyPractice;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysChallengesThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Please enter 6 numbers (1-49): ");
        for (int i = 0; i < 6; ) {
            int num = sc.nextInt();

            if (num < 1 || num > 49) {
                System.out.println("Invalid number. Please enter 6 numbers (1-49): ");
                continue;
            }
            arr[i] = num;
            i++;
        }

        System.out.println("1.The array does not contain more that 3 even numbers: " + isEven(arr));
        System.out.println("2.The array does not contain more that 3 odd numbers: " + isOdd(arr));
        System.out.println("3.The array does not contain more that 3 consecutive numbers: " + isConsecutive(arr));
        System.out.println("4.The array does not contain more that 3 numbers with the same last digit: " + sameLastDigit(arr));
        System.out.println("5.The array does not contain more that 3 numbers in the same decade: " + sameDecade(arr));
    }

    public static boolean isEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count <= 3;
    }

    public static boolean isOdd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count <= 3;
    }

    public static boolean isConsecutive(int[] arr) {
        Arrays.sort(arr); // first sort the array
        int count = 0;

        for (int i = 0;  i < arr.length - 2; i++) { // γτ κοιτάμε 2 στοιχεία μπροστά
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                count++;
                break;
            }
        }
        return count <= 3;
    }

    public static boolean sameLastDigit(int[] arr) {
        if (arr == null) return false;

        int[] endings = new int[10]; // last digits 0-9
        for (int num : arr) {
            endings[num % 10]++;
            if (endings[num % 10] > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean sameDecade(int[] arr) {
        int[] decadeCount = new int[5]; // 5 decades for numbers 0 - 49

        for (int n : arr) {
            int decade = (n - 1) / 10; // 1-10 -> 0, 11-20 -> 1 etc
            decadeCount[decade]++;
            if (decadeCount[decade] > 3) return false;

        }
        return true;
    }
}
