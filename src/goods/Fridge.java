package goods;

public class Fridge extends Product {

    private double height;

    public Fridge(String model, double price, double height) {
        super(model, price);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHigh) {
        height = newHigh;
    }
}
