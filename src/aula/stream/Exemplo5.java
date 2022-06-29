package aula.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Opcao 1
        Stream<Integer> stream = numeros.stream();
        stream.forEach(n -> System.out.println(n));
        //Opcao 2
        numeros.stream().forEach(n -> System.out.println(n));

        //alterar os dados dentro
        List<Integer> novosNumeros = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        long quantosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Quantidade de pares: " + quantosPares);
        numeros.forEach(n -> System.out.print(n));
        novosNumeros.forEach(n -> System.out.print(n));

        numeros.forEach(n -> System.out.println(n));
        numeros.forEach(System.out::print); //[classe]::[metodo estático da classe]

    }
}
