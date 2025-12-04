package ch6;
/**
 * shallow copy: όταν κάνουμε copy references
 * it has side effects
 */
public class ArrayShallowCopy {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrCopy = arr; //Shallow copy
        // αντιγραφή δείκτη όχι περιεχομένων

        arrCopy[0] = 1000;
        System.out.println(arr[0]);
    }
}
