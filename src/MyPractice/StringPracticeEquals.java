package MyPractice;

public class StringPracticeEquals {

    public static void main(String[] args) {
        String s1 = "Bob";
        String s2 = new String("Bob");
        boolean isEqual;

        isEqual = s1.equals(s2);

        boolean isEqual2 = s1 == s2;

        String s3 = s1 + s2;

        System.out.println(isEqual);
        System.out.println(isEqual2);
        System.out.println(s3);
    }
}
