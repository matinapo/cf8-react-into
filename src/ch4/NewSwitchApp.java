package ch4;

import java.util.Scanner;

public class NewSwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade: ");
        grade = in.nextInt();

        switch (grade) { //new Switch format from 14 edition
            case 1, 2, 3, 4 -> System.out.println("Failed");
            case 5, 6 -> System.out.println("Good");
            case 7, 8 -> System.out.println("Very Good");
            case 9, 10 -> System.out.println("Excellent");
            default -> System.out.println("Invalid Grade");
        }
    }
}
