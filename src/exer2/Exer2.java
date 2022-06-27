package exer2;

import exer2.curriculo.Curriculo;
import exer2.curriculo.Pessoa;
import exer2.livroPDF.LivroPDF;
import exer2.relatorio.Relatorio;

import java.util.ArrayList;

public class Exer2 {
    public static void main(String[] args) {
        //Informações para o curriculo
        Pessoa candidato = new Pessoa("Savio", 24, "Masculino", "Chefe de cozinha");
        ArrayList<String> habilidades = new ArrayList<String>();
        habilidades.add("Ler");
        habilidades.add("Fazer bolo");
        habilidades.add("Suco de frutas");
        //Criando um curriculo
        Curriculo curriculo = new Curriculo(candidato, habilidades);

        //Criando um livro
        LivroPDF livro = new LivroPDF("Codigo Limpo", "Robert C. Martin", "Terror", 456);

        //Informacoes para um relatorio
        ArrayList<String> texto = new ArrayList<String>();
        habilidades.add("Ola");
        habilidades.add("Mundo");
        habilidades.add("!");
        //Criando um relatorio
        Relatorio relatorio = new Relatorio("Savio", "Bootcampers", 1, texto);

        //Objeto responsável por imprimir
        Imprissora imprissora = new Imprissora();

        //Imprimindo o Curriculo
        imprissora.imprimir(curriculo);
        //Imprimindo o livro
        imprissora.imprimir(livro);
        //Imprimind relatorio
        imprissora.imprimir(relatorio);
    }
}
