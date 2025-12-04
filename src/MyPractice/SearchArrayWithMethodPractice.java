package MyPractice;

public class SearchArrayWithMethodPractice {

    public static void main(String[] args) {
        int[] quantities = {100, 200, 300, 400};
        int value = 100;

        int position = getElementPosition(quantities, value);

        if (position != -1) {
            System.out.printf("Position: %d, Value: %d", position, quantities[position]);
        } else {
            System.out.println("Value not found");
        }
    }

    public static int getElementPosition(int[] arr, int value){
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
