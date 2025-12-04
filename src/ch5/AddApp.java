package ch5;

/**
 * demo of addition method
 */
public class AddApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add(num1, num2); // eδώ καλούμε την add και τις δίνουμε 2 μεταβλητές

        System.out.println("Sum = " + sum);
    }
    public static int add(int a, int b) {

//        // Δήλωση και αρχικοποίηση
//        int sum = 0;
//
//        // Επεξεργασία Δεδομένων Εισόδου
//        sum = a + b;
//
//        // Επιστροφή Αποτελέσματος
//        return sum;

        return a + b; // μπορούμε κατεθείαν να φτάσουμε στο return χωρίς το sum
    }
}
