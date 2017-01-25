package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class KaguNurk {

    public static void main(String[] args) {
        final int suurus = 9;
        int[][] maatriks = new int[suurus][suurus];
        int number = 0;

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks.length; j++) {
                maatriks[i][j] = i == j ? ++number : j >= i ? number : j+1;
            }
        }
        
        // Pöörame maatriksit 180 kraadi võrra kellaosuti liikumise suunas
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
