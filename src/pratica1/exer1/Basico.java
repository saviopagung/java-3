package pratica1.exer1;

import pratica1.exer1.transacao.ConsultaSaldo;
import pratica1.exer1.transacao.PagamentoSevico;
import pratica1.exer1.transacao.SaqueDinheiro;

public class Basico {
    ConsultaSaldo saldo;
    PagamentoSevico servico;
    SaqueDinheiro saque;

    public Basico(ConsultaSaldo saldo, PagamentoSevico servico, SaqueDinheiro saque) {
        this.saldo = saldo;
        this.servico = servico;
        this.saque = saque;
    }

    public void consultarSaldo(){
        saldo.TrasacaoOk();
    }

    public void pagarServico(){
        servico.TrasacaoOk();
    }

    public void sacar(){
        saque.TrasacaoOk();
    }

}
