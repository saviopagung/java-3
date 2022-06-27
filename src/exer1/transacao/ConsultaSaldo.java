package exer1.transacao;

public class ConsultaSaldo implements Transacao{
    @Override
    public void TrasacaoOk() {
        System.out.println("Saldo consultado!");
    }

    @Override
    public void TrasacaoNaoOk() {
        System.out.println("Saldo não consultado!");
    }
}
