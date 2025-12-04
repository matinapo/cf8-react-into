package ch8;

public class NPEApp {

    public static void main(String[] args) {
        String s;

        s = getOneNull();

        if (s == null) { // state-test
            System.out.println("s is null");
            return;
        }
        System.out.println(s.length());
    }

    public static String getOneNull() {
        return null;
    }
}
