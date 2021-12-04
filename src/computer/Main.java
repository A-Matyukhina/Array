package computer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Map<String,String> comp = new HashMap<>();
        comp.put("M1", "Mac");
        comp.put("Intel Celeron", "Microsoft");
        comp.put("Intel Core", "Mac");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a processor's model: ");
        System.out.println("This computer has processor: " + getModelProcessor(comp, sc.nextLine()));
    }

    public static String getModelProcessor(Map<String,String> comp, String model){
        String tmp2 = null;
        for(Map.Entry<String, String> tmp : comp.entrySet()){
            if(model.equals(tmp.getValue())){
                tmp2 = tmp.getKey();
            }
        }
        return tmp2;
    }
}
