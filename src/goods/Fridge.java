package goods;

public class Fridge extends Goods{

    private double high;

    public Fridge(String model, double price, double high) {
        super(model, price);
        setHigh(high);
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double newHigh) {
        high = newHigh;
    }
}
