package objects;

public class StringTest {
    public static void main(String[] args) {
        String s = "I'n here"; // заменить на m
//        System.out.println(s.substring(0,3));
//        System.out.println(s);
//
//        System.out.println(s.toUpperCase());
//        s = s.toUpperCase();
        s = s.replace("n", "m");
        System.out.println(s);
        s = s.replace("I'n", "I'm");
        System.out.println(s);
    }
}
