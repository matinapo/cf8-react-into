package MyPractice;

public class Str20PalindromeAndMethods {

    public static void main(String[] args) {
        String s1 = "AttAA";
        System.out.println(isPalindrome(s1));
    }

    /**
     * επιστέφει true αν ένα String είναι παλινδρομικό, αλλιώς false
     * @param s the input string
     * @return
     */
    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
