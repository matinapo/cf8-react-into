package ch6;
/**
 * Υλοποιεί μια λογική Last-In-First-Out (lIFO)
 */
public class StackApp {

    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        // top: -1
        push(1); // top: 0
        push(2);
        push(3);
        push(4);
        push(5);
        push(6); // top: 5

        printStack();
        num = pop();
        System.out.println("Popped " + num);
        System.out.println();
        printStack();
    }

    public static void push(int num) {
        if (isFull()) {
            System.err.println("Stack is full"); //system logging
            return;
        }
        //stack[++top] = num; or
        top++; // πρέπει να γίνει 0 ο top για να δείξει στην 1 θέση του κάθετου πίνακα (stack)
        stack[top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // επιστρέφει τον top & ταυτόχρονα τον διαγράφει (soft delete- o top δείχνει παρακάτω)
        int num = stack[top];
        top--;
        return num;
        // return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1; // επιστρέφει true αλλιώς false! no need to write all if..else etc
    }

    public static boolean isFull() {
        return top == stack.length - 1; // όταν ο top δείχνει στο τελευταίο ψηφίο
    }
    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) { // δεν χρειάζεται να εκτυπώσουμε ολο τον πίνακα, μόνο ότι έχουμε "γεμίσει" άρα από top κ κάτω
            System.out.println(stack[i]);
        }
    }
}
