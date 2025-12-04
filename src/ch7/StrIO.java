package ch7;

import java.util.Scanner;

public class StrIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Enter 2 strings: ");

        str = sc.next(); // διαβάζει μέχρι ν βρει whitespace (spaces, tab, new line)
        str2 = sc.nextLine(); // διαβάζει μέχρι να βρει new line (την καταναλώνει (διαβάζει) αλλά δεν την δίνει

    }
}
