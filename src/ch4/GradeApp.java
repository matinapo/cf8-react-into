package ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Enter the grade of the student: ");
        grade = in.nextInt();

        switch (grade) { // fall through σε όλα τα cases μέχρι να βρει break - έτσι υλοποιείται η λογική του or
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Failed");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid grade");
                break;
          }
    }
}
