package immutable;

public class TryCat {
    public static void main(String[] args) {

        Cat cat = new Cat("Sam", 3.5, 0.6);
        System.out.println(cat);
        tryModification(cat.getName(), cat.getWeight(), cat.getAge());
        System.out.println(cat);

        Cat cat2 = cat.createNew("Tom", 2.8, 2.2);
        System.out.println(cat2);
        tryModification(cat2.getName(), cat2.getWeight(), cat2.getAge());
        System.out.println(cat2);
    }
    public static void tryModification(String name, double weight, double age){
        name = "Mars";
        weight = 4.8;
        age = 5.3;
    }
}
