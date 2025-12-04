package ch5;

/**
 * ορίζουμε μια μέθοδο void swap(int a, int b) που ανταλλάσει αμοιβαία τις τιμές a,b
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a, b); // SwapApp.swap(a, b); το πλήρες όνομα με το όνομα της κλάσης μαζί

        System.out.printf("a = %d, b = %d\n", a, b);
    }

    /**
     * swaps 2 numbers
     * @param a first number
     * @param b second number
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
