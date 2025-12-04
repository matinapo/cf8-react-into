package MyPractice;

public class ArraysChallengesFive {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        // Create Events Array (2 events per car: arrival/ departure)
        int[][] events = new int[arr.length * 2][2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            events[index++] = new int[]{arr[i][0], 1}; // arrival
            events[index++] = new int[]{arr[i][1], 0}; // departure
        }

        // Sort Events by Time
        for (int i = 0; i < events.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < events.length; j++) {
                if (events[j][0] < events[minIndex][0]) {
                    minIndex = j;
                }
            }
            int[] temp = events[i];
            events[i] = events[minIndex];
            events[minIndex] = temp;
        }
            // Sweep through Events
            int currentCars = 0;
            int maxCars = 0;
            for (int[] e : events) {
                if (e[1] == 1) currentCars++; // arrival
                else currentCars--;            // departure

                if (currentCars > maxCars) maxCars = currentCars;
            }
            System.out.println("Maximum cars at the same time: " + maxCars);
    }
}
