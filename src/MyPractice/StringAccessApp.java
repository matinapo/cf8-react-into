package MyPractice;

public class StringAccessApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        // reverse order
        for (int j = s.length() -1; j >= 0; j--){
            System.out.print(s.charAt(j) + " ");
        }
        System.out.println();
    }
}

