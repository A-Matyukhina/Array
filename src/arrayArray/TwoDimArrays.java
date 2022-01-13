package arrayArray;

import java.time.LocalDateTime;
import java.util.Random;

public class TwoDimArrays {
    public static void main(String[] args) {

        Random r = new Random();
        int N = 8;
        int M = 12;

//        int [] simpleArray = new int[10];
//        int[][] special = new int[10][];
//        special[0] = new int[1];
//        special[1] = new int[2];

        int[][] table = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                table[i][j] = r.nextInt(100);
            }
        }


        for (int i = 0; i < N; i++) { // N = 8
            for (int j = 0; j < M; j++) { //M =  12
                System.out.print("\t[" + i + "," + j + "]");
            }
            System.out.println();
        }

        System.out.println("---");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("\t" + table[i][j]);
            }
            System.out.println();
        }

        System.out.println("---");

        int [][] ladder = new int[10][];
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i+1];
        }

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = 1;
            }
        }

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }

    }
}
