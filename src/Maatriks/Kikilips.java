package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {

    public static void main(String[] args) {
        final int suurus = 9;
        char[][] maatriks = new char[suurus][suurus];

        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks.length; j++) {

                if (i > suurus / 2) {
                    // Maatriksi alumine poolt
                    maatriks[i][j] = j >= i + 1 || suurus - i > j + 1 ? '.' : '0';
                } else {
                    // Maatriksi ülemine pool
                    maatriks[i][j] = j >= i && suurus - i > j ? '0' : '.';
                }
            }
        }

        printMaatriks(pooraMaatriksit(maatriks));
    }

    // Pöörab maatriksit kellaosuti liikumise suunas 90 kraadi.
    static char[][] pooraMaatriksit(char[][] maatriks) {
        final int M = maatriks.length;
        final int N = maatriks[0].length;
        char[][] ret = new char[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = maatriks[r][c];
            }
        }
        return ret;
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(char[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
