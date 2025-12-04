package MyPractice;

public class StackDemoPractice {

    static int[] stack = new int[50];
    static int top = -1; // ο ακέραιος δείχνει στην κορυφή της στοίβας, αρχικά -1

    public static void main(String[] args) {
        int num;

        push(1); // μέθος για να εισάγουμε στο τέλος της στοίβας
        push(2);

        printStack();
        num = pop(); // μέθοδος για να εξάγουμε από το τέλος της στοίβας
        System.out.printf("Num %d was popped. \n", num);
        System.out.println("Contents of the stack: ");
        printStack();
    }

    public static void push(int num){
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = num; // or: top++; stack[top] = num;
        // πρώτα αυξάνει το top κατά ένα και μετά εισάγει τον αριθμό
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--]; // πρώτα εξάγει και μετά μειώνει το top κατά ένα
    }

    public static boolean isFull() {
        return (top == stack.length -1);
    }
    public static boolean isEmpty() {
        return top == -1;
    }

    public static void printStack() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        for (int i = top; i >= 0; i--) { // prints in reverse order (top to bottom)
            System.out.println(stack[i]);
        }
        System.out.println();
    }
}
