package ch7;
/**
 * Strings are cached in SCP (String Constant Pool) or Intern Area
 * for efficiency. Strings are immutable in order to be secure
 */
public class StrImmutable {

    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = "Coding";

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);
    }
}
