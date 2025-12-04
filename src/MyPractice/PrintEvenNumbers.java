package MyPractice;

public class PrintEvenNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int result = 0; // declare before the loop
        for (int j = 1; j <= 50; j++) {
            result = result + j; // accumulates the values
        }
        System.out.println(result); // prints final sum outside the loop

        for (int z = 10; z >= 1; z--) {
            System.out.print(z + " ");
        }
        System.out.println();

        // stars = 2 * row -1
        // spaces = 4 - 1
        for (int row = 1; row <= 4 ; row++) {
            for (int spaces = 1; spaces <= 4 - row; spaces++) { // for spaces
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) { // for stars
                System.out.print("*");
            }
            System.out.println(); // add line
        }
    }
}
