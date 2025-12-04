package ch7;

public class CharCount {

    public static void main(String[] args) {

    }
    public int countChars(String str) {
        if (str == null) return 0;
        return str.length();
    }
}
// ο δείκτης δεν θέλουμε να είναι null, γι'αυτό βάζουμε ==