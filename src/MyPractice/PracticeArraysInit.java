package MyPractice;

public class PracticeArraysInit {

    public static void main(String[] args) {

        // 1.Αρχικοποίηση με Εκχωρήσεις
        // Array declaration & init
        int[] ages = new int[5];

        // Populate Array
        ages[0] = 20;
        ages[1] = 40;
        ages[2] = 27;
        ages[3] = 37;
        ages[4] = 15;

        // Print array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        System.out.println();

        // 2.Αρχικοποίηση με Unsized Init
        // Initialise & Populate the Array
        int[] ages2 = {19, 20, 24, 45, 32};

        // Print array elements
        for (int i = 0; i < ages2.length; i++) {
            System.out.print(ages2[i] + " ");
        }

        System.out.println();

        // 3. Array Initializer
        int[] ages3;
        ages3 = new int[] {14, 45, 34, 23, 32};

        // Print array elements
        for (int age : ages3) {
            System.out.print(age + " ");
        }

        System.out.println();
        printArray(ages3, 1, ages.length - 2);
    }
    public static void printArray(int[] arr, int low, int high){
        if ((low < 0) || (high > arr.length - 1)) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
