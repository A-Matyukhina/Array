package objects;

import currenttime.StaticNonstaticExample;

public class ObjectEquals {
    public static void main(String[] args) {

        int i1 = 125000;
        int i2 = 125000;

        System.out.println(i1 == i2);         // ?

        Integer o1 = 1480000;
        Integer o2 = 1480000;

        System.out.println(o1 == o2);         // ?
        System.out.println(o1.equals(o2));    // ?

    }
}
