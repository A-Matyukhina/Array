package array;

import java.util.Random;


public class ArrayTask {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 50, 10, 2}; // 1

//        shouldToResearchArray(myArray);
//        shouldToResearchArray2(myArray);
        shouldToResearchArray3(myArray);
        System.out.println();
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }

    public static void homeWorkWithArray() {
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

    /*
    Исследовать массивы в джаве, понять, меняется ли массив, если
    1) присвоить его второй переменной
    2) передать в метод и там изменить - так, как мы смотрели с инт и объектами. int[]
     */
    public static void shouldToResearchArray(int[] array) {
//        int[] newArray = array;
        for (int i : array) {
            System.out.print(i + " ");
        }
//        System.out.println();
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
    }

    public static void shouldToResearchArray2(int[] array) {
        int[] newArray = new int[4];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void shouldToResearchArray3(int[] array) { // 2

        array[0] = 4;
        array[3] = 9;

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
