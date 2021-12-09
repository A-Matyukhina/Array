package computer;

/*
    у Компьютера ИМЕЕТСЯ процессор
    "HAS-A"
 */

public class ComputerWithProcessor {

    private CPU cpu;
    private String model;

    public ComputerWithProcessor(CPU cpu, String model) {
        this.cpu = cpu;
        this.model = model;
    }

    public ComputerWithProcessor() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
