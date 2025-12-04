package MyPractice;

public class PrimitiveToString {

    public static void main(String[] args) {
        int num = 5;
        float f = 3.14f;
        String s1, s2;

        s1 = String.valueOf(num);
        s2 =  String.valueOf(f);

        System.out.println(s1);
        System.out.println(s2);
    }
}
