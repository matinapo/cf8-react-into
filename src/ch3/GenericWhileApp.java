package ch3;


public class GenericWhileApp {

    public static void main(String[] args) {
        int i = 1; //local scope, local variable
        int endVal = 10;

        while (i <= endVal) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Loops: " + (i -1));
    }
}
