package pratica2.exe2;

import pratica2.exe1.Garagem;
import pratica2.exe1.Veiculo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Veiculo carro1 = new Veiculo("Fiesta", "Ford", 1000.0);
        veiculos.add(carro1);

        Veiculo carro2 = new Veiculo("Focus", "Ford", 1200.0);
        veiculos.add(carro2);

        Veiculo carro3 = new Veiculo("Explorer", "Ford", 2500.0);
        veiculos.add(carro3);

        Veiculo carro4 = new Veiculo("Uno", "Fiat", 500.0);
        veiculos.add(carro4);

        Veiculo carro5 = new Veiculo("Cronos", "Fiat", 1000.0);
        veiculos.add(carro5);

        Veiculo carro6 = new Veiculo("Torino", "Fiat", 1250.0);
        veiculos.add(carro6);

        Veiculo carro7 = new Veiculo("Aveo", "Chevrolet", 1250.0);
        veiculos.add(carro7);

        Veiculo carro8 = new Veiculo("Spin", "Chevrolet", 2500.0);
        veiculos.add(carro8);

        Veiculo carro9 = new Veiculo("Corola", "Toyota", 1200.0);
        veiculos.add(carro9);

        Veiculo carro10 = new Veiculo("Fortuner", "Toyota", 3000.0);
        veiculos.add(carro10);

        Veiculo carro11 = new Veiculo("Logan", "Renault", 950.0);
        veiculos.add(carro11);

        Garagem garagem = new Garagem(1, veiculos);
        garagem.getVeiculos().sort((a, b) -> a.compareTo(b));

        for (Veiculo veiculo :garagem.getVeiculos()) {
            System.out.println(veiculo.getPreco());
        }

    }
}
