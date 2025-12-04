package ch4;

import java.util.Scanner;

public class SwitchExpressionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.print("Please enter a grade: ");
        grade = in.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Failed");
                yield 'F';
            }
            case 5, 6 -> 'C'; // μόνο 1 εντολή, δεν χρειαζόμαστε {} ούτε το yield
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'U';
        };
        System.out.println("classification: " + classification);
    }
}
