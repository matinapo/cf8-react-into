package MyPractice;

public class ReplaceWithMethodPractice {

    public static void main(String[] args) {
        int[] grades = {4, 2, 8, 9, 15};

        upscaleByOne(grades);
        printArray(grades);
    }
    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.print(item + " ");
        }
    }
}
