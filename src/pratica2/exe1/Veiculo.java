package pratica2.exe1;

public class Veiculo implements Comparable<Veiculo>{
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    //para o exercicio3
    @Override
    public int compareTo(Veiculo v) {
        return (int) (this.preco - v.getPreco());
    }

    //para o exercicio4
    public int compareToStr(Veiculo v) {
        return this.getMarca().compareTo(v.getMarca());
    }

    @Override
    public String toString(){
        return "Modelo: " + this.getModelo() + " | Marca: " + this.getMarca() + " | Preço: " + this.getPreco();
    }
}
