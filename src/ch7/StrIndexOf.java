package ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); // 1
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o", 2); // 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o"); // 11
        System.out.println(positionOfLasto);

    }

        // Μέθοδος που να επιστρέφει την κατάληξη του ονόματος ενός αρχείου
        // πχ coding.txt

        public static String getExtension(String FileName){
            return FileName.substring(FileName.lastIndexOf(".") + 1);
        }
    }
