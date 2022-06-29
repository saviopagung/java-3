package pratica1.exer1;

import pratica1.exer1.transacao.Deposito;
import pratica1.exer1.transacao.Transferencia;

public class Executivos {
    Deposito deposito;
    Transferencia transferencia;

    public Executivos(Deposito deposito, Transferencia transferencia) {
        this.deposito = deposito;
        this.transferencia = transferencia;
    }

    public void depositar(){
        deposito.TrasacaoOk();
    }

    public void transferir() {
        transferencia.TrasacaoOk();
    }
}
