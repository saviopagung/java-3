package pratica1.exer1;

import pratica1.exer1.transacao.ConsultaSaldo;
import pratica1.exer1.transacao.SaqueDinheiro;

public class Cobradores {
    SaqueDinheiro saque;
    ConsultaSaldo saldo;

    public Cobradores(SaqueDinheiro saque, ConsultaSaldo saldo) {
        this.saque = saque;
        this.saldo = saldo;
    }

    public void sacar(){
        saque.TrasacaoOk();
    }

    public void consultarSaldo() {
        saldo.TrasacaoOk();
    }
}
