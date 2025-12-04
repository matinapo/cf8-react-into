package ch4;

public class ForEverAppWithBreak {

    public static void main(String[] args) {
        int count = 0;
        final int MAX = 100;

        for (; ; ) { // for ever
            System.out.print("forever");
            count++;
            if (count % 10 == 0) System.out.println(); // για μια μόνο εντολή μπορούμε να μην βάλουμε {}
            if (count == MAX) break;
        }
    }
}
