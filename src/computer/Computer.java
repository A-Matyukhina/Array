package computer;

public class Computer{

    private Processor cpu;
    private String model;

    public Computer(Processor cpu, String model) {
        this.cpu = cpu;
        this.model = model;
    }

    public Computer() {
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}