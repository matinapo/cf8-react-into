package MyPractice;

public class MinMaxAppPractice {

    public static void main(String[] args) {
        int[] grades = new int[] {7, 6, 3, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = grades[0];
        int maxValue = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < minValue) {
                minValue = grades[i];
                minPosition = i;
            }

            if (grades[i] > maxValue) {
                maxValue = grades[i];
                maxPosition = i;
            }
        }
        System.out.printf("Min value: %d, Min Position: %d ", minValue, minPosition + 1);
        System.out.printf("Max value: %d, Max Position: %d ", maxValue, maxPosition + 1);
    }
}
