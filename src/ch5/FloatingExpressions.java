package ch5;

public class FloatingExpressions {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = intNum + floatNum + doubleNum; // όλα γίνονται typecast σε double -> στον μεγαλύτερο τύπο
        // auto- widening

        System.out.println("Result is: " + result);
        System.out.printf("Result is: %.2f\n", result);
    }
}
