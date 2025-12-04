package MyPractice;

/**
 * Two types of String declaration & Initialization
 */
public class StringIntroPractice {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = new String("Bob");

        System.out.println(alice + " and " + bob);
        System.out.println("Total length = " + (alice.length() + bob.length()));

        char[] alice2 = {'A', 'l', 'i', 'c', 'e'};
        String bob2 = "Bob";

        System.out.println(alice2);
        System.out.println(bob2);
    }
}
