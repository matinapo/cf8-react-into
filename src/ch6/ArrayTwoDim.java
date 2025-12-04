package ch6;
/**
 * ορίζει ένα δισδιάστατο πίνακα &  τον κάνει populate
 * 2D arrays: [γραμμή] [στήλη]
 */
public class ArrayTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[2][3]; // 2 γραμμές & 3 στήλες
        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6},
        };

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;

        //Traverse
        for (int i = 0; i < grid.length; i++) { // γραμμές! "κάθετος πίνακας"
            for (int j = 0; j < grid[i].length; j++) { // στήλες, grid[0]-> 1 πρώτη γραμμή
                System.out.print(grid[i][j] + " "); // για κάθε γραμμή εκτυπώνει
            }
            System.out.println(); // και αλλάζει γραμμή
        }

        // Enhanced For
        for (int[] row : grid) { // για κάθε γραμμή (κάθετος πίνακας)
            for (int element : row) { // για κάθε στοιχείο της κάθε γραμμής (στήλη)
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
