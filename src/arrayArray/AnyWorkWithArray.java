package arrayArray;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать динамический массив строк. Добавлять в массив строки, вводимые с клавиатуры пользователем,
до тех пор, пока пользователь не введёт команду СТОП.
Вывести на экран все элементы массива через запятую и их количество.
*/
public class AnyWorkWithArray {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public String[] createArray() {
        Scanner sc = new Scanner(System.in);
        String[] myArray = new String[10];
        int size = 0;
        System.out.println(ANSI_PURPLE + "Please enter any number of lines." + "\n" + //was added for coordinate the user's action.
                "After entering each line, press \'enter\'." + "\n" +
                "When you've done type the lines, enter the word \'stop\'" + ANSI_RESET);
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
        int arraySize = 0; // was added for correct output array's size.
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                arraySize++;
            }
        }
        System.out.println("Length: " + arraySize);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) { // was added for correct output of elements.
                if (i == arraySize - 1) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            } else {
                break;
            }
        }
    }
}
