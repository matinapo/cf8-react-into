package ch7;

public class StrUpperLower {
    public static void main(String[] args) {
        String str1 = "Athens";
        String str2 = "athens";

        // equalsIgnoreCase() με normalization σε uppercase
        boolean isEqual = str1.toUpperCase().equals(str2.toUpperCase());
        boolean isEqual2 = str1.toLowerCase().equals(str2.toLowerCase());
    }
}
