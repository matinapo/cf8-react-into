package ch5;

public class NewTest {
    public static void main(String[] args) {

    }

    public static int count(int a) {
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if ((i % 2) == 0) counter ++;
        }
        return counter;
    }
}
