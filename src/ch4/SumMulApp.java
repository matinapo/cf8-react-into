package ch4;

/**
 * Υπολογίζει και εκτυπώνει το άρθροισμα και το γινόμενο των 10 πρώτων ακεραίων
 */
public class SumMulApp {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + mul);
    }
}
