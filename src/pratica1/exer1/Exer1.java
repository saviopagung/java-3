package pratica1.exer1;

import pratica1.exer1.transacao.Deposito;
import pratica1.exer1.transacao.ConsultaSaldo;
import pratica1.exer1.transacao.PagamentoSevico;
import pratica1.exer1.transacao.SaqueDinheiro;
import pratica1.exer1.transacao.Transferencia;

public class Exer1 {
    public static void main(String[] args) {
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        Deposito deposito = new Deposito();
        PagamentoSevico pagamentoServico = new PagamentoSevico();
        SaqueDinheiro saqueDinheiro = new SaqueDinheiro();
        Transferencia transferencia = new Transferencia();

        Basico clienteBasico = new Basico(consultaSaldo, pagamentoServico, saqueDinheiro);
        Cobradores clienteCobrador = new Cobradores(saqueDinheiro, consultaSaldo);
        Executivos clienteExecutivo = new Executivos(deposito, transferencia);

        System.out.println("------------------");
        System.out.println("Cliente Basico");
        clienteBasico.consultarSaldo();
        clienteBasico.pagarServico();
        clienteBasico.sacar();

        System.out.println("------------------");
        System.out.println("Cliente Cobradores");
        clienteCobrador.sacar();
        clienteCobrador.consultarSaldo();

        System.out.println("------------------");
        System.out.println("Cliente Executivos");
        clienteExecutivo.depositar();
        clienteExecutivo.transferir();
    }
}
