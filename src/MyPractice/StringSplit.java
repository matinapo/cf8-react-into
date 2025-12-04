package MyPractice;

public class StringSplit {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        String[] tokens = s.split(" ");

        for (String token : tokens) { // returns array, this why we traverse with enhanced for
            System.out.println(token);
        }
    }
}
