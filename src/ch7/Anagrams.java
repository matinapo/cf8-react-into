package ch7;
/**
 * example: "Listen" & "Silent" ίδια γράμματα & ίδιος αριθμός γραμμάτων
 */
public class Anagrams {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean testAnagram= isAnagram(s1, s2);
        System.out.println(testAnagram);
        // μπορώ να καλέσω και κατευθείαν τη μέθοδο μέσα στην print: (no need to declare new boolean)
        // System.out.println(isAnagram(s1, s2));
    }

    /**
     * Checks if two strings are anagrams
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] frequency = new int[256]; // full ascii - default value is 0 for every position

        for (char c : s1.toCharArray()) {
            frequency[c]++; // πλήθος εμφανίσεων
        }

        for (char c : s2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false; // early exit
        }

        // All counts are 0
        for (int item : frequency) {
            if (item != 0) return false;
        }
        return true;
    }
}
