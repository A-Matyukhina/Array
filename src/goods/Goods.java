package goods;

public class Goods {

    private String model;
    private double price;

    public Goods(String model, double price) {
        setModel(model);
        setPrice(price);
    }

    public Goods() {
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