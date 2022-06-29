package pratica1.exer3.animal;

import pratica1.exer3.animal.dieta.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {

    @Override
    public String emitirSom() {
        return "AUAU";
    }

    @Override
    public String comer() {
        return comerCarne();
    }

    @Override
     public String comerCarne() {
        return "Cachorro come carne";
    }
}
