package tv;

public class TV {

    private String model;
    private double diagonal;
    private double price;

    public TV() {
    }
    /*
    Избавиться от слова this в классе TV
    */
    public TV(String model, double diagonal, double price) {
        setModel(model);
        setDiagonal(diagonal);
        setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
}