package MyPractice;
import java.util.Scanner;
/**
 * prints stars in different patterns
 */
public class StarsApp {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of stars: ");
        n = sc.nextInt();

        // Horizontal Print
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // Vertical Print
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();

        //nxn
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Ascending (1-n)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Descending (n-1)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
