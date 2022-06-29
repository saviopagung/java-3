package pratica1.exer3.animal;

import pratica1.exer3.animal.dieta.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    @Override
    public String emitirSom() {
        return "MIAU";
    }
    @Override
    public String comer() {
        return comerCarne();
    }

    @Override
    public String comerCarne() {
        return "Gato come carne";
    }
}
