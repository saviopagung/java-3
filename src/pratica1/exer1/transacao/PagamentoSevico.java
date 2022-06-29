package pratica1.exer1.transacao;

public class PagamentoSevico implements Transacao{
    @Override
    public void TrasacaoOk() {
        System.out.println("Pagamento realizado!");
    }

    @Override
    public void TrasacaoNaoOk() {
        System.out.println("Pagamento não realizado!");
    }
}
