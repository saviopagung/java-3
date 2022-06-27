package exer2.livroPDF;

import exer2.Impressao;

public class LivroPDF implements Impressao {
    private String titulo;
    private String autor;
    private String genero;
    private int quantidadePaginas;

    public LivroPDF(String titulo, String autor, String genero, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String imprimir() {
        return toString();
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | Genero: " + genero + " | Numero de paginas: " + quantidadePaginas;
    }
}
