package Algoritm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        // FIltreerime kõik 3 välja
        naide = Arrays.stream(naide).filter(x -> x != 3).toArray();

        // Tekitame uue map'i, mis sisaldab kõiki unikaalseid väärtusi ning nende esinemissagedust
        Map<Integer, Long> result = Arrays.stream(naide).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        /* Reastame kõik unikaalsed väärtused vastavalt nende esinemissagedusele alates suurimast sagedusest
        ning võtame kõige esimese elemendi */

        result.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(1)
                .forEach(System.out::println);
    }

}
