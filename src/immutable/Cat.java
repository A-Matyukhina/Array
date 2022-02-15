package immutable;

public final class Cat {

    private final String name;
    private final double weight;
    private final double age;


    public Cat(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        return age;
    }

    public Cat createNew(String name, double weight, double age){
        return new Cat(name, weight, age);
    }

    public Cat withName(String newName) {
    // this.name = newName;
        return new Cat(newName, this.weight, this.age);
    }

    @Override
    public String toString(){
        return name + " , " + weight + " , " + age + ".";
    }
}
