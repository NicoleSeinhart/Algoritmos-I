//Se pide crear dos métodos, uno que cuente los números impares de una lista y otro que retorne los números consecutivos que hay en una lista.

import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> numeros) {
        int count = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> numeros) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < numeros.size() - 1; i++) {
            if (numeros.get(i) + 1 == numeros.get(i + 1)) {
                consecutivos.add(numeros.get(i));
                consecutivos.add(numeros.get(i + 1));
            }
        }
        return consecutivos;
    }
}
