package MyPractice;

public class ArraySearchAppPractice {

    public static void main(String[] args) {
        final int KEY = 10;
        boolean keyFound = false;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int item : arr) {
            if(item == KEY) {
                keyFound = true;
                break;
            }
        }

        if(!keyFound) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found");
        }

    }
}
