package computer;


public class Processor extends Computer {

    public Processor(String model) {
        super(model);
    }

    public Processor() {
    }
}

/*
    Processor extends Computer
    ==
    Процессор ЯВЛЯЕТСЯ типом компьютера
    ( и это не так!)
    "IS-A"
 */