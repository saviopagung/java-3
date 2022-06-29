package pratica1.exer2.relatorio;

import pratica1.exer2.Impressao;

import java.util.ArrayList;

public class Relatorio implements Impressao {
    private String autor;
    private String revisor;
    private int quantidadePaginas;
    private ArrayList<String> texto;

    public Relatorio(String autor, String revisor, int quantidadePaginas, ArrayList<String> texto) {
        this.autor = autor;
        this.revisor = revisor;
        this.quantidadePaginas = quantidadePaginas;
        this.texto = texto;
    }

    @Override
    public String imprimir() {
        return "Autor: " + autor + " | Revisor: " + revisor + " | Quandidade de paginas: " + quantidadePaginas + texto.toString();
    }
}
