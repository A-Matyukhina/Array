package arrayArray;

import java.util.Random;
import java.util.Scanner;
/*
2. Создать двумерный массив символов. Количество строк и столбцов вводит пользователь с клавиатуры.
Все элементы массива заполнить случайными символами. Полученную матрицу вывести на экран.
 */

public class TwoDimCharArray {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers for the lengths of a two-dimensional array: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        char[][] charArray = new char[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                charArray[i][j] = (char) r.nextInt();
            }
        }
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print("\t" + charArray[i][j]);
            }
            System.out.println();
        }
    }
}
