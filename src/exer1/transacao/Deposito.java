package exer1.transacao;

import exer1.transacao.Transacao;

public class Deposito implements Transacao {

    @Override
    public void TrasacaoOk() {
        System.out.println("Deposito realizado!");
    }

    @Override
    public void TrasacaoNaoOk() {
        System.out.println("Deposito não realizado!");
    }
}
