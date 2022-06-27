package exer1;

import exer1.transacao.Deposito;
import exer1.transacao.Transferencia;

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
