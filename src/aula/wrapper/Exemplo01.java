package aula.wrapper;

public class Exemplo01 {
    public static void main(String[] args) {
        int n = 10;

//      Integer integer = new Integer(10); Depreciado
        Integer integer = 10; //autoboxing: boxing conversion

        int valor = integer.intValue();
        valor = integer; //autoboxing: unboxing conversion

        System.out.println(integer);
        System.out.println(valor);

        //Com a classe voce ganha varios metodos para trabalhar com o conteudo
        int num = Integer.parseInt("12");
        System.out.println(num);

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2); //Comparando os obj
        System.out.println(n1.equals(n2)); //Comparando o conteudo


    }
}
