package tv;

public class TV {

    private String model;
    private double diagonal;
    private double price;

    public TV() {
    }

    public TV(String model, double diagonal, double price) {
        this.model = model;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}