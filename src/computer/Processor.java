package computer;

public class Processor extends Computer {

    private String name;

    public Processor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
    Processor extends Computer
    ==
    Процессор ЯВЛЯЕТСЯ типом компьютера
    ( и это не так!)
    "IS-A"
 */