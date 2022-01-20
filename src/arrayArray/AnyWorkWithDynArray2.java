package arrayArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnyWorkWithDynArray2 {

    public List<String> createArrayList() {
        List<String> newArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR LINES, PLEASE. USE THE \'ENTER\' AFTER EACH LINE." + "\n" +
                "IF YOU FINISHED - TYPE \'STOP\'.");
        boolean stop = false;
        do {
            String s = sc.next();
            if(!s.equalsIgnoreCase("stop")) {
                newArrayList.add(s);
            } else {
                stop = true;
            }
        } while (!stop);
        return newArrayList;
    }

    public void printArrayList(List<String> arrayList){
        if(arrayList.isEmpty()){
            throw new NullPointerException();
        }
        System.out.print("Collection's elements: ");
        for(String tmp : arrayList){
            System.out.print(tmp + ", ");
        }
        System.out.println();
        System.out.println("Collection's size: " + arrayList.size());
    }
}
