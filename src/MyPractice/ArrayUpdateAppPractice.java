package MyPractice;

public class ArrayUpdateAppPractice {

    public static void main(String[] args) {
        final int KEY = 10;
        boolean keyFound = false;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                arr[i] = KEY + 2;
            }
        }
//Με enhanced for δεν μπορούμε να αντικαταστήσουμε γιατί το item δεν
//είναι τα πραγματικά στοιχεία του πίνακα, αλλά ένας δείκτης σε αυτά
        for (int item: arr) {
            System.out.print(item + " ");
        }
    }
}
