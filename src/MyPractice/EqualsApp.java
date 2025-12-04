package MyPractice;

public class EqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "London";
        String s4 = "ATHENS";

        boolean isEqual;

        isEqual = s1.equals(s2); // true
        isEqual = s1.equals(s3); // false
        isEqual = s1.equals(s4); // false
        isEqual = s1.equalsIgnoreCase(s4); // true
    }
}
