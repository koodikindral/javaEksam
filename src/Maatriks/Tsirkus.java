package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {

    public static void main(String[] args) {
        final int suurus = 10;
        int[][] maatriks = new int[suurus][suurus];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks.length; j++) {
                if (i % 2 == 0) {
                    maatriks[i][j] =  (i + 1) * suurus - j;
                } else {
                    maatriks[i][j] = (i + 1) * suurus - suurus + j + 1;
                }
            }
        }

        printMaatriks(pooraMaatriksit(pooraMaatriksit(maatriks)));
    }

    // Pöörab maatriksit kellaosuti liikumise suunas 90 kraadi.
    static int[][] pooraMaatriksit(int[][] maatriks) {
        final int M = maatriks.length;
        final int N = maatriks[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = maatriks[r][c];
            }
        }
        return ret;
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
