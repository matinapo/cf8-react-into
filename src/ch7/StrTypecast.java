package ch7;

import java.util.Scanner;

/**
 * from String to Int
 */
public class StrTypecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("Enter an integer:");
        lexeme = sc.nextLine().trim();
        num = Integer.parseInt(lexeme); //  Integer.parseInt(String)

        System.out.println("The number is: " + num);
    }
}
