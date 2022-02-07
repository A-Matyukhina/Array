package arrayArray;

import java.util.Random;
import java.util.Scanner;

/*
пусть двумерный массив возвращает не все иероглифы мира, а только латинский алфавит
 */
public class TwoDimCharArray2 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers for the lengths of a two-dimensional array: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        char[][] charArray = new char[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                charArray[i][j] = (char) (r.nextInt(26) + 'A');
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
