package comparable.comparator;

public class sort implements Comparable {

    private String name;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public sort() {
    }

    public sort(String name, double weight) {
        setName(name);
        setWeight(weight);
    }

    @Override
    public int compareTo(Object o) {
        sort entry = (sort) o;
        return name.compareTo(((sort) o).getName());
    }
}
