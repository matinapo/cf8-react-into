package MyPractice;

public class ForEachAppStringsPractice {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");
    }
}
