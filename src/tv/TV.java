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

    public void setModel(String model) {
        setModel(model);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        setDiagonal(diagonal);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        setPrice(price);
    }
}