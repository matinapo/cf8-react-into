package MyPractice;
import java.util.Scanner;
/**
 * διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος
 * και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */
public class DateApp {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("The date is %02d/%02d/%02d", num1, num2, num3);
    }
}
