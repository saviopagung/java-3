package exer3.animal;

import exer3.animal.dieta.Vegetariano;

public class Vaca extends Animal implements Vegetariano {
    @Override
    public String emitirSom() {
        return "MUH";
    }

    @Override
    public String comer() {
        return comerPasto();
    }

    @Override
    public String comerPasto() {
        return "Vaca come pasto";
    }
}
