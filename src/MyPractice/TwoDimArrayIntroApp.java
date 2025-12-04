package MyPractice;

public class TwoDimArrayIntroApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2]; // lines, columns

        grid[0][0] = 0; // 1st line, 1st column
        grid[0][1] = 1; // 1st line, 2nd column
        grid[1][0] = 2; // 2nd line, 1st column
        grid[1][1] = 3; // 2nd line, 2nd column

        for (int[] row : grid) { // we start from the lines (vertical table)
            for (int col : row) { // we take assume a horizontal table per row
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
