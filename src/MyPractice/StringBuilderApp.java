package MyPractice;

/**
 * Concatenates strings efficiently with {@link StringBuilder)}
 * Μετράμε το χρόνο συνέχνσης με String
 */
public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        // μετράει τον χρόνο σε milliseconds από το UNIX Epoch (1/1/1970 00:00:00)

        for (int i = 1; i <= 15000; i++) {
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0; // μετατρέπουμε σε seconds

        timeStart = System.nanoTime();
        for (int i = 1; i <= 15000; i++) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        sbElapsedTime = (timeEnd - timeStart) / 1_000_000_000.0;

        System.out.println("String concat time: " + stringElapsedTime + " seconds");
        System.out.println("String Builder concat time: " + sbElapsedTime + " seconds");

    }
}
