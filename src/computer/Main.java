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

        CPU cpuOne = new CPU("M1");
        ComputerWithProcessor computerOne = new ComputerWithProcessor(cpuOne, "Macbook Pro 16 2021");

        ComputerWithProcessor computerTwo = new ComputerWithProcessor();
        computerTwo.setModel("Microsoft Surface");
        computerTwo.setCpu(new CPU("Intel Core"));

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
    }

    private static String getModelProcessor(Map<String,String> comp, String model){
        String tmp2 = null;
        for(Map.Entry<String, String> tmp : comp.entrySet()){
            if(model.equals(tmp.getValue())){
                tmp2 = tmp.getKey();
            }
        }
        return tmp2;
    }
}
