package ch7;

public class StrBuilderApp {
    public static void main(String[] args) {
        String  concatStr = ""; // immutable, σε κάθε concat δημιουργείται νέο string
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed time: " + elapsedTime + " seconds");

        // String Builder // MUTABLE! // πιο efficient
        StringBuilder sb = new StringBuilder(); // Mutable
        timeStart = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            sb.append(i); // συνενώνει
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println("Elapsed time: " + elapsedTime + " seconds");
    }
}
