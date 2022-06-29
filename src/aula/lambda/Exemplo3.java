package aula.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for (Integer n : numeros) {
//            System.out.println(n);
//        }

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }

    /*
        public boolean par(int n) {
            return n % 2 == 0;
        }

        n -> n % 2 == 0;
    */
}
