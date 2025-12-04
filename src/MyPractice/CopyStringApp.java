package MyPractice;

public class CopyStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String clone;

        clone = s;
        System.out.println(clone);

        s = "Coding Factory Plus"; // new string
        System.out.println(s);
        System.out.println(clone);
    }
}
