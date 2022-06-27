package exer1.transacao;

public class SaqueDinheiro implements Transacao{
    @Override
    public void TrasacaoOk() {
        System.out.println("Saque realizado");
    }

    @Override
    public void TrasacaoNaoOk() {
        System.out.println("Saque nao realizado");
    }
}
