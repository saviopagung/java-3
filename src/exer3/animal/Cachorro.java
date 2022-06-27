package exer3.animal;

import exer3.animal.dieta.Carnivoro;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
