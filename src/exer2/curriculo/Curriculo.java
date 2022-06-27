package exer2.curriculo;

import exer2.Impressao;

import java.util.ArrayList;

public class Curriculo implements Impressao {
    Pessoa pessoa;
    ArrayList<String> habilidades;

    public Curriculo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Curriculo(Pessoa pessoa, ArrayList<String> habilidades) {
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    public void addHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }

    @Override
    public String imprimir() {
        return toString();
    }

    @Override
    public String toString(){
        return "PESSOA\n" + pessoa.toString() + "\nHABILIDADES\n" + habilidades.toString();
    }
}
