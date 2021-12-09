package goods;

public class TV extends Product {

    private double diagonal;

    public TV(String model, double price, double diagonal) {
        super(model, price);
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;
    }
}
