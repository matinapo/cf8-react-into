package ch7;

import java.util.Scanner;

public class StrTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = "";

        System.out.println("Enter First Name:");
        firstname = sc.nextLine().trim(); // chaining! (αλυσιδωτή κλήση μεθόδων)

        System.out.println(firstname);

    }
}
