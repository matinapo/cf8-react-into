package MyPractice;

public class ArrayMinApp2Practice {

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 9, 2, 11};

        // we set as min value a very big integer: Integer.MAX_VALUE
        // so some element will be smaller unless they are all max-int
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d, Min Position: %d ", minValue, minPosition + 1); // user-friendly
    }
}
