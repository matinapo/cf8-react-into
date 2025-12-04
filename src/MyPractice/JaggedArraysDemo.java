package MyPractice;

/**
 * Μπορούμε να δώσουμε διαφορετικές διαστάσεις σε κάθε πίνακα του 2D πίνακα
 */
public class JaggedArraysDemo {

    public static void main(String[] args) {
        int[][] grid = new int[3][];

        grid[0] = new int [4];
        grid[1] = new int [2];
        grid[2] = new int [3];

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
