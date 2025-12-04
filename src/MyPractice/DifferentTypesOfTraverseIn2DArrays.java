package MyPractice;

public class DifferentTypesOfTraverseIn2DArrays {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2},{2, 4, 5}};

        // 1. Classic For
        for (int i = 0; i < arr.length; i++) { // διατρέχει τις γραμμές (arr.length = 3)
            for (int j = 0 ; j < arr[i].length; j++){ // διατρέχει τις στήλες κάθε γραμμής (arr[i].length)
                System.out.print(arr[i][j] + " "); // arr[i][j] = στοιχείο στη γραμμή i, στήλη j
            }
            System.out.println();
        }

        // 2. Enhanced For + Classic For
        // παίρρνουμε την κάθε γραμμή ως σύνολο και φιατρέχουμε τα στοιχεία της γραμμής με index
        for (int[] row : arr) { // για κάθε γραμμή row στον πίνακα arr, το row είναι πίνακας
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

        // 3. Two Enhanced For
        for (int[] row : arr) { // για κάθε γραμμή στον πίνακα
            for (int j : row) { // για κάθε στοιχείο της γραμμής
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
