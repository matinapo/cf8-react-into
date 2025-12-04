package MyPractice;
import java.util.Scanner;

public class TypecastsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please enter an int: ");
        lexeme = sc.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is: " + num);

    }
}
