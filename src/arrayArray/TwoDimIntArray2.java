package arrayArray;

import java.util.Random;
import java.util.Scanner;

/*
меняем задачу на инты тоже. пользователь
вводит только одно число. матрица всегда квадрат.
главная диагональ - это из левого верхнего угла до правого нижнего. обнулить её.
 */
public class TwoDimIntArray2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter a number (from 1 to 15), please");
        int A = sc.nextInt();
        int[][] intArray = new int[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                intArray[i][j] = r.nextInt(50);
                System.out.print("\t" + intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (i == j) {                                //main diagonal = 0.
                    intArray[i][j] = 0;
                } else if (i + j  == intArray.length - 1 ) { // reverse diagonal = 0.
                    intArray[i][j] = 0;
                }
                System.out.print("\t" + intArray[i][j]);
            }
            System.out.println();
        }
    }
}
