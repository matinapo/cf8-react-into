package ch5;

public class SwapClarification {
    public static void main(String[] args) {
    int x = 5;
    int y = 12;
    swap(x,y);

        System.out.println(x +" " + y);
    // oι τιμές μέσα στην swap αλλάζουν μεταξύ τους,
    // όμως οι αρχικές μεταβλητές παραμένουν ίδιες!
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

