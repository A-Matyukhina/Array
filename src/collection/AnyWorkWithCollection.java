package collection;

public class AnyWorkWithCollection {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
//        rainbow.printCollection(rainbow.createCollection());
        System.out.println(rainbow.findString("'R' - is for red", rainbow.createCollection()));
        System.out.println(rainbow.findString("'O' - is for orange", rainbow.createCollection()));

        System.out.println(rainbow.findString(null, null));
    }
}
