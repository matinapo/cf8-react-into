package ch4;

public class PrintStarsApp {

    public static void main(String[] args) {

        // HORIZONTAL STARS
        for (int i = 1; i <= 10; i++) {
            System.out.print('*');
        }

        // VERTICAL STARTS
        for (int i = 1; i <= 10; i++) {
            System.out.println('*');
        }

        // GRID 10 x 10 // Nested for loops
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Stars Ascending
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Stars Descending
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
