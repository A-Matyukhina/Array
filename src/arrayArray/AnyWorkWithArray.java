package arrayArray;

import java.util.Arrays;
import java.util.Scanner;

public class AnyWorkWithArray {

    public String[] createArray() {
        Scanner sc = new Scanner(System.in);
        String[] myArray = new String[10];
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {
            String s = sc.next();
            if (s.equalsIgnoreCase("stop")) {
                break;
            } else {
                myArray[i] = s;
                size++;
                if (size == myArray.length) {
                    myArray = Arrays.copyOf(myArray, myArray.length * 2);
                }
            }
        }
        return myArray;
    }

    public void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
