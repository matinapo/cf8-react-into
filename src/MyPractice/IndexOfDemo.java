package MyPractice;

public class IndexOfDemo {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

        if (s.contains("Economics")) System.out.println("Found"); // Found

        index = s.indexOf("Uni");
        System.out.println("Start Index of Uni: " + index); // 7

        index = s.indexOf('t');
        System.out.println("Start Index of 't': " + index); // 1

        index = s.lastIndexOf('t'); // last index of the substring
        System.out.println("Last Index of 't': " + index); // 15

        index = s.indexOf('s');
        System.out.println("Start Index of 's': " + index); // 5

        index = s.indexOf('s', 7); // here start index is 7, so we ignore the s in position 5
        System.out.println("Start Index of 's': " + index); // 13

        if (s.startsWith("Athens")) System.out.println("Found");
        if (s.startsWith("Uni", 7)) System.out.println("Found");

        // Με for εκτυπώνουμε κάθε χαρακτήρα του string με
        //την substring(i, i+1) η οποία εκτυπώνει χαρακτήρα-χαρακτήρα
        for (int i = 0; i < s.length(); i ++) {
            System.out.print(s.substring(i, i + 1));
        }
    }
}
