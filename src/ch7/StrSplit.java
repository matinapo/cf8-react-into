package ch7;

public class StrSplit {

    public static void main(String[] args) {
        String str = "Athens University of Economics and Business";
        String[] tokens; // πίνακας από strings

        tokens = str.split(" "); // " " -> delimiter or " +" -> ένα ή περισσότερα κενά
        // η split επιστρέφει πίνακα

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
