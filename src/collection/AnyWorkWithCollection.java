package collection;

public class AnyWorkWithCollection {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
//        rainbow.printCollection(rainbow.createCollection());
//        System.out.println(rainbow.findStringFirstVersion("'R' - is for red", rainbow.createCollection()));


        System.out.println(rainbow.findString2("\'V\' - is for Violet", rainbow.createCollection()));
    }
}
