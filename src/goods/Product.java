package goods;

public class Product {

    private String model;
    private double price;

    public Product(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Product() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}