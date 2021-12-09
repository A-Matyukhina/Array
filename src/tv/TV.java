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
    public TV(String m, double d, double p) {
        model = m;
        diagonal = d;
        price = p;
    }

    public String getModel() {
        System.out.println("Getting model");
        return model;
    }

    public void setModel(String newModel) {
        if (!newModel.isEmpty()) {
            model = newModel;
        }
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