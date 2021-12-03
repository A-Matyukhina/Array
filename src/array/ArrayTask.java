package array;

import java.util.Random;


public class ArrayTask {

    public static void main(String[] args) {

        /*
        Создать массив из 10 целых чисел.
        Заполнить его случайно сгенерированными значениями от 10 до 100.
        Вывести все элементы массива на экран.
         */

        Random rand = new Random();

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 10 + rand.nextInt(100 - 10 + 1);
            System.out.print("\t" + myArray[i]);
        }
        System.out.println();

        /*
        1.2 (продолжение)
        После создания и заполнения - элементы с четными индексами увеличить в два раза.
        Снова показать на экране.
        */
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                myArray[i] *= 2;
            }
            System.out.print("\t" + myArray[i]);
        }
        System.out.println("\n"); //escape sequence


        /*
        1.3 (продолжение)
        Найти самый большой и самый маленький элементы массива. Вывести на экран.
        */

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println("\n" + "Largest element of the array: " + max);
        System.out.println("Smallest element of the array: " + min);
    }
}
