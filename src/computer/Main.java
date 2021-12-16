package computer;
/*
        5.
        Определить класс Процессор.
        Определить класс Компьютер. Процессор является частью компьютера.
        Написать метод, который по модели компьютера возвращает модель процессора в нем.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Processor cpu1 = new Processor("M1");                     //Creating a new CPU model
        Computer comp1 = new Computer(cpu1, "MacBook Air");      // and a new Computer and computer's name.
        Processor cpu2 = new Processor("Intel Core");
        Computer comp2 = new Computer(cpu2, "Microsoft Surface");

        CPU cpuOne = new CPU("M1");
        ComputerWithProcessor computerOne = new ComputerWithProcessor(cpuOne, "Macbook Pro 16 2021");

        ComputerWithProcessor computerTwo = new ComputerWithProcessor();
        computerTwo.setModel("Microsoft Surface");
        computerTwo.setCpu(new CPU("Intel Core"));
        Computer comp3 = new Computer();                                // Create a new computer, computer name and processor model. Another way.
        comp3.setModel("Dell");
        comp3.setCpu(new Processor("Celeron"));

        String cpuNameFromParentObject = computerOne.getCpu().getName();

    }

    private static void oldImplementation() {
        Map<String,String> comp = new HashMap<>();
        comp.put("M1", "Mac");
        comp.put("Intel Celeron", "Microsoft");
        comp.put("Intel Core", "Mac");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a processor's model: ");
        System.out.println("This computer has processor: " + getModelProcessor(comp, sc.nextLine()));
//        System.out.println(getNameByComputerModel(comp1));
//        System.out.println(getNameByComputerModel(comp2));
//        System.out.println(getNameByComputerModel(comp3));
    }

    private static String getModelProcessor(Map<String,String> comp, String model) {
        String tmp2 = null;
        for (Map.Entry<String, String> tmp : comp.entrySet()) {
            if (model.equals(tmp.getValue())) {
                tmp2 = tmp.getKey();
            }
        }
        return tmp2;
    }

    private static String getNameByComputerModel(Computer computer) { // Method which getting back CPUname by Computer Model.
        return computer.getCpu().getName();
    }
//    public static Map<String, String> getCollection() {
//        Map<String, String> comp = new HashMap<>();
//        comp.put("M1", "Mac");
//        comp.put("Intel Celeron", "Microsoft");
//        comp.put("Intel Core", "Mac");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a processor's model: ");
//        System.out.println("This computer has processor: " + getModelProcessor(comp, sc.nextLine()));
//        return comp;
//    }
//    private static String getModelProcessor(Map<String,String> comp, String model){
//        String tmp2 = null;
//        for(Map.Entry<String, String> tmp : comp.entrySet()){
//            if(model.equals(tmp.getValue())){
//                tmp2 = tmp.getKey();
//            }
//        }
//        return tmp2;
}
