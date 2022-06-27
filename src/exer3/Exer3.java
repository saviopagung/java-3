package exer3;

import exer3.animal.Animal;
import exer3.animal.Cachorro;
import exer3.animal.Gato;
import exer3.animal.Vaca;

public class Exer3 {
    public static void main(String[] args) {
        System.out.println("==== VACA ====");
        Vaca vaca = new Vaca();
        System.out.println(vaca.emitirSom());
        System.out.println(vaca.comerPasto());

        System.out.println("==== CACHORRO ====");
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comerCarne());

        System.out.println("==== GATO ====");
        Gato gato = new Gato();
        System.out.println(gato.emitirSom());
        System.out.println(gato.comerCarne());
        System.out.println("==============");

        System.out.println("Função que recebe a classe abstrata");
        System.out.println("VACA: " + comerAnimal(vaca));
        System.out.println("CACHORRO: " + comerAnimal(cachorro));
        System.out.println("GATO: " + comerAnimal(gato));

    }

    public static String comerAnimal(Animal animal) {
        return animal.comer();
    }
}
