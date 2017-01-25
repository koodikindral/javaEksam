package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {

    public static void main(String[] args) {
        final int suurus = 11;
        char[][] liivakell = new char[suurus][suurus];

        for (int i = 0; i < liivakell.length; i++) {
            for (int j = 0; j < liivakell.length; j++) {

                if (i > suurus / 2) {
                    // Liivakella alumine poolt
                    liivakell[i][j] = j >= i + 1 || suurus - i > j + 1 ? '.' : '0';
                } else {
                    // Liivakella ülemine pool
                    liivakell[i][j] = j >= i && suurus - i > j ? '0' : '.';
                }
            }
        }

        printMaatriks(liivakell);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(char[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
