package goods;

public class Fridge extends Product {

    private double height;

    public Fridge(String model, double price, double height) {
        super(model, price);
        setHeight(height);
    }

    public Fridge() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }
}
