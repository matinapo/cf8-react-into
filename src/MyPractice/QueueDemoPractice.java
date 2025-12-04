package MyPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class QueueDemoPractice {

    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        enQueue(1);
        enQueue(2);
        enQueue(3);

        printQueue();

        num = deQueue();

        printQueue();
    }

    public static void enQueue(int num) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++top] = num; // εισάγουμε στο τέλος της ουράς αφού πρώτα αυξήσουμε το top κατά 1
    }

    public static int deQueue() {
        int num = 0;

        if (isEmpty()) throw new RuntimeException("Queue is empty");

        num = queue[0];

        // Για να μην έχουμε οπή (hole) κάνουμε shift μία θέση αριστερά όλα
        //τα περιεχόμενα του πίνακα και μειώνουμε τον top κατά 1.

        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == queue.length - 1;
    }

    public static void printQueue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");

        for (int i = 0; i <= top; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}