package MyPractice;
import java.util.Scanner;

public class StringConstantPoolPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please insert a string that ends with whitespace (enter, tab, space): ");
        s = sc.next();
        sc.nextLine(); //consumes the new line characters

        System.out.println(s);

        System.out.println("Please enter a new string that ends with enter:");
        s = sc.nextLine();
        System.out.println(s);

    }
}
