package computer;

public class Computer {

    private String model;

    public Computer(String model) {
        setModel(model);
    }

    public Computer() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }
}