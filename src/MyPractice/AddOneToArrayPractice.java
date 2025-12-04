package MyPractice;

import java.util.Arrays;

public class AddOneToArrayPractice {

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 8};
        int[] arrOut;

        arrOut = addOne(arr);

        for (int el : arrOut){
            System.out.print(el + " ");
        }
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return null;
        int[] arrOut = new int[arr.length + 1]; // we maybe need an extra space for the carry
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }
        arrOut[0] = carry;

        if (carry == 0) {
            return Arrays.copyOfRange(arrOut, 1, arrOut.length);
        }
        return arrOut;
    }
}
