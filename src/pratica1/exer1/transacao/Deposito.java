package pratica1.exer1.transacao;

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
