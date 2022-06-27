package exer1.transacao;

import exer1.transacao.Transacao;

public class Transferencia implements Transacao {
    @Override
    public void TrasacaoOk() {
        System.out.println("Tranferencia realizada!");
    }

    @Override
    public void TrasacaoNaoOk() {
        System.out.println("Tranferencia nao realizada!");
    }
}
