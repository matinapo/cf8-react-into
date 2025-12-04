package MyPractice;

public class ReplaceAndDeleteApp {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickname;
        String oneName;
        String s = "Hello World";
        String s1;

        // Replaces dash with whitespace
        simpleName = firstname.replace("-"," ");
        System.out.println(simpleName);

        // Replaces the empty string (string with length() == 0)
        // Thus essentially deletes
        nickname = firstname.replace("-","");
        System.out.println(nickname);

        // Replaces with empty string- Deletes
        oneName = firstname.replace("-Helen", "");
        System.out.println(oneName);

        // Replace all
        s1 = s.replaceAll("o", "0");
        System.out.println(s1);
    }
}
