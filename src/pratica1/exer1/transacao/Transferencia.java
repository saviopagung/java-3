package pratica1.exer1.transacao;

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
