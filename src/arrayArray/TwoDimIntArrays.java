package arrayArray;

import java.util.Random;
import java.util.Scanner;
/*
Создать двумерный массив, только использовать целые числа. все элементы в первом столбце удвоить
 */
public class TwoDimIntArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter two integers for the lengths of a two-dimensional array, integers should be greater than zero: ");
        int A = sc.nextInt(), B = sc.nextInt();
        int[][] intArray = new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                intArray[i][j] = r.nextInt(100);
                System.out.print("\t" + intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (j == 0) {
                    intArray[i][j] = intArray[i][j] * 2;
                }
                System.out.print("\t" + intArray[i][j]);
            }
            System.out.println();
        }
    }
}

