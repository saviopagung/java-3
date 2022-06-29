package aula.lambda;

public class Exemplo4 {

    interface InterfaceString {
        String executar(String str);
    }

    public static void imprimir(String texto, InterfaceString interfac) {
        String resultado = interfac.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        InterfaceString mudar = s -> s + " complemento";
        imprimir("meu texto", mudar);
    }
}
