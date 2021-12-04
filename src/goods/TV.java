package goods;

public class TV extends Goods{

    private double diagonal;

    public TV(String model, double price, double diagonal) {
        super(model, price);
        setDiagonal(diagonal);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;
    }
}
