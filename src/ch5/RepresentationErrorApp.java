package ch5;

public class RepresentationErrorApp {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        System.out.println("actual is: " + actual);

        if (actual == expected) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
