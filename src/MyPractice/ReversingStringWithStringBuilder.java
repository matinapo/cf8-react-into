package MyPractice;

public class ReversingStringWithStringBuilder {

    public static void main(String[] args) {
        String original = "Hello World";

        // Create a StingBuilder from the original string
        StringBuilder sb = new StringBuilder(original);

        // Reverse the string
        sb.reverse();

        // Convert back to String
        String reversed = sb.toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
